package Nintendo;

import org.junit.Test;

public class ApplyTest extends BaseTest {

    private BasePage basePage;
    private HomePage homePage;
    private CareersPage careersPage;
    private JobOpeningsPage jobOpeningsPage;

    @Test
    public void testApply() throws InterruptedException {

        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        careersPage = homePage.clickCareersButton();
        Thread.sleep(2500);
        careersPage.fillSearchField("tester");
        jobOpeningsPage = careersPage.clickSearchButton();
        Thread.sleep(3000);
        jobOpeningsPage.clickSoftwareTester();


    }
}
