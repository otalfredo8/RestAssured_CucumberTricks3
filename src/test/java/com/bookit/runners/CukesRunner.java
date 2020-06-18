package com.bookit.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target//json-reports/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/bookit/step_definitions",
         dryRun = false,
//        tags = "@api and @create_student"
        tags = "@api and @delete_student"

)
public class CukesRunner { //To run with TestNG "extends AbastractTestNGCucumberTest"
}
