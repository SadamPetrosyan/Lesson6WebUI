
import Pages.CreatingAnAccount;
import Pages.PageNavigation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

// TODO: 14.12.2021 создание нового владельца счета в банке
public class PageObjectTest {

    private EventFiringWebDriver webDriver;
    protected WebDriverWait webDriverWait;

    @Test
    @DisplayName("Переход на страницу (Создание нового владельца счёта)")
    void PageNavigationTest(){
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
        new PageNavigation(webDriver).changePage();
    }
    @Test
    void CreatingAnAccountTest(){
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
        new CreatingAnAccount(webDriver).changePage()
                .changeFirstName("Tom")
                .changeLastName("Marvolo")
                .changePostCode("A1ML0RD")
                .buttonSubmit();
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