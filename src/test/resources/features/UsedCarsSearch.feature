@Used-Search-cars
Feature: validating that used seach cars page is working or not
  We are doing acceptance testing

  @Used-Search-cars-positive
  Scenario: Validate used search car page
    Given I am on the home page "https://www.carsguide.com.au/" of application
    When I move to the menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And Click on "Used cars links" link
    And select carbrand as "Audi" from anymake dropdown
    And select car model
      | carModel |
      | A4       |
      | A3       |
    And select location as "ACT - All" from selectLocation dropdown
    And select price as "$10,000" from price dropdown
    And click on Find_My_Next_Car button
    Then I should see the list of all searched cars
    And the page title should be "Used Audi A4 Under 10000 for Sale ACT | carsguide"
