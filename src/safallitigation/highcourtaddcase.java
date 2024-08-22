package safallitigation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class highcourtaddcase {
	

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

	    @Test(priority=1)
	    public void testAddAdvocateonRO() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

	        Thread.sleep(5000);
	        
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        clicknpa.click();
	        Thread.sleep(3000);
	        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
	        addcase.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]"));
	        clickthreedots.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickhighcort = driver.findElement(By.xpath("(//a[normalize-space()='High Court'])[1]"));
	        clickhighcort.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseHCSCCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
	        clickclose.click();
	        
            //coborrower/Guarantor/Legal Heirs
	        
	        WebElement clickaddbutton = driver.findElement(By.xpath("//button[@id='BtnHSBorrower']"));
	        clickaddbutton.click();
	        
	        WebElement clicklegalheirs = driver.findElement(By.xpath("//input[@id='HSLegal']"));
	        clicklegalheirs.click();
	        
	        WebElement checkbox = driver.findElement(By.xpath("(//input[@id='HCSCSelect_1162'])[1]"));
	        if (!checkbox.isSelected()) {
	        	checkbox.click();
	        }
	        
	        WebElement clickaddbutton1 = driver.findElement(By.xpath("//button[@id='BtnHSBorrowerSave']"));
	        clickaddbutton1.click();
	        WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnHSSelectedBorrowerSave']"));
	        savebutton.click();
	        
             //state of court
	        
	        WebElement StateofCourt = driver.findElement(By.xpath("//select[@id='DrpHSState']"));
	        Select StateofCourtSelect = new Select(StateofCourt);
	        StateofCourtSelect.selectByVisibleText("Kerala");
	        
	        //Location of the Court
	        
	        WebElement LocationoftheCourt = driver.findElement(By.xpath("//select[@id='DrpHSDistrict']"));
	        Select LocationoftheCourtSelect = new Select(LocationoftheCourt);
	        LocationoftheCourtSelect.selectByVisibleText("Palakkad");
	        
	        //Court Forum
	        
	        
	        WebElement CourtForum = driver.findElement(By.xpath("//select[@id='DrpHSCourtForum']"));
	        Select CourtForumSelect = new Select(CourtForum);
	        CourtForumSelect.selectByVisibleText("High Court of Kerala");
	        
	        //bench
	        
	        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpHSBench']"));
	        Select benchSelect = new Select(bench);
	        benchSelect.selectByVisibleText("High Court of Kerala");
	        
            //case type
	        
	        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpHSCaseTyp']"));
	        Select casetypeSelect = new Select(casetype);
	        casetypeSelect.selectByVisibleText("Appeal");
	        
            //case stage
	        
	        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpHSCaseStage']"));
	        Select casestageSelect = new Select(casestage);
	        casestageSelect.selectByVisibleText("Hearing");
	        
	        //nature of case
	        
	        WebElement natureofcase = driver.findElement(By.xpath("//select[@id='DrpHSCaseNature']"));
	        Select natureofcaseSelect = new Select(natureofcase);
	        natureofcaseSelect.selectByVisibleText("Appeal/Revision");
	        
           //Date of Filing
	        
	        WebElement DateofFiling = driver.findElement(By.xpath("//input[@id='TxtHSFilingDate']"));
	        DateofFiling.sendKeys("09-07-2024");
	        
	        //Date of Reporting
	        
	        WebElement DateofReporting = driver.findElement(By.xpath("//input[@id='TxtHSReportingDate']"));
	        DateofReporting.sendKeys("24-07-2024");
	        
             //Role of Bank
	        
	        WebElement RoleofBank = driver.findElement(By.xpath("//select[@id='DrpHSCanaraRole']"));
	        Select RoleofBankSelect = new Select(RoleofBank);
	        RoleofBankSelect.selectByVisibleText("Petitioner(s)");
	        
	        //Whether Monetary Case
	        
	        WebElement Monetary = driver.findElement(By.xpath("//select[@id='DrpHSMonetaryCase']"));
	        Select MonetarySelect = new Select(Monetary);
	        MonetarySelect.selectByVisibleText("Yes");
	        
	        //plainamount
	        
	        WebElement plainamount = driver.findElement(By.xpath("//input[@id='TxtHSPlaintAmt']"));
	        plainamount.sendKeys("896868");
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1500)");
	        
	        //Interest Claimed (%)
	        WebElement InterestClaimed = driver.findElement(By.xpath("//input[@id='TxtHSInterestClaimed']"));
	        InterestClaimed.sendKeys("13");
	        
	      //Interest Type
		       
	        WebElement InterestType = driver.findElement(By.xpath("//select[@id='DrpHSInterestTyp']"));
	        Select InterestTypeSelect = new Select(InterestType);
	        InterestTypeSelect.selectByVisibleText("Simple Interest");
	        
	        //Damages claimed
	        WebElement Damages = driver.findElement(By.xpath("//input[@id='TxtHSDamageClaimed']"));
	        Damages.sendKeys("4545465");
	        
	        //Cost / Misc. Claim
	        WebElement Claim = driver.findElement(By.xpath("//input[@id='TxtHSMiscClaim']"));
	        Claim.sendKeys("5466556");
	        
	        //Filing No
	        
	        WebElement Filing = driver.findElement(By.xpath("//input[@id='TxtHSFilingNo']"));
	        Filing.sendKeys("43534");
	        
	        //Filing Year
	        
	        WebElement FilingYear = driver.findElement(By.xpath("//select[@id='DrpHSFilingYear']"));
	        Select FilingYearSelect = new Select(FilingYear);
	        FilingYearSelect.selectByVisibleText("2024");
	        
	        //cnrno 
	        
	        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtHSFilingNo']"));
	        cnrno.sendKeys("hiuvu78757463536");
	        
	        //Case No
	        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtHSCaseNo']"));
	        caseno.sendKeys("444");
	        
	        //Case Year
	        
	        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpHSCaseYear']"));
	        Select caseyearSelect = new Select(caseyear);
	        caseyearSelect.selectByVisibleText("2024");
	        
	        
	        //Fact of Case
	        
	        WebElement factofcase = driver.findElement(By.xpath("//textarea[@id='TxtHSCaseFact']"));
	        factofcase.sendKeys("fact");
	        
	        //Prayer
	        WebElement Prayer = driver.findElement(By.xpath("//textarea[@id='TxtHSPrayer']"));
	        Prayer.sendKeys("prayer");
	        
	        Thread.sleep(3000);
	        
	        WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnHSSave']"));
	        clicksave.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        clickok.click();
	        
            Thread.sleep(3000);
	        
	        WebElement clickok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        clickok1.click();
	        

}}
