package com.roofstacks.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    /**
     * Performs a pause
     *
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     *  checks that an element is present on the DOM of a page. This does not
     *    * necessarily mean that the element is visible.
     * @param by
     * @param time
     */
    public static void waitForPresenceOfElement(By by, long time) {
        new WebDriverWait(Driver.get(), time).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /**
     * Waits for element matching the locator to be visible on the page
     *
     * @param locator
     * @param timeout
     * @return
     */
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * attempts to click on provided element until given time runs out
     *
     * @param element
     * @param timeout
     */
    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }

    /**
     * return a list of string from a list of elements
     *
     * @param list of webelements
     * @return list of string
     */
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }


    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element
     * @param timeToWaitInSec
     * @return
     */
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    /**
     * Waits for provided element to be clickable
     *
     * @param element
     * @param timeout
     * @return
     */
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    /**
     * Scrolls down to an element using JavaScript
     *
     * @param element
     */
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollToElementSecondMethod(WebElement element){
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element);
        actions.perform();
    }

    /**
     * Scrolls up
     *
     */
    public static void scrollUpElement() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                jse.executeScript("window.scrollBy(0,-250)");
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Scrolls down
     */
    public static void scrollDownElement() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(500);
                jse.executeScript("window.scrollBy(0,250)");
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Clicks on an element using JavaScript
     *
     * @param element
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
    }

    /**
     * If there is just a window to switch use that method.
     */
    public static void switchToWindow(){
        String currentWindowHandle = Driver.get().getWindowHandle();

        Set<String> windowHandles = Driver.get().getWindowHandles();

        for (String handle : windowHandles) {
            if(!handle.equals(currentWindowHandle)){
                Driver.get().switchTo().window(handle);
            }
        }
    }

    public static String getTitle(){
        return Driver.get().getTitle();
    }

    public static void hoverOver(WebElement locator){
        Actions builder = new Actions(Driver.get());
        builder.moveToElement(locator).perform();
    }

    public static String uploadFilePath(WebElement element){
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        String filePath = "src/test/resources/SampleTask.pdf";
        String fullPath = projectPath + "/" + filePath;
        System.out.println(fullPath);
        return fullPath;
    }



}
