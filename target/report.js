$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/workspace/cucumbertasks/src/test/resources/feature/AddCustomerOneDiemensionalmap.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to get the customer registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "customer is in the home page first",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerOneDiemensionalMap.customer_is_in_the_home_page_first()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks add customer button in home page",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerOneDiemensionalMap.user_clicks_add_customer_button_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the details and clicks submit button",
  "rows": [
    {
      "cells": [
        "fname",
        "panneer"
      ]
    },
    {
      "cells": [
        "lname",
        "selvam"
      ]
    },
    {
      "cells": [
        "email",
        "panneer@gmail.com"
      ]
    },
    {
      "cells": [
        "addr",
        "chennai"
      ]
    },
    {
      "cells": [
        "phno",
        "9840156060"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerOneDiemensionalMap.user_fills_the_details_and_clicks_submit_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Should get registration id",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerOneDiemensionalMap.user_Should_get_registration_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("C:/Users/HP/workspace/cucumbertasks/src/test/resources/feature/ScenarioOutlineOfAddCustomer.feature");
formatter.feature({
  "name": "scenario outline for add customer one diemension list class",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "multiple no of users accessing add customer parellely",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in the home page of demoTest",
  "keyword": "Given "
});
formatter.step({
  "name": "user is filling all the fields and clicks submit button\"\u003cfirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cEmail\u003e\",\"\u003cAddress\u003e\",\"\u003cMobileNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should get registration id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "LastName",
        "Email",
        "Address",
        "MobileNumber"
      ]
    },
    {
      "cells": [
        "panneer",
        "selvam",
        "panneer@gmail.com",
        "chennai",
        "9840156060"
      ]
    },
    {
      "cells": [
        "dhana",
        "sekar",
        "dhana@gmail.com",
        "chennai",
        "9677108674"
      ]
    },
    {
      "cells": [
        "karthi",
        "raaasa",
        "pulirasa@gmail.com",
        "chennai",
        "8667540679"
      ]
    }
  ]
});
formatter.scenario({
  "name": "multiple no of users accessing add customer parellely",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in the home page of demoTest",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutlineForAddCustomer.user_is_in_the_home_page_of_demoTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is filling all the fields and clicks submit button\"panneer\",\"selvam\",\"panneer@gmail.com\",\"chennai\",\"9840156060\"",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutlineForAddCustomer.user_is_filling_all_the_fields_and_clicks_submit_button(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should get registration id",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineForAddCustomer.the_user_should_get_registration_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "multiple no of users accessing add customer parellely",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in the home page of demoTest",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutlineForAddCustomer.user_is_in_the_home_page_of_demoTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is filling all the fields and clicks submit button\"dhana\",\"sekar\",\"dhana@gmail.com\",\"chennai\",\"9677108674\"",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutlineForAddCustomer.user_is_filling_all_the_fields_and_clicks_submit_button(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should get registration id",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineForAddCustomer.the_user_should_get_registration_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "multiple no of users accessing add customer parellely",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in the home page of demoTest",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutlineForAddCustomer.user_is_in_the_home_page_of_demoTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is filling all the fields and clicks submit button\"karthi\",\"raaasa\",\"pulirasa@gmail.com\",\"chennai\",\"8667540679\"",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutlineForAddCustomer.user_is_filling_all_the_fields_and_clicks_submit_button(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should get registration id",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineForAddCustomer.the_user_should_get_registration_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("C:/Users/HP/workspace/cucumbertasks/src/test/resources/feature/UserClicksAddCustomer.feature");
formatter.feature({
  "name": "when User clicks The Add customer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to get the customer registration no",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "customer is in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer1DList.customer_is_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer clicks add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer1DList.customer_clicks_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer filling all the fields with valid texts",
  "rows": [
    {
      "cells": [
        "panneer",
        "selvam",
        "panneerselvamjune7@gmail.com",
        "thiruvottriyur",
        "9840156060"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer1DList.customer_filling_all_the_fields_with_valid_texts(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer clicks done button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer1DList.customer_clicks_done_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer1DList.customer_clicks_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should get registration number",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer1DList.the_user_should_get_registration_number()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("C:/Users/HP/workspace/cucumbertasks/src/test/resources/feature/UserClicksAddTariffPlanUsingOneDList.feature");
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
  "status": "passed"
});
formatter.step({
  "name": "customer click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanUsing1dList.customer_click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should get valid message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlanUsing1dList.the_user_should_get_valid_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to the home page",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanUsing1dList.the_user_goes_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("C:/Users/HP/workspace/cucumbertasks/src/test/resources/feature/addCustomerUsing2DList.feature");
formatter.feature({
  "name": "using 2d list we give values",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to get registration id",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "customer is in the home page firsts",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerUsing2DList.customer_is_in_the_home_page_firsts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks add customer button in home pages",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerUsing2DList.user_clicks_add_customer_button_in_home_pages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the details and clicks submit buttonss",
  "rows": [
    {
      "cells": [
        "panneer",
        "selvam",
        "panneer@gmail.com",
        "chennai",
        "9860878789"
      ]
    },
    {
      "cells": [
        "dhana",
        "sekar",
        "dhana@gmail.com",
        "trichy",
        "9788567890"
      ]
    },
    {
      "cells": [
        "karthi",
        "raja",
        "pulirasa@gmail.com",
        "chennai",
        "7668769768"
      ]
    },
    {
      "cells": [
        "tamil",
        "vendan",
        "tamil@gmail.com",
        "royapuram",
        "8765456767"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerUsing2DList.user_fills_the_details_and_clicks_submit_buttonss(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Should get registration idss",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerUsing2DList.user_Should_get_registration_idss()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});