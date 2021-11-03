package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    //create contructor and page factory inside that

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy (xpath = "//*[@name='q']")
public WebElement googleSearchBox;


}
