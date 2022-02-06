package com.roofstacks.page;

import com.roofstacks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePage{

    public GooglePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "input[title='Ara']")
    public WebElement googleSearchBox;

    public WebElement searchLink(String linkName){
        String locator = "(//cite[.='" + linkName + "'])[1]";
        return Driver.get().findElement(By.xpath(locator));
    }







}
