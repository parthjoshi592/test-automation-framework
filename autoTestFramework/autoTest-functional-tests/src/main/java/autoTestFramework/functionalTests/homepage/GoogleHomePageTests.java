package autoTestFramework.functionalTests.homepage;

import autoTestFramework.testPageObjects.homepage.GoogleHomePage;
import autoTestFramework.testFramework.core.BaseTest;
import autoTestFramework.testPageObjects.homepage.SearchResultsPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GoogleHomePageTests extends BaseTest {

    @Test
    public void homePageTests() {
        GoogleHomePage homePage = new GoogleHomePage(getDriver());
        driver.get("https://google.co.in");

        homePage.waitUntilVisible(homePage.searchBox);
        homePage.searchBox.sendKeys("India" + Keys.ENTER);

        SearchResultsPage searchResultsPage = new SearchResultsPage(getDriver());

        assertEquals("India", searchResultsPage.resultPageSearchBox.getAttribute("value"));
        searchResultsPage.waitUntilVisible(searchResultsPage.resultStats);
        assertTrue(searchResultsPage.resultStats.isDisplayed());
    }
}