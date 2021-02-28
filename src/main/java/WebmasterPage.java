import org.openqa.selenium.WebDriver;

public class WebmasterPage {
    private WebDriver driver;

    public WebmasterPage(WebDriver driver) { this.driver = driver; };
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
