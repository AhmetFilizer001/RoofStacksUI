package com.roofstacks.page;

import com.roofstacks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoofCareerPage extends BasePage{

    public RoofCareerPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//small[normalize-space()='Send CV']")
    public WebElement sendCvButton;

    @FindBy(xpath = "//input[@placeholder='Browse Computer']")
    public WebElement selectFileBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement uploadButton;

    @FindBy(id = "email")
    public WebElement emailBox;

    public WebElement positions(String positionName){
        String locator = "(//h4[normalize-space()='"+positionName+"']//parent::a//parent::div//preceding-sibling::*)[1]";
        return Driver.get().findElement(By.xpath(locator));
    }

    @FindBy(xpath = "//div[.='100%']")
    public WebElement percent;







}
