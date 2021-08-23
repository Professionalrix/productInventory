package com.product.managment.webapp.exceptions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {	
	
	
	  	private Date timestamp;
	    private String message;
	    private String details;
	    private HttpStatus status;
	    private List<String> errors;
	

	    
	    public ExceptionResponse(final HttpStatus status, final String message, final String error) {
	        super();
	        this.status = status;
	        this.message = message;
	        errors = Collections.singletonList(error);
	    }


	    public ExceptionResponse(HttpStatus status, Date timestamp, String message, String details, String error) {
	        super();
	        this.timestamp = timestamp;
	        this.status = status;
	        this.message = message;
	        this.details = details;
	        errors = Arrays.asList(error);
	    }


		public Date getTimestamp() {
			return timestamp;
		}


		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}


		public String getMessage() {
			return message;
		}


		public void setMessage(String message) {
			this.message = message;
		}


		public String getDetails() {
			return details;
		}


		public void setDetails(String details) {
			this.details = details;
		}


		public HttpStatus getStatus() {
			return status;
		}


		public void setStatus(HttpStatus status) {
			this.status = status;
		}


		public List<String> getErrors() {
			return errors;
		}


		public void setErrors(List<String> errors) {
			this.errors = errors;
		}


		public ExceptionResponse() {


		}
	    
	    

}
