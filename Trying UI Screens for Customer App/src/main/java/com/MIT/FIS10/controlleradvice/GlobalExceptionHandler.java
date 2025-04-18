package com.MIT.FIS10.controlleradvice; 
import com.MIT.FIS10.exception.ResourceNotFoundException; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.ControllerAdvice; 
import org.springframework.web.bind.annotation.ExceptionHandler; 
@ControllerAdvice 
public class GlobalExceptionHandler { 
	@ExceptionHandler(ResourceNotFoundException.class) 
	public String handleResourceNotFoundException(ResourceNotFoundException ex, Model model) 
	{
		model.addAttribute("errorMessage", ex.getMessage()); 
		return "error"; // You can redirect to a custom error page 
		} 
		@ExceptionHandler(Exception.class) 
		public String handleGeneralException(Exception ex, Model model) { 
		model.addAttribute("errorMessage", "An error occurred: " + ex.getMessage()); 
		return "error"; 
		}	
	
}