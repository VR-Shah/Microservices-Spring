package com.ProductService.ProductService.exceptionHandler;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

	private Integer statusCode;
	private String message;
	private Date timeStamp;
	private String description;
	
}
