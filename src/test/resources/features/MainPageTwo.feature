Feature: Verifying the Main Page second part

  Scenario: Main Page second part verification

    Given User is in landing page
    When  Verifies that Search icon is present and enabled
    And   Verifies that cart icon is present
    Then  Verifies that "My Account" is present
    And   Verifies that "My Cart" is present
