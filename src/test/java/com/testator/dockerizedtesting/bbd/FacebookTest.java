package com.testator.dockerizedtesting.bbd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:reports/test-report" },
        features = "src/test/resources/firstTest.feature",
        tags = { "@firstFeature","@firstScenario"}
)
public class FacebookTest {
}
