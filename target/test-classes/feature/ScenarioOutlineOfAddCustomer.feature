Feature: scenario outline for add customer one diemension list class
 


  Scenario Outline: multiple no of users accessing add customer parellely
    Given user is in the home page of demoTest
    
    When user is filling all the fields and clicks submit button"<firstName>","<LastName>","<Email>","<Address>","<MobileNumber>"
    
    
    Then the user should get registration id

    Examples: 
      | firstName | LastName | Email              | Address | MobileNumber |
      | panneer   | selvam   | panneer@gmail.com  | chennai |   9840156060 |
      | dhana     | sekar    | dhana@gmail.com    | chennai |   9677108674 |
      | karthi    | raaasa   | pulirasa@gmail.com | chennai |   8667540679 |
