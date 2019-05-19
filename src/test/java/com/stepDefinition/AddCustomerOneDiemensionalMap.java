package com.stepDefinition;

import io.cucumber.datatable.DataTable;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerOneDiemensionalMap {

	@Given("customer is in the home page first")
	public void customer_is_in_the_home_page_first() {
     Hook.driver.get("https://www.demo.guru99.com/telecom/");	  
	}

	@Given("user clicks add customer button in home page")
	public void user_clicks_add_customer_button_in_home_page() {
		Hook.driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	}

	@When("user fills the details and clicks submit button")
	public void user_fills_the_details_and_clicks_submit_button(DataTable dataTable) {
Map<String,String> userDetails = dataTable.asMap(String.class,String.class);
Hook.driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(userDetails.get("fname"));
Hook.driver.findElement(By.name("lname")).sendKeys(userDetails.get("lname"));
Hook.driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(userDetails.get("email"));
Hook.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(userDetails.get("addr"));
Hook.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(userDetails.get("phno"));
Hook.driver.findElement(By.xpath("//label[@for='done']")).click();  
Hook.driver.findElement(By.xpath("//input[@type='submit']")).click();
	  }

	@Then("user Should get registration id")
	public void user_Should_get_registration_id() {
		Assert.assertTrue(Hook.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());	
		
	}
	}
