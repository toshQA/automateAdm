import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VacanciesPageTest {
    private WebDriver driver;
    private VacanciesPage vacanciesPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Admitad\\automateAdm\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://test.stage.wp.admitad.com/ru/site/about/careers/vacancies");
        vacanciesPage = new VacanciesPage(driver);
    }

    @Test
    public void findVacancies() {
        String query = "QA";
        String searchHeader = vacanciesPage.getSearchResultHeader(query);
        Assert.assertEquals("Вакансии по запросу " + query, searchHeader);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
