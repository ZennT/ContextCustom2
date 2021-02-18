package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.KidsAndYouthPage;
import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class KidsAndYouthStepDef extends Base {

   Actions action = new Actions(MyDriver.get() );
   KidsAndYouthPage kidsAndYouthPage=new KidsAndYouthPage();

    @Then("move to Kids&Youth Clothing")
    public void move_to_Kids_Youth_Clothing() {
       moveToKidsAndYouth();
    }

    @Then("click on All Kids&Youth Clothing")
    public void click_on_All_Kids_Youth_Clothing() {
        allKidsAndYouth();
    }

    @Then("verify Kids&Youth Clothing page is displayed")
    public void verify_Kids_Youth_Clothing_page_is_displayed() {
        verifyingImageOfText();
    }
    public void moveToCategories(){
        action.moveToElement(kidsAndYouthPage.categories).perform();
    }
    public void moveToKidsAndYouth(){
        Actions action = new Actions(MyDriver.get());
        action.moveToElement(kidsAndYouthPage.kidsAndYouth).click().perform();
    }

    public void allKidsAndYouth(){
        Actions action = new Actions(MyDriver.get());
        action.moveToElement(kidsAndYouthPage.allKids).click().perform();
    }

    public void verifyingImageOfText(){
        System.out.println(kidsAndYouthPage.imageOfText.isDisplayed());
        // Assert.assertTrue(imageOfText.isDisplayed());
    }
}
