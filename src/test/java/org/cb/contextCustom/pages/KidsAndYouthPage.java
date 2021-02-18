package org.cb.contextCustom.pages;
import org.cb.contextCustom.stepdef.Base;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsAndYouthPage extends Base {

    Actions action = new Actions(MyDriver.get());

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement categories;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[5]")
    public WebElement kidsAndYouth;

    @FindBy(linkText = "All Kids & Youth Clothing")
    public WebElement allKids;

    @FindBy(xpath = "//li[@class='breadcrumb-item text-nowrap active']")
    public WebElement imageOfText;

    public void moveOnToCategoriesDropdownMenu(){
        moveToElement(categories);
    }

    public KidsAndYouthPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }
}
