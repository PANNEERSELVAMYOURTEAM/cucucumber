$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/workspace/cucumbertasks/src/test/resources/feature/UserClicksAddTariffPlanUsingOneDList.feature");
formatter.feature({
  "name": "add Tariff plan using one diemensional list",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to get Valid mesage",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "customer is in the home page of demo",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffPlanUsing1dList.customer_is_in_the_home_page_of_demo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer clicks add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanUsing1dList.customer_clicks_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer filling all the fields with valid numbers",
  "rows": [
    {
      "cells": [
        "10000",
        "2000",
        "1000",
        "5000",
        "59",
        "25",
        "100"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlanUsing1dList.customer_filling_all_the_fields_with_valid_numbers(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //input[@id\u003dlocal_minutes\u0027] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//input[@id\u003dlocal_minutes\u0027]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d74.0.3729.157)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-1TFOULF\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:3341}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.157, webStorageEnabled: true}\nSession ID: ba3335a619b485eaf9fa39ad416128a3\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003dlocal_minutes\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.stepDefinition.AddTariffPlanUsing1dList.customer_filling_all_the_fields_with_valid_numbers(AddTariffPlanUsing1dList.java:33)\r\n\tat ✽.customer filling all the fields with valid numbers(C:/Users/HP/workspace/cucumbertasks/src/test/resources/feature/UserClicksAddTariffPlanUsingOneDList.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "customer click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanUsing1dList.customer_click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user should get valid message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlanUsing1dList.the_user_should_get_valid_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user goes to the home page",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanUsing1dList.the_user_goes_to_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});