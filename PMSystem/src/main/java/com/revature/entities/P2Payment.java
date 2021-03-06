package com.revature.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="p2_payment")
public class P2Payment {
	@Id
	@Column(name="paymentid")
	private int paymentid;
	
	@Column(name="payment_date")
	private Date payment_date;
	
	@Column(name="payment_amount")
	private double payment_amount;
	
	@Column(name="unitid")
	private int unitid;
	
	@ManyToOne(optional = false
			)
	@JoinColumn(name="unitid" ,insertable=false, updatable=false )
	private P2Unit unit;
	
	
	
	
	
	
	// ---------------------------------------
	
	
	
	
	public int getPaymentid() {
		return paymentid;
	}
	@Override
	public String toString() {
		return "P2Payment [paymentid=" + paymentid + ", payment_amount=" + payment_amount + ", unitid=" + unitid + "]";
	}
	public P2Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public double getPayment_amount() {
		return payment_amount;
	}
	public void setPayment_amount(double payment_amount) {
		this.payment_amount = payment_amount;
	}
	public int getUnitid() {
		return unitid;
	}
	public void setUnitid(int unitid) {
		this.unitid = unitid;
	}
	
	

}
