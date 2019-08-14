package com.modal;

import java.util.Date;

public class Utility {

	private String billID; //ID of the bill
	
	private String billType; //bill type
	
	private Date fromDate; //start day of the bill
	
	private Date toDate; //end date of the bill
	
	private Date dateOfBill; //billed date
	
	private double billAmount; // amount of the bill
	
	private Date paidDate; //bill paid date
	
	private String enteredEmp; // bill details entered person

	
	public String getBillID() {
		return billID;
	}

	public String getBillType() {
		return billType;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public Date getDateOfBill() {
		return dateOfBill;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public String getEnteredEmp() {
		return enteredEmp;
	}

	public void setBillID(String billID) {
		this.billID = billID;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public void setDateOfBill(Date dateOfBill) {
		this.dateOfBill = dateOfBill;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public void setEnteredEmp(String enteredEmp) {
		this.enteredEmp = enteredEmp;
	}
	
	
}
