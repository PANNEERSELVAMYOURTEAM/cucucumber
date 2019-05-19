package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	static WebDriver driver;
	@Before
	public  void BeforeClass(){
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\cucumbermaven\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
	}
	@After
	public  void AfterClass(){
		driver.close();
		driver.quit();
	}

}
