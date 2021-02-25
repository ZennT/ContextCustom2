package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.MainPageTwo;

public class MainPageTwoSteps extends Base {

    MainPageTwo mainPageTwo = new MainPageTwo();

    @When("Verifies that Search icon is present and enabled")
    public void verifiesThatSearchIconIsPresentAndEnabled() {
        imageIsDisplayedAndEnabled(mainPageTwo.searchIcon);
    }
    @And("Verifies that cart icon is present")
    public void verifiesThatCartIconIsPresent() {
        imageIsDisplayedAndEnabled(mainPageTwo.cartIcon);
    }

    @And("Verifies that {string} is present")
    public void verifiesThatIsPresent(String value) {
        if(value.equals(mainPageTwo.myAccount.getText())){
            String expected = "My Account";
            textIsDisplayedAndEnabled(expected, mainPageTwo.cartIcon);
        }

        else if(value.equals(mainPageTwo.myCart.getText())){
            String expected = "My Cart";
            textIsDisplayedAndEnabled(expected, mainPageTwo.myCart);
        }

    }


}
