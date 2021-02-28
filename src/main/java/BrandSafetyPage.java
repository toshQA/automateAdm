import org.openqa.selenium.WebDriver;

public class BrandSafetyPage {
    private WebDriver driver;

    public BrandSafetyPage(WebDriver driver) { this.driver = driver; };
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
