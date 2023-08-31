package com.internetBanking.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.internetBanking.Utilites.ReadConfig;

public class BaseClass {
	public String baseURL = "https://demo.guru99.com/V4/";
	public String usrName = "mngr523224";
	public String pwd = "utYsYde";
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

//		System.getProperty("user.dir")--> only in java class
//		./ --> in java class and properties 
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chrome.exe");

		driver = new ChromeDriver();
		logger = Logger.getLogger("InternetBanking");
		PropertyConfigurator.configure("Log4j.properties");
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ReadConfig.getChromePath());
			driver = new ChromeDriver();
		} else if (br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", ReadConfig.getEdgeePath());
			driver = new EdgeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", ReadConfig.getChromePath());
			driver = new ChromeDriver();
		}
		driver.get(baseURL);
		logger.info("URL is opened...!!!");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
