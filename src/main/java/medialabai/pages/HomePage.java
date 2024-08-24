package medialabai.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "search")
    private WebElement searchBar;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchTerm(String searchTerm) {
        searchBar.clear();
        searchBar.sendKeys(searchTerm);
    }

    public void pressEnterKey() {
        searchBar.sendKeys(Keys.ENTER);
    }
}