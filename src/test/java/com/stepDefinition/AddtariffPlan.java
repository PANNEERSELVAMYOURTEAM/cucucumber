package com.stepDefinition;
import java.util.List;
import io.cucumber.datatable.DataTable;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddtariffPlan {
	static WebDriver driver;
	@Given("cm is in the home page")
	public void cm_is_in_the_home_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\cucumbermaven\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.demo.guru99.com/telecom/");	   
	}

	@Given("cm is clicking tariff plan")
	public void cm_is_clicking_tariff_plan() {
	  driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
/*
	@When("cm is entering all the details in tariff plan")
	public void cm_is_entering_all_the_details_in_tariff_plan() {
	   driver.findElement(By.id("rental1")).sendKeys("1000");
	  driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys("6000");
	  driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys("2000");
	  driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys("100");
	  driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys("35");
	  driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys("90");
	  driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys("98");
	  
	}*/
/*	@When("cm is entering all the details in tariff plan using one diemensional list")
	public void cm_is_entering_all_the_details_in_tariff_plan_using_one_diemensional_list(DataTable dataTable) {
	  List<String> tarifDetail=dataTable.asList(String.class);
	  driver.findElement(By.id("rental1")).sendKeys(tarifDetail.get(0));
	  driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys(tarifDetail.get(1));
	  driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys(tarifDetail.get(2));
	  driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(tarifDetail.get(3));
	  driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(tarifDetail.get(4));
	  driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys(tarifDetail.get(5));
	  driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(tarifDetail.get(6));
	}
*/
	/*@When("cm is entering all the details in tariff plan using one diemensional map")
	public void cm_is_entering_all_the_details_in_tariff_plan_using_one_diemensional_map(DataTable dataTable) {
	   Map<String,String> tariffDetail=dataTable.asMap(String.class,String.class);
	   driver.findElement(By.id("rental1")).sendKeys(tariffDetail.get("MR"));
		  driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys(tariffDetail.get("FLM"));
		  driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys(tariffDetail.get("FIM"));
		  driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(tariffDetail.get("FSP"));
		  driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(tariffDetail.get("LPMC"));
		  driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys(tariffDetail.get("IPMC"));
		  driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(tariffDetail.get("SPMC"));
	}*/

	/*@When("cm is entering all the details in tariff plan using one scenarioOutline{string},{string},{string},{string},{string},{string},{string}")
	public void cm_is_entering_all_the_details_in_tariff_plan_using_one_scenarioOutline(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
		  driver.findElement(By.id("rental1")).sendKeys(string);
		  driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys(string2);
		  driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys(string3);
		  driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(string4);
		  driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(string5);
		  driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys(string5);
		  driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(string6);
	}*/

	@When("cm is entering all the details in tariff plan using two diemensional list")
	public void cm_is_entering_all_the_details_in_tariff_plan_using_two_diemensional_list(DataTable dataTable) {
List<List<String>> tariffDetails = dataTable.asLists(String.class);
driver.findElement(By.id("rental1")).sendKeys(tariffDetails.get(0).get(3));
driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys(tariffDetails.get(0).get(2));
driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys(tariffDetails.get(2).get(3));
driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(tariffDetails.get(2).get(3));
driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(tariffDetails.get(3).get(3));
driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys(tariffDetails.get(2).get(4));
driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(tariffDetails.get(1).get(2));
	}
/*	@When("cm is entering all the details in tariff plan using two diemensional map")
	public void cm_is_entering_all_the_details_in_tariff_plan_using_two_diemensional_map(DataTable dataTable) {
	 List<Map<String, String>> tariffDetail = dataTable.asMaps(String.class,String.class);
	 driver.findElement(By.id("rental1")).sendKeys(tariffDetail.get(1).get("MONTHLY RENTAL"));
	 driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys(tariffDetail.get(0).get("FREE LOCAL MINUTES"));
	 driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys(tariffDetail.get(2).get("FREE INTERNATIONAL MINUTES"));
	 driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(tariffDetail.get(2).get("FREE SMS PACKS"));
	 driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(tariffDetail.get(3).get("LOCAL PER MINUTE CHARGES"));
	 driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys(tariffDetail.get(2).get("INTERNATIONAL PER MINUTE CHARGES"));
	 driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(tariffDetail.get(1).get("SMS CHARGES"));
	}*/

	

	@When("cm clicking the submit button")
	public void cm_clicking_the_submit_button() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();   
	}

	@Then("cm should get the valid message")
	public void cm_should_get_the_valid_message() {
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

	@Then("cm should go for the home page")
	public void cm_should_go_for_the_home_page() {
	   driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();
	}



}
