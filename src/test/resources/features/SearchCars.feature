@Search-cars
Feature: validating that seach cars page is working or not
  We are doing acceptance testing

  @Search-cars-positive
  Scenario: Validate search car page
    Given I am on the home page "https://www.carsguide.com.au/" of application
    When I move to the menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And Click on "Search cars" link
    And select carbrand as "BMW" from anymake dropdown
    And select car model as "1 Series" from selectmodel dropdown
    And select location as "ACT - All" from selectLocation dropdown
    And select price as "$10,000" from price dropdown
    And click on Find_My_Next_Car button
    Then I should see the list of all searched cars
    And the page title should be "Bmw 1 Series Under 10000 for Sale ACT | carsguide"
