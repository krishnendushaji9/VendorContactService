package com.faith.model;

public class Vendor {

	 private Integer vdId;
	 private String vdName;
	 private String vdAddr;
	 private String vdLocation;
	 private String vdService;
	 private Integer vdPin;
	 private String isActive;
	 
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(Integer vdId, String vdName, String vdAddr, String vdLocation, String vdService, Integer vdPin,String isActive) {
		super();
		this.vdId = vdId;
		this.vdName = vdName;
		this.vdAddr = vdAddr;
		this.vdLocation = vdLocation;
		this.vdService = vdService;
		this.vdPin = vdPin;
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
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Vendor [vdId=" + vdId + ", vdName=" + vdName + ", vdAddr=" + vdAddr + ", vdLocation=" + vdLocation
				+ ", vdService=" + vdService + ", vdPin=" + vdPin + ", isActive=" + isActive + "]";
	}
	
	 
	 
}
