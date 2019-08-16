package Nintendo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends BasePage {

    public CareersPage(WebDriver driver) {super(driver);}

    @FindBy (css = "#searchInput")
    private WebElement searchField;

    public void fillSearchField(String text) {
        searchField.sendKeys(text);
    }

    @FindBy (css = "#btn-search")
    private WebElement searchButton;

    public JobOpeningsPage clickSearchButton() {
        searchButton.click();
        return new JobOpeningsPage(driver);
    }
}
