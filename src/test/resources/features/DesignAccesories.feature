Feature: Verifying the Design and Buy page

  Scenario: Design and buy page verification
    Given User is in landing page
    Then Login an account
    And move on to categories button
    And move on to accessories button
    And move on to All accessories button and click
    And selects the first product in the page
    And clicks on Start Designing button
