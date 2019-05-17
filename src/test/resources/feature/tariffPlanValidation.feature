
Feature: adding tariff plan for the customer
  
@Tag1
  Scenario: adding tariff plan 
    Given cm is in the home page
    And cm is clicking tariff plan
    When cm is entering all the details in tariff plan using two diemensional list
  |100|100|233|455|345|345|343|
  |123|345|678|980|098|546|456|
  |124|567|789|890|900|567|908|
  |100|200|300|400|500|600|700|
    And cm clicking the submit button
    Then cm should get the valid message
    And cm should go for the home page
 
 
 @Tag2
  Scenario: adding tariff plan 
    Given cm is in the home page
    And cm is clicking tariff plan
    When cm is entering all the details in tariff plan using two diemensional map
  |MONTHLY RENTAL|FREE LOCAL MINUTES|FREE INTERNATIONAL MINUTES|FREE SMS PACKS|LOCAL PER MINUTE CHARGES|INTERNATIONAL PER MINUTE CHARGES|SMS CHARGES| 
  |100|100|233|455|345|345|343|
  |123|345|678|980|098|546|456|
  |124|567|789|890|900|567|908|
  |100|200|300|400|500|600|700|
    And cm clicking the submit button
    Then cm should get the valid message
    And cm should go for the home page
    
 
    