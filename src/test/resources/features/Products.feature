Feature: Verifying the MainPage

  @Products
  Scenario: MoreProducts verification
    Given User is on landing page

    Then User verifies that More products button is present
    Then User verifies that "accessories" is displayed
    Then User verifies that "hats" is displayed
    Then User verifies that "home-living" is displayed
    Then User verifies that "kids-youth-clothing" is displayed
    Then User verifies that "mens-clothing" is displayed
    Then User verifies that "womens-clothing" is displayed

    Then User verifies that "Accessories" heading is present
    Then User verifies that "Hats" heading is present
    Then User verifies that "Home & Living" heading is present
    Then User verifies that "Kids & Youth Clothing" heading is present
    Then User verifies that "Men's Clothing" heading is present
    Then User verifies that "Women's Clothing" heading is present

    Then User verifies that "Backpacks" menu is present
    Then User verifies that "Beanies" menu is present
    Then User verifies that "Blankets" menu is present
    Then User verifies that "Baby Bibs" menu is present
    Then User verifies that "Bottoms" menu is present
    Then User verifies that "Bottoms" menu is present

#
#  Scenario: Homepage verification
#    Given User is on landing page
#    Then User verifies that "Supply from you print from us" is present
#    Then User verifies that "Bring Your Own Tee" is present
#    Then User verifies that Print Now button is present
#    Then User verifies that "Print picture" is present
#    Then User verifies that title Brands is present
#    Then User verifies that Context Custom, GILDAN and BELLA+CANVAS logo under Brands are present







