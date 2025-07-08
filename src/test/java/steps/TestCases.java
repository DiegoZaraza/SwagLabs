package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.ProductsPageObject;
import pageObject.SauceDemoPageObject;
import utilities.ConfigReader;
import utilities.Helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@Epic("Validate Login")
@Feature("Validate Login Functionality")
public class TestCases {
    private WebDriver driver;
    private SauceDemoPageObject sauceDemoPageObject;
    private ProductsPageObject productsPageObject;
    private Helper helper;
    WebDriverWait wait;

    @BeforeEach
    @Step("Setup WebDriver and initialize page objects")
    public void setup() throws MalformedURLException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(ConfigReader.get("TIMEOUT"))));
        driver.get(ConfigReader.get("URL"));
        driver.manage().window().maximize();
        sauceDemoPageObject = new SauceDemoPageObject(driver);
        productsPageObject = new ProductsPageObject(driver);
        helper = new Helper();
    }

    @AfterEach
    @Step("Tear down WebDriver")
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginSwag(){
        sauceDemoPageObject.performLogin(ConfigReader.get("VALID_USERNAME"), ConfigReader.get("VALID_PASSWORD"));

        assertEquals(ConfigReader.get("EXPECTED_TITLE"), productsPageObject.getTitle());
    }

    @Test
    public void invalidUser(){
        sauceDemoPageObject.performLogin(ConfigReader.get("VALID_USERNAME"), ConfigReader.get("INVALID_PASSWORD"));

        assertEquals(ConfigReader.get("EXPECTED_ERROR_MESSAGE"), sauceDemoPageObject.getErrorMessage());
    }
}