import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Admitad\\automateAdm\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.admitad.com/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void openWebmasterPageFromHeaderNav(){
        WebmasterPage webmasterPage = mainPage.clickHeaderNavTabWebmaster();
        String url = webmasterPage.getUrl();
        Assert.assertTrue(url.contains("site/webmaster/"));
    }

    @Test
    public void openAdvertiserPageFromHeaderNav(){
        AdvertiserPage advertiserPage = mainPage.clickHeaderNavTabAdvertiser();
        String url = advertiserPage.getUrl();
        Assert.assertTrue(url.contains("site/advertiser/"));
    }

    @Test
    public void openWebmasterPageFromInfoSection(){
        WebmasterPage webmasterPage = mainPage.clickInfoSectionPublishersButton();
        String url = webmasterPage.getUrl();
        Assert.assertTrue(url.contains("site/webmaster/"));
    }

    @Test
    public void openAdvertiserPageFromInfoSection(){
        AdvertiserPage advertiserPage = mainPage.clickInfoSectionAdvertisersButton();
        String url = advertiserPage.getUrl();
        Assert.assertTrue(url.contains("site/advertiser/"));
    }

    @Test
    public void openCompliancePageFromComplianceSection(){
        ComlpiancePage comlpiancePage = mainPage.clickComplianceSectionPublishersButton();
        String url = comlpiancePage.getUrl();
        Assert.assertTrue(url.contains("site/webmaster/compliance"));
    }

    @Test
    public void openBrandSafetyPageFromComplianceSection(){
        BrandSafetyPage brandSafetyPage = mainPage.clickComplianceSectionAdvertisersButton();
        String url = brandSafetyPage.getUrl();
        Assert.assertTrue(url.contains("site/advertiser/brand-safety/"));
    }

    @Test
    public void openReviewMegababosPageFromSuccessStoriesSection() {
        ReviewMegababosPage reviewMegababosPage = mainPage.clickSuccessStoriesSectionWebmastersCard();
        if(reviewMegababosPage != null) {
            String url = reviewMegababosPage.getUrl();
            Assert.assertTrue(url.contains("site/webmaster/reviews/kejs-veb-mastera-megababos-komanda-arbitrazhnikov-trafika/"));
        } else {
            Assert.assertNull(reviewMegababosPage);
        }
    }

    @Test
    public void openCompliancePageFromHeaderNav() {
        ComlpiancePage comlpiancePage = mainPage.clickHeaderNavTabWebmasterCompliance();
        String url = comlpiancePage.getUrl();
        Assert.assertTrue(url.contains("site/webmaster/compliance"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
