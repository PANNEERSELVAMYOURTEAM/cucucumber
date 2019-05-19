package com.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineForAddCustomer {
	
	@Given("user is in the home page of demoTest")
	public void user_is_in_the_home_page_of_demoTest() {
		
		 Hook.driver.get("https://www.demo.guru99.com/telecom/");	
		 Hook.driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	}
	@When("user is filling all the fields and clicks submit button{string},{string},{string},{string},{string}")
	public void user_is_filling_all_the_fields_and_clicks_submit_button(String firstName, String LastName, String Email, String Address, String MobileNumber) {
	
		 Hook.driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(firstName);
		 Hook.driver.findElement(By.name("lname")).sendKeys(LastName);
		 Hook.driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(Email);
		 Hook.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(Address);
		 Hook.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(MobileNumber);
		 Hook.driver.findElement(By.xpath("//label[@for='done']")).click();
		 Hook.driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("the user should get registration id")
	public void the_user_should_get_registration_id() {
		Assert.assertTrue( Hook.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}

	
}
