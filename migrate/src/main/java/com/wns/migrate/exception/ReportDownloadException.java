package com.wns.migrate.exception;

/**
 * ReportDownloadException class 
 * @author Satya
 *
 */
@SuppressWarnings("serial")
public class ReportDownloadException extends RuntimeException {
	
	private String msg;

    public ReportDownloadException(String msg) {
        super(msg);
        this.msg = msg;
    }


    public ReportDownloadException(Throwable cause, String msg) {
        super(msg, cause);
        this.msg = msg;
    }

}
