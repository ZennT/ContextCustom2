package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensClothing {
    public MensClothing() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[6]")
    public WebElement menscloth;

    @FindBy(linkText = "All Men's Clothing")
    public WebElement allMen;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']")
    public WebElement mensClothingText;
}
