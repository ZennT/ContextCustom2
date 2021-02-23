package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.ProductsPage;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductsSteps extends Base {
    ProductsPage productsPage = new ProductsPage();
    Logger logger = LoggerFactory.getLogger(ProductsSteps.class);

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        logger.info("User is on Landing Page");
    }

    @Then("User verifies that More products button is present")
    public void userVerifiesThatMoreProductsButtonIsPresent() {
        productsPage.moreProductsButton.isDisplayed();
        logger.info("More products button is displayed");
    }

    @Then("User verifies that {string} is displayed")
    public void userVerifiesThatIsDisplayed(String value) {  // image

        if (value.equals(productsPage.accessoriesImage.getAttribute("alt"))) {
            imageIsDisplayedAndEnabled(productsPage.accessoriesImage);

        }else if (value.equals(productsPage.hatImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(productsPage.hatImage);

        }else if (value.equals(productsPage.homeLivingImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(productsPage.homeLivingImage);

        }else if (value.equals(productsPage.kidsYouthImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(productsPage.kidsYouthImage);

        }else if (value.equals(productsPage.mensClothingImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(productsPage.mensClothingImage);

        }else if (value.equals(productsPage.womensClothingImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(productsPage.womensClothingImage);

        } else {
            logger.warn("Failed");
        }
    }

    @Then("User verifies that {string} heading is present")
    public void userVerifiesThatHeadingIsPresent(String value) {

        if(value.equals(productsPage.accessories.getText())){
            textIsDisplayedAndEnabled("Accessories", productsPage.accessories);

        }else if (value.equals(productsPage.hats.getText())){
            textIsDisplayedAndEnabled("Hats", productsPage.hats);

        }else if (value.equals(productsPage.homeLiving.getText())){
            textIsDisplayedAndEnabled("Home & Living", productsPage.homeLiving);

        }else if (value.equals(productsPage.kidsYouthClothing.getText())){
            textIsDisplayedAndEnabled("Kids & Youth Clothing", productsPage.kidsYouthClothing);

        }else if (value.equals(productsPage.mensClothing.getText())){
            textIsDisplayedAndEnabled("Men's Clothing", productsPage.mensClothing);

        }else if (value.equals(productsPage.womensClothing.getText())){
            textIsDisplayedAndEnabled("Women's Clothing", productsPage.womensClothing);
            click(productsPage.womensClothing);
          textIsDisplayedAndEnabled("Women's Clothing",productsPage.verifyWomensClothingText);
        }

        else{
            logger.warn("Failed");
        }

    }


    @Then("User verifies that {string} menu is present")
    public void userVerifiesThatMenuIsPresent(String arg0) {
    }
}
