package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.contextCustom.pages.NewProductsNames;

public class NewProductsNamesSteps extends Base {

    NewProductsNames newProductsNames = new NewProductsNames();

    @When("Verifies that {string} item name is present")
    public void verifiesThatItemNameIsPresent(String value) {

        if(value.equals(newProductsNames.unisexSpongeFleeceName.getText())){
            textIsDisplayedAndEnabled(value,newProductsNames.unisexSpongeFleeceName);
            //System.out.println(newProducts_if.babyJerseyName.getText());
        }
        else if(value.equals(newProductsNames.babyJerseyName.getText())){
            textIsDisplayedAndEnabled(value,newProductsNames.babyJerseyName);
        }
        else if(value.equals(newProductsNames.unisexVNeckTeeName.getText())){
            textIsDisplayedAndEnabled(value,newProductsNames.unisexVNeckTeeName);
        }
        else if(value.equals(newProductsNames.embroideredApronName.getText())){
            textIsDisplayedAndEnabled(value,newProductsNames.embroideredApronName);
            // System.out.println(newProducts_if.unisexSpongeFleeceName.getText());   sonraki element gorunmuyordu, bu satirla kodda nasil yazdigini gorduk
        }
        else logger.warn("Error");
    }


}
