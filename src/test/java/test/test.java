package test;

import common.MobDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {


    private static IOSDriver<IOSElement> driver;

    Boolean x = true;

    @Before
    public void mapTest() throws Exception {
        driver = MobDriver.initDriver();
    }

    @Test
    public void sampleTest() throws Exception {


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("UI-Btn-AllLocation")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Boolean isMapDisplayed2 = driver.findElement(By.id("UI-Lbl-Location")).isDisplayed();
        System.out.println(isMapDisplayed2);


        Boolean isMapDisplayed3 = driver.findElement(By.id("UI-Btn-DownDevices")).isDisplayed();
        System.out.println(isMapDisplayed3);



//        List<IOSElement> labels = driver.findElementsByClassName("XCUIElementTypeCollectionView");
//
//        IOSElement parentElement = (IOSElement) ((IOSDriver) driver).findElementByIosNsPredicate("(type = \"XCUIElementTypeCollectionView\")");
//        List<MobileElement> rows = parentElement.findElementsByIosNsPredicate("(type = \"XCUIElementTypeCell\")");
//        MobileElement cellElement = rows.get(rows.size() - 2);
//        System.out.println("I'm " + cellElement.getAttribute("name"));
//        List<MobileElement> videoButtons = cellElement.findElementsById("UI-Btn-AllLocation");
//
//        System.out.println(cellElement.isDisplayed());
//


        try {
            Thread.sleep(3000);
        } catch (Exception ex) {

            System.out.println("waiting faild ");
        }
        System.out.println("Test passed");
    }

    @After
    public void after() {
        driver.quit();
    }
}
