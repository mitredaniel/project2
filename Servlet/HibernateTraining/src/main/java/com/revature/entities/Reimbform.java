package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="reimbform")
public class Reimbform {
	@Id
	@Column(name="rfid")
	@SequenceGenerator(name="serialrfid",sequenceName="serialrfid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="serialrfid")
	private int rfid;
	
	
	@Column(name="forignuserid")
	private int userid;
	
	@Column(name="dateini")
	private String dateini;
	
	@Column(name="dateupdate")
	private String dateupdate;
	
	@Column(name="description")
	private String description;
	
	@Column(name="location")
	private String location;
	
	@Column(name="city")
	private String city;
	
	@Column(name="total")
	private double total;
	
	@Column(name="tawared")
	private double tawared;
	
	@Column(name="tpending")
	private double tpending;
	
	@Column(name="aprovestatus")
	private int aprovestatus;
	
	@Column(name="grading")
	private String grading;
	
	@Column(name="type_event")
	private String type_event;
	
	@Column(name="work_related")
	private String work_related;
	
	/*
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;

*/
	public Reimbform(int rfid, int userid, String dateini, String dateupdate, String description, String location,
			String city, double total, double tawared, double tpending, int aprovestatus, String grading,
			String type_event, String work_related, User user) {
		super();
		this.rfid = rfid;
		this.userid = userid;
		this.dateini = dateini;
		this.dateupdate = dateupdate;
		this.description = description;
		this.location = location;
		this.city = city;
		this.total = total;
		this.tawared = tawared;
		this.tpending = tpending;
		this.aprovestatus = aprovestatus;
		this.grading = grading;
		this.type_event = type_event;
		this.work_related = work_related;
	
	}
	
	
	

}
