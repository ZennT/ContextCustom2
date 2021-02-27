package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.MainPageHeaderAndCustomPrint;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;

public class MainPageHeaderAndCustomPrintSteps extends Base {

    MainPageHeaderAndCustomPrint mainPageHeaderAndCustomPrint = new MainPageHeaderAndCustomPrint();


    @Given("User verifies the landing page")
    public void userVerifiesTheLandingPage() {

        String expected = "Context Custom";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);
        logger.info("contextcustom.com website title is {}", actual);

        imageIsDisplayedAndEnabled(mainPageHeaderAndCustomPrint.logo);
    }

    @When("Verifies that {string} are present")
    public void verifiesThatArePresent(String value) {

            if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.howItWorks.getText())){
            textIsDisplayedAndEnabled(value,mainPageHeaderAndCustomPrint.howItWorks);
            }
            else if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.freeMockups.getText())){
            textIsDisplayedAndEnabled(value, mainPageHeaderAndCustomPrint.freeMockups);
            }
            else if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.buyDesigns.getText())) {
                textIsDisplayedAndEnabled(value, mainPageHeaderAndCustomPrint.buyDesigns);
            }
            else if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.myAccount.getText())){
            textIsDisplayedAndEnabled(value, mainPageHeaderAndCustomPrint.myAccount);
            }
            else if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.myCart.getText())) {
                textIsDisplayedAndEnabled(value, mainPageHeaderAndCustomPrint.myCart);
            }
            else if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.customizeYourselfText.getText())){
            textIsDisplayedAndEnabled(value, mainPageHeaderAndCustomPrint.customizeYourselfText);
            }
            else if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.customPrintHeading.getText())){
            textIsDisplayedAndEnabled(value, mainPageHeaderAndCustomPrint.customPrintHeading);
            }
            else if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.printAndShip.getText())){
            textIsDisplayedAndEnabled(value, mainPageHeaderAndCustomPrint.printAndShip);
            }
            else if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.supplyFromYouText.getText())){
            textIsDisplayedAndEnabled(value, mainPageHeaderAndCustomPrint.supplyFromYouText);
            }
            else if(value.equalsIgnoreCase(mainPageHeaderAndCustomPrint.bringYourTee.getText())){
            textIsDisplayedAndEnabled(value, mainPageHeaderAndCustomPrint.bringYourTee);
            }

            imageIsDisplayedAndEnabled(mainPageHeaderAndCustomPrint.cartIcon);

            imageIsDisplayedAndEnabled(mainPageHeaderAndCustomPrint.searchIcon);

            imageIsDisplayedAndEnabled(mainPageHeaderAndCustomPrint.makeAnOrderImage);

            imageIsDisplayedAndEnabled(mainPageHeaderAndCustomPrint.printNowImage);

            mainPageHeaderAndCustomPrint.makeAnOrderButton.isEnabled();

            mainPageHeaderAndCustomPrint.printNowButton.isEnabled();


    }

    @Then("Clicks on Print Now and verifies the page")
    public void clicksOnPrintNowAndVerifiesThePage() {
        mainPageHeaderAndCustomPrint.printNowButton.click();

    }
}
