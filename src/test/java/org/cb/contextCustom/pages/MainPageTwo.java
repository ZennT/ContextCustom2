package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageTwo {
    public MainPageTwo() {
        PageFactory.initElements(MyDriver.get(),this);
    }
    @FindBy(xpath = "//i[@class='navbar-tool-icon czi-search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//div[@class='navbar-tool-text ml-n3']")
    public WebElement myAccount;

    @FindBy(xpath = "//i[@class='navbar-tool-icon czi-cart']")
    public WebElement cartIcon;

    @FindBy(xpath = "//a[@class='navbar-tool-text']")
    public WebElement myCart;

}
