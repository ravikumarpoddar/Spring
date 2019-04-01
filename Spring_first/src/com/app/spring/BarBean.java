package com.app.spring;

import java.io.Serializable;

public class BarBean implements Serializable {
	private String barName;
	private String licNo;
	private String location;
	private int turnOver;

	public String getBarName() {
		return barName;
	}

	public void setBarName(String barName) {
		this.barName = barName;
	}

	public String getLicNo() {
		return licNo;
	}

	public void setLicNo(String licNo) {
		this.licNo = licNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(int turnOver) {
		this.turnOver = turnOver;
	}
	
	
	
//Method which shows functionality(Business method)
	public String supply() {
		return "supplies alcohol";
	}

	public BarBean(String barName, String licNo, String location, int turnOver) {
		this.barName = barName;
		this.licNo = licNo;
		this.location = location;
		this.turnOver = turnOver;
	}
	
	
	
	
	
	

}
