package com.app.ac;

import java.io.Serializable;

public class NavyBean implements Serializable {

	private String regimentName;
	private String rank;
	private String port;

	public String getRegimentName() {
		return regimentName;
	}

	public void setRegimentName(String regimentName) {
		this.regimentName = regimentName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	//Business method
	public String  protect() {
		return "protect nation";
	}

	public NavyBean(String regimentName, String rank, String port) {
		this.regimentName = regimentName;
		this.rank = rank;
		this.port = port;
	}
	

}
