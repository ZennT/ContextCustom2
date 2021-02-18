package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.WomensClothing;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WomensClothingSteps extends Base{
    WomensClothing womensClothing = new WomensClothing();
    Logger logger = LoggerFactory.getLogger(WomensClothingSteps.class);

    @When("move on to Categories dropdown menu")
    public void moveOnToCategoriesDropdownMenu() {
        moveToElement(womensClothing.categories);
    }

    @Then("move on to Women's Clothing sub-menu")
    public void moveOnToWomenSClothingSubMenu() {
        moveToElement(womensClothing.womenscloth);
    }

    @And("move and click on All Women's Clothing")
    public void moveAndClickOnAllWomenSClothing() {
        moveAndClickToElement(womensClothing.allWomen);
    }

    @Then("verify that Women's Clothing text is present")
    public void verifyThatWomenSClothingTextIsPresent() {
        String expected = "Women's Clothing";
        String actual = womensClothing.pageMapText.getText();
        verifyTheText(actual, expected);
    }
}
