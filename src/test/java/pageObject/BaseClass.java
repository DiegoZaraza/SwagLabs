package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseClass {
    protected static WebDriver driver;
    private static final By btnHome = By.xpath("//a[contains(text(),'Home')]");
    private static final By btnTop = By.xpath("//button");
    private final By btnAdd = By.xpath("//a[[contains(text(),'Add')]]");

    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }

    protected static void click(By locator) {
        driver.findElement(locator).click();
    }

    protected static void type(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    protected List<WebElement> findObjects(By locator) {
        return driver.findElements(locator);
    }

    protected String getAttribute(By locator, String property) {
        return driver.findElement(locator).getDomAttribute(property);
    }

    protected List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    protected boolean isElementPresent(By locator) {
        return !driver.findElements(locator).isEmpty();
    }


    protected void waitElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    protected void scrollDownUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)", "");
    }

    public static void clickOnHome() {
        click(btnHome);
    }

    public static void clickOnTop() {
        click(btnTop);
    }

    public void clickOnAdd() {
        click(btnAdd);
    }
}