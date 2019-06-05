package autoTestFramework.testPageObjects.homepage;

import autoTestFramework.testFramework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class GoogleHomePage extends BasePage {

    @FindBy(xpath = "//input[@title = 'Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@id = 'resultStats']")
    public WebElement resultStats;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }
}
