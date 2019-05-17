
Feature: using onedimension list creating add customer

  Scenario: To generate cm registration no 
 Given cm is in the homepage
    And cm clicks the addcustomer button
    When customer enters all the details into corresponding field using onediemensional map
   |fname|panneer|
   |lname|selvam|
   |email|panneer@gmail.com|
   |address|chennai|
   |phno|9840156060|
    And customer clicks the done button after entering all the details
    And customer clicks submit button atlast
    Then customer should get registration number
    