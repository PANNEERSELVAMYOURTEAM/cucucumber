package com.stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\workspace\\cucumbertasks\\src\\test\\resources\\feature",glue="com.stepDefinition",plugin={"html:target","json:target/testcases.json"},dryRun=false,monochrome=true,strict=true)
public class TestRunner {

}
