package com.wns.migrate.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to Map String date to LocalDate and Vice versa
 * @author user
 *
 */
@Converter(autoApply = true)
public class DateAttributeConverter implements AttributeConverter<LocalDate, String> {
	
	private static Logger logger = LoggerFactory.getLogger(DateAttributeConverter.class);

	@Override
	public String convertToDatabaseColumn(LocalDate entityDate) {
		//Not required as of now , as Application contains only read only operation
		return entityDate.toString();
	}

	@Override
	public LocalDate convertToEntityAttribute(String dbData) {
		LocalDate date = null;
		try {
			date = LocalDate.parse(dbData, DateTimeFormatter.BASIC_ISO_DATE);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
		return date;
	}

}
