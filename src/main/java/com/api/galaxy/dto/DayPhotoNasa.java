package com.api.galaxy.dto;

import java.util.Date;

public class DayPhotoNasa {
   
	private Date date;
	private String explanation;
	private String hdUrl;
	private String title;
	private String url;
	
	public DayPhotoNasa() {
		// TODO Auto-generated constructor stub
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getHdUrl() {
		return hdUrl;
	}

	public void setHdUrl(String hdUrl) {
		this.hdUrl = hdUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
