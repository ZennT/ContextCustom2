package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.MoreProductsPage;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreProductsSteps extends Base {
    MoreProductsPage moreProductsPage = new MoreProductsPage();
    Logger logger = LoggerFactory.getLogger(MoreProductsSteps.class);

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        logger.info("User is on Landing Page");
    }

    @Then("User verifies that More products button is present")
    public void userVerifiesThatMoreProductsButtonIsPresent() {
        moreProductsPage.moreProductsButton.isDisplayed();
        logger.info("More products button is displayed");
    }

    @Then("User verifies that {string} is displayed")
    public void userVerifiesThatIsDisplayed(String value) {  // image

        if (value.equals(moreProductsPage.accessoriesImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(moreProductsPage.accessoriesImage);

        }else if (value.equals(moreProductsPage.hatImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(moreProductsPage.hatImage);

        }else if (value.equals(moreProductsPage.homeLivingImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(moreProductsPage.homeLivingImage);

        }else if (value.equals(moreProductsPage.kidsYouthImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(moreProductsPage.kidsYouthImage);

        }else if (value.equals(moreProductsPage.mensClothingImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(moreProductsPage.mensClothingImage);

        }else if (value.equals(moreProductsPage.womensClothingImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(moreProductsPage.womensClothingImage);

        } else {
            logger.warn("Failed");
        }
    }

    @Then("User verifies that {string} heading is present")
    public void userVerifiesThatHeadingIsPresent(String value) {

        if(value.equals(moreProductsPage.accessories.getText())){
            textIsDisplayedAndEnabled("Accessories", moreProductsPage.accessories);

        }else if (value.equals(moreProductsPage.hats.getText())){
            textIsDisplayedAndEnabled("Hats", moreProductsPage.hats);

        }else if (value.equals(moreProductsPage.homeLiving.getText())){
            textIsDisplayedAndEnabled("Home & Living", moreProductsPage.homeLiving);

        }else if (value.equals(moreProductsPage.kidsYouthClothing.getText())){
            textIsDisplayedAndEnabled("Kids & Youth Clothing", moreProductsPage.kidsYouthClothing);

        }else if (value.equals(moreProductsPage.mensClothing.getText())){
            textIsDisplayedAndEnabled("Men's Clothing", moreProductsPage.mensClothing);

        }else if (value.equals(moreProductsPage.womensClothing.getText())){
            textIsDisplayedAndEnabled("Women's Clothing", moreProductsPage.womensClothing);
        }

        else{
            logger.warn("Failed");
        }

    }


    @Then("User verifies that {string} menu is present")
    public void userVerifiesThatMenuIsPresent(String arg0) {
    }
}
