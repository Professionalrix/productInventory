package com.product.managment.webapp.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	/*
	 * @ExceptionHandler(value = { IllegalArgumentException.class,
	 * IllegalStateException.class }) protected ResponseEntity<Object>
	 * handleConflict( RuntimeException ex, WebRequest request) { String
	 * bodyOfResponse = "This should be application specific";
	 * 
	 * return handleExceptionInternal(ex, body, headers, status, request)(ex,
	 * bodyOfResponse, , HttpStatus.CONFLICT, request); }
	 */

}
