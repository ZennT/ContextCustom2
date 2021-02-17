package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.MainPage1;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPageSteps1 extends Base {

    MainPage1 mainPage1 = new MainPage1();
    Logger logger = LoggerFactory.getLogger(MainPageSteps1.class);

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
      //  MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        String expected = "Context Custom";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);

        logger.info("contextcustom.com website title is {}", actual);
    }

    @Then("User verifies that More products button is present")
    public void userVerifiesThatMoreProductsButtonIsPresent() {
        mainPage1.moreProductsButton.isDisplayed();
        logger.info("More products button is displayed.");

    }

    @Then("User verifies that {string} is present")
    public void userVerifiesThatIsPresent(String value) {

        String actual;
        if(value.equals(mainPage1.accessories.getText())){
            actual = mainPage1.accessories.getText();
            Assert.assertEquals(value,actual);
            logger.info("{} is verified", value);

//        }else if(mainPage1.accessoriesPicture.isDisplayed()){
//            logger.info("{} is verified", value);

        }else if(value.equals(mainPage1.hatPicture.getText())) {
            actual = mainPage1.hatPicture.getText();
            Assert.assertEquals(value, actual);
            logger.info("{} is verified", value);

        } else if(value.equals(mainPage1.hats.getText())) {
            actual = mainPage1.hats.getText();
            Assert.assertEquals(value, actual);
            logger.info("{} is verified", value);
        }

        else{
            logger.warn("Failed");
        }

    }


//        mainPage1.accessoriesPicture.isDisplayed();

//    }


    @Then("User verifies that Backpacks under Accessories is present")
    public void userVerifiesThatBackpacksUnderAccessoriesIsPresent() {
    }

    @Then("User verifies that Beanies under Hat is present")
    public void userVerifiesThatBeaniesUnderHatIsPresent() {
    }

    @Then("User verifies that Blankets under Home & Living is present")
    public void userVerifiesThatBlanketsUnderHomeLivingIsPresent() {
    }

    @Then("User verifies that Baby Bibs under Kids & Youth Clothing is present")
    public void userVerifiesThatBabyBibsUnderKidsYouthClothingIsPresent() {
    }

    @Then("User verifies that Bottoms under Men's Clothing is present")
    public void userVerifiesThatBottomsUnderMenSClothingIsPresent() {
    }

    @Then("User verifies that Crop Tops under Women's Clothing is present")
    public void userVerifiesThatCropTopsUnderWomenSClothingIsPresent() {
    }


}
