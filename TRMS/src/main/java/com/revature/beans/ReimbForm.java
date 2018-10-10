package com.revature.beans;

import java.sql.Date;
import java.util.List;

public class ReimbForm {
	private int rfId;
	private int userId;
	private Date dateIni;
	private Date dateUpdate;
	private String description;
	private String location;
	private String city;
	private double totalAmount;
	private double totalAwared;
	private double totalPending;
	private int approvalStatus;
	private int grading;
	private int eventType;
	private String workRelated;
	private List<String> req ;
	
	public ReimbForm() {};
	
	public List<String> getReq() {
		return req;
	}

	public void setReq(List<String> req) {
		this.req = req;
	}

	public ReimbForm(int rfId, int userId, Date dateIni, Date dateUpdate, String description, String location, String city,
					 double totalAmount, double totalAwared, double totalPending, int approvalStatus, int grading, int eventType,
					 String workRelated) {
		this.rfId = rfId;
		this.userId = userId;
		this.dateIni= dateIni;
		this.dateUpdate = dateUpdate;
		this.description= description;
		this.location = location;
		this.city = city;
		this.totalAmount = totalAmount;
		this.totalAwared = totalAwared;
		this.totalPending = totalPending;
		this.approvalStatus= approvalStatus;
		this.grading = grading;
		this.eventType = eventType;
		this.workRelated = workRelated;						
	}

	// -------------------------- getter and setter ------------------------------
	public int getRfId() {
		return rfId;
	}

	public void setRfId(int rfId) {
		this.rfId = rfId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDateIni() {
		return dateIni;
	}

	public void setDateIni(Date dateIni) {
		this.dateIni = dateIni;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTotalAwared() {
		return totalAwared;
	}

	public void setTotalAwared(double totalAwared) {
		this.totalAwared = totalAwared;
	}

	public double getTotalPending() {
		return totalPending;
	}

	public void setTotalPending(double totalPending) {
		this.totalPending = totalPending;
	}

	public int getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(int approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public int getGrading() {
		return grading;
	}

	public void setGrading(int grading) {
		this.grading = grading;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public String getWorkRelated() {
		return workRelated;
	}

	public void setWorkRelated(String workRelated) {
		this.workRelated = workRelated;
	}
	//----------------------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "ReimbForm [rfId=" + rfId + ", userId=" + userId + ", dateIni=" + dateIni + ", dateUpdate=" + dateUpdate
				+ ", description=" + description + ", location=" + location + ", city=" + city + ", totalAmount="
				+ totalAmount + ", totalAwared=" + totalAwared + ", totalPending=" + totalPending + ", approvalStatus="
				+ approvalStatus + ", grading=" + grading + ", eventType=" + eventType + ", workRelated=" + workRelated
				+ "]";
	}
	
}
