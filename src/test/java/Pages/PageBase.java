package Pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    IOSDriver<IOSElement> driver;
    private static final int ELEMENT_WAIT_PERIOD_SECS = 5;

    PageBase(IOSDriver<IOSElement> driver) {
        this.driver = driver;
    }

//    public static MapPage initMap() {
//        driver.findElement(By.id("UI-Btn-Map")).click();
//        return new MapPage(driver);
//    }

    public void waitUntilDisplay(String name) {
        WebDriverWait wait = new WebDriverWait(driver, ELEMENT_WAIT_PERIOD_SECS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(name)));
    }

    public Boolean isDisplayed(String id) {
        boolean isDisplayed = true;
        try {
            driver.findElement(By.id(id));
        } catch (NoSuchElementException e) {
            isDisplayed = false;
        }
        return isDisplayed;
    }

    public void closeDriver() {
        driver.quit();
    }

}
