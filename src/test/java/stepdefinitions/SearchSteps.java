package stepdefinitions;

import  medialabai.pages.HomePage;

import medialabai.pages.SearchResultsPage;
import utils.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.WebDriverManager;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class SearchSteps {

    private WebDriver driver;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Before
    public void setUp() {
        driver=WebDriverManager.getDriver();
        //driver = WebDriverManager.getDriver();
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @After
    public void tearDown() {
        WebDriverManager.quitDriver();
    }

    @Given("a user is on the product search page")
    public void userIsOnProductSearchPage() {
        driver.get("https://magento2-demo.scandiweb.com/");


    }

    @When("the user enters a search term {string} in the search bar")
    public void userEntersSearchTerm(String searchTerm) {

        homePage.enterSearchTerm(searchTerm);
    }

    @When("the user presses the {string} key")
    public void userPressesKey(String key) {
       // if (key.equalsIgnoreCase("Enter")) {
         //   homePage.pressEnterKey();
       // }
    }

    @Then("the product listing area should display products matching the search term")
    public void productListingShouldDisplayMatchingProducts() {
        // expected and actual

        //ass
        assertTrue(true);
        assertTrue(searchResultsPage.areProductsDisplayed());
        //assertTrue("Products should be displayed", searchResultsPage.areProductsDisplayed());
    }

    @Then("a message {string} should be displayed in the product listing area")
    public void noResultsMessageShouldBeDisplayed(String expectedMessage) {
        assertTrue("No results message should be displayed", searchResultsPage.isNoResultsMessageDisplayed());
        assertEquals("No results message text should match", expectedMessage, searchResultsPage.getNoResultsMessageText());
    }

    @Then("the product listing area should be updated accordingly")
    public void productListingAreaShouldBeUpdated() {
        // This step can be implemented based on your specific requirements
        // For example, you can check if the page title has changed, or if the URL includes the search term
        assertTrue("Search results page should be displayed", driver.getCurrentUrl().contains("search"));
    }
}

