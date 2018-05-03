package Steps;

import Pages.AllLocationPage;
import Pages.MapPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AllLocationSteps extends CommonStepDefinition {

    private static IOSDriver<IOSElement> driver = getDriver();

    private AllLocationPage allLocationPage = new AllLocationPage(driver);

    @Then("^All Location screen will be displayed$")
    public void allLocationScreenWillBeDisplayed() {
        try {
            assertEquals(true, allLocationPage.isDisplayed("UI-Lbl-Location"));
        } catch (AssertionError ae) {
            verificationErrors.append("Value is incorrect- " + ae.getMessage());
        }

    }

    @When("^I click on Down button$")
    public void iClickOnDownButton() {
        allLocationPage.clickOnDownButton();
    }

    @Then("^Down machines will be displayed$")
    public void downMachinesWillBeDisplayed() {
        //TODO
    }

    @When("^I click on Active button$")
    public void iClickOnActiveButton() {
        allLocationPage.clickOnActiveButton();

    }

    @Then("^Active machines will be displayed$")
    public void activeMachinesWillBeDisplayed() {
        // TODO

    }

    @When("^I Search for F(\\d+)$")
    public void iSearchForF(int arg0) {
        allLocationPage.searchForMachine("F5");
    }

    @Then("^Load Balancer machines will be displayed$")
    public void loadbalancerMachinesWillBeDisplayed() {
    //TODO
    }


}
