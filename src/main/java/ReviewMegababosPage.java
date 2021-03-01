import org.openqa.selenium.WebDriver;

public class ReviewMegababosPage {
    private WebDriver driver;

    public ReviewMegababosPage (WebDriver driver) { this.driver = driver; };
    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
