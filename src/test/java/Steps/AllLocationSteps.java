package Steps;

import Pages.AllLocationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import static org.junit.Assert.assertEquals;

public class AllLocationSteps extends StepsBase {

    private IOSDriver<IOSElement> driver=getDriver();
    private AllLocationPage allLocationPage = new AllLocationPage(driver);

    @Then("^All Location screen will be displayed$")
    public void allLocationScreenWillBeDisplayed() {
        try {
            assertEquals(true, allLocationPage.isDisplayed("UI-Lbl-Location"));
        } catch (AssertionError ae) {
            verificationErrors.append("Value is incorrect- ").append(ae.getMessage());
        }
    }

//    @When("^I click on Down button$")
//    public void iClickOnDownButton() {
//        allLocationPage.clickOnDownButton();
//    }

    @Then("^Down machines will be displayed$")
    public void downMachinesWillBeDisplayed() {
        //TODO
    }

//    @When("^I click on Active button$")
//    public void iClickOnActiveButton() {
//        allLocationPage.clickOnActiveButton();
//
//    }

    @Then("^Active machines will be displayed$")
    public void activeMachinesWillBeDisplayed() {
        // TODO
    }

    @Then("^Load Balancer machines will be displayed$")
    public void loadbalancerMachinesWillBeDisplayed() {
        //TODO
    }

//    @And("^I Search for FFive machines$")
//    public void iSearchForFFiveMachines() {
//        allLocationPage.searchForMachine("F5");
//    }
}
