package com.stepDefinition;



import io.cucumber.datatable.DataTable;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariffPlanUsing1dList {
	
	@Given("customer is in the home page of demo")
	public void customer_is_in_the_home_page_of_demo() {
		
		 Hook.driver.get("https://www.demo.guru99.com/telecom/");
	}

	@Given("customer clicks add tariff button")
	public void customer_clicks_add_tariff_button() {
		 Hook.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("customer filling all the fields with valid numbers")
	public void customer_filling_all_the_fields_with_valid_numbers(DataTable dataTable) {
	List<String>	userDetails=dataTable.asList(String.class);
	 Hook.driver.findElement(By.id("rental1")).sendKeys(userDetails.get(0));
	 Hook.driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys(userDetails.get(1));
	 Hook.driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys(userDetails.get(2));
	 Hook.driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(userDetails.get(3));
	 Hook.driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(userDetails.get(4));
	 Hook.driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys(userDetails.get(5));
	 Hook.driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(userDetails.get(6));
		  
	}

	@When("customer click submit button")
	public void customer_click_submit_button() {
		 Hook.driver.findElement(By.xpath("//input[@type='submit']")).click();   
	}

	@Then("The user should get valid message")
	public void the_user_should_get_valid_message() {
		Assert.assertTrue( Hook.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

@Then("the user goes to the home page")
public void the_user_goes_to_the_home_page() {
	 Hook.driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();
}
}
