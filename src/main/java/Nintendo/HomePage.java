package Nintendo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {super(driver);}

    @FindBy(css = "a[href^=\"https://careers.nintendo.com\"]")
    private WebElement careersButton;

    public CareersPage clickCareersButton() {
        careersButton.click();
        return new CareersPage(driver);
    }
}
