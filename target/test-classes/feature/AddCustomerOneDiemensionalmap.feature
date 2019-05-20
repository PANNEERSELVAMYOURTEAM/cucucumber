Feature: Title of your feature
  I want to use this template for my feature file


   
  Scenario: to get the customer registration
  Given customer is in the home page first
   And user clicks add customer button in home page
    When user fills the details and clicks submit button 
      | fname  | panneer     |
      | lname|selvam|
      |email| panneer@gmail.com |
      |addr|chennai |
      |phno|9840156060 | 
    Then user Should get registration id
