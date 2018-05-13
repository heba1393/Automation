package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(glue = "Steps",
        features = {"src/test/java/Featuers/AllLocation.Feature","src/test/java/Featuers/map.Feature"},
        tags = {"@SmokeTest"}
)
public class SmokeTestsRunner {

}
