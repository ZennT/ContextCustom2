package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.KidsAndYouthPage;

public class KidsAndYouthStepDef extends Base {

    KidsAndYouthPage kidsAndYouthPage=new KidsAndYouthPage();

    @When("move on to Categories")
    public void move_on_to_Categories() {
        kidsAndYouthPage.moveToCategories();
    }

    @Then("move to Kids&Youth Clothing")
    public void move_to_Kids_Youth_Clothing() {
       kidsAndYouthPage.moveToKidsAndYouth();
    }

    @Then("click on All Kids&Youth Clothing")
    public void click_on_All_Kids_Youth_Clothing() {
        kidsAndYouthPage.allKidsAndYouth();
    }

    @Then("verify Kids&Youth Clothing page is displayed")
    public void verify_Kids_Youth_Clothing_page_is_displayed() {
        kidsAndYouthPage.verifyingImageOfText();
    }
}
