package com.myshop.Error;

import java.util.List;

public class ErrorHandler {

	private String message;
	
	private List<String> errorMessagesDetails;
	
	private String date;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrorMessagesDetails() {
		return errorMessagesDetails;
	}

	public void setErrorMessagesDetails(List<String> errorMessagesDetails) {
		this.errorMessagesDetails = errorMessagesDetails;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
