package stepdefinitions.database_step_defs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

public class Create_Step_Definitions {

    @When("user creates a new hotel with this values {string}")
    public void user_creates_a_new_hotel_with_this_values(String hotelData) {
    String query ="INSERT INTO tHOTEL (Code,Name,Address,Phone,Email,CreateDate,CreateUser) " +
        "VALUES ("+hotelData+");";
// INSERT INTO tHOTEL (Code,Name,Address,Phone,Email,CreateDate,CreateUser)
//   VALUES ('3000','Royal King Hotel','LA Downtown','8889900','royalla@testemail.com','2021-10-10 19:40:47.597', 4);
        DBUtils.executeQuery(query);
    }

    @Then("verify the creation is successful")
    public void verify_the_creation_is_successful() {
        //Asserting if tHOTEL table Name column contains Royal King Hotel - the one that we just created
//        DBUtils
//        .getColumnData("SELECT Name FROM tHOTEL","Name")
//        .toString().contains("Royal King Hotel");
String columnListString = DBUtils.getColumnData("SELECT Name FROM tHOTEL","Name").toString();
        System.out.println("Column list as String: " + columnListString);
        System.out.println(columnListString.contains("Royal King Hotel"));
        Assert.assertTrue(columnListString.contains("Mustafa Royal King Hotel"));

    }

}
