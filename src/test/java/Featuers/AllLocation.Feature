Feature: All Location Screen test

  @SmokeTest
  Scenario: filter Active F5 Machines
    Given I open the app
    And  the map screen is displayed
    And I click on "UI-Btn-AllLocation"
    And All Location screen will be displayed
    When I click on "UI-Btn-ActiveDevices"
    And I enter "F5" into input field having id "UI-TF-Search"
    Then Load Balancer machines will be displayed
    And I click on "UI-Btn-Map"

  @RegressionTest
  Scenario: filter Down Machines
    Given I open the app
    And  the map screen is displayed
    And I click on "UI-Btn-AllLocation"
    And All Location screen will be displayed
    When I click on "UI-Btn-DownDevices"
    Then Down machines will be displayed
    And I click on "UI-Btn-Map"

  @RegressionTest
  Scenario: filter Active Machines
    Given I open the app
    And  the map screen is displayed
    And I click on "UI-Btn-AllLocation"
    And All Location screen will be displayed
    When I click on "UI-Btn-ActiveDevices"
    Then Active machines will be displayed
    And I click on "UI-Btn-Map"

