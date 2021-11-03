package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement advancedLink;

    @FindBy(id = "proceed-link")
    public WebElement proceedLink;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userName;

    @FindBy (id = "Password" )
    public WebElement password;

    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement loginButton;






}
