package com.stepDefinition;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\workspace\\cucumbertasks\\src\\test\\resources\\feature\\tariffPlanValidation.feature",glue="stepDefinition",plugin="html:target")


public class TestRunner {

}
