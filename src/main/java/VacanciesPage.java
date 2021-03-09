
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VacanciesPage {
    private WebDriver driver;

    public VacanciesPage(WebDriver driver) { this.driver = driver; };
    public String getUrl() {
        return driver.getCurrentUrl();
    }

    private By searchField = By.xpath("//input[@id='tags']");
    private By searchButton = By.xpath("//div[@id='search-btn']");
    private By searchResultHeader = By.xpath("//h2[@class='page__search-result']");

    public VacanciesPage typeQuery(String query) {
        driver.findElement(searchField).sendKeys(query);
        return this;
    }

    public VacanciesPage findVacancies(String query) {
        typeQuery(query);
        driver.findElement(searchButton).click();
        return this;
    }

    public String getSearchResultHeader(String query) {
        findVacancies(query);
        return driver.findElement(searchResultHeader).getText();
    }

}
