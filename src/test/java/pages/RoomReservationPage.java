package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomReservationPage {

public RoomReservationPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy (partialLinkText = "ADD ROOM RESERVATION")
public WebElement addRoomReservation;

@FindBy (id = "IDUser")
public WebElement iDUser;

@FindBy (id="IDHotelRoom")
public WebElement iDHotelRoom;

    @FindBy (id="Price")
    public WebElement price;

    @FindBy (id="DateStart")
    public WebElement dateStart;

    @FindBy (id="DateEnd")
    public WebElement dateEnd;

    @FindBy (id="AdultAmount")
    public WebElement adultAmount;

    @FindBy (id="ChildrenAmount")
    public WebElement childrenAmount;

    @FindBy (id="ContactNameSurname")
    public WebElement contactNameSurname;

    @FindBy (id="ContactPhone")
    public WebElement contactPhone;

    @FindBy (id="ContactEmail")
    public WebElement contactEmail;

    @FindBy (id="Notes")
    public WebElement notes;

    @FindBy (id="Approved")
    public WebElement approved;

    @FindBy (id="IsPaid")
    public WebElement isPaid;

    @FindBy (id="btnSubmit")
    public WebElement saveButton;

    @FindBy (xpath = "//div[@class='bootbox-body']")
    public WebElement successMessage;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement oKButton;
}
