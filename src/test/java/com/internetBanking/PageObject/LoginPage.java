package com.internetBanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver locdriver;

	public LoginPage(WebDriver remodriver) {
		locdriver = remodriver;
		PageFactory.initElements(remodriver, this);
	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassWord;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;

	public void setUsername(String usrName) {
		txtUserName.sendKeys(usrName);
	}

	public void setPassword(String pwd) {
		txtPassWord.sendKeys(pwd);
	}

	public void clkSubmit() {
		btnLogin.click();
	}

}