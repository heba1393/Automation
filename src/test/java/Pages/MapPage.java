package Pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MapPage extends PageBase {

    public MapPage(IOSDriver<IOSElement> driver) {
        super(driver);
    }

    public MapPage clickOnMapRedCorner() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"0\"]")).click();
        return new MapPage(driver);
    }

    public MapPage clickOnAllLocationButton() {
        driver.findElement(By.id("UI-Btn-AllLocation")).click();
        return new MapPage(driver);
    }
}
