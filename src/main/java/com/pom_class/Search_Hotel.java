package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;
	public Search_Hotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	WebElement location;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getType() {
		return roomtype;
	}

	public WebElement getNos() {
		return roomnos;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(id="hotels")
	WebElement hotels;
	
	@FindBy(id="room_type")
	WebElement roomtype;
	
	@FindBy(id="room_nos")
	WebElement roomnos;
	
	@FindBy(id="datepick_in")
	WebElement checkin;
	
	@FindBy(id="datepick_out")
	WebElement checkout;
	
	@FindBy(id="adult_room")
	WebElement adults;
	
	@FindBy(id="child_room")
	WebElement children;
	
	@FindBy(name="Submit")
	WebElement search;
	
	
	
	
	
	
	
	
	
}
