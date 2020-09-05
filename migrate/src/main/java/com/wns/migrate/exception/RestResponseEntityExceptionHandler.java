package com.wns.migrate.exception;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Class for Global Exception Handling
 * 
 * @author Satya
 *
 */
@EnableWebMvc
@ControllerAdvice
public class RestResponseEntityExceptionHandler /* extends ResponseEntityExceptionHandler */ {

	@ExceptionHandler(value = { ReportDownloadException.class })
	protected ResponseEntity<Object> handleReportDownloadError(RuntimeException ex, WebRequest request) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { NoHandlerFoundException.class })
	public ResponseEntity<Object> requestHandlingNoHandlerFound() {
		return new ResponseEntity<Object>(ErrorMessage.RESOURCE_NOT_FOUND.errorMessage, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = { SQLException.class })
	public ResponseEntity<Object> handleDataBaseError() {
		return new ResponseEntity<Object>(ErrorMessage.RESOURCE_NOT_FOUND.errorMessage, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = { Exception.class })
	protected ResponseEntity<Object> handleServerError(RuntimeException ex, WebRequest request) {
		return new ResponseEntity<Object>(ErrorMessage.INTERNAL_SERVER_ERROR.errorMessage,
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
