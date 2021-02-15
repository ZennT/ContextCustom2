package org.cb.contextCustom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(xpath = "//a[@class=\"navbar-brand d-none d-sm-block mr-4 order-lg-1\"]//img[1]")
    public WebElement logo;


}
