package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;



@ExtendWith(AllureJunit5.class)
public class BasicTest {
    protected EventFiringWebDriver webDriver;
    protected WebDriverWait webDriverWait;

    String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject";

    public BasicTest(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);

    }

    @BeforeEach
    void setUp() {
        webDriver = new EventFiringWebDriver(WebDriverManager.chromedriver().create());
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 7);
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }
}