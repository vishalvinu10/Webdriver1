package safallitigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class commercialcaseadd {
	

	 private WebDriver driver;
	 private WebDriverWait wait;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }

	    @Test(priority=1,enabled=false)
	    public void testAddcommercial() throws InterruptedException {
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
	        
	        WebElement clickcommercial = driver.findElement(By.xpath("(//a[normalize-space()='Commercial Court'])[1]"));
	        clickcommercial.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseComCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
	        clickclose.click();
	        
	        
	        //coborrower/Guarantor/Legal Heirs
	        
	        WebElement clickaddbutton = driver.findElement(By.xpath("//button[@id='BtnComBorrower']"));
	        clickaddbutton.click();
	        
	        WebElement clicklegalheirs = driver.findElement(By.xpath("//input[@id='ComLegal']"));
	        clicklegalheirs.click();
	        
	        WebElement checkbox = driver.findElement(By.xpath("(//input[@id='ComCheck_1162'])[1]"));
	        if (!checkbox.isSelected()) {
	        	checkbox.click();
	        }
	        
	        WebElement clickaddbutton1 = driver.findElement(By.xpath("//button[@id='BtnComBorrowerCustSave']"));
	        clickaddbutton1.click();
	        WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnComBorrowerCustOK']"));
	        savebutton.click();
	        
             //state of court
	        
	        WebElement StateofCourt = driver.findElement(By.xpath("//select[@id='DrpComState']"));
	        Select StateofCourtSelect = new Select(StateofCourt);
	        StateofCourtSelect.selectByVisibleText("Kerala");
	        
	        //Location of the Court
	        
	        WebElement LocationoftheCourt = driver.findElement(By.xpath("//select[@id='DrpComDistrict']"));
	        Select LocationoftheCourtSelect = new Select(LocationoftheCourt);
	        LocationoftheCourtSelect.selectByVisibleText("Palakkad");
	        
            //Name of the Court
	        
	        WebElement NameoftheCourt = driver.findElement(By.xpath("//select[@id='DrpComCourtName']"));
	        Select NameoftheCourtSelect = new Select(NameoftheCourt);
	        NameoftheCourtSelect.selectByVisibleText("Commercial Court");
	        
	        //BENCH
	        
	        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpComBench']"));
	        Select benchSelect = new Select(bench);
	        benchSelect.selectByVisibleText("Addl District Court, Wanaprthy");
	        
	        
	        //cnr number
	        
	        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtComCNRNo']"));
	        cnrno.sendKeys("ltupoji234555885");
	        
	        //case type
	        
	        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpComCaseTyp']"));
	        Select casetypeSelect = new Select(casetype);
	        casetypeSelect.selectByVisibleText("Com.A.A - (Arbitration Application)");
	        
            //case stage
	        
	        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpComCaseStage']"));
	        Select casestageSelect = new Select(casestage);
	        casestageSelect.selectByVisibleText("Hearing");
	        
	        //Date of Filing
	        
	        WebElement DateofFiling = driver.findElement(By.xpath("//input[@id='TxtComFilingDate']"));
	        DateofFiling.sendKeys("06-08-2024");
	        
             //Role of Bank
	        
	        WebElement RoleofBank = driver.findElement(By.xpath("//select[@id='DrpComCanaraRole']"));
	        Select RoleofBankSelect = new Select(RoleofBank);
	        RoleofBankSelect.selectByVisibleText("Petitioner(s)");
	        
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        
	        
	        //Suit Amount in Rs.(Actuals)
	        
	        WebElement SuitAmount = driver.findElement(By.xpath("//input[@id='TxtComSuitAmount']"));
	        SuitAmount.sendKeys("798685");
	        
	        //Interest Claimed (%)
	        
	        WebElement Interest = driver.findElement(By.xpath("//input[@id='TxtComInterestClaimed']"));
	        Interest.sendKeys("20");
	        
	        //Interest Type
	       
	        WebElement InterestType = driver.findElement(By.xpath("//select[@id='DrpComInterestTyp']"));
	        Select InterestTypeSelect = new Select(InterestType);
	        InterestTypeSelect.selectByVisibleText("Simple Interest");
	        
	        //Mediation No
	        
	        WebElement Mediation = driver.findElement(By.xpath("//input[@id='TxtComMediationNo']"));
	        Mediation.sendKeys("97997");
	        
	        //Mediation Year
	        
	        WebElement MediationYear = driver.findElement(By.xpath("//select[@id='DrpComMediationYear']"));
	        Select MediationYearSelect = new Select(MediationYear);
	        MediationYearSelect.selectByVisibleText("2024");
	        
	        //Whether Mediation approved
	        
	        WebElement WhetherMediationapproved = driver.findElement(By.xpath("//select[@id='DrpComMediationApprv']"));
	        Select WhetherMediationapprovedSelect = new Select(WhetherMediationapproved);
	        WhetherMediationapprovedSelect.selectByVisibleText("No");
	        
	        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtComCaseNo']"));
	        caseno.sendKeys("2222");
	        
	        //Date of approval / Disposal
	        
//	        WebElement Dateofapproval = driver.findElement(By.xpath("//input[@id='TxtComApprvDisposl']"));
//	        Dateofapproval.sendKeys("17-07-2024");
//	        
//	        //Amount of Award
//	        WebElement AmountofAward = driver.findElement(By.xpath("//input[@id='TxtComAmtAward']"));
//	        AmountofAward.sendKeys("87877");
//	        
//	        //Interest Awarded(%)
//	        
//	        WebElement InterestAwarded = driver.findElement(By.xpath("//input[@id='TxtComIntrstAward']"));
//	        InterestAwarded.sendKeys("13");
//	        
	        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpComCaseYear']"));
	        Select caseyearSelect = new Select(caseyear);
	        caseyearSelect.selectByVisibleText("2024");
	        
	        WebElement clicksave = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComSave']")));
	        clicksave.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickok =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        clickok.click();
	        
            Thread.sleep(3000);
	        
	        WebElement clickok1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        clickok1.click();
	        
	    }
	        
	        
	        @Test(priority=2,enabled=false)
		    public void testcommercialapprove() throws InterruptedException {
		        driver.get("https://safallitigation.onlinesafe.in/");

		        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
		        usernameField.sendKeys("BM");

		        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
		        signInButton.click();

		        Thread.sleep(5000);
		        
		        WebElement clickapprovals = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[7]"));
		        clickapprovals.click();
		        Thread.sleep(3000);
		        WebElement approval = driver.findElement(By.xpath("//span[normalize-space()='Approval']"));
		        approval.click();
		        
		        Thread.sleep(5000);
		        
		        //filter
		        
		        
		        WebElement NatureofCase = driver.findElement(By.xpath("//select[@id='DrpApprvCaseTyp']"));
		        Select NatureofCaseSelect = new Select(NatureofCase);
		        NatureofCaseSelect.selectByVisibleText("Commercial Court");
		        
		        WebElement search = driver.findElement(By.xpath("//button[@id='BtnApprvSearch']"));
		        search.click();
		        
		        Thread.sleep(3000);
		        
		        WebElement clickeyebutton = driver.findElement(By.xpath("(//i[@id='BtnSelectApprovl'])[1]"));
		        clickeyebutton.click();
		        
		        Thread.sleep(5000);
		        
		      //approval
	            
	            WebElement approvebutton = driver.findElement(By.xpath("//button[@id='BtnComApprove']"));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", approvebutton);
	            Thread.sleep(1000);
	            approvebutton.click();
	            
	            Thread.sleep(1000);
	            
	            WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	            clickok.click();
	            
	            Thread.sleep(1000);
	            
	            WebElement clickokagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	            clickokagain.click();
	            
	        }
	            
	            
	            @Test(priority=3)
	    	    public void testcommerciallitigation() throws InterruptedException {
	    	        driver.get("https://safallitigation.onlinesafe.in/");

	    	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	    	        usernameField.sendKeys("BM");

	    	        WebElement signInButton =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
	    	        signInButton.click();

	    	        Thread.sleep(5000);
	    	        
	    	        WebElement litigation =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Litigation']")));
	    	        litigation.click();
//	    	        Thread.sleep(3000);
	    	        WebElement litigation1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.alert'][normalize-space()='Litigation']")));
	    	        litigation1.click();
	    	        
//	    	        Thread.sleep(5000);
	    	        
	    	        //filter
	    	        
	    	        
			        WebElement NatureofCase =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpCListCaseTyp']")));
			        Select NatureofCaseSelect = new Select(NatureofCase);
			        NatureofCaseSelect.selectByVisibleText("Commercial Court");
			        
			        WebElement search =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnCListSearch']")));
			        search.click();
			        
			        Thread.sleep(3000);
			        
			        JavascriptExecutor js = (JavascriptExecutor) driver;
   		            js.executeScript("window.scrollBy(0, 250);");  
			        
   		            Thread.sleep(3000);
   		            
   		            // locate an element horizontally
   		            
   		         WebElement UploadCaseDetails = driver.findElement(By.xpath("(//i[@class='BtnUploadCaseStage fa fa-upload fnt-18 fnt-bold text-violet'])[1]"));
   		         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", UploadCaseDetails);
 	              Thread.sleep(3000);
 	             UploadCaseDetails.click();
 	            Thread.sleep(3000);
 	             
 	             //Advocate & Professional Fee Details
 	            
 	           WebElement plus = driver.findElement(By.xpath("//button[@id='BtnComAdvctDtls']"));
 	           plus.click();
 	          Thread.sleep(3000);
 	          
 	         WebElement state = driver.findElement(By.xpath("//select[@id='DrpComADState']"));
		      Select stateSelect = new Select(state);
		      stateSelect.selectByVisibleText("Kerala"); 
		      
		      WebElement district = driver.findElement(By.xpath("//select[@id='DrpComADDistrict']"));
		      Select districtSelect = new Select(district);
		      districtSelect.selectByVisibleText("Palakkad"); 
		      
		      WebElement name = driver.findElement(By.xpath("//select[@id='DrpComADAdvocateName']"));
		      Select nameSelect = new Select(name);
		      nameSelect.selectByVisibleText("PRADEEP"); 
		      
		      WebElement totalfee = driver.findElement(By.xpath("//input[@id='TxtComADTtlAdvctFee']"));
		      totalfee.sendKeys("100000");
		      WebElement feepaid = driver.findElement(By.xpath("//input[@id='TxtComADAdvctFeePaid']"));
		      feepaid.sendKeys("50000");
		      WebElement clerkage = driver.findElement(By.xpath("//input[@id='TxtComADClerkageFee']"));
		      clerkage.sendKeys("10000");
		      
		      WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComAdvctDtlsSave']")));
		      add.click();
		      Thread.sleep(3000);
		      WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
		      save.click();
		      Thread.sleep(3000);
		      WebElement ok =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
		      ok.click();
		      
		      Thread.sleep(3000);
		      
		      //advocate 2
		      
		      WebElement total = driver.findElement(By.xpath("//input[@id='TxtComADTotalCourtFeePayable']"));
		      total.sendKeys("100000");
		      WebElement feepaid1 = driver.findElement(By.xpath("//input[@id='TxtComADCourtFeePaid']"));
		      feepaid1.sendKeys("30000");
		      WebElement advofoppparty = driver.findElement(By.xpath("//input[@id='TxtComADAdvoctOppParty']"));
		      advofoppparty.sendKeys("dinesh");
		      WebElement save1 = driver.findElement(By.xpath("//button[@id='BtnComADAdvctSave']"));
		      save1.click();
		      Thread.sleep(1000);
		      WebElement saveagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
		      saveagain.click();
		      Thread.sleep(1000);
		      WebElement ok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
		      ok1.click();
		      
		      
		      //couterclaim
		      
		      WebElement Dateoffiling = driver.findElement(By.xpath("//input[@id='TxtComCCFilingCounterClaim']"));
		      Dateoffiling.sendKeys("24-07-2024"); 
		      WebElement amount = driver.findElement(By.xpath("//input[@id='TxtComCCAmtCounterClaim']"));
		      amount.sendKeys("50000"); 
		      WebElement intrestclaimed = driver.findElement(By.xpath("//input[@id='TxtComCCInterestClaimed']"));
		      intrestclaimed.sendKeys("13"); 
		      WebElement intresttype = driver.findElement(By.xpath("//select[@id='DrpComCCInterestTyp']"));
		      Select intresttypeSelect = new Select(intresttype);
		      intresttypeSelect.selectByVisibleText("Simple Interest");
		      Thread.sleep(3000);
		      WebElement save2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
		      save2.click();
		      Thread.sleep(3000);
		      WebElement saveagain1 = driver.findElement(By.xpath("/html/body/div[3]/div[7]/div/button"));
		      saveagain1.click();
		      Thread.sleep(3000);
		      WebElement ok2 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[7]/div/button")));
		      ok2.click();
		      
		      
		      Thread.sleep(3000);
		      
		      //court proceedings
		      
		      
		      WebElement plusbutton = driver.findElement(By.xpath("//button[@id='BtnComCourtProceed']"));
		      plusbutton.click();
	          Thread.sleep(1000);
	          WebElement stage = driver.findElement(By.xpath("//select[@id='DrpComCPStage']"));
		      Select stageSelect = new Select(stage);
		      stageSelect.selectByVisibleText("Hearing");
		      WebElement dateofhearing = driver.findElement(By.xpath("//input[@id='TxtComCPHearingDate']"));
		      dateofhearing.sendKeys("30-07-2024");
		      WebElement purpose = driver.findElement(By.xpath("//textarea[@id='TxtComCPPurpose']"));
		      purpose.sendKeys("test");
		      WebElement notes = driver.findElement(By.xpath("//textarea[@id='TxtComCPNotes']"));
		      notes.sendKeys("test");
		      Thread.sleep(1000);
		      WebElement save3 = driver.findElement(By.xpath("//button[@id='BtnComCPSave']"));
		      save3.click();
		      Thread.sleep(1000);
		      WebElement saveagain2 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
		      saveagain2.click();
		      Thread.sleep(1000);
		      WebElement ok3 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
		      ok3.click();
		      
		      Thread.sleep(3000);
		      
//		      JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		      
		      //upload documents
		      WebElement doctype = driver.findElement(By.xpath("//select[@id='DrpComUDDocumentTyp']"));
		      Select doctypeSelect = new Select(doctype);
		      doctypeSelect.selectByVisibleText("PDF");
		      
		         WebElement uploadfile1 = driver.findElement(By.xpath("//input[@id='UploadComUDFile']"));
		         String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\SAFE\\field alignment issue.jpg";
		         uploadfile1.sendKeys(filePath);
		         WebElement desc = driver.findElement(By.xpath("//textarea[@id='TxtComUDDescription']"));
		         desc.sendKeys("document");
		         
		         WebElement clickupload = driver.findElement(By.xpath("//button[@id='BtnComUDDocUpload']"));
		         clickupload.click();
		         Thread.sleep(3000);
			      WebElement save4 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
			      save4.click();
			      Thread.sleep(3000);
			      
			      WebElement ok4 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
			      ok4.click();
			      
			      Thread.sleep(3000);
			      //Details of Interim Application (IA)
			      
			      WebElement clickplus = driver.findElement(By.xpath("//button[@id='BtnComInter']"));
			      clickplus.click();
			      WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtComInterIADate']"));
			      dateoffiling.sendKeys("24-07-2024");
			      WebElement IAno = driver.findElement(By.xpath("//input[@id='TxtComInterIANo']"));
			      IAno.sendKeys("545");
			      WebElement IAyear = driver.findElement(By.xpath("//select[@id='DrpComInterIAYear']"));
			      Select IAyearSelect = new Select(IAyear);
			      IAyearSelect.selectByVisibleText("2024");
			      WebElement fileby = driver.findElement(By.xpath("//textarea[@id='TxtComInterFileBy']"));
			      fileby.sendKeys("TEST");
			      WebElement purpose1 = driver.findElement(By.xpath("//textarea[@id='TxtComInterPurpose']"));
			      purpose1.sendKeys("TEST");
			      WebElement dateoffilingcounter = driver.findElement(By.xpath("//input[@id='TxtComInterCounterRply']"));
			      dateoffilingcounter.sendKeys("24-07-2024");
			      WebElement dateofdisposal = driver.findElement(By.xpath("//input[@id='TxtComInterDisposalIA']"));
			      dateofdisposal.sendKeys("24-07-2024");
			      WebElement filedagainst = driver.findElement(By.xpath("//select[@id='DrpComInterAppealIA']"));
			      Select filedagainstSelect = new Select(filedagainst);
			      filedagainstSelect.selectByVisibleText("No");
			      
			      Thread.sleep(3000);
			      WebElement save5 = driver.findElement(By.xpath("//button[@id='BtnComInterSave']"));
			      save5.click();
			      Thread.sleep(3000);
			      WebElement saveagain3 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
			      saveagain3.click();
			      Thread.sleep(3000);
			      
			      WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
			      clickok.click();
			      
			      
	          
		      
		      
		      
		      
		      
 	             
			        
			        
			        
			        
	    	        
	        
	        
	        

}}
