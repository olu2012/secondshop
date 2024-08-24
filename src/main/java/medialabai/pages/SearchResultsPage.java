package medialabai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".description")
    private WebElement productWebElement;
    //private List<WebElement> productListings;

    @FindBy(css = ".description")
    private WebElement noResultsMessage;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean areProductsDisplayed() {

        return productWebElement.isDisplayed();
    }

    public boolean isNoResultsMessageDisplayed() {
        return noResultsMessage.isDisplayed();
    }

    public String getNoResultsMessageText() {
        return noResultsMessage.getText();
    }
}

