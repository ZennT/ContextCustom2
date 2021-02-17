package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.MainPage1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPageSteps1 extends Base{

    MainPage1 mainPage1 = new MainPage1();
    Logger logger = LoggerFactory.getLogger(MainPageSteps.class);

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
    }

    @Then("User verifies that More products button is present")
    public void userVerifiesThatMoreProductsButtonIsPresent() {
    }

    @Then("User verifies that {string} and {string} are present")
    public void userVerifiesThatAndArePresent(String arg0, String arg1) {
    }

    @Then("User verifies that {string} under Accessories is present")
    public void userVerifiesThatUnderAccessoriesIsPresent(String arg0) {
    }

    @Then("User verifies that {string} under Hat is present")
    public void userVerifiesThatUnderHatIsPresent(String arg0) {
    }

    @Then("User verifies that {string} under Home & Living is present")
    public void userVerifiesThatUnderHomeLivingIsPresent(String arg0) {
    }

    @Then("User verifies that {string} under Kids & Youth Clothing is present")
    public void userVerifiesThatUnderKidsYouthClothingIsPresent(String arg0) {
    }

    @Then("User verifies that {string} under Men's Clothing is present")
    public void userVerifiesThatUnderMenSClothingIsPresent(String arg0) {
    }

//    @Then("User verifies that {string}and {string} are present")
//    public void userVerifiesThatAndArePresent(String arg0, String arg1) {
//    }

    @Then("User verifies that {string} under Women's Clothing is present")
    public void userVerifiesThatUnderWomenSClothingIsPresent(String arg0) {
    }


}
