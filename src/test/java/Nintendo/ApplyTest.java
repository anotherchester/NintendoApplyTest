package Nintendo;

import org.junit.Test;

public class ApplyTest extends BaseTest {

    private BasePage basePage;
    private HomePage homePage;
    private CareersPage careersPage;
    private JobOpeningsPage jobOpeningsPage;

    @Test
    public void testApply() {

        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        careersPage = homePage.clickCareersButton();
        careersPage.fillSearchField("tester");
        jobOpeningsPage = careersPage.clickSearchButton();
        jobOpeningsPage.clickSoftwareTester();


    }
}
