package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestPage {
    //    This is 1st page class
//    This class should have ONLY TestAddressLoginPage object
//    We can also add major methods in this class
//    1. Create constructor
    public  TestPage(){
//        PageFactory.initElements will initilize this page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //    2. @FindBy :Used to find elements
//    NORMAL WAY:
//    WebElement username=Driver.getDriver.findElement(By.id("username"));
//    Page Object Model
    @FindBy(id="session_email")
    public WebElement email;
    @FindBy(id="session_password")
    public WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement singInButton;
}
