package com.wns.migrate.exception;

/**
 * Enum for stroing error Messages
 * @author Satya
 *
 */
public enum ErrorMessage {
	
	REPORT_DOWNLOAD_ERROR("Error While Downloading CSV File"),
	INTERNAL_SERVER_ERROR("Something went wrong, Kindly contact Administrator"),
	RESOURCE_NOT_FOUND("Resource not found"),
	DB_ERROR("Database Error, Kindly contact support");
	
	public final String errorMessage;
	 
    private ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
