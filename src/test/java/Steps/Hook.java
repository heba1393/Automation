package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
    @Before
    public void initalizeTest() {
        System.out.println("Start Test");
        CommonStepDefinition.getDriver();
    }

    @After
    public void endTest() {
        CommonStepDefinition.terminateDriver();
    }

}
