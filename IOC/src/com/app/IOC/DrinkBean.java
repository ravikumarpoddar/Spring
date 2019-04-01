package com.app.IOC;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class DrinkBean implements Serializable {

	private String type;
	private double perOfAlcohol;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPerOfAlcohol() {
		return perOfAlcohol;
	}

	public void setPerOfAlcohol(double perOfAlcohol) {
		this.perOfAlcohol = perOfAlcohol;
	}

}
