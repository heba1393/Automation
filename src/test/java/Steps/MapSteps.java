package Steps;

import common.MobDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MapSteps {
    private static IOSDriver<IOSElement> driver;

    @Given("^I open the app$")
    public void iOpenTheApp() {
        driver = MobDriver.initDriver();
    }

    @And("^I am on the map screen$")
    public void iAmOnTheMapScreen() {
    }

    @Then("^the machines list menu should be displayed$")
    public void theMachinesListMenuShouldBeDisplayed() {
    }

    @When("^I click on the map red corner$")
    public void iClickOnTheMapRedCorner() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"0\"]")).click();        //issue  ^^^

    }


}
