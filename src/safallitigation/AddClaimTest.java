package safallitigation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddClaimTest {
	
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
	                {"yrrrrth756985466", "434"},
	                {"orrtyuio567432667", "878"}
	        };
	    }

	    @Test(priority = 1, dataProvider = "claimData")
	    public void testAddClaimAbnpa(String cnrnoValue, String caseNoValue) throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

	        Thread.sleep(5000);

	        WebElement clickclaimagainstbank = driver.findElement(By.xpath("//span[normalize-space()='Claim against bank']"));
	        clickclaimagainstbank.click();
	        Thread.sleep(3000);
	        WebElement fornpa = driver.findElement(By.xpath("//span[normalize-space()='NPA Customer']"));
	        fornpa.click();

	        Thread.sleep(3000);

	        WebElement clickthreedots = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[9]/div[1]/button[1]/i[1]"));
	        clickthreedots.click();

	        Thread.sleep(3000);

	        WebElement clickcab = driver.findElement(By.xpath("(//a[normalize-space()='Case against bank'])[1]"));
	        clickcab.click();

	        Thread.sleep(3000);

	        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseConCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
	        clickclose.click();

	        Thread.sleep(3000);

	        // CO-Borrower/Guarantor/Legal Heirs

	        WebElement clickplusbutton = driver.findElement(By.xpath("//button[@id='BtnConBorrower']"));
	        clickplusbutton.click();

	        Thread.sleep(3000);

	        WebElement checkbox = driver.findElement(By.xpath("(//input[@id='ConCheck_88933260'])[1]"));
	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }

	        Thread.sleep(2000);

	        WebElement addbutton = driver.findElement(By.xpath("//button[@id='BtnConBorrowerSave']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addbutton);
	        addbutton.click();

	        Thread.sleep(2000);

	        WebElement clickgurantor = driver.findElement(By.xpath("//input[@id='ConGuaranteer']"));
	        clickgurantor.click();

	        Thread.sleep(2000);

	        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@id='ConCheck_250511346'])[1]"));
	        if (!checkbox1.isSelected()) {
	            checkbox1.click();
	        }
	        Thread.sleep(2000);

	        WebElement addbutton1 = driver.findElement(By.xpath("//button[@id='BtnConBorrowerSave']"));
	        addbutton1.click();

	        Thread.sleep(1000);

	        WebElement clicklegalheirs = driver.findElement(By.xpath("//input[@id='ConLegal']"));
	        clicklegalheirs.click();

	        Thread.sleep(2000);

	        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@id='ConCheck_1162'])[1]"));
	        if (!checkbox2.isSelected()) {
	            checkbox2.click();
	        }
	        Thread.sleep(2000);

	        WebElement addbutton2 = driver.findElement(By.xpath("//button[@id='BtnConBorrowerSave']"));
	        addbutton2.click();

	        Thread.sleep(2000);

	        WebElement clickok = driver.findElement(By.xpath("//button[@id='BtnConSelectedBorrowerSave']"));
	        clickok.click();

	        Thread.sleep(2000);

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
	        natureofcaseSelect.selectByVisibleText(" Bank Guarantee/LC Matters");

	        WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtConCaseFilingDate']"));
	        dateoffiling.sendKeys("27-07-2024");
	        WebElement dateofreporting = driver.findElement(By.xpath("//input[@id='TxtConCaseReportingDate']"));
	        dateofreporting.sendKeys("27-07-2024");

	        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtConCNRNo']"));
	        cnrno.sendKeys(cnrnoValue);

	        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtConCaseCaseNo']"));
	        caseno.sendKeys(caseNoValue);

	        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpConCaseCaseYear']"));
	        Select caseyearSelect = new Select(caseyear);
	        caseyearSelect.selectByVisibleText("2024");

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


