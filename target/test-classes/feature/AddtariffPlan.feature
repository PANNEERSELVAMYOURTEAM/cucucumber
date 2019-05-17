

Feature: adding tariffPlan
  I want to use this template for my feature file


  Scenario Outline: Title of your scenario outline
    Given cm is in the homepage
    And cm clicks the addcustomer button
    When customer enters all the details into corresponding fields"<fname>","<lname>","<email>","<address>","<phno>"
    And customer clicks the done button after entering all the details
    And customer clicks submit button atlast
    Then customer should get registration number
    Examples: 
      | fname  |lname |email|address|phno|
      | panneer |selvam| panneer@gmail.com|chennai|9840156060|
      | dhana |sekar | samsekar@gmail.com|thiruvottriyur|9677108674|
      |dinesh|denny|denny@gmail.com|perambur|9710867744|