package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
    @Before
    public void initalizeTest()
    {
    System.out.println("Starthebaaaaaaaaaaaaaaaaa");
    }

    @After
    public void itearDownTest()
    {
        System.out.println("stophebaaaaaaaaaaaaaa");
    }

}
