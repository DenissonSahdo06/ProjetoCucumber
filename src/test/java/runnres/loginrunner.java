package runnres;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features/login.feature",
        tags = "@loginrunner",
        glue = "steps",
        monochrome = true,
        dryRun = false
)
public class loginrunner {

}
