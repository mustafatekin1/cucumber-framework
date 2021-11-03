package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day17_GoogleSearchStepDefinitions {

    //This class has Java code
    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

    }

    GooglePage googlePage = new GooglePage();

    @Given("user search for iphone")
    public void user_search_for_iphone() {

        googlePage.googleSearchBox.sendKeys("iPhone" + Keys.RETURN);
    }

    @Then("verify the result as iphone")
    public void verify_the_result_as_iphone() {
        String expTitle = "iPhone";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expTitle));
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @Given("user search for teapot")
    public void user_search_for_teapot() {
        googlePage.googleSearchBox.sendKeys("teapot" + Keys.ENTER);
    }

    @Then("verify the result has teapot")
    public void verify_the_result_has_teapot() {
        String expTitle = "teapot";
        Assert.assertTrue(Driver.getDriver().getTitle().contains("teapot"));
    }

    @Given("user search for flower")
    public void user_search_for_flower() {
        googlePage.googleSearchBox.sendKeys("flower" + Keys.ENTER);
    }

    @Then("verify the result has flower")
    public void verify_the_result_has_flower() {
        String expTitle = "flower";
        Assert.assertTrue(Driver.getDriver().getTitle().contains("flower"));
    }

    @Given("user search for bmw")
    public void user_search_for_bmw() {
        googlePage.googleSearchBox.sendKeys("bmw" + Keys.RETURN);
    }

    @Then("verify the result has bmw")
    public void verify_the_result_has_bmw() {
        String expTitle = "bmw";
        Assert.assertTrue(Driver.getDriver().getTitle().contains("bmw"));
    }

    @Given("user search for {string}")
    public void user_search_for(String string) {
    googlePage.googleSearchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("verify the result has {string}")
    public void verify_the_result_as(String string) {
     Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }
}
