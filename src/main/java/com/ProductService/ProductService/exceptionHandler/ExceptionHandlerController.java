package com.ProductService.ProductService.exceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex) {
		return new ErrorMessage(HttpStatus.BAD_REQUEST.value(), 
				ex.getMessage(), new Date(), "Resource Not Found.");
	}
	
}
