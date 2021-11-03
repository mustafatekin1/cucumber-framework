package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
                 },
        features = "src/test/resources/features", // path of the "features"
        glue = "stepdefinitions",
        // (we can use path of "stepdefinitions" but that did not work for me
        //they are at the same level with features package
        tags = "@room_reservation", // we tag the feature files which will be run
 // * we can use multiple tags with "or", "and"
 // * we can use multiple tags before scenarios: @smoke @login @logout
 //tags = "@smoke and @login" => runs the scenarios which have both
 //tags = "@smoke or @login" => runs the scenarios which have any of them
        dryRun = false // is used to check if there are any missing Java codes
                 // false means: run test on the browser and check if any Java codes are missing.
                 // true means : run test without browser (like chrome-headless) and check if any Java codes are missing.
                )
public class Runner {

    /*
    - Runner is used to run feature files
    - We do it with @RunWith(Cucumber.class)

    *** @CucumberOptions
    - We add the paths of features, stepdefinitions
    - And we can add tags, dryRun and report plug-ins (will be explained later)
     */




}
