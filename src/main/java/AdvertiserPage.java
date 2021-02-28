import org.openqa.selenium.WebDriver;

public class AdvertiserPage {
    private WebDriver driver;

    public AdvertiserPage(WebDriver driver) { this.driver = driver; };
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
