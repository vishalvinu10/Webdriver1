package safallitigation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class democaseag {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority=1)
    public void testaddclaimabnpa() {

        driver.get("https://safallitigation.onlinesafe.in/");

        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
        usernameField.sendKeys("BU");

        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
        signInButton.click();

        WebElement clickclaimagainstbank = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Claim against bank']")));
        clickclaimagainstbank.click();
        WebElement fornpa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='NPA Customer']")));
        fornpa.click();

        WebElement clickthreedots = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[9]/div[1]/button[1]/i[1]")));
        clickthreedots.click();

        WebElement clickcab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Case against bank'])[1]")));
        clickcab.click();

        WebElement clickclose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='CloseConCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']")));
        clickclose.click();

        // CO-Borrower/Guarantor/Legal Heirs

        WebElement clickplusbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConBorrower']")));
        clickplusbutton.click();

        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='ConCheck_88933260'])[1]")));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        WebElement addbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConBorrowerSave']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addbutton);
        addbutton.click();

        WebElement clickgurantor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ConGuaranteer']")));
        clickgurantor.click();

        WebElement checkbox1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='ConCheck_250511346'])[1]")));
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

        WebElement addbutton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConBorrowerSave']")));
        addbutton1.click();

        WebElement clicklegalheirs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ConLegal']")));
        clicklegalheirs.click();

        WebElement checkbox2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='ConCheck_1162'])[1]")));
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

        WebElement addbutton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConBorrowerSave']")));
        addbutton2.click();

        WebElement clickok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConSelectedBorrowerSave']")));
        clickok.click();

        WebElement state = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConState']")));
        Select stateSelect = new Select(state);
        stateSelect.selectByVisibleText("Kerala");

        WebElement location = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConDistrict']")));
        Select locationSelect = new Select(location);
        locationSelect.selectByVisibleText("Palakkad");

        WebElement nameofcourt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseCourtForum']")));
        Select nameofcourtSelect = new Select(nameofcourt);
        nameofcourtSelect.selectByVisibleText("Civil Court");

        WebElement bench = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseBench']")));
        Select benchSelect = new Select(bench);
        benchSelect.selectByVisibleText("District Courts Complex-1");

        WebElement casetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseCaseTyp']")));
        Select casetypeSelect = new Select(casetype);
        casetypeSelect.selectByVisibleText("Miscellaneous Application (MA)");

        WebElement casestage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseCaseStage']")));
        Select casestageSelect = new Select(casestage);
        casestageSelect.selectByVisibleText("Rejoinder Evidence");

        WebElement damagesclaimed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCaseDamageClaimed']")));
        damagesclaimed.sendKeys("50000");

        WebElement miscclaimed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCaseMiscClaim']")));
        miscclaimed.sendKeys("30000");

        WebElement factofcase = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtConCaseCaseFact']")));
        factofcase.sendKeys("fact");

        WebElement prayer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtConCasePrayer']")));
        prayer.sendKeys("prayer");

        WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConCaseSave']")));
        save.click();

        WebElement ok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
        ok.click();

        WebElement ok1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
        ok1.click();
    }

    @Test(priority = 2)
    public void testBMapprove() throws InterruptedException {

        driver.get("https://safallitigation.onlinesafe.in/");

        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
        usernameField.sendKeys("BM");

        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
        signInButton.click();

        WebElement clickapprovals = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[4]/a[1]")));
        clickapprovals.click();

        WebElement approvals = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/CaseApproval/CaseApproval']")));
        approvals.click();

        WebElement clickeyebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]/a[1]/i[1]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", clickeyebutton);
        clickeyebutton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");

        WebElement clickapprove = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConCaseApprove']")));
        clickapprove.click();

        WebElement ok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
        ok.click();

        WebElement ok1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
        ok1.click();
    }
}
