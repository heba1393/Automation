package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;

public class CommonStepDefinition extends StepsBase{

    private IOSDriver<IOSElement> driver=getDriver();

    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0){
        driver.findElement(By.id(arg0)).click();
    }

    @And("^I enter \"([^\"]*)\" into input field having id \"([^\"]*)\"$")
    public void iEnterIntoInputFieldHavingId(String arg0, String arg1){
        driver.findElement(By.id(arg1)).sendKeys(arg0);
    }
}
