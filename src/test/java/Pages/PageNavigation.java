package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageNavigation extends BasicTest {


    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    private WebElement secondPage;

    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    private WebElement addCustom;

    public PageNavigation(WebDriver webDriver) {
        super(webDriver);
    }

    public PageNavigation changePage(){
        secondPage.click();
        addCustom.click();
        return this;
    }

}