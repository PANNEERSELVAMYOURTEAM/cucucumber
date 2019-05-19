Feature: using 2d list we give values

  Scenario: to get registration id
    Given customer is in the home page firsts
    And user clicks add customer button in home pages
    When user fills the details and clicks submit buttonss
      | panneer | selvam | panneer@gmail.com  | chennai   | 9860878789 |
      | dhana   | sekar  | dhana@gmail.com    | trichy    | 9788567890 |
      | karthi  | raja   | pulirasa@gmail.com | chennai   | 7668769768 |
      | tamil   | vendan | tamil@gmail.com    | royapuram | 8765456767 |
    Then user Should get registration idss
