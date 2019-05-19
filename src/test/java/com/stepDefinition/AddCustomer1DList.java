package com.stepDefinition;

import io.cucumber.datatable.DataTable;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer1DList {
	
	@Given("customer is in the home page")
	public void customer_is_in_the_home_page() {
		
	Hook.driver.get("https://www.demo.guru99.com/telecom/");	
	}

	@Given("customer clicks add customer button")
	public void customer_clicks_add_customer_button() {
		Hook.driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	}

	@When("customer filling all the fields with valid texts")
	public void customer_filling_all_the_fields_with_valid_texts(DataTable dataTable) {
	   List<String> userDetails = dataTable.asList(String.class);
	 Hook.driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(userDetails.get(0));
	 Hook.driver.findElement(By.name("lname")).sendKeys(userDetails.get(1));
	 Hook.driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(userDetails.get(2));
	 Hook.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(userDetails.get(3));
	 Hook.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(userDetails.get(4));
	  
	}

	@When("customer clicks done button")
	public void customer_clicks_done_button() {
		 Hook.driver.findElement(By.xpath("//label[@for='done']")).click();  
	}

	@When("customer clicks submit button")
	public void customer_clicks_submit_button() {
		 Hook.driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("The user should get registration number")
	public void the_user_should_get_registration_number() {
		Assert.assertTrue( Hook.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}

}
