package Steps;

import Pages.MapPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MapSteps extends CommonStepDefinition {
    private MapPage mapPage;
    private static IOSDriver<IOSElement> driver;

    @Given("^I open the app$")
    public void iOpenTheApp() {
       driver = getDriver();
        System.out.println("hello maap");
    }


    @And("^the map screen is displayed$")
    public void theMapScreenDisplayed() {
        mapPage = new MapPage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        try  {
            assertEquals(true, mapPage.isDisplayed("UI-Iv-Logo"));
        }
        catch(AssertionError ae) {
            verificationErrors.append("Value is incorrect- "+ae.getMessage());
        }

    }

    @When("^click on the map red corner$")
    public void iClickOnTheMapRedCorner() {
        mapPage.clickOnMapRedCorner();
    }

    @Then("^DataCenters lists menu should be displayed$")
    public void theMachinesListMenuShouldBeDisplayed() {
        //TODO
    }

    @When("^I click on All Location button$")
    public void iClickOnAllLocationButton() {
        mapPage.clickOnAllLocationButton();
    }
}
