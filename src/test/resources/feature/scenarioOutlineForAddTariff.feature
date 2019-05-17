
Feature: 



  Scenario Outline: Title of your scenario outline
   Given cm is in the home page
    And cm is clicking tariff plan
    When cm is entering all the details in tariff plan using one scenarioOutline"<MR>","<FLM>","<FIM>","<FSP>","<LPMC>","<IPMC>","<SPMC>"
    And cm clicking the submit button
    Then cm should get the valid message
    And cm should go for the home page

    Examples: 
      |MR|FLM|FIM|FSP|LPMC|IPMC|SPMC | 
      |50|45|65|78|24|23|22|
      |100|200|2000|3000|49|37|36|
      |130|137|156|100|23|67|78|
