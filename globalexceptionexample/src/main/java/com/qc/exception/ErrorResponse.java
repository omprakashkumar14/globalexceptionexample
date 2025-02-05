package com.qc.exception;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ErrorResponse {

	// TODO Auto-generated constructor stub

	private int errorCode;
	private String message;

	public ErrorResponse() {

	}

	public ErrorResponse(int errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}