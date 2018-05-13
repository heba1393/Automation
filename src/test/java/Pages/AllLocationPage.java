package Pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;

public class AllLocationPage extends PageBase {

    public AllLocationPage(IOSDriver<IOSElement> driver) {
        super(driver);
    }

//    public AllLocationPage clickOnDownButton() {
//        driver.findElement(By.id("UI-Btn-DownDevices")).click();
//        return new AllLocationPage(driver);
//    }

//    public AllLocationPage clickOnActiveButton() {
//        driver.findElement(By.id("UI-Btn-ActiveDevices")).click();
//        return new AllLocationPage(driver);
//    }

//    public AllLocationPage searchForMachine(String name) {
//        driver.findElement(By.id("UI-TF-Search")).sendKeys(name);
//        return new AllLocationPage(driver);
//    }
}
