package autoTestFramework.testPageObjects.homepage;

import autoTestFramework.testFramework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//input[@title = 'Search']")
    public WebElement resultPageSearchBox;

    @FindBy(xpath = "//div[@id = 'resultStats']")
    public WebElement resultStats;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
}