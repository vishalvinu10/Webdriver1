package testngpackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class reportgenerationpgm {
	 private WebDriver driver;
	    private ExtentHtmlReporter htmlReporter;
	    private ExtentReports extent;
	    private ExtentTest test;
	    
	    
	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        
	        // Set up ExtentReports
	        htmlReporter = new ExtentHtmlReporter("./Reports/extentReport.html");
	        htmlReporter.config().setTheme(Theme.DARK);
	        htmlReporter.config().setDocumentTitle("KVGB NPA Test Report");
	        htmlReporter.config().setReportName("KVGB NPA Test Report");

	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Host Name", "Localhost");
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("User Name", "Vishal");
	    }
	
	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	        // Flush the extent report
	        extent.flush();
	    }
	    @Test(priority=1)
	    public void testkvgbnpacivilcourt() throws InterruptedException {
	        test = extent.createTest("testkvgbnpacivilcourt", "Test to add civil court case in KVGB NPA portal");
	        
	        try {
	            driver.get("https://kvgb.onlinesafe.in/");
	            test.log(Status.INFO, "Navigated to https://kvgb.onlinesafe.in/");

	            WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtLoginID']"));
	            usernameField.sendKeys("branchuser@gmail.com");
	            test.log(Status.PASS, "Entered username");

	            WebElement passwordField = driver.findElement(By.xpath("//input[@id='TxtPassword']"));
	            passwordField.sendKeys("Bu@12345");
	            test.log(Status.PASS, "Entered password");

	            WebElement submitButton = driver.findElement(By.xpath("//a[@id='ButLogin']"));
	            submitButton.click();
	            test.log(Status.PASS, "Clicked login button");

	            Thread.sleep(2000);

	            WebElement clicknpa = driver.findElement(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[2]/a[1]"));
	            clicknpa.click();
	            test.log(Status.PASS, "Clicked NPA section");

	            WebElement addcases = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
	            addcases.click();
	            test.log(Status.PASS, "Clicked Add Cases");

	            Thread.sleep(2000);

	            String targetElementXpath = "(//i[@class='fa fa-ellipsis-v'])[1]";
	            WebElement targetElement = driver.findElement(By.xpath(targetElementXpath));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", targetElement);
	            targetElement.click();
	            test.log(Status.PASS, "Scrolled to and clicked target element");

	            WebElement clickacase = driver.findElement(By.xpath("(//a[normalize-space()='Civil Court'])[1]"));
	            clickacase.click();
	            test.log(Status.PASS, "Clicked Civil Court");

	            WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseCCCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
	            clickclose.click();
	            test.log(Status.PASS, "Clicked close button");

	            WebElement clickcobguarator = driver.findElement(By.xpath("//button[@id='BtnCCBorrower']"));
	            clickcobguarator.click();
	            test.log(Status.PASS, "Clicked Borrower");

	            WebElement checkbox = driver.findElement(By.xpath("//input[@id='CivilCheck_424621']"));
	            if (!checkbox.isSelected()) {
	                checkbox.click();
	            }
	            test.log(Status.PASS, "Selected checkbox for borrower");

	            WebElement addbutton = driver.findElement(By.xpath("//button[@id='BtnCCCBorrowerSave']"));
	            addbutton.click();
	            test.log(Status.PASS, "Clicked Add button for borrower");

	            WebElement radiobutton = driver.findElement(By.xpath("//input[@id='CCGuaranteer']"));
	            radiobutton.click();
	            test.log(Status.PASS, "Selected guarantor");

	            WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='CivilCheck_47634']"));
	            if (!checkbox2.isSelected()) {
	                checkbox2.click();
	            }
	            test.log(Status.PASS, "Selected checkbox for guarantor");

	            WebElement addbutton2 = driver.findElement(By.xpath("//button[@id='BtnCCCBorrowerSave']"));
	            addbutton2.click();
	            test.log(Status.PASS, "Clicked Add button for guarantor");

	            WebElement clickok = driver.findElement(By.xpath("//button[@id='BtnCCBorrowIDOK']"));
	            clickok.click();
	            test.log(Status.PASS, "Clicked OK button");

	            WebElement clicklegalheirs = driver.findElement(By.xpath("//button[@id='BtnCCLegalheir']"));
	            clicklegalheirs.click();
	            test.log(Status.PASS, "Clicked Legal Heirs button");

	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");  // SCROLL DOWN IN A TABLE
	            test.log(Status.PASS, "Scrolled down the table");

	            WebElement addbutton3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]"));
	            addbutton3.click();
	            test.log(Status.PASS, "Clicked Add button for legal heirs");

	            WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='CivilCheck_661']"));
	            if (!checkbox3.isSelected()) {
	                checkbox3.click();
	            }
	            test.log(Status.PASS, "Selected checkbox for legal heir");

	            WebElement addbutton4 = driver.findElement(By.xpath("//button[@id='BtnCIVILLegalHeiralSave']"));
	            addbutton4.click();
	            test.log(Status.PASS, "Clicked Save button for legal heir");

	            WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnCIVILSelectedLegalHeirSave']"));
	            clicksave.click();
	            test.log(Status.PASS, "Clicked Save button for selected legal heirs");

	            WebElement loanno = driver.findElement(By.xpath("//input[@id='TxtCCBranchFileno']"));
	            loanno.sendKeys("678576");
	            test.log(Status.PASS, "Entered loan number");

	            WebElement districtofcourt = driver.findElement(By.xpath("//select[@id='DrpCCDistrict']"));
	            Select districtofcourtSelect = new Select(districtofcourt);
	            districtofcourtSelect.selectByVisibleText("Bagalkot");
	            test.log(Status.PASS, "Selected district of court");

	            WebElement taluk = driver.findElement(By.xpath("//select[@id='DrpCCTaluk']"));
	            Select talukSelect = new Select(taluk);
	            talukSelect.selectByVisibleText("HUNGUND");
	            test.log(Status.PASS, "Selected taluk");

	            WebElement nameofcourt = driver.findElement(By.xpath("//select[@id='DrpCCCourtName']"));
	            Select nameofcourtSelect = new Select(nameofcourt);
	            nameofcourtSelect.selectByVisibleText("CIVIL COURT");
	            test.log(Status.PASS, "Selected name of court");

	            WebElement bench = driver.findElement(By.xpath("//select[@id='DrpCCBench']"));
	            Select benchSelect = new Select(bench);
	            benchSelect.selectByVisibleText("TEST1");
	            test.log(Status.PASS, "Selected bench");

	            WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpCCCaseTyp']"));
	            Select casetypeSelect = new Select(casetype);
	            casetypeSelect.selectByVisibleText("Review");
	            test.log(Status.PASS, "Selected case type");

	            WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpCCCaseStage']"));
	            Select casestageSelect = new Select(casestage);
	            casestageSelect.selectByVisibleText("Hearing");
	            test.log(Status.PASS, "Selected case stage");

	            WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtCCFilingDate']"));
	            dateoffiling.click();
	            WebElement dateclick1 = driver.findElement(By.xpath("//td[@class='today day']"));
	            dateclick1.click();
	            test.log(Status.PASS, "Selected date of filing");

	            WebElement roleofbank = driver.findElement(By.xpath("//select[@id='DrpCCCanaraRole']"));
	            Select roleofbankSelect = new Select(roleofbank);
	            roleofbankSelect.selectByVisibleText("Petitioner(s)");
	            test.log(Status.PASS, "Selected role of bank");

	            JavascriptExecutor js1 = (JavascriptExecutor) driver;
	            js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	            test.log(Status.PASS, "Scrolled to bottom of the page");

	            WebElement suitamount = driver.findElement(By.xpath("//input[@id='TxtCCSuitAmount']"));
	            suitamount.sendKeys("40000");
	            test.log(Status.PASS, "Entered suit amount");

	            WebElement intrestclaimed = driver.findElement(By.xpath("//input[@id='TxtCCInterestClaimed']"));
	            intrestclaimed.sendKeys("21");
	            test.log(Status.PASS, "Entered interest claimed");

	            WebElement intresttype = driver.findElement(By.xpath("//select[@id='DrpCCInterestTyp']"));
	            Select intresttypeSelect = new Select(intresttype);
	            intresttypeSelect.selectByVisibleText("Simple Interest");
	            test.log(Status.PASS, "Selected interest type");

	            WebElement bankadv = driver.findElement(By.xpath("//button[@id='BtnCCAdvctName']"));
	            bankadv.click();
	            WebElement districtofadv = driver.findElement(By.xpath("//select[@id='DrpAdvCCDistrict']"));
	            Select districtofadvSelect = new Select(districtofadv);
	            districtofadvSelect.selectByVisibleText("Bagalkot");
	            WebElement talukofadv = driver.findElement(By.xpath("//select[@id='DrpAdvCCTaluk']"));
	            Select talukofadvSelect = new Select(talukofadv);
	            talukofadvSelect.selectByVisibleText("HUNGUND");
	            WebElement clicksearch = driver.findElement(By.xpath("//button[@id='BtnAdvIDSearch']"));
	            clicksearch.click();
	            test.log(Status.PASS, "Clicked search button for advocate");

	            WebElement checkbox4 = driver.findElement(By.xpath("//input[@id='CheckCAdvt_806']"));
	            if (!checkbox4.isSelected()) {
	                checkbox4.click();
	            }
	            test.log(Status.PASS, "Selected checkbox for advocate");

	            WebElement clickadd = driver.findElement(By.xpath("//button[@id='BtnCCAdvctSave']"));
	            clickadd.click();
	            test.log(Status.PASS, "Clicked add button for advocate");

	            WebElement courtfilingno = driver.findElement(By.xpath("//input[@id='TxtCCFilingNo']"));
	            courtfilingno.sendKeys("654");
	            test.log(Status.PASS, "Entered court filing number");

	            WebElement courtfilingyear = driver.findElement(By.xpath("//select[@id='DrpCCFilingYear']"));
	            Select courtfilingyearSelect = new Select(courtfilingyear);
	            courtfilingyearSelect.selectByVisibleText("2024");
	            test.log(Status.PASS, "Selected court filing year");

	            WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtCCCNRNo']"));
	            cnrno.sendKeys("yytre67889889098");
	            test.log(Status.PASS, "Entered CNR number");

	            WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtCCCaseNo']"));
	            caseno.sendKeys("321");
	            test.log(Status.PASS, "Entered case number");

	            WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpCCCaseYear']"));
	            Select caseyearSelect = new Select(caseyear);
	            caseyearSelect.selectByVisibleText("2024");
	            test.log(Status.PASS, "Selected case year");

	            Thread.sleep(3000);

	            WebElement clicksave1 = driver.findElement(By.xpath("//button[@id='BtnCCSave']"));
	            clicksave1.click();
	            test.log(Status.PASS, "Clicked save button");

	            Thread.sleep(3000);

	            WebElement clickOK = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	            clickOK.click();
	            test.log(Status.PASS, "Clicked OK button");

	            Thread.sleep(3000);

	            WebElement clickOK1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	            clickOK1.click();
	            test.log(Status.PASS, "Clicked final OK button");

	        } catch (Exception e) {
	            test.log(Status.FAIL, "Test case failed: " + e.getMessage());
	            Assert.fail("Test case failed: " + e.getMessage());
	        }
	    }
	}

