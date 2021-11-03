package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.RoomReservationPage;

import java.util.List;

public class Day20_RoomReservationStepDefinitons {
// we put login part  into LoginStepDefinitons
// because that class is more relevant

    DefaultPage defaultPage=new DefaultPage();
    RoomReservationPage roomReservationPage=new RoomReservationPage();
    @Given("user navigates to the create room reservation")
public void user_navigates_to_the_create_room_reservation() {
    defaultPage.hotelManagement.click();
    defaultPage.roomReservations.click();
    roomReservationPage.addRoomReservation.click();
}
    @Given("user enter all of the required fields")
    public void user_enter_all_of_the_required_fields(DataTable roomData) {
    List<String> listOfRoomData = roomData.row(1);
        System.out.println(listOfRoomData);

    //IDUser is a dropdown
    Select idUser = new Select(roomReservationPage.iDUser);
    idUser.selectByVisibleText(listOfRoomData.get(0));
    //Hotel is also dropdown
    Select idHotelRoom = new Select(roomReservationPage.iDHotelRoom);
    idHotelRoom.selectByVisibleText(listOfRoomData.get(1));

    roomReservationPage.price.sendKeys(listOfRoomData.get(2));
    roomReservationPage.dateStart.sendKeys(listOfRoomData.get(3));
    roomReservationPage.dateEnd.sendKeys(listOfRoomData.get(4));
    roomReservationPage.adultAmount.sendKeys(listOfRoomData.get(5));
    roomReservationPage.childrenAmount.sendKeys(listOfRoomData.get(6));
    roomReservationPage.contactNameSurname.sendKeys(listOfRoomData.get(7));
    roomReservationPage.contactPhone.sendKeys(listOfRoomData.get(8));
    roomReservationPage.contactEmail.sendKeys(listOfRoomData.get(9));
    roomReservationPage.notes.sendKeys(listOfRoomData.get(10));
    }
    @Given("user clicks on the approved checkbox")
    public void user_clicks_on_the_approved_checkbox() {
        roomReservationPage.approved.click();
    }
    @Given("user clicks on is paid check box")
    public void user_clicks_on_is_paid_check_box() {
        roomReservationPage.isPaid.click();
    }
    @Given("user clicks on save button")
    public void user_clicks_on_save_button() throws InterruptedException {

        roomReservationPage.saveButton.click();
        System.out.println(roomReservationPage.saveButton.getText());
    }
    @Then("user verifies the success message")
    public void user_verifies_the_success_message() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(roomReservationPage.successMessage.getText());
        Assert.assertTrue(roomReservationPage.successMessage.getText().contains("success"));
    }
    @Then("user clicks on OK button")
    public void user_clicks_on_ok_button() throws InterruptedException {
       Thread.sleep(2000);
        roomReservationPage.oKButton.click();
    }
}
