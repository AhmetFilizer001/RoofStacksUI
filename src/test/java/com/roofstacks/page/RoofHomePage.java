package com.roofstacks.page;

import com.roofstacks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RoofHomePage extends BasePage{

    public RoofHomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public WebElement modules(String moduleName){
        String locator = "a[title='" + moduleName + "']";
        return Driver.get().findElement(By.cssSelector(moduleName));
    }

}
