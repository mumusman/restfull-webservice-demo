package com.example.restwebservices.restfullwebservicedemo.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timetemp;
	private String message;
	private String detail;
	
	public ExceptionResponse(Date timetemp, String message, String description) {
		super();
		this.timetemp = timetemp;
		this.message = message;
		this.detail = description;
	}
	public Date getTimetemp() {
		return timetemp;
	}
	public void setTimetemp(Date timetemp) {
		this.timetemp = timetemp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
