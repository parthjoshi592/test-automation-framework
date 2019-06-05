package autoTestFramework.functionalTests.homepage;

import autoTestFramework.testPageObjects.homepage.GoogleHomePage;
import autoTestFramework.testFramework.core.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleHomePageTests extends BaseTest {

    @Test
    public void homePageTests() {
        GoogleHomePage homePage = new GoogleHomePage(getDriver());
        driver.get("https://google.co.in");

        homePage.waitUntilVisible(homePage.searchBox);
        homePage.searchBox.sendKeys("India" + Keys.ENTER);
        assertEquals("India", homePage.searchBox.getAttribute("value"));
        homePage.waitUntilVisible(homePage.resultStats);
    }
}