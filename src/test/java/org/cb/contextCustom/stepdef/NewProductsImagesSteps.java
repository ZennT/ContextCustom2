package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.NewProductsImages;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;

public class NewProductsImagesSteps extends Base {
    NewProductsImages newProductsImages = new NewProductsImages();

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        logger.info("User is on LandingPage");
    }

    @When("Verifies that {string} is displayed")
    public void verifiesThatIsDisplayed(String value) {

        if(value.equals(newProductsImages.unisexSpongeFleeceImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProductsImages.unisexSpongeFleeceImage);
        }
        else if(value.equals(newProductsImages.babyJerseyImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProductsImages.babyJerseyImage);
        }
        else if(value.equals(newProductsImages.unisexVNeckTeeImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProductsImages.unisexVNeckTeeImage);
        }
        else if(value.equals(newProductsImages.embroideredApronImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProductsImages.embroideredApronImage);
        }
        else logger.warn("Error");
    }
}
