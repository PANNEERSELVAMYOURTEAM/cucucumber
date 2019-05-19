package com.stepDefinition;

import io.cucumber.datatable.DataTable;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerUsing2DList {

	@Given("customer is in the home page firsts")
	public void customer_is_in_the_home_page_firsts() {
		 
		 Hook.driver.get("https://www.demo.guru99.com/telecom/");
	}

	@Given("user clicks add customer button in home pages")
	public void user_clicks_add_customer_button_in_home_pages() {
		 Hook.driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	}
// error pickle step error why plz clarify whenever we enter numbers at last in any given and when condition generate datatype format so is there any special functions for that
/*	@When("user fills the details and clicks submit button{int}")
	public void user_fills_the_details_and_clicks_submit_button(DataTable dataTable) {
		List<List<String>> userDetails = dataTable.asLists(String.class);
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(userDetails.get(0).get(3));
		driver.findElement(By.name("lname")).sendKeys(userDetails.get(1).get(2));
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(userDetails.get(3).get(2));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(userDetails.get(1).get(4));
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(userDetails.get(2).get(3));
		driver.findElement(By.xpath("//label[@for='done']")).click();  
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user Should get registration id{int}")
	public void user_Should_get_registration_id(Integer int1) {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}*/
	@When("user fills the details and clicks submit buttonss")
	public void user_fills_the_details_and_clicks_submit_buttonss(DataTable dataTable) {
		List<List<String>> userDetails = dataTable.asLists(String.class);
		 Hook.driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(userDetails.get(0).get(3));
		 Hook.driver.findElement(By.name("lname")).sendKeys(userDetails.get(1).get(1));
		 Hook.driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(userDetails.get(3).get(2));
		 Hook.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(userDetails.get(1).get(4));
		 Hook.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(userDetails.get(3).get(4));
		 Hook.driver.findElement(By.xpath("//label[@for='done']")).click();  
		 Hook.driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	}

	@Then("user Should get registration idss")
	public void user_Should_get_registration_idss() {
		Assert.assertTrue( Hook.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}


	



}
