package StepDefinitions;

import autoTestFramework.testPageObjects.homepage.GoogleHomePage;
import autoTestFramework.testPageObjects.homepage.SearchResultsPage;
import cucumber.api.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class HomePageTests {

    protected WebDriver driver;

    @Given("^chrome is open and Google website has been launched$")
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Automation\\autoTestFramework\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.co.in");
        driver.manage().window().maximize();
    }

    @When("user enters (.*?) as the search term and presses enter")
    public void enterSearchTerm(String searchTerm) {
        GoogleHomePage homePage = new GoogleHomePage(driver);
        homePage.waitUntilVisible(homePage.searchBox);
        homePage.searchBox.sendKeys(searchTerm + Keys.ENTER);
    }

    @Then("the search results page loads")
    public void theSearchResultsPageLoads() {
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        assertEquals("India", searchResultsPage.resultPageSearchBox.getAttribute("value"));
        searchResultsPage.waitUntilVisible(searchResultsPage.resultStats);
        assertTrue(searchResultsPage.resultStats.isDisplayed());
    }
}
