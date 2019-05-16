package com.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerValidation {
	static WebDriver driver;
	@Given("cm is in the homepage")
	public void cm_is_in_the_homepage() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\cucumbermaven\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.demo.guru99.com/telecom/");	   
	}

	@Given("cm clicks the addcustomer button")
	public void cm_clicks_the_addcustomer_button() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click(); 
	}

	@When("customer enters all the details into corresponding fields")
	public void customer_enters_all_the_details_into_corresponding_fields() {
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("panneer");
		driver.findElement(By.name("lname")).sendKeys("selvam");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("panneerselvamjune7@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Thiruvotriyur Tollgate");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("8667540679"); 
	}

	@When("customer clicks the done button after entering all the details")
	public void customer_clicks_the_done_button_after_entering_all_the_details() {
		driver.findElement(By.xpath("//label[@for='done']")).click();  
	}

	@When("customer clicks submit button atlast")
	public void customer_clicks_submit_button_atlast() {
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("customer should get registration number")
	public void customer_should_get_registration_number() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());  
	}



}
