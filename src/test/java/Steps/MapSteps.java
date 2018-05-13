package Steps;

import Pages.MapPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MapSteps extends StepsBase {

    private IOSDriver<IOSElement> driver = getDriver();
    private MapPage mapPage;

    @Given("^I open the app$")
    public void iOpenTheApp() {
        mapPage = new MapPage(driver);
    }

    @And("^the map screen is displayed$")
    public void theMapScreenDisplayed() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            assertEquals(true, mapPage.isDisplayed("UI-Iv-Logo"));
        } catch (AssertionError ae) {
            verificationErrors.append("Value is incorrect- ").append(ae.getMessage());
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

//    @When("^I click on All Location button$")
//    public void iClickOnAllLocationButton() {
//        mapPage.clickOnAllLocationButton();
//    }

//    @And("^I go back to the map screen$")
//    public void iGoBackToTheMapScreen()  {
//        mapPage.initMap();
//    }
}
