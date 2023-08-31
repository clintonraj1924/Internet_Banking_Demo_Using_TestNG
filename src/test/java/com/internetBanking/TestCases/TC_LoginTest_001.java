package com.internetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetBanking.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		logger.info("URL is opened...!!!");
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(usrName);
		logger.info("User Name is entered...!!!");
		lp.setPassword(pwd);
		logger.info("Password is entered...!!!");
		lp.clkSubmit();
		Thread.sleep(5000);
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Loggin Test Pass...!!!");
		} else {
			Assert.assertTrue(false);
			logger.info("Loggin Test Fail...!!!");
		}

	}
}
