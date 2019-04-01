package com.app.IOC;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class BarBean implements Serializable {
	private String barName;
	private String licNo;
	private DrinkBean drink;

	//private new Drink();
	public DrinkBean getDrink() {
		return drink;
	}

	/*public void setDrink(DrinkBean drink) {
		this.drink = drink;
	}
*/
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

	// Business method
	public String supply() {
		return "supplies alcohol";
	}

	public BarBean(String barName, String licNo, DrinkBean drink) {
		this.barName = barName;
		this.licNo = licNo;
		this.drink = drink;
	}
	public BarBean() {
		
	}

}
