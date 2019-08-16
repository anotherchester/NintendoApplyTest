package Nintendo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {super(driver);}

    @FindBy(css = "#page-container > div > div > div.footer.aem-GridColumn.aem-GridColumn--default--12 > footer > div:nth-child(1) > div > div > div > nav > div > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    private WebElement careersButton;

    public CareersPage clickCareersButton() {
        careersButton.click();
        return new CareersPage(driver);
    }
}
