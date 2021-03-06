package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAndLivingPage {

    public HomeAndLivingPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement categories;

    @FindBy(xpath = "(//a[@class='dropdown-item dropdown-toggle'])[3]")
    public WebElement homeAndLiving;

    @FindBy(xpath = "//a[text()='All Home & Living']")
    public WebElement allHomeAndLiving;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']")
    public WebElement textOfHomeAndLiving;
}
