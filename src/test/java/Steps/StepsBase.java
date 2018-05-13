package Steps;

import common.MobDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class StepsBase {

    StringBuffer verificationErrors = new StringBuffer();

    public static IOSDriver<IOSElement> driver;

    protected static IOSDriver<IOSElement> getDriver() {
        if (driver == null) {
            driver = MobDriver.initDriver();
        }
        return driver;
    }

    public static void terminateDriver() {
        driver.quit();
    }
}
