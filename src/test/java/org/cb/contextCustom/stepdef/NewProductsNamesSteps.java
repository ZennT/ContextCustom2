package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewProductsNamesSteps extends Base {

    @When("Verifies that {string} item name is present")
    public void verifiesThatItemNameIsPresent(String value) {

        else if(value.equals(newProducts_if.unisexSpongeFleeceName.getText())){
            textIsDisplayedAndEnabled(value,newPunisexSpongeFleeceName);
            //System.out.println(newProducts_if.babyJerseyName.getText());
        }
        else if(value.equals(newProducts_if.babyJerseyName.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.babyJerseyName);
        }
        else if(value.equals(newProducts_if.unisexVNeckTeeName.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.unisexVNeckTeeName);
        }
        if(value.equals(newProducts_if.embroideredApronName.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.embroideredApronName);
            // System.out.println(newProducts_if.unisexSpongeFleeceName.getText());   sonraki element gorunmuyordu, bu satirla kodda nasil yazdigini gorduk
        }
        else logger.warn("Error");
    }


}
