package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensClothing {

    public WomensClothing() {

        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement categories;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[7]")
    public WebElement womenscloth;

    @FindBy(linkText = "All Women's Clothing")
    public WebElement allWomen;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']")
    public WebElement pageMapText;
}
