package stepdefinitions.database_step_defs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.Set;

public class Read_Step_Definitions {
    @Given("user connects to DB")
    public void user_connects_to_db() {
        DBUtils.createConnection();
    }
//Our url is the following:
//app_url_crystal=https://qa-environment.crystalkeyhotels.com/admin/HotelRoomAdmin
    @Given("user gets the {string} from {string} table")
    public void user_gets_the_from_table(String column, String table) {
    //column = price, table = tHOTELROOM
//        Writing the query
        String myDynamicQuery = "Select "+column+" from "+table;
//        Executing the query. This takes us to the column from the table
        DBUtils.executeQuery(myDynamicQuery);
//      I am at Price column on the Hotel Room(column = Price, table = tHOTELROOM)

    }
    @Given("user reads all of the {string} column data")
    public void user_reads_all_of_the_column_data(String column) throws SQLException {
        //     How you an go to row 5
        //resultset.absolute(row);-> to go to specific row number
        DBUtils.getResultset().absolute(5);//Now i am on row 5

        //getObject(columnName);-> returns the data on that column row
        //This gives us the 5th row data in price column
        Object columnData = DBUtils.getResultset().getObject(column);
        System.out.println(columnData);

        DBUtils.getResultset().next();
        Object nextColumnData = DBUtils.getResultset().getObject(column);
        System.out.println(nextColumnData);

        DBUtils.getResultset().next();
        Object nextNextColumnData = DBUtils.getResultset().getObject(column);
        System.out.println(nextNextColumnData);

        String columnString = DBUtils.getResultset().getString(column);
        System.out.println("column as string: " + columnString);
        Assert.assertTrue(columnString.contains("NEW"));
        //we can manipulate string data with more options.

//        How to get all of the price column data
        DBUtils.getResultset().absolute(0);
        while (DBUtils.getResultset().next()){
            Object eachColumnData=DBUtils.getResultset().getObject(1);
            System.out.println(eachColumnData);
        }
    }
    @Then("close the connection")
    public void close_the_connection() {
    DBUtils.closeConnection();
    }

}
