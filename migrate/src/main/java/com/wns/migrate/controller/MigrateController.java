package com.wns.migrate.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.wns.migrate.entity.FinalCritExt;
import com.wns.migrate.exception.ErrorMessage;
import com.wns.migrate.exception.ReportDownloadException;
import com.wns.migrate.service.MigrateDataService;

import lombok.extern.slf4j.Slf4j;

/**
 * Controller class to export data as csv
 * @author Satya
 *
 */
@RestController
@RequestMapping("/migrate")
@Slf4j
public class MigrateController {
	
	 private static Logger logger = LoggerFactory.getLogger(MigrateController.class);
	 
	@Autowired
	MigrateDataService migrateDataService;
	
	@Value(value = "${export.csv.file.name}")
	String fileName;
	
	/**
	 * End point to export data as CSV
	 * @param response
	 */
	@GetMapping("/export-csv")
	public void exportAsCsv(HttpServletResponse response) {
		
		 //set file name and content type
        response.setContentType("text/csv");
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + fileName + "\"");

        //create a csv writer
        StatefulBeanToCsv<FinalCritExt> writer = null;
		try {
			writer = new StatefulBeanToCsvBuilder<FinalCritExt>(response.getWriter())
			        .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
			        .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
			        .withOrderedResults(false)
			        .build();
		} catch (IOException ex) {
			logger.error(ex.getMessage());
			throw new ReportDownloadException(ErrorMessage.REPORT_DOWNLOAD_ERROR.errorMessage);
		}

        //write all FinalCritExt to csv file
        try {
			writer.write(migrateDataService.exportDataInCsv());
		} catch (CsvDataTypeMismatchException ex1) {
			logger.error(ex1.getMessage());
			throw new ReportDownloadException(ErrorMessage.REPORT_DOWNLOAD_ERROR.errorMessage);
		} catch (CsvRequiredFieldEmptyException ex2) {
			logger.error(ex2.getMessage());
			throw new ReportDownloadException(ErrorMessage.REPORT_DOWNLOAD_ERROR.errorMessage);
		}
		
		
	}

}
