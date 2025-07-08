package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPageObject extends BaseClass{
    private final By titleLbl = By.className("title");

    public ProductsPageObject(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        waitElement(titleLbl);
        return getText(titleLbl);
    }
}
