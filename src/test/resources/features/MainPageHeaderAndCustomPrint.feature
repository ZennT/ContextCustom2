Feature: MainPage Header and Custom Print Verification

  Scenario Outline: Verifying MainPage Header and Custom Print

    Given User verifies the landing page
#    When Verifies that Context Custom logo is present

    When  Verifies that "<Header elements>" are present
#    And  Verifies that "How It Works?" is present
#    And  Verifies that "Free Mockups" is present
##   Then Verifies that "Buy Designs" is present
#    When Verifies that Search icon is present and enabled
#    And  Verifies that cart icon is present
#    Then Verifies that "My Account" is present
#    And  Verifies that "My Cart" is present

    And   Verifies that "<Custom Print elements>" are present
#    Given User verifies that heading and subheading are present
#    When  Verifies that Make an Order is present
#    And   Verifies that Print Now is present

    Then  Clicks on Print Now and verifies the page


    Examples:
      | Header elements       | Custom Print elements |
      | How It Works?         | We'll print & ship it for you!          |
      | Free Mockups          | Custom printed & embroidered products    |
      | Buy Designs           | Make an Order     |
      | Search                | Bring Your Own Tee          |
      | My Account            | Shop Converse         |
      | cartIcon              | Bring Your Own Tee        |
      | My Cart               | Shop Converse     |





