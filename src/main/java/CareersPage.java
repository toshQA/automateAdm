import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class CareersPage {

    private WebDriver driver;

    public CareersPage(WebDriver driver) { this.driver = driver; };
    public String getUrl() {
        return driver.getCurrentUrl();
    }

    private By watchAllVacanciesButton = By.xpath("//section[@id='vacancies']/div/a");

    public VacanciesPage clickWatchAllVacanciesButton() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,5000)");
        driver.findElement(watchAllVacanciesButton).click();
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
        return new VacanciesPage(driver);
    }

}
