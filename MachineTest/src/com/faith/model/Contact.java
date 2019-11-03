package com.faith.model;

public class Contact {

	private Integer cpId;
	private String cpName;
	private Integer cpVendor;
	private String cpDepartment;
	private String cpEmail;
	private Integer cpMobile;
	private String isActive;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Integer cpId, String cpName, Integer cpVendor, String cpDepartment, String cpEmail, Integer cpMobile,
			String isActive) {
		super();
		this.cpId = cpId;
		this.cpName = cpName;
		this.cpVendor = cpVendor;
		this.cpDepartment = cpDepartment;
		this.cpEmail = cpEmail;
		this.cpMobile = cpMobile;
		this.isActive = isActive;
	}
	public Integer getCpId() {
		return cpId;
	}
	public void setCpId(Integer cpId) {
		this.cpId = cpId;
	}
	public String getCpName() {
		return cpName;
	}
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
	public Integer getCpVendor() {
		return cpVendor;
	}
	public void setCpVendor(Integer cpVendor) {
		this.cpVendor = cpVendor;
	}
	public String getCpDepartment() {
		return cpDepartment;
	}
	public void setCpDepartment(String cpDepartment) {
		this.cpDepartment = cpDepartment;
	}
	public String getCpEmail() {
		return cpEmail;
	}
	public void setCpEmail(String cpEmail) {
		this.cpEmail = cpEmail;
	}
	public Integer getCpMobile() {
		return cpMobile;
	}
	public void setCpMobile(Integer cpMobile) {
		this.cpMobile = cpMobile;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Contact [cpId=" + cpId + ", cpName=" + cpName + ", cpVendor=" + cpVendor + ", cpDepartment="
				+ cpDepartment + ", cpEmail=" + cpEmail + ", cpMobile=" + cpMobile + ", isActive=" + isActive + "]";
	}
	
	
}
