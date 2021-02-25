Feature: New Products Names

  Scenario:Verifying New Products' Names

    Given User is on landing page
    When Verifies that "Embroidered Apron" item name is present
    And  Verifies that "Unisex Sponge Fleece Drop Shoulder Sweatshirt | 3945 Bella Canvas" item name is present
    And  Verifies that "Baby Jersey Short Sleeve One Piece | 100B Bella Canvas" item name is present
    Then Verifies that "Unisex V-Neck Tee | Bella + Canvas 3005" item name is present