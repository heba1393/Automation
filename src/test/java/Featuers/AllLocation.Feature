Feature: All Location Screen test

  Scenario: filter Active F5 Machines
    Given I open the app
    And  the map screen is displayed
    And I click on All Location button
    And All Location screen will be displayed
    When I click on Active button
    And I Search for F5
    Then Load Balancer machines will be displayed
