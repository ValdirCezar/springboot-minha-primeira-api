package com.valdir.myapi.resources.exceptions;

public class StandardError {

	private Integer status;
	private Long timestamp;
	private String message;

	public StandardError() {
		super();
	}

	public StandardError(Integer status, Long timestamp, String message) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
