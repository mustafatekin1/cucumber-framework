package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DefaultPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class Day19_LoginStepDefinitons {


    @Given("user is on the application page")
    public void user_is_on_the_application_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_qa_environment"));
        try{
            Thread.sleep(1000);
            loginPage.advancedLink.click();
            Thread.sleep(1000);
            loginPage.proceedLink.click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Advanced Link and Proceed Link is not displayed");
        }
    }

    LoginPage loginPage =
            new LoginPage();
    @Given("user enters manager id {string}")
    public void user_enters_manager_id(String string) {
    loginPage.userName.sendKeys(string, Keys.ENTER);
    }
    @Given("user enters manager password {string}")
    public void user_enters_manager_password(String string) {
    loginPage.password.sendKeys(string);
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
    loginPage.loginButton.click();
    }

    DefaultPage defaultPage = new DefaultPage();
    @Then("verify the {string} is displayed")
    public void verify_the_is_displayed(String string) throws InterruptedException {
    String actAccountName= defaultPage.accountName.getText();
    Assert.assertEquals(string, actAccountName);

    }

    @Given("user enters manager_id and manager_password")
    public void user_enters_manager_id_and_manager_password(DataTable credentials) {

// 1st way: Getting Data as List<String>
//    List<String> managerCredentialsRow_0 = credentials.row(0);// returns list
//        System.out.println(managerCredentialsRow_0);
//        System.out.println(managerCredentialsRow_0.get(0));// manager
//        System.out.println(managerCredentialsRow_0.get(1));// Manager1!
//
//     loginPage.userName.sendKeys(managerCredentialsRow_0.get(0));
//     loginPage.password.sendKeys(managerCredentialsRow_0.get(1));
//     // loginPage.loginButton.click();
//     // we must not write this because it is already written in this class

////  2nd way: Getting Data as List<List<String>>
//
//        List<List<String>> managerCredentials = credentials.asLists();
////        System.out.println(managerCredentials);//[[username, password], [manager, Manager1!]]
//        for (List<String> eachCredentials:managerCredentials){
//            System.out.println(eachCredentials);//[username, password],[manager, Manager1!]
//            System.out.println(eachCredentials.get(0));
//            System.out.println(eachCredentials.get(1));
//            if (!eachCredentials.get(0).equals("username")) {
//            loginPage.userName.sendKeys(eachCredentials.get(0));
//            loginPage.password.sendKeys(eachCredentials.get(1));
//            }
//        }


//        //OR USING LAMBDA
//        List<List<String>> managerCredentials = credentials.asLists();
//        managerCredentials.stream()
//                .filter(eachCredentials-> !(eachCredentials.get(0).equals("username")))
//                .forEach(eachCredentials-> {
//                    loginPage.userName.sendKeys(eachCredentials.get(0));
//                    loginPage.password.sendKeys(eachCredentials.get(1));
//                });

//        3. List<Map<String,String>>
List<Map<String, String>> managerCredentials = credentials.asMaps(String.class, String.class);
        System.out.println(managerCredentials);//[{username=manager, password=Manager1!}]
        for (Map<String,String> eachCredentials:managerCredentials){
            System.out.println(eachCredentials);
            loginPage.userName.sendKeys(eachCredentials.get("username"));
            loginPage.password.sendKeys(eachCredentials.get("userpassword"));
        }






    }





}
