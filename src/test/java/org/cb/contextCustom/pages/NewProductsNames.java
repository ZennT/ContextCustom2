package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProductsNames {

    public NewProductsNames() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Unisex Sponge Fleece Drop Shoulder Sweatshirt')]")
    public WebElement unisexSpongeFleeceName;

    //  @FindBy(xpath = "(//h3[@class='product-title font-size-sm'])[3]")
    @FindBy(xpath = "//a[contains(text(),'Baby Jersey Short Sleeve One Piece |')]")
    public WebElement babyJerseyName;

    @FindBy(xpath = "//a[normalize-space()='Unisex V-Neck Tee | Bella + Canvas 3005']")
    public WebElement unisexVNeckTeeName;

    @FindBy(xpath = "//a[normalize-space()='Embroidered Apron']")
    public WebElement embroideredApronName;
}
