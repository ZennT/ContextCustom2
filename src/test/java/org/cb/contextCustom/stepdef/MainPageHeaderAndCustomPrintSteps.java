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
            waitSomeTime(3000L);

            if(value.equals(mainPageHeaderAndCustomPrint.howItWorks.getText())){
                textIsDisplayedAndEnabled("How It Works", mainPageHeaderAndCustomPrint.howItWorks);
            }
            else if(value.equals(mainPageHeaderAndCustomPrint.freeMockups.getText())){
            textIsDisplayedAndEnabled("Free Mockups", mainPageHeaderAndCustomPrint.freeMockups);
            }
            else if(value.equals(mainPageHeaderAndCustomPrint.buyDesigns.getText())) {
                textIsDisplayedAndEnabled("Buy Designs", mainPageHeaderAndCustomPrint.buyDesigns);
            }
            else if(value.equals(mainPageHeaderAndCustomPrint.myAccount.getText())){
                textIsDisplayedAndEnabled("My Account", mainPageHeaderAndCustomPrint.myAccount);
            }
            else if(value.equals(mainPageHeaderAndCustomPrint.myCart.getText())) {
                textIsDisplayedAndEnabled("My Cart", mainPageHeaderAndCustomPrint.myCart);
            }
            else if(value.equals(mainPageHeaderAndCustomPrint.customizeYourselfText.getText())){
                textIsDisplayedAndEnabled("Customize for yourself or for your customers", mainPageHeaderAndCustomPrint.customizeYourselfText);
            }
            else if(value.equals(mainPageHeaderAndCustomPrint.customPrintHeading.getText())){
                textIsDisplayedAndEnabled("Custom printed & embroidered products", mainPageHeaderAndCustomPrint.customPrintHeading);
            }
            else if(value.equals(mainPageHeaderAndCustomPrint.printAndShip.getText())){
                textIsDisplayedAndEnabled("We'll print & ship it for you!", mainPageHeaderAndCustomPrint.printAndShip);
            }
            else if(value.equals(mainPageHeaderAndCustomPrint.supplyFromYouText.getText())){
                textIsDisplayedAndEnabled("Supply from you print from us", mainPageHeaderAndCustomPrint.supplyFromYouText);
            }
            else if(value.equals(mainPageHeaderAndCustomPrint.bringYourTee.getText())){
                textIsDisplayedAndEnabled("Bring Your Own Tee", mainPageHeaderAndCustomPrint.bringYourTee);
            }

            waitSomeTime(3000L);

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
