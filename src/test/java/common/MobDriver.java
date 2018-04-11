package common;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobDriver {

    private static IOSDriver<IOSElement> driver;

    public static IOSDriver<IOSElement> initDriver() {

        String serverUrl = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad Pro (9.7-inch)");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/adnan/Desktop/MobileNOC.app");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        System.out.println("Argument to driver object : " + serverUrl);
        try {
            driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            throw new RuntimeException("appium driver could not be initialised for device ");
        }
        return driver;
    }

}

