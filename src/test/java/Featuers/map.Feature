Feature: map test
  @SmokeTest @SmokeTest
  Scenario: open map machine list when I click on the red corrner
    Given I open the app
    And I am on the map screen
    When I click on the map red corner
    Then the machines list menu should be displayed
