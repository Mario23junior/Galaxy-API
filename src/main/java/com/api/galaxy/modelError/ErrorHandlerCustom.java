package com.api.galaxy.modelError;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.api.galaxy.exceptions.ExceptionsReturnMessageError;

@RestControllerAdvice
public class ErrorHandlerCustom {
  
	@ExceptionHandler(ExceptionsReturnMessageError.class)
	public modelErroResponse returnErroCustom(ExceptionsReturnMessageError ex, WebRequest request) {
		modelErroResponse error = new modelErroResponse(
				HttpStatus.NO_CONTENT.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
				return error;	
	}
}
