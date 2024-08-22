package safallitigation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecourtcaseagainstbanknonnpa {
	
	private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name = "claimData")
    public Object[][] claimData() {
        return new Object[][]{
            {"erdmyLphth554567", "926"},
            {"nxOcnrno423456789", "656"}
        };
    }

    @Test(priority = 1, dataProvider = "claimData", invocationCount = 1)
    public void testAddClaimAbnonnpa(String cnrnoValue, String caseNoValue) throws InterruptedException {

        driver.get("https://safallitigation.onlinesafe.in/");

        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
        usernameField.sendKeys("BU");

        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
        signInButton.click();

        Thread.sleep(5000);

        WebElement clickclaimagainstbank = driver.findElement(By.xpath("//a[@href='/NPA/ECourtCaseListingDetails']"));
        clickclaimagainstbank.click();
        Thread.sleep(5000);
        
        WebElement clickecourt= driver.findElement(By.xpath("//a[@href='/NPA/ECourtCaseListingDetails']"));
        clickecourt.click();
        
        WebElement click3dots = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[19]/div[1]/button[1]/i[1]"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", click3dots);
        Thread.sleep(3000);
        click3dots.click();
        
        WebElement clickclaimagainstbanknonnpa = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[19]/div[1]/div[1]/a[2]"));
        clickclaimagainstbanknonnpa.click();

        Thread.sleep(3000);

        // Master page
        WebElement state = driver.findElement(By.xpath("//select[@id='DrpConState']"));
        Select stateSelect = new Select(state);
        stateSelect.selectByVisibleText("Kerala");

        WebElement location = driver.findElement(By.xpath("//select[@id='DrpConDistrict']"));
        Select locationSelect = new Select(location);
        locationSelect.selectByVisibleText("Palakkad");

        WebElement nameofcourt = driver.findElement(By.xpath("//select[@id='DrpConCaseCourtForum']"));
        Select nameofcourtSelect = new Select(nameofcourt);
        nameofcourtSelect.selectByVisibleText("Civil Court");

        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpConCaseBench']"));
        Select benchSelect = new Select(bench);
        benchSelect.selectByVisibleText("District Courts Complex-1");

        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpConCaseCaseTyp']"));
        Select casetypeSelect = new Select(casetype);
        casetypeSelect.selectByVisibleText("Miscellaneous Application (MA)");

        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpConCaseCaseStage']"));
        Select casestageSelect = new Select(casestage);
        casestageSelect.selectByVisibleText("Hearing");

        WebElement natureofcase = driver.findElement(By.xpath("//select[@id='DrpConCaseCaseNature']"));
        Select natureofcaseSelect = new Select(natureofcase);
        natureofcaseSelect.selectByVisibleText("Bank Guarantee/LC Matters");

        WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtConCaseFilingDate']"));
        dateoffiling.sendKeys("29-07-2024");
        dateoffiling.clear();
        WebElement dateofreporting = driver.findElement(By.xpath("//input[@id='TxtConCaseReportingDate']"));
        dateofreporting.sendKeys("29-07-2024");

        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtConCNRNo']"));
        cnrno.sendKeys(cnrnoValue);

        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtConCaseCaseNo']"));
        caseno.sendKeys(caseNoValue);

        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpConCaseCaseYear']"));
        Select caseyearSelect = new Select(caseyear);
        caseyearSelect.selectByVisibleText("2024");

        WebElement roleofbank = driver.findElement(By.xpath("//select[@id='DrpConCanaraRole']"));
        Select roleofbankSelect = new Select(roleofbank);
        roleofbankSelect.selectByVisibleText("Petitioner(s)");

        // Respondent
        WebElement clickplus = driver.findElement(By.xpath("//button[@id='BtnConCaseRespondent']"));
        clickplus.click();
        WebElement respondantname = driver.findElement(By.xpath("//input[@id='TxtConCaseRespondent']"));
        respondantname.sendKeys("logan");
        WebElement clickadd = driver.findElement(By.xpath("//button[@id='BtnConCaseRespondentSave']"));
        clickadd.click();
        Thread.sleep(3000);
        WebElement handlepopup = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        handlepopup.click();

        WebElement whethermonetary = driver.findElement(By.xpath("//select[@id='DrpConCaseMonetaryCase']"));
        Select whethermonetarySelect = new Select(whethermonetary);
        whethermonetarySelect.selectByVisibleText("Yes");

        WebElement plainamount = driver.findElement(By.xpath("//input[@id='TxtConCasePlaintAmt']"));
        plainamount.sendKeys("400000");
        WebElement intrestclaimed = driver.findElement(By.xpath("//input[@id='TxtConCaseInterestClaimed']"));
        intrestclaimed.sendKeys("21");
        WebElement intresttype = driver.findElement(By.xpath("//select[@id='DrpConCaseInterestTyp']"));
        Select intresttypeSelect = new Select(intresttype);
        intresttypeSelect.selectByVisibleText("Simple Interest");
        WebElement damagesclaimed = driver.findElement(By.xpath("//input[@id='TxtConCaseDamageClaimed']"));
        damagesclaimed.sendKeys("50000");
        WebElement miscclaimed = driver.findElement(By.xpath("//input[@id='TxtConCaseMiscClaim']"));
        miscclaimed.sendKeys("30000");
        WebElement factofcase = driver.findElement(By.xpath("//textarea[@id='TxtConCaseCaseFact']"));
        factofcase.sendKeys("fact");
        WebElement prayer = driver.findElement(By.xpath("//textarea[@id='TxtConCasePrayer']"));
        prayer.sendKeys("prayer");

        Thread.sleep(2000);

        WebElement save = driver.findElement(By.xpath("//button[@id='BtnConCaseSave']"));
        save.click();

        Thread.sleep(2000);

        WebElement ok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        ok.click();

        Thread.sleep(2000);

        WebElement ok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        ok1.click();
    }
}





