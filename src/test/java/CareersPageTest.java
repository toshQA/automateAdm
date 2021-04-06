import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CareersPageTest {
    private WebDriver driver;
    private CareersPage careersPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Admitad\\automateAdm\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.admitad.com/ru/site/about/careers/");
        careersPage = new CareersPage(driver);
    }

    @Test
    public void openFindCareersPage() {
        VacanciesPage vacanciesPage = careersPage.clickWatchAllVacanciesButton();
        String url = vacanciesPage.getUrl();
        Assert.assertTrue(url.contains("site/about/careers/vacancies"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
