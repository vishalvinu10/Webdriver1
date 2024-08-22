package testngpackage;


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

public class Kvgb_npa_commercial {
	
	 private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }

	    //COMMERCIAL COURT CASE
	    
	    @Test(priority=1)
	    public void testkvgbnpacivilcourt() throws InterruptedException {
	    	 driver.get("https://kvgb.onlinesafe.in/");

		        WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtLoginID']"));
		        usernameField.sendKeys("branchuser@gmail.com");
		        
		        WebElement passwordField = driver.findElement(By.xpath("//input[@id='TxtPassword']"));
		        passwordField.sendKeys("Bu@12345");

		        WebElement submitButton = driver.findElement(By.xpath("//a[@id='ButLogin']"));
		        submitButton.click();

		        Thread.sleep(2000);
		        
		        WebElement clicknpa = driver.findElement(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[2]/a[1]"));
		        clicknpa.click();
		        
		        WebElement addcases = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
		        addcases.click();
		        
		        Thread.sleep(2000);
		        
		        String targetElementXpath = "(//i[@class='fa fa-ellipsis-v'])[1]"; // Replace with your actual XPath
		         WebElement targetElement = driver.findElement(By.xpath(targetElementXpath));
		         
		         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", targetElement);
		         
		         targetElement.click();
		         
		         
		         WebElement clickacase = driver.findElement(By.xpath("(//a[normalize-space()='Commercial Court'])[1]"));
		         clickacase.click();
		         
		         WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseComCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
		         clickclose.click();
		         
		         WebElement clickcobguarator = driver.findElement(By.xpath("//button[@id='BtnComBorrower']"));
		         clickcobguarator.click();
		         
		         
			        WebElement radiobutton = driver.findElement(By.xpath("//input[@id='ComGuaranteer']"));
			        radiobutton.click();
			        
			        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@id='ComCheck_47634'])[1]"));
			        if (!checkbox2.isSelected()) {
			            checkbox2.click();
			        }
			        
			        WebElement addbutton2 = driver.findElement(By.xpath("//button[@id='BtnComBorrowerCustSave']"));
			        addbutton2.click();
			        
			        WebElement clickok = driver.findElement(By.xpath("//button[@id='BtnComBorrowerCustOK']"));
			        clickok.click();
			        
			        WebElement clicklegalheirs = driver.findElement(By.xpath("//button[@id='BtnComLegalHeirs']"));
				       
			        clicklegalheirs.click();
			        
			        WebElement addbutton3 = driver.findElement(By.xpath("//tr[@class='odd']//a[@id='btnAddLegalHeir']"));
			        addbutton3.click();
			        
			        WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='Check_661']"));
			        if (!checkbox3.isSelected()) {
			            checkbox3.click();
			        }
			        
			        JavascriptExecutor js = (JavascriptExecutor) driver;
			        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			        
			        WebElement addbutton4 = driver.findElement(By.xpath("//button[@id='BtnCOMLegalHeiralSave']"));
			        addbutton4.click();
			        
			        WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnCOMSelectedLegalHeirSave']"));
			        savebutton.click();
			        
			        WebElement branchloanno = driver.findElement(By.xpath("//input[@id='TxtComBranchFileno']"));
			        branchloanno.sendKeys("454454");
			        
			        WebElement districtofcourt = driver.findElement(By.xpath("//select[@id='DrpComDistrict']"));
			        Select districtofcourtSelect = new Select(districtofcourt);
			        districtofcourtSelect.selectByVisibleText("Dharwad");
			        
			        WebElement taluk = driver.findElement(By.xpath("//select[@id='DrpComTaluk']"));
			        Select talukSelect = new Select(taluk);
			        talukSelect.selectByVisibleText("DHARWAD");
			        
			        WebElement nameofcourt = driver.findElement(By.xpath("//select[@id='DrpComCourtName']"));
			        Select nameofcourtSelect = new Select(nameofcourt);
			        nameofcourtSelect.selectByVisibleText("Commercial Court");
			        
			        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpComBench']"));
			        Select benchSelect = new Select(bench);
			        benchSelect.selectByVisibleText("Addl District Court, Wanaprthy");
			        
		
			        
			        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtComCNRNo']"));
			        cnrno.sendKeys("derserre676878775");
			        
			        
			        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpComCaseTyp']"));
			        Select casetypeSelect = new Select(casetype);
			        casetypeSelect.selectByVisibleText("First Appeal");
			        
			        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpComCaseStage']"));
			        Select casestageSelect = new Select(casestage);
			        casestageSelect.selectByVisibleText("Hearing");
			        
			        WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtComFilingDate']"));
			        dateoffiling.click();
			        WebElement dateclick1 = driver.findElement(By.xpath("//td[@class='today day']"));
			        dateclick1.click();
			        
			        WebElement roleofbank = driver.findElement(By.xpath("//select[@id='DrpComCanaraRole']"));
			        Select roleofbankSelect = new Select(roleofbank);
			        roleofbankSelect.selectByVisibleText("Petitioner(s)");
			        
			        Thread.sleep(5000);
			        
			        JavascriptExecutor js1 = (JavascriptExecutor) driver;
			        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			        
			        WebElement suitamt = driver.findElement(By.xpath("//input[@id='TxtComSuitAmount']"));
			        suitamt.sendKeys("56656655");
			        
			        WebElement intrestamt = driver.findElement(By.xpath("//input[@id='TxtComInterestClaimed']"));
			        intrestamt.sendKeys("21");
			        
			        WebElement intresttype = driver.findElement(By.xpath("//select[@id='DrpComInterestTyp']"));
			        Select intresttypeSelect = new Select(intresttype);
			        intresttypeSelect.selectByVisibleText("Simple Interest");
			        
			        WebElement bankadv = driver.findElement(By.xpath("//button[@id='BtnComAdvctName']"));
			        bankadv.click();
			        WebElement districtofadv = driver.findElement(By.xpath("//select[@id='DrpAdvComDistrict']"));
			        Select districtofadvSelect = new Select(districtofadv);
			        districtofadvSelect.selectByVisibleText("Dharwad");
			        WebElement talukofadv = driver.findElement(By.xpath("//select[@id='DrpAdvComCouTaluk']"));
			        Select talukofadvSelect = new Select(talukofadv);
			        talukofadvSelect.selectByVisibleText("DHARWAD");
			        WebElement clicksearch = driver.findElement(By.xpath("//button[@id='ComBtnAdvIDSearch']"));
			        clicksearch.click();
			        
			        WebElement checkbox4 = driver.findElement(By.xpath("(//input[@id='CheckComAdvt_825'])[1]"));
			        if (!checkbox4.isSelected()) {
			            checkbox4.click();
			        }
			        
			        WebElement clickadd = driver.findElement(By.xpath("//button[@id='BtnComAdvctSave']"));
			        clickadd.click();
			        
			        WebElement MediationNo = driver.findElement(By.xpath("//input[@id='TxtComMediationNo']"));
			        MediationNo.sendKeys("67665665655");
			        
			        
			        WebElement MediationYear = driver.findElement(By.xpath("//select[@id='DrpComMediationYear']"));
			        Select MediationYearSelect = new Select(MediationYear);
			        MediationYearSelect.selectByVisibleText("2024");
			        
			        WebElement WhetherMediationapproved = driver.findElement(By.xpath("//select[@id='DrpComMediationApprv']"));
			        Select WhetherMediationapprovedSelect = new Select(WhetherMediationapproved);
			        WhetherMediationapprovedSelect.selectByVisibleText("Yes");
			        
			        WebElement Dateofapproval = driver.findElement(By.xpath("//input[@id='TxtComApprvDisposl']"));
			        Dateofapproval.click();
			        WebElement dateclick2 = driver.findElement(By.xpath("//td[@class='today day']"));
			        dateclick2.click();
			        
			        WebElement AmountofAward= driver.findElement(By.xpath("//input[@id='TxtComAmtAward']"));
			        AmountofAward.sendKeys("8654663");
			        
			        WebElement InterestAwarded= driver.findElement(By.xpath("//input[@id='TxtComIntrstAward']"));
			        InterestAwarded.sendKeys("20");
			        
			        WebElement InterestType = driver.findElement(By.xpath("//select[@id='DrpComMIntrstType']"));
			        Select InterestTypeSelect = new Select(InterestType);
			        InterestTypeSelect.selectByVisibleText("Simple Interest");
			        
                    Thread.sleep(3000);
			        
			        WebElement savebutton1 = driver.findElement(By.xpath("//button[@id='BtnComSave']"));
			        savebutton1.click();
			        
			        Thread.sleep(3000);
			        
			        WebElement clickok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
			        clickok1.click();
			        
			        Thread.sleep(3000);
			        
			        WebElement clickokagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
			        clickokagain.click();
			        
			        
		         

}}
