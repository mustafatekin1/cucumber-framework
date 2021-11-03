package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import utilities.ReusableMethods;

import java.io.IOException;

public class ReusableStepDefinitions {
    @Then("take the screenshot")
    public void take_a_screenshot() throws IOException {
    ReusableMethods.getScreenshot("capturing_screenshots");
    }


}
