package com.example.model;

public class Address {
	
	private int pid;
	private String areaname;
	private String cityname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	@Override
	public String toString() {
		return "Address [pid=" + pid + ", areaname=" + areaname + ", cityname=" + cityname + "]";
	}
	
	

}
