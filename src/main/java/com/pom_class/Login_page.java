package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public WebDriver driver;
	public Login_page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")
WebElement username;

public WebDriver getDriver() {
	return driver;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

@FindBy(id="password")
WebElement password;

@FindBy(id="login")
WebElement login;
}
