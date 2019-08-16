package Nintendo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobOpeningsPage extends BasePage {

    public JobOpeningsPage (WebDriver driver) {super(driver);}

    @FindBy (xpath = "//*[@id=\"190000007B\"]")
    private WebElement softwareTester;

    public void clickSoftwareTester() {
        softwareTester.click();
    }
}
