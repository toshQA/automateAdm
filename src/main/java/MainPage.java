import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private Actions actions;

    public MainPage(WebDriver driver) { this.driver = driver; };

    private By headerLogoButton = By.xpath("//img[@title='Admitad']");
    private By headerNavTabWebmaster = By.xpath("//li[@id='menu-item-3712']");
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
    private By successStoriesSection = By.xpath("//section[contains(@class, 'homepage_stories')]");
    private By successStoriesSectionPublishersCard = By.xpath("//section[contains(@class, 'homepage_stories')]/div/div/div[2]/article");
    private By successStoriesSectionAdvertisersCard = By.xpath("//section[contains(@class, 'homepage_compliance')]//article[2]/a");
    private By headerNavTabWebmasterCompliance = By.xpath("//nav[@id='navigation-menu']/ul/li[1]/ul/li[5]/a");
    private By footerNavCareersPage = By.xpath("//nav[@id='footer-navigation-menu']/ul/li[1]/ul/li[2]/a");

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
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.findElement(complianceSectionPublishersButton);
        jse.executeScript("window.scrollBy(0,2500)");
        driver.findElement(complianceSectionPublishersButton).click();
        return new ComlpiancePage(driver);
    }

    public BrandSafetyPage clickComplianceSectionAdvertisersButton() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.findElement(complianceSectionAdvertisersButton);
        jse.executeScript("window.scrollBy(0,2500)");
        driver.findElement(complianceSectionAdvertisersButton).click();
        return new BrandSafetyPage(driver);
    }

    public ReviewMegababosPage clickSuccessStoriesSectionWebmastersCard() {
        if(!driver.findElements(successStoriesSection).isEmpty()) {
            driver.findElement(successStoriesSectionPublishersCard).click();
            return new ReviewMegababosPage(driver);
        }
        return null;
    }

    public ComlpiancePage clickHeaderNavTabWebmasterCompliance() {
        actions.moveToElement(driver.findElement(headerNavTabWebmaster));
        actions.moveToElement(driver.findElement(headerNavTabWebmasterCompliance)).click().build().perform();
        return new ComlpiancePage(driver);
    }




}
