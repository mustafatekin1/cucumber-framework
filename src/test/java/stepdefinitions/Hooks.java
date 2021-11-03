package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Hooks has @Before and @After annotations
    We create a Hooks under StepDefinitions folder (package)
    Hooks is like TestBase class we had in previous frameworks.
    We do not need to extend. It automatically extends
    @Before @After runs before and after scenarios
In cucumber
@After
- we put close the app/url
- we put reports
- we put screenshots
     =>>(TakesScreenshot) method comes from Selenium
     which means that we can take screenshots
     "in JUnit and TestNG also"
     */

@Before
    public void setUp(){
    System.out.println("This is Hooks Before method");
}

@After
    public void tearDown(Scenario scenario) {
    // System.out.println("This is Hooks After method");
    //getting the screenshot
    final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

//       Attaching the screenshot to the scenarios in the default-cucumber-reports.html
    if (scenario.isFailed()) {
        scenario.attach(screenshot, "image/png", "Screenshot");
    }
    //Driver.closeDriver();
    }
}
