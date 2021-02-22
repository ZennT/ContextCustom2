Feature:Hats Page Functionality

  @Hats
  Scenario:Verifying Hats Page
    When move on to Categories dropdown menu
    Then move to Hats
    Then move on to All hats button and click
    Then verify Hats page is displayed

    Then verify Cuffed Beanie image is present
    And verify  Cuffed Beanie item brand name is present
    Then verify Cuffed Beanie item text is present
    And verify Cuffed Beanie item price is present
    And click on Cuffed Beanie item picture
#    Then verify Cuffed Beanie item name is present