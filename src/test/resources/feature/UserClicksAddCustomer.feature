
Feature: when User clicks The Add customer 
  


  Scenario: to get the customer registration no 
    Given customer is in the home page
    And customer clicks add customer button
    When customer filling all the fields with valid texts
    |panneer|selvam|panneerselvamjune7@gmail.com|thiruvottriyur|9840156060|
    And  customer clicks done button
    And customer clicks submit button
    Then The user should get registration number
    


