package com.roofstacks.step_definitions;

import com.roofstacks.page.GooglePage;
import com.roofstacks.page.RoofCareerPage;
import com.roofstacks.page.RoofHomePage;
import com.roofstacks.utilities.BrowserUtils;
import com.roofstacks.utilities.ConfigurationReader;
import com.roofstacks.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class taskStepDef {
    GooglePage googlePage = new GooglePage();
    RoofHomePage roofHomePage = new RoofHomePage();
    RoofCareerPage roofCareerPage = new RoofCareerPage();


    @Given("the user is on the google main page")
    public void the_user_is_on_the_google_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("the user search {string} on google")
    public void the_user_search_on_google(String searchItem) {
        googlePage.googleSearchBox.sendKeys(searchItem);
        googlePage.googleSearchBox.sendKeys(Keys.ENTER);

    }

    @When("the user selected {string} link from the options")
    public void the_user_selected_link_from_the_options(String linkName) {
        googlePage.searchLink(linkName).click();
    }

    @When("the user clicks to {string} module")
    public void the_user_clicks_to_module(String moduleName) {
        roofHomePage.navigateToModules(moduleName);
    }


    @When("the user selects {string} position")
    public void the_user_selects_position(String positionName) {
        //BrowserUtils.scrollDownElement();
        BrowserUtils.scrollToElement(roofCareerPage.positions(positionName));
        roofCareerPage.positions(positionName).click();
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String title) {
        Assert.assertEquals(title,BrowserUtils.getTitle());
    }

    @When("the user clicks to Send CV button")
    public void the_user_clicks_to_Send_CV_button() {
        BrowserUtils.scrollToElementSecondMethod(roofCareerPage.sendCvButton);
        roofCareerPage.sendCvButton.click();

    }

    @When("the user upload a file to send CV")
    public void the_user_upload_a_file_to_send_CV() {
        roofCareerPage.selectFileBox.sendKeys(BrowserUtils.uploadFilePath(roofCareerPage.selectFileBox));

    }


    @When("the user sends to {string} as an email address")
    public void the_user_sends_to_as_an_email_address(String email) {
        roofCareerPage.emailBox.sendKeys(email);

    }

    @When("the user clicks to upload button")
    public void the_user_clicks_to_upload_button() {
        roofCareerPage.uploadButton.click();
    }

    @Then("the percent should be {string}")
    public void the_percent_should_be(String percent) {
        BrowserUtils.waitForVisibility(roofCareerPage.percent,20);
        Assert.assertEquals(percent,roofCareerPage.percent.getText());
    }









}
