package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.NewProducts;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;

public class NewProductsSteps extends Base {

    NewProducts newProducts = new NewProducts();

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        logger.info("User is on LandingPage");
    }

    @Then("Verifies that {string} is displayed")
    public void verifiesThatIsDisplayed(String value) {

        if(value.equals(newProducts.embroideredApronImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProducts.embroideredApronImage);
        }
        else if(value.equals(newProducts.unisexSpongeFleeceImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProducts.unisexSpongeFleeceImage);
        }
        else if(value.equals(newProducts.babyJerseyImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProducts.babyJerseyImage);
        }
        else if(value.equals(newProducts.unisexVNeckTeeImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProducts.unisexVNeckTeeImage);
        }
        else logger.warn("Error");
    }

    @Then("Verifies that {string} item name is present")
    public void verifiesThatItemNameIsPresent(String value) {

        if(value.equals(newProducts.embroideredApronName.getText())){
            textIsDisplayedAndEnabled(value,newProducts.embroideredApronName);
        }
        else if(value.equals(newProducts.unisexSpongeFleeceName.getText())){
            textIsDisplayedAndEnabled(value,newProducts.unisexSpongeFleeceName);
        }
        else if(value.equals(newProducts.babyJerseyName.getText())){
            textIsDisplayedAndEnabled(value,newProducts.babyJerseyName);
        }
        else if(value.equals(newProducts.unisexVNeckTeeName.getText())){
            textIsDisplayedAndEnabled(value,newProducts.unisexVNeckTeeName);
        }
        else logger.warn("Error");
    }

    @Then("Verifies that {string} is present")
    public void verifiesThatIsPresent(String value) {
        if(value.equals(newProducts.embroideredApronPrice.getText())){
            textIsDisplayedAndEnabled(value,newProducts.embroideredApronPrice);
        }
        else if(value.equals(newProducts.unisexSpongeFleecePrice.getText())){
            textIsDisplayedAndEnabled(value,newProducts.unisexSpongeFleecePrice);
        }
        else if(value.equals(newProducts.babyJerseyPrice.getText())){
            textIsDisplayedAndEnabled(value,newProducts.babyJerseyPrice);
        }
        else if(value.equals(newProducts.unisexVNeckTeePrice.getText())){
            textIsDisplayedAndEnabled(value,newProducts.unisexVNeckTeePrice);
        }
        else logger.warn("Error");
    }

    @Then("Verifies that {string} brand name is present")
    public void verifiesThatBrandIsPresent(String value) {
        if(value.equals(newProducts.embroideredApronBrand.getText())){
            textIsDisplayedAndEnabled(value,newProducts.embroideredApronBrand);
        }
        else if(value.equals(newProducts.unisexSpongeFleeceBrand.getText())){
            textIsDisplayedAndEnabled(value,newProducts.unisexSpongeFleeceBrand);
        }
        else if(value.equals(newProducts.babyJerseyBrand.getText())){
            textIsDisplayedAndEnabled(value,newProducts.babyJerseyBrand);
        }
        else if(value.equals(newProducts.unisexVNeckTeeBrand.getText())){
            textIsDisplayedAndEnabled(value,newProducts.unisexVNeckTeeBrand);
        }
        else logger.warn("Error");
    }

    @Then("Moves to Embroidered Apron")
    public void movesToEmbroideredApron() {
        moveToElement(newProducts.apron);
        logger.info("Moves to Embroidered Apron");
        waitSomeTime(5000L);
    }

    @Then("Verifies that Design & Buy button is present")
    public void verifiesThatDesignBuyButtonIsPresent() {
        imageIsDisplayedAndEnabled(newProducts.embroideredApronDesignButton);
    }

    @Then("Moves to Unisex Sponge Fleece Drop Shoulder Sweatshirt")
    public void movesToUnisexSpongeFleeceDropShoulderSweatshirt() {
        moveToElement((newProducts.sweatshirt));
        logger.info("Moves to Unisex Sponge Fleece Drop Shoulder Sweatshirt");
        waitSomeTime(5000L);
    }
    @Then("Verifies that Sweatshirt Design & Buy button is present")
    public void verifiesThatSweatshirtDesignBuyButtonIsPresent() {
        imageIsDisplayedAndEnabled(newProducts.unisexSpongeFleeceDesignButton);
    }

    @Then("Moves to Baby Jersey Short Sleeve One Piece")
    public void movesToBabyJerseyShortSleeveOnePiece() {
        moveToElement(newProducts.babyJersey);
        logger.info("Moves to Baby Jersey Short Sleeve One Piece");
        waitSomeTime(3000L);
    }
    @Then("Verifies that Baby Jersey Design & Buy button is present")
    public void verifiesThatBabyJerseyDesignBuyButtonIsPresent() {
        imageIsDisplayedAndEnabled(newProducts.babyJerseyDesignButton);
    }

    @Then("Moves to Unisex V-Neck Tee")
    public void movesToUnisexVNeckTee() {
        moveToElement(newProducts.vNeckTee);
        logger.info("Moves to Unisex V-Neck Tee");
        waitSomeTime(3000L);
    }

    @Then("Verifies that V Neck Tee Design & Buy button is present")
    public void verifiesThatVNeckTeeDesignBuyButtonIsPresent() {
        imageIsDisplayedAndEnabled(newProducts.unisexVNeckTeeDesignButton);
    }

    @And("Clicks on More Products button")
    public void clicksOnMoreProductsButton() {
        newProducts.moreProductsButton.click();
        logger.info("Clicks on More Products Button");
        newProducts.productCatalog.isDisplayed();
        logger.info("Product Catalog is present");
    }


}


