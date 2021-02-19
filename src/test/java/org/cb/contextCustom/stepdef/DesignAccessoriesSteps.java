package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.DesignAccessories;
import org.cb.contextCustom.pages.MainPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DesignAccessoriesSteps extends Base{

    DesignAccessories designAccessories = new DesignAccessories();
    Logger logger = LoggerFactory.getLogger(DesignAccessoriesSteps.class);


    @Then("Login an account")
    public void loginAnAccount() {
        waitSomeTime(1000L);
        designAccessories.myAccount.click();

        designAccessories.username.sendKeys("fakirsule001@gmail.com");
        designAccessories.password.sendKeys("1qaz2wsx");
        designAccessories.signIn.click();
        waitSomeTime(1000L);
    }

    @And("move on to categories button")
    public void moveOnToCategoriesButton() {
        moveToElement(designAccessories.categories);
    }

    @And("move on to accessories button")
    public void moveOnToAccessoriesButton() {
        moveToElement(designAccessories.accessories);
    }

    @And("move on to All accessories button and click")
    public void moveOnToAllAccessoriesButtonAndClick() {
        moveAndClickToElement(designAccessories.allAccessories);
    }

    @And("selects the first product in the page")
    public void selectsTheFirstProductInThePage() {
        waitSomeTime(1000L);
        moveAndClickToElement(designAccessories.firstProduct);

    }

    @And("clicks on Start Designing button")
    public void clicksOnStartDesigningButton() {
        designAccessories.designingButton.click();
        designAccessories.startTyping.sendKeys("hello");
        designAccessories.addTextButton.click();
        designAccessories.addToCartButton.click();
        waitSomeTime(2000L);
    }


}
