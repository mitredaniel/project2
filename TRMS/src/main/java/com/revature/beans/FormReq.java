package com.revature.beans;

import java.sql.Date;

public class FormReq {
	private int reqId;
	private int userId;
	private int rfId;
	private Date date;
	private String description;
	private int requestedBy;
	private int completed;
	
	public FormReq() {}

	// ------------------------- getter | setters ---------------------------------
	
	public int getReqId() {
		return reqId;
	}

	

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRfId() {
		return rfId;
	}

	public void setRfId(int rfId) {
		this.rfId = rfId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(int requestedBy) {
		this.requestedBy = requestedBy;
	}

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	};
	
	// ----------------------------------------------------------------------------
	@Override
	public String toString() {
		return "FormReq [reqId=" + reqId + ", userId=" + userId + ", rfId=" + rfId + ", date=" + date + ", description="
				+ description + ", requestedBy=" + requestedBy + ", completed=" + completed + "]";
	}

}
