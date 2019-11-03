package com.faith.model;

public class VVendorContact {

	 private Integer vdId;
	 private String vdName;
	 private String vdAddr;
	 private String vdLocation;
	 private String vdService;
	 private Integer vdPin;
	private String cpName;
	private Integer cpVendor;
	private String cpDepartment;
	private String cpEmail;
	private String cpMobile;
	private String isActive;
	
	public VVendorContact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VVendorContact(Integer vdId, String vdName, String vdAddr, String vdLocation, String vdService,
			Integer vdPin, String cpName, Integer cpVendor, String cpDepartment, String cpEmail, String cpMobile,String isActive) {
		super();
		this.vdId = vdId;
		this.vdName = vdName;
		this.vdAddr = vdAddr;
		this.vdLocation = vdLocation;
		this.vdService = vdService;
		this.vdPin = vdPin;
		this.cpName = cpName;
		this.cpVendor = cpVendor;
		this.cpDepartment = cpDepartment;
		this.cpEmail = cpEmail;
		this.cpMobile = cpMobile;
		this.isActive=isActive;
	}

	public Integer getVdId() {
		return vdId;
	}

	public void setVdId(Integer vdId) {
		this.vdId = vdId;
	}

	public String getVdName() {
		return vdName;
	}

	public void setVdName(String vdName) {
		this.vdName = vdName;
	}

	public String getVdAddr() {
		return vdAddr;
	}

	public void setVdAddr(String vdAddr) {
		this.vdAddr = vdAddr;
	}

	public String getVdLocation() {
		return vdLocation;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setVdLocation(String vdLocation) {
		this.vdLocation = vdLocation;
	}

	public String getVdService() {
		return vdService;
	}

	public void setVdService(String vdService) {
		this.vdService = vdService;
	}

	public Integer getVdPin() {
		return vdPin;
	}

	public void setVdPin(Integer vdPin) {
		this.vdPin = vdPin;
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

	public String getCpMobile() {
		return cpMobile;
	}

	public void setCpMobile(String cpMobile) {
		this.cpMobile = cpMobile;
	}

	@Override
	public String toString() {
		return "VVendorContact [vdId=" + vdId + ", vdName=" + vdName + ", vdAddr=" + vdAddr + ", vdLocation="
				+ vdLocation + ", vdService=" + vdService + ", vdPin=" + vdPin + ", cpName=" + cpName + ", cpVendor="
				+ cpVendor + ", cpDepartment=" + cpDepartment + ", cpEmail=" + cpEmail + ", cpMobile=" + cpMobile +",isActive="+isActive+ "]";
	}
	
	
	
}
