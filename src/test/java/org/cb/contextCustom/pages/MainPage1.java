package org.cb.contextCustom.pages;

import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage1 {

    public MainPage1() {
        PageFactory.initElements(MyDriver.get(), this);
    }


}
