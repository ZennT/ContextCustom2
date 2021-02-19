package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoreProductsPage {

    public MoreProductsPage() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-outline-accent']")
    public WebElement moreProductsButton;

    @FindBy(xpath = "//img[@alt='accessories']")
    public WebElement accessoriesImage;

    @FindBy(xpath = "//h2[@class='h5']//a[contains(text(), 'Accessories')]")
    public WebElement accessories;

    @FindBy(xpath = "//a[@class='nav-link-style'][normalize-space()='Backpacks']")
    public WebElement backpacks;

    @FindBy(css = "img[alt='hats']")
    public WebElement hatImage;

    @FindBy(xpath = "//h2[@class='h5']//a[contains(text(),'Hats')]")
    public WebElement hats;

    @FindBy (xpath = "//a[@class='nav-link-style'][normalize-space()='Beanies']")
    public WebElement beanies;

    @FindBy (xpath = "//img[@alt='home-living']")
    public WebElement homeLivingImage;

    @FindBy (xpath = "//h2[@class='h5']//a[contains(text(),'Home & Living')]" )
    public WebElement homeLiving;

    @FindBy (xpath = "//a[@class='nav-link-style'][normalize-space()='Blankets']")
    public WebElement blankets;

    @FindBy (xpath = "//img[@alt='kids-youth-clothing']")
    public WebElement kidsYouthImage;

    @FindBy (xpath = "//h2[@class='h5']//a[contains(text(),'Kids & Youth Clothing')]")
    public WebElement kidsYouthClothing;

    @FindBy (xpath = "//a[@class='nav-link-style'][contains(text(),'Baby Bibs')]")
    public WebElement babybibs;

    @FindBy (xpath = "//img[@alt='mens-clothing']")
    public WebElement mensClothingImage;

    @FindBy (xpath = "//div[5]//div[1]//div[1]//h2[1]//a[1]")
    public WebElement mensClothing;

    //(//h2[@class='h5'][contains(text(),'Men's Clothing')])[5]

    @FindBy (xpath = "(//a[@class='nav-link-style'][contains(text(),'Bottoms')])[1]")
    public WebElement bottomsM;


    @FindBy (xpath = "//img[@alt='womens-clothing']")
    public WebElement womensClothingImage;

    @FindBy (xpath = "//div[6]//div[1]//div[1]//h2[1]//a[1]")
    public WebElement womensClothing;

    @FindBy (xpath = "(//a[@class='nav-link-style'][contains(text(),'Bottoms')])[2]")
    public WebElement bottomsW;








}
