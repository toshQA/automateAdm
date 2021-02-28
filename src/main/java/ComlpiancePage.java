import org.openqa.selenium.WebDriver;

public class ComlpiancePage {
    private WebDriver driver;

    public ComlpiancePage(WebDriver driver) { this.driver = driver; };
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
