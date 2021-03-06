package autoTestFramework.testPageObjects.homepage;

import autoTestFramework.testFramework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends BasePage {

    @FindBy(xpath = "//input[@title = 'Search']")
    public WebElement searchBox;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }
}