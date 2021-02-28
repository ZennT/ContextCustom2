package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.NewProducts;

public class NewProductsSteps extends Base {

    NewProducts newProducts = new NewProducts();

    @When("User verifies that product images are displayed")
    public void userVerifiesThatProductImagesAreDisplayed() {
        imageIsDisplayedAndEnabled(newProducts.embroideredApronImage);

        imageIsDisplayedAndEnabled(newProducts.unisexSpongeFleeceImage);

        imageIsDisplayedAndEnabled(newProducts.babyJerseyImage);

        imageIsDisplayedAndEnabled(newProducts.unisexVNeckTeeImage);
//        if(value.equals(newProducts.embroideredApronImage.getAttribute("alt"))){
//            imageIsDisplayedAndEnabled(newProducts.embroideredApronImage);
//        }
//        else if(value.equals(newProducts.unisexSpongeFleeceImage.getAttribute("alt"))){
//            imageIsDisplayedAndEnabled(newProducts.unisexSpongeFleeceImage);
////        }
////        else if(value.equals(newProducts.babyJerseyImage.getAttribute("alt"))){
//            imageIsDisplayedAndEnabled(newProducts.babyJerseyImage);
////        }
////        else if(value.equals(newProducts.unisexVNeckTeeImage.getAttribute("alt"))){
//            imageIsDisplayedAndEnabled(newProducts.unisexVNeckTeeImage);
//        }
//        else logger.warn("Error");

    }

    @And("User verifies that product names are present")
    public void userVerifiesThatProductNamesArePresent() {

        String expected = "Embroidered Apron";
        textIsDisplayedAndEnabled(expected,newProducts.embroideredApronName);
        expected = "Unisex Sponge Fleece Drop Shoulder Sweatshirt | 3945 Bella Canvas";
        textIsDisplayedAndEnabled(expected, newProducts.unisexSpongeFleeceName);
        expected = "Baby Jersey Short Sleeve One Piece | 100B Bella Canvas";
        textIsDisplayedAndEnabled(expected,newProducts.babyJerseyName);
        expected = "Unisex V-Neck Tee | Bella + Canvas 3005";
        textIsDisplayedAndEnabled(expected,newProducts.unisexVNeckTeeName);

//        if(value.equals(newProducts.embroideredApronName.getText())){

//            textIsDisplayedAndEnabled(newProducts.embroideredApronName);
//            // System.out.println(newProducts_if.unisexSpongeFleeceName.getText());   sonraki element gorunmuyordu, bu satirla kodda nasil yazdigini gorduk
//        }
//        else if(value.equals(newProducts.unisexSpongeFleeceName.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.unisexSpongeFleeceName);
//            //System.out.println(newProducts_if.babyJerseyName.getText());
//        }
//        else if(value.equals(newProducts.babyJerseyName.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.babyJerseyName);
//        }
//        else if(value.equals(newProducts.unisexVNeckTeeName.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.unisexVNeckTeeName);
//        }
//        else logger.warn("Error");
    }

    @And("User verifies that product prices are present")
    public void userVerifiesThatProductPricesArePresent() {
        String expected = "$16.50";
        textIsDisplayedAndEnabled(expected,newProducts.embroideredApronPrice);
        expected = "$18.73";
        textIsDisplayedAndEnabled(expected,newProducts.unisexSpongeFleecePrice);
        expected = "$9.95";
        textIsDisplayedAndEnabled(expected,newProducts.babyJerseyPrice);
        expected = "$4.85";
        textIsDisplayedAndEnabled(expected,newProducts.unisexVNeckTeePrice);

//        if(value.equals(newProducts.embroideredApronPrice.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.embroideredApronPrice);
//        }
//        else if(value.equals(newProducts.unisexSpongeFleecePrice.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.unisexSpongeFleecePrice);
//        }
//        else if(value.equals(newProducts.babyJerseyPrice.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.babyJerseyPrice);
//        }
//        else if(value.equals(newProducts.unisexVNeckTeePrice.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.unisexVNeckTeePrice);
//        }
//        else logger.warn("Error");
    }

    @And("User verifies that brand names are present")
    public void userVerifiesThatBrandNamesArePresent() {
        String expected = "Context";
        textIsDisplayedAndEnabled(expected,newProducts.embroideredApronBrand);
        expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected,newProducts.unisexSpongeFleeceBrand);
        expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected,newProducts.babyJerseyBrand);
        expected = "Bella canvas";
        textIsDisplayedAndEnabled(expected,newProducts.unisexVNeckTeeBrand);
//        if(value.equals(newProducts.embroideredApronBrand.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.embroideredApronBrand);
//        }
//        else if(value.equals(newProducts.unisexSpongeFleeceBrand.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.unisexSpongeFleeceBrand);
//        }
//        else if(value.equals(newProducts.babyJerseyBrand.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.babyJerseyBrand);
//        }
//        else if(value.equals(newProducts.unisexVNeckTeeBrand.getText())){
//            textIsDisplayedAndEnabled(value,newProducts.unisexVNeckTeeBrand);
//        }
//        else logger.warn("Error");
    }

    @Then("User verifies that design&buy buttons are present")
    public void userVerifiesThatDesignBuyButtonsArePresent() {
        moveToElement(newProducts.apron);
        logger.info("Moves to Embroidered Apron");
        waitSomeTime(5000L);
        imageIsDisplayedAndEnabled(newProducts.embroideredApronDesignButton);
        //newProducts_if.embroideredApronDesignButton.click();

        moveToElement((newProducts.sweatshirt));
        logger.info("Moves to Unisex Sponge Fleece Drop Shoulder Sweatshirt");
        waitSomeTime(5000L);
        imageIsDisplayedAndEnabled(newProducts.unisexSpongeFleeceDesignButton);

        moveToElement(newProducts.babyJersey);
        logger.info("Moves to Baby Jersey Short Sleeve One Piece");
        waitSomeTime(3000L);
        imageIsDisplayedAndEnabled(newProducts.babyJerseyDesignButton);

        moveToElement(newProducts.vNeckTee);
        logger.info("Moves to Unisex V-Neck Tee");
        waitSomeTime(3000L);
        imageIsDisplayedAndEnabled(newProducts.unisexVNeckTeeDesignButton);

    }

    @Then("User clicks on More Products button and verifies the page")
    public void userClicksOnMoreProductsButtonAndVerifiesThePage() {
        newProducts.moreProductsButton.click();
        logger.info("Clicks on More Products Button");
        newProducts.productCatalog.isDisplayed();
        logger.info("Product Catalog is present");
    }
}
