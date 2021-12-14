package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingAnAccount extends BasicTest {

    public CreatingAnAccount(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    private WebElement secondPage;

    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    private WebElement addCustom;

    @FindBy(xpath ="//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath ="//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath ="//input[@placeholder='Post Code']")
    private WebElement postCode;

    @FindBy (xpath ="//button[@type='submit']" )
    private WebElement buttonSubmit;


    public CreatingAnAccount changePage(){
        secondPage.click();
        addCustom.click();
        return this;
    }

    public CreatingAnAccount changeFirstName (String Fname){
        firstName.click();
        firstName.sendKeys();
        return this;
    }
    public CreatingAnAccount changeLastName (String Lname){
        lastName.click();
        lastName.sendKeys();
        return this;
    }
    public CreatingAnAccount changePostCode (String Pcod){
        postCode.click();
        postCode.sendKeys();
        return this;
    }
    public CreatingAnAccount buttonSubmit (){
        buttonSubmit.click();
        return this;
    }

}