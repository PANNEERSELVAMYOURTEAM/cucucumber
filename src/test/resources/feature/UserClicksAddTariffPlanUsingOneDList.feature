
Feature: add Tariff plan using one diemensional list



  Scenario: to get Valid mesage
Given customer is in the home page of demo
    And customer clicks add tariff button
    When customer filling all the fields with valid numbers
    |10000|2000|1000|5000|59|25|100|
    And customer click submit button
    Then The user should get valid message
    And the user goes to the home page

