package com.example.demo.util;

import java.io.Serializable;

public class CommonResponse  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int recordCount;
	private String message;
	private Object data;
	boolean status;
	boolean endIndex;

	public CommonResponse() {
	}

	public CommonResponse(String message, Object data, boolean status) {
		super();
		this.recordCount = 1;
		this.message = message;
		this.data = data;
		this.status = status;
		this.endIndex = true;
	}

	public CommonResponse(int recordCount, String message, Object data, boolean status, boolean endIndex) {
		super();
		this.recordCount = recordCount;
		this.message = message;
		this.data = data;
		this.status = status;
		this.endIndex = endIndex;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isEndIndex() {
		return endIndex;
	}

	public void setEndIndex(boolean endIndex) {
		this.endIndex = endIndex;
	}

}

