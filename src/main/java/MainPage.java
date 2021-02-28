import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) { this.driver = driver; };

    private By headerLogoButton = By.xpath("//img[@title='Admitad']");
    private By headerNavTabWebmaster = By.xpath("//nav[@id='navigation-menu']/ul[@class='menu']/li[1]/a");
    private By headerNavTabAdvertiser = By.xpath("//nav[@id='navigation-menu']/ul[@class='menu']/li[2]/a");
    private By headerNavTabAllPrograms = By.xpath("//nav[@id='navigation-menu']/ul[@class='menu']/li[3]/a");
    private By headerNavTabCompany = By.xpath("//nav[@id='navigation-menu']/ul[@class='menu']/li[4]/a");
    private By headerNavTabBlog = By.xpath("//nav[@id='navigation-menu']/ul[@class='menu']/li[5]/a");
    private By headerNavTabAcademy = By.xpath("//nav[@id='navigation-menu']/ul[@class='menu']/li[6]/a");
    private By headerLogInButton = By.xpath("//div[@class='account-logo']/a");
    private By headerSignInButton = By.xpath("//aside/div/a");
    private By infoSectionPublishersButton = By.xpath("//section[@class='homepage_recipients']//div[contains(@class, 'homepage_recipientsCol')][1]/a");
    private By infoSectionAdvertisersButton = By.xpath("//section[@class='homepage_recipients']//div[contains(@class, 'homepage_recipientsCol')][2]/a");
    private By complianceSectionPublishersButton = By.xpath("//section[contains(@class, 'homepage_compliance')]//article[1]/a");
    private By complianceSectionAdvertisersButton = By.xpath("//section[contains(@class, 'homepage_compliance')]//article[2]/a");

    public WebmasterPage clickHeaderNavTabWebmaster() {
        driver.findElement(headerNavTabWebmaster).click();
        return new WebmasterPage(driver);
    }

    public AdvertiserPage clickHeaderNavTabAdvertiser() {
        driver.findElement(headerNavTabAdvertiser).click();
        return new AdvertiserPage(driver);
    }

    public WebmasterPage clickInfoSectionPublishersButton() {
        driver.findElement(infoSectionPublishersButton).click();
        return new WebmasterPage(driver);
    }

    public AdvertiserPage clickInfoSectionAdvertisersButton() {
        driver.findElement(infoSectionAdvertisersButton).click();
        return new AdvertiserPage(driver);
    }

    public ComlpiancePage clickComplianceSectionPublishersButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(complianceSectionPublishersButton));
        driver.findElement(complianceSectionPublishersButton).click();
        return new ComlpiancePage(driver);
    }

    public BrandSafetyPage clickComplianceSectionAdvertisersButton() {
        driver.findElement(complianceSectionAdvertisersButton).click();
        return new BrandSafetyPage(driver);
    }




}
