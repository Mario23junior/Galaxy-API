package com.api.galaxy.modelError;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class modelErroResponse {

	private Integer status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yy/MM/yyyy")
	private Date timestap;
	private String message;
	private String path;

	public modelErroResponse() {
		// TODO Auto-generated constructor stub
	}

	public modelErroResponse(Integer status, Date timestap, String message, String path) {
		super();
		this.status = status;
		this.timestap = timestap;
		this.message = message;
		this.path = path;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getTimestap() {
		return timestap;
	}

	public void setTimestap(Date timestap) {
		this.timestap = timestap;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}