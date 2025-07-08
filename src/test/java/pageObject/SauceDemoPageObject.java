package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoPageObject extends BaseClass{
    public SauceDemoPageObject(WebDriver driver) {
        super(driver);
    }

    private final By userNameTxt = By.id("user-name");
    private final By userPasswordTxt = By.id("password");
    private final By loginBtn = By.id("login-button");
    private final By errorMessage = By.cssSelector("[data-test='error']");

    public void typeUserName (String user){
        type(userNameTxt, user);
    }

    public void typePassword (String pasword){
        type(userPasswordTxt, pasword);
    }

    public void clickLogin (){
        click(loginBtn);
    }

    public String getErrorMessage() {
        return getText(errorMessage);
    }

    public void performLogin(String user, String password) {
        typeUserName(user);
        typePassword(password);
        clickLogin();
    }
}
