package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabpgrm {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    // @AfterClass
    // public void tearDown() {
    // if (driver != null) {
    // driver.quit();
    // }
    // }

    @Test(priority=1)
    public void testaddclaimabnpa() throws InterruptedException {

        driver.get("https://safallitigation.onlinesafe.in/");

        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
        usernameField.sendKeys("BU");

        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
        signInButton.sendKeys(Keys.TAB);
        signInButton.click();

        Thread.sleep(5000);

        WebElement clickclaimagainstbank = driver.findElement(By.xpath("//span[normalize-space()='Claim against bank']"));
        clickclaimagainstbank.sendKeys(Keys.TAB);
        clickclaimagainstbank.click();
        Thread.sleep(3000);
        WebElement fornpa = driver.findElement(By.xpath("//span[normalize-space()='NPA Customer']"));
        fornpa.sendKeys(Keys.TAB);
        fornpa.click();

        Thread.sleep(3000);

        WebElement clickthreedots = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[9]/div[1]/button[1]/i[1]"));
        clickthreedots.sendKeys(Keys.TAB);
        clickthreedots.click();

        Thread.sleep(3000);

        WebElement clickcab = driver.findElement(By.xpath("(//a[normalize-space()='Case against bank'])[1]"));
        clickcab.sendKeys(Keys.TAB);
        clickcab.click();

        Thread.sleep(3000);

        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseConCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
        clickclose.sendKeys(Keys.TAB);
        clickclose.click();

        Thread.sleep(3000);

        // CO-Borrower/Guarantor/Legal Heirs

        WebElement clickplusbutton = driver.findElement(By.xpath("//button[@id='BtnConBorrower']"));
        clickplusbutton.sendKeys(Keys.TAB);
        clickplusbutton.click();

        Thread.sleep(3000);

        WebElement checkbox = driver.findElement(By.xpath("(//input[@id='ConCheck_88933260'])[1]"));
        if (!checkbox.isSelected()) {
            checkbox.sendKeys(Keys.TAB);
            checkbox.click();
        }

        Thread.sleep(2000);

        WebElement addbutton = driver.findElement(By.xpath("//button[@id='BtnConBorrowerSave']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addbutton);
        addbutton.sendKeys(Keys.TAB);
        addbutton.click();

        Thread.sleep(2000);

        WebElement clickgurantor = driver.findElement(By.xpath("//input[@id='ConGuaranteer']"));
        clickgurantor.sendKeys(Keys.TAB);
        clickgurantor.click();

        Thread.sleep(2000);

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@id='ConCheck_250511346'])[1]"));
        if (!checkbox1.isSelected()) {
            checkbox1.sendKeys(Keys.TAB);
            checkbox1.click();
        }
        Thread.sleep(2000);

        WebElement addbutton1 = driver.findElement(By.xpath("//button[@id='BtnConBorrowerSave']"));
        addbutton1.sendKeys(Keys.TAB);
        addbutton1.click();

        Thread.sleep(1000);

        WebElement clicklegalheirs = driver.findElement(By.xpath("//input[@id='ConLegal']"));
        clicklegalheirs.sendKeys(Keys.TAB);
        clicklegalheirs.click();

        Thread.sleep(2000);

        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@id='ConCheck_1162'])[1]"));
        if (!checkbox2.isSelected()) {
            checkbox2.sendKeys(Keys.TAB);
            checkbox2.click();
        }
        Thread.sleep(2000);

        WebElement addbutton2 = driver.findElement(By.xpath("//button[@id='BtnConBorrowerSave']"));
        addbutton2.sendKeys(Keys.TAB);
        addbutton2.click();

        Thread.sleep(2000);

        WebElement clickok = driver.findElement(By.xpath("//button[@id='BtnConSelectedBorrowerSave']"));
        clickok.sendKeys(Keys.TAB);
        clickok.click();

        Thread.sleep(2000);

        WebElement state = driver.findElement(By.xpath("//select[@id='DrpConState']"));
        state.sendKeys(Keys.TAB);
        Select stateSelect = new Select(state);
        stateSelect.selectByVisibleText("Kerala");

        WebElement location = driver.findElement(By.xpath("//select[@id='DrpConDistrict']"));
        location.sendKeys(Keys.TAB);
        Select locationSelect = new Select(location);
        locationSelect.selectByVisibleText("Palakkad");

        WebElement nameofcourt = driver.findElement(By.xpath("//select[@id='DrpConCaseCourtForum']"));
        nameofcourt.sendKeys(Keys.TAB);
        Select nameofcourtSelect = new Select(nameofcourt);
        nameofcourtSelect.selectByVisibleText("Civil Court");

        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpConCaseBench']"));
        bench.sendKeys(Keys.TAB);
        Select benchSelect = new Select(bench);
        benchSelect.selectByVisibleText("District Courts Complex-1");

        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpConCaseCaseTyp']"));
        casetype.sendKeys(Keys.TAB);
        Select casetypeSelect = new Select(casetype);
        casetypeSelect.selectByVisibleText("Miscellaneous Application (MA)");

        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpConCaseCaseStage']"));
        casestage.sendKeys(Keys.TAB);
        Select casestageSelect = new Select(casestage);
        casestageSelect.selectByVisibleText("Hearing");

        WebElement natureofcase = driver.findElement(By.xpath("//select[@id='DrpConCaseCaseNature']"));
        natureofcase.sendKeys(Keys.TAB);
        Select natureofcaseSelect = new Select(natureofcase);
        natureofcaseSelect.selectByVisibleText(" Bank Guarantee/LC Matters");

        WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtConCaseFilingDate']"));
        dateoffiling.sendKeys(Keys.TAB);
        dateoffiling.sendKeys("27-07-2024");
        WebElement dateofreporting = driver.findElement(By.xpath("//input[@id='TxtConCaseReportingDate']"));
        dateofreporting.sendKeys(Keys.TAB);
        dateofreporting.sendKeys("27-07-2024");

        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtConCNRNo']"));
        cnrno.sendKeys(Keys.TAB);
        cnrno.sendKeys("wirrrth756985499");

        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtConCaseCaseNo']"));
        caseno.sendKeys(Keys.TAB);
        caseno.sendKeys("9847");

        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpConCaseCaseYear']"));
        caseyear.sendKeys(Keys.TAB);
        Select caseyearSelect = new Select(caseyear);
        caseyearSelect.selectByVisibleText("2024");

        WebElement whethermonetary = driver.findElement(By.xpath("//select[@id='DrpConCaseMonetaryCase']"));
        whethermonetary.sendKeys(Keys.TAB);
        Select whethermonetarySelect = new Select(whethermonetary);
        whethermonetarySelect.selectByVisibleText("Yes");

        WebElement plainamount = driver.findElement(By.xpath("//input[@id='TxtConCasePlaintAmt']"));
        plainamount.sendKeys(Keys.TAB);
        plainamount.sendKeys("400000");
        WebElement intrestclaimed = driver.findElement(By.xpath("//input[@id='TxtConCaseInterestClaimed']"));
        intrestclaimed.sendKeys(Keys.TAB);
        intrestclaimed.sendKeys("21");
        WebElement intresttype = driver.findElement(By.xpath("//select[@id='DrpConCaseInterestTyp']"));
        intresttype.sendKeys(Keys.TAB);
        Select intresttypeSelect = new Select(intresttype);
        intresttypeSelect.selectByVisibleText("Simple Interest");
        WebElement damagesclaimed = driver.findElement(By.xpath("//input[@id='TxtConCaseDamageClaimed']"));
        damagesclaimed.sendKeys(Keys.TAB);
        damagesclaimed.sendKeys("50000");
        WebElement miscclaimed = driver.findElement(By.xpath("//input[@id='TxtConCaseMiscClaim']"));
        miscclaimed.sendKeys(Keys.TAB);
        miscclaimed.sendKeys("30000");
        WebElement factofcase = driver.findElement(By.xpath("//textarea[@id='TxtConCaseCaseFact']"));
        factofcase.sendKeys(Keys.TAB);
        factofcase.sendKeys("fact");
        WebElement prayer = driver.findElement(By.xpath("//textarea[@id='TxtConCasePrayer']"));
        prayer.sendKeys(Keys.TAB);
        prayer.sendKeys("prayer");

        Thread.sleep(2000);

        WebElement save = driver.findElement(By.xpath("//button[@id='BtnConCaseSave']"));
        save.sendKeys(Keys.TAB);
        save.click();

        Thread.sleep(2000);

        WebElement ok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        ok.sendKeys(Keys.TAB);
        ok.click();

        Thread.sleep(2000);

        WebElement ok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        ok1.sendKeys(Keys.TAB);
        ok1.click();
    }

    @Test(priority = 2)
    public void testBMapprove() throws InterruptedException {

        driver.get("https://safallitigation.onlinesafe.in/");

        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
        usernameField.sendKeys("BM");

        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
        signInButton.sendKeys(Keys.TAB);
        signInButton.click();

        Thread.sleep(5000);

        WebElement clickapprovals = driver.findElement(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[4]/a[1]"));
        clickapprovals.sendKeys(Keys.TAB);
        clickapprovals.click();
        Thread.sleep(3000);
        WebElement approvals = driver.findElement(By.xpath("//a[@href='/CaseApproval/CaseApproval']"));
        approvals.sendKeys(Keys.TAB);
        approvals.click();

        Thread.sleep(3000);

        // locate an element horizontally

        WebElement clickeyebutton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]/a[1]/i[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", clickeyebutton);
        Thread.sleep(3000);
        clickeyebutton.sendKeys(Keys.TAB);
        clickeyebutton.click();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");

        WebElement clickapprove = driver.findElement(By.xpath("//button[@id='BtnConCaseApprove']"));
        clickapprove.sendKeys(Keys.TAB);
        clickapprove.click();

        Thread.sleep(2000);

        WebElement ok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        ok.sendKeys(Keys.TAB);
        ok.click();

        Thread.sleep(2000);

        WebElement ok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        ok1.sendKeys(Keys.TAB);
        ok1.click();
    }
}
