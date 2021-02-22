package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.MensClothing;

public class MensClothingSteps extends Base{
    MensClothing mensClothing = new MensClothing();

    @Then("move on to Men's Clothing sub-menu")
    public void moveOnToMenSClothingSubMenu() {
        moveToElement(mensClothing.menscloth);
        waitSomeTime(1000L);
    }

    @And("move and click on All Men's Clothing")
    public void moveAndClickOnAllMenSClothing() {
        moveAndClickToElement(mensClothing.allMen);
    }

    @Then("verify that Men's Clothing text is present")
    public void verifyThatMenSClothingTextIsPresent() {
        String expected = "Men's Clothing";
        waitSomeTime(1000L);
        textIsDisplayedAndEnabled(expected, mensClothing.mensClothingText);
    }

    @And("verify that first men item image is present")
    public void verifyThatFirstMenItemImageIsPresent() {
    }

    @And("verify that men item brand name is present")
    public void verifyThatMenItemBrandNameIsPresent() {
    }

    @Then("verify that men item title is present")
    public void verifyThatMenItemTitleIsPresent() {
    }

    @And("verify that men item price is present")
    public void verifyThatMenItemPriceIsPresent() {
    }

    @And("click on men kids item picture")
    public void clickOnMenKidsItemPicture() {
    }

    @Then("verify that first men item name is present")
    public void verifyThatFirstMenItemNameIsPresent() {
    }
}
