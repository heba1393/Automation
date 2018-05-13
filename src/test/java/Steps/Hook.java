package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
    @Before
    public void initalizeTest() {
        System.out.println("-----------------Start of Scenario-----------------");
    }

    @After
    public void endTest() {
        System.out.println("-----------------End of Scenario-----------------");
    }

}
