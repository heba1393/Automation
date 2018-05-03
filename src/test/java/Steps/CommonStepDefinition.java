package Steps;


import common.MobDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class CommonStepDefinition {

    StringBuffer verificationErrors = new StringBuffer();

    private static IOSDriver<IOSElement> driver;

    protected static IOSDriver<IOSElement> getDriver() {
        if (driver == null) {
            driver = MobDriver.initDriver();
        }
        return driver;
    }

    public static void terminateDriver() {
        driver.close();
    }
}
