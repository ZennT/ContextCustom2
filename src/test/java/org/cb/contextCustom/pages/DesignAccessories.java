package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignAccessories {

    public DesignAccessories() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//div[@class='navbar-tool-text ml-n3']")
    public WebElement myAccount;

    @FindBy(xpath = "//input[@id='id_username_reg_pg']")
    public WebElement username;


    @FindBy(xpath = "//input[@id='id_password_reg_pg']")
    public WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement categories;

    @FindBy(xpath = "//a[@class='dropdown-item dropdown-toggle'][normalize-space()='Accessories']")
    public WebElement accessories;

    @FindBy(xpath = "//a[normalize-space()='All Accessories']")
    public WebElement allAccessories;

    @FindBy(xpath = "//img[@src='/media/images/EcoToteBack.png']")
    public WebElement firstProduct;

    @FindBy(xpath = "//input[@id='startDesigningButton']")
    public WebElement designingButton;

    @FindBy(xpath = "//input[@id='text-string']")
    public WebElement startTyping;

    @FindBy(xpath = "//button[@id='add-text']")
    public WebElement addTextButton;

    @FindBy(xpath = "//input[@id='addtocartButton']")
    public WebElement addToCartButton;



}




