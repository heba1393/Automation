Feature: map test

  @RegressionTest
  Scenario: open map machine list
    Given I open the app
    And the map screen is displayed
    When  click on the map red corner
    Then DataCenters lists menu should be displayed

  @RegressionTest
  Scenario: Open All location Screen
    Given I open the app
    And  the map screen is displayed
    When I click on "UI-Btn-AllLocation"
    Then All Location screen will be displayed

