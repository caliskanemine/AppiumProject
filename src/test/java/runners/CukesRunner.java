package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html"
        },
        monochrome = true,
        features = "src/test/resources",
        glue = {"step_Defs", "hooks"},
        tags = "@google",
        dryRun = false
)
public class CukesRunner {
}