package com.roofstacks.page;

import com.roofstacks.utilities.BrowserUtils;
import com.roofstacks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToModules(String moduleName){
        String moduleLocator = "a[title='" + moduleName + "']";

        try {
            //Driver.get().findElement(By.cssSelector(moduleLocator)).click();
            BrowserUtils.clickWithJS(Driver.get().findElement(By.cssSelector(moduleLocator)));
        }catch(Exception e){
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 5);
        }
    }


}
