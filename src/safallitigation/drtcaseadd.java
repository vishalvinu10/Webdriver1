package safallitigation;

import java.time.Duration;
import java.util.Random;

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


public class drtcaseadd {
	
	 private WebDriver driver;
	 private WebDriverWait wait;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    }
	    
	    

//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }
	    
		// Method to generate a random 5-digit number
		private String generateRandomDiaryNumber() {
			Random random = new Random();
			int diaryNumber = random.nextInt(90000) + 10000; // Ensures a 5-digit number
			return String.valueOf(diaryNumber);
		}
	    
	    // Method to generate a random alphanumeric string of 16 characters
	    private String generateRandomCNRNumber() {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        StringBuilder cnrNumber = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < 16; i++) {
	            cnrNumber.append(chars.charAt(random.nextInt(chars.length())));
	        }
	        return cnrNumber.toString();
	    }

	    @Test(priority=1)
	    public void testAdddrtcase() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

//	        Thread.sleep(5000);
	        
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        clicknpa.click();
	        Thread.sleep(3000);
	        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
	        addcase.click();
	        
//	        Thread.sleep(5000);
	        
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]"));
	        clickthreedots.click();
	        
//	        Thread.sleep(3000);
	        
	        WebElement clickdrt = driver.findElement(By.xpath("(//a[normalize-space()='DRT'])[1]"));
	        clickdrt.click();
	        
//	        Thread.sleep(3000);
	        
	        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseDRTCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
	        clickclose.click();
	        
	        //coborrower/Guarantor/Legal Heirs
	        
	        WebElement clickaddbutton = driver.findElement(By.xpath("//button[@id='BtnBorrower']"));
	        clickaddbutton.click();
	        
	        WebElement clicklegalheirs = driver.findElement(By.xpath("//input[@id='LegalHeirDRT']"));
	        clicklegalheirs.click();
	        
	        WebElement checkbox = driver.findElement(By.xpath("(//input[@id='DRTCheck_1162'])[1]"));
	        if (!checkbox.isSelected()) {
	        	checkbox.click();
	        }
	        
	        WebElement clickaddbutton1 = driver.findElement(By.xpath("//button[@id='BtnDRTBorrowerSave']"));
	        clickaddbutton1.click();
	        WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnDRTSelectedBorrowerSave']"));
	        savebutton.click();
	        
	        //state of court
	        
	        WebElement StateofCourt = driver.findElement(By.xpath("//select[@id='DrpDRTState']"));
	        Select StateofCourtSelect = new Select(StateofCourt);
	        StateofCourtSelect.selectByVisibleText("Kerala");
	        
	        //Location of the Court
	        
	        WebElement LocationoftheCourt = driver.findElement(By.xpath("//select[@id='DrpDRTDistrict']"));
	        Select LocationoftheCourtSelect = new Select(LocationoftheCourt);
	        LocationoftheCourtSelect.selectByVisibleText("Palakkad");
	        
	        //Name of the Court
	        
	        WebElement NameoftheCourt = driver.findElement(By.xpath("//select[@id='DrpCourtName']"));
	        Select NameoftheCourtSelect = new Select(NameoftheCourt);
	        NameoftheCourtSelect.selectByVisibleText("DRT");
	        
	        //BENCH
	        
	        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpBench']"));
	        Select benchSelect = new Select(bench);
	        benchSelect.selectByVisibleText("COIMBATORE");
	        
	        //case type
	        
	        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpCaseTyp']"));
	        Select casetypeSelect = new Select(casetype);
	        casetypeSelect.selectByVisibleText("Miscellaneous Application");
	        
	        //case stage
	        
	        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpCaseStage']"));
	        Select casestageSelect = new Select(casestage);
	        casestageSelect.selectByVisibleText("Hearing");
	        
	        //Date of Filing
	        
	        WebElement DateofFiling = driver.findElement(By.xpath("//input[@id='TxtFilingDate']"));
	        DateofFiling.sendKeys("01-01-2000");
	        
	        //Role of Bank
	        
	        WebElement RoleofBank = driver.findElement(By.xpath("//select[@id='DrpDRTCanaraRole']"));
	        Select RoleofBankSelect = new Select(RoleofBank);
	        RoleofBankSelect.selectByVisibleText("Petitioner(s)");
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        
	        //Bank’s Advocate
	        
	        WebElement clickaddbutton2 = driver.findElement(By.xpath("//button[@id='BtnAdvctName']"));
	        clickaddbutton2.click();
	        
	        WebElement StateofAdvocate = driver.findElement(By.xpath("//select[@id='DrpAdvDRTState']"));
	        Select StateofAdvocateSelect = new Select(StateofAdvocate);
	        StateofAdvocateSelect.selectByVisibleText("Kerala");
	        WebElement DistrictofAdvocate = driver.findElement(By.xpath("//select[@id='DrpAdvDRTDistrict']"));
	        Select DistrictofAdvocateSelect = new Select(DistrictofAdvocate);
	        DistrictofAdvocateSelect.selectByVisibleText("Palakkad");
	        WebElement clicksearchbutton= driver.findElement(By.xpath("//button[@id='BtnAdvIDDSearch']"));
	        clicksearchbutton.click();
	        
	        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@id='CheckDAdvt_1'])[1]"));
	        if (!checkbox2.isSelected()) {
	        	checkbox2.click();
	        }
	        
	        WebElement clickaddbutton3 = driver.findElement(By.xpath("//button[@id='BtnAdvctSave']"));
	        clickaddbutton3.click();
	        
	        //diary no
	        
	   
	   	 WebElement diarynoElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDiaryNo']")));
		 String generatedDiaryNumber = generateRandomDiaryNumber();
		 diarynoElement.sendKeys(generatedDiaryNumber);
		 System.out.println("Generated Diary Number: " + generatedDiaryNumber);
	        
	        //diary year
	        WebElement diaryyear = driver.findElement(By.xpath("//select[@id='DrpDiaryYear']"));
	        Select diaryyearSelect = new Select(diaryyear);
	        diaryyearSelect.selectByVisibleText("2024");
	        
	        //CNR No
	      
	        
	        WebElement cNRNOElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTCNRNo']")));
			 cNRNOElement.sendKeys(generateRandomCNRNumber());
			 String generatedCNRNumber = generateRandomCNRNumber();
			 System.out.println("Generated CNR Number: " + generatedCNRNumber);
	        
	        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtCaseNo']"));
	        caseno.sendKeys("987");
	        
//	        Thread.sleep(3000);
	        
	        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpCaseYear']"));
	        Select caseyearSelect = new Select(caseyear);
	        caseyearSelect.selectByVisibleText("2024");
	        
	        WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnDRTSave']"));
	        clicksave.click();
	        
//	        Thread.sleep(3000);
	        
	        WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        clickok.click();
	        
//            Thread.sleep(3000);
	        
	        WebElement clickok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        clickok1.click();



}
	    
	    
        @Test(priority=2)
	    public void testdrtapprove() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BM");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

//	        Thread.sleep(5000);
	        
	        WebElement clickapprovals = driver.findElement(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']"));
	        clickapprovals.click();
//	        Thread.sleep(3000);
	        WebElement approval = driver.findElement(By.xpath("//a[@href='/CaseApproval/CaseApproval']"));
	        approval.click();
	        
//	        Thread.sleep(5000);
	        
	        //filter
	        
	        
	        WebElement NatureofCase = driver.findElement(By.xpath("//select[@id='DrpApprvCaseTyp']"));
	        Select NatureofCaseSelect = new Select(NatureofCase);
	        NatureofCaseSelect.selectByVisibleText("DRT");
	        
	        WebElement search = driver.findElement(By.xpath("//button[@id='BtnApprvSearch']"));
	        search.click();
	        
//	        Thread.sleep(3000);
	        
	        WebElement UploadCaseDetails = driver.findElement(By.xpath("(//i[@id='BtnSelectApprovl'])[1]"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", UploadCaseDetails);
//            Thread.sleep(3000);
            UploadCaseDetails.click();
          
	        
//	        Thread.sleep(5000);
	        
	      //approval
            
            WebElement approvebutton = driver.findElement(By.xpath("//button[@id='BtnDRTApprove']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", approvebutton);
//            Thread.sleep(1000);
            approvebutton.click();
            
//            Thread.sleep(3000);
            
            WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
            clickok.click();
            
//            Thread.sleep(3000);
            
            WebElement clickokagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
            clickokagain.click();
            
//            Thread.sleep(5000);
            
        }
        
        
        @Test(priority=3,enabled = false)
	    public void testDRTlitigation() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BM");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

	        Thread.sleep(5000);
	        
	        WebElement litigation = driver.findElement(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Litigation']"));
	        litigation.click();
	        Thread.sleep(3000);
	        WebElement litigation1 = driver.findElement(By.xpath("//span[@data-i18n='nav.basic-components.alert'][normalize-space()='Litigation']"));
	        litigation1.click();
	        
	        Thread.sleep(5000);
	        
	        //filter
	        
	        
	        WebElement NatureofCase = driver.findElement(By.xpath("//select[@id='DrpCListCaseTyp']"));
	        Select NatureofCaseSelect = new Select(NatureofCase);
	        NatureofCaseSelect.selectByVisibleText("DRT");
	        
	        WebElement search = driver.findElement(By.xpath("//button[@id='BtnCListSearch']"));
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
         
        WebElement plus = driver.findElement(By.xpath("//button[@id='BtnDRTCDAdvctDtls']"));
        plus.click();
       Thread.sleep(3000);
       
      WebElement state = driver.findElement(By.xpath("//select[@id='DrpDRTADState']"));
      Select stateSelect = new Select(state);
      stateSelect.selectByVisibleText("Kerala"); 
      
      WebElement district = driver.findElement(By.xpath("//select[@id='DrpDRTADDistrict']"));
      Select districtSelect = new Select(district);
      districtSelect.selectByVisibleText("Palakkad"); 
      
      WebElement name = driver.findElement(By.xpath("//select[@id='DrpDRTCDAdvocateName']"));
      Select nameSelect = new Select(name);
      nameSelect.selectByVisibleText("PRADEEP"); 
      
      WebElement totalfee = driver.findElement(By.xpath("//input[@id='TxtCDTtlAdvctFee']"));
      totalfee.sendKeys("100000");
      WebElement feepaid = driver.findElement(By.xpath("//input[@id='TxtCDAdvctFeePaid']"));
      feepaid.sendKeys("50000");
      WebElement clerkage = driver.findElement(By.xpath("//input[@id='TxtCDClerkageFee']"));
      clerkage.sendKeys("10000");
      
      WebElement add = driver.findElement(By.xpath("//button[@id='BtnCDAdvctDtlsSave']"));
      add.click();
      Thread.sleep(1000);
      WebElement save = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
      save.click();
      Thread.sleep(1000);
      WebElement ok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
      ok.click();
      
      Thread.sleep(3000);
      
      //advocate 2
      
      WebElement total = driver.findElement(By.xpath("//input[@id='TxtCDTotalCourtFee']"));
      total.sendKeys("100000");
      WebElement refund = driver.findElement(By.xpath("//input[@id='TxtCDRefundCourtFee']"));
      refund.sendKeys("30000");
      WebElement advofoppparty = driver.findElement(By.xpath("//input[@id='TxtCDAdvctOppPart']"));
      advofoppparty.sendKeys("dinesh");
      WebElement save1 = driver.findElement(By.xpath("//button[@id='BtnDRTCDAdvctSave']"));
      save1.click();
      Thread.sleep(1000);
      WebElement saveagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
      saveagain.click();
      Thread.sleep(1000);
      WebElement ok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
      ok1.click();
      
      
      //couterclaim
      
      WebElement Dateoffiling = driver.findElement(By.xpath("//input[@id='TxtFilingCounterClaim']"));
      Dateoffiling.sendKeys("24-07-2024"); 
      WebElement amount = driver.findElement(By.xpath("//input[@id='TxtAmtCounterClaim']"));
      amount.sendKeys("50000"); 
      WebElement intrestclaimed = driver.findElement(By.xpath("//input[@id='TxtCDInterestClaimed']"));
      intrestclaimed.sendKeys("13"); 
      WebElement intresttype = driver.findElement(By.xpath("//select[@id='DrpCDInterestTyp']"));
      Select intresttypeSelect = new Select(intresttype);
      intresttypeSelect.selectByVisibleText("Simple Interest");
      Thread.sleep(1000);
      WebElement save2 = driver.findElement(By.xpath("//button[@id='BtnDRTCDCounterClaimSave']"));
      save2.click();
      Thread.sleep(1000);
      WebElement saveagain1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
      saveagain1.click();
      Thread.sleep(1000);
      WebElement ok2 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
      ok2.click();
      
      
      Thread.sleep(3000);
      
      //court proceedings
      
      
      WebElement plusbutton = driver.findElement(By.xpath("//button[@id='BtnDRTCDCourtProceed']"));
      plusbutton.click();
      Thread.sleep(1000);
      WebElement stage = driver.findElement(By.xpath("//select[@id='DrpCPStage']"));
      Select stageSelect = new Select(stage);
      stageSelect.selectByVisibleText("Hearing");
      WebElement dateofhearing = driver.findElement(By.xpath("//input[@id='TxtCPHearingDate']"));
      dateofhearing.sendKeys("30-07-2024");
      WebElement purpose = driver.findElement(By.xpath("//textarea[@id='TxtCPPurpose']"));
      purpose.sendKeys("test");
      WebElement notes = driver.findElement(By.xpath("//textarea[@id='TxtCPNotes']"));
      notes.sendKeys("test");
      Thread.sleep(1000);
      WebElement save3 = driver.findElement(By.xpath("//button[@id='BtnCPSave']"));
      save3.click();
      Thread.sleep(1000);
      WebElement saveagain2 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
      saveagain2.click();
      Thread.sleep(1000);
      WebElement ok3 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
      ok3.click();
      
      Thread.sleep(3000);
      
//      JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
      //upload documents
      WebElement doctype = driver.findElement(By.xpath("//select[@id='DrpDocumentTyp']"));
      Select doctypeSelect = new Select(doctype);
      doctypeSelect.selectByVisibleText("PDF");
      
         WebElement uploadfile1 = driver.findElement(By.xpath("//input[@id='UploadDRTFile']"));
         String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\SAFE\\field alignment issue.jpg";
         uploadfile1.sendKeys(filePath);
         WebElement desc = driver.findElement(By.xpath("//textarea[@id='TxtDRTDescription']"));
         desc.sendKeys("document");
         
         WebElement clickupload = driver.findElement(By.xpath("//button[@id='BtnDocUpload']"));
         clickupload.click();
         Thread.sleep(1000);
	      WebElement save4 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	      save4.click();
	      Thread.sleep(1000);
	      
	      WebElement ok4 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	      ok4.click();
	      
	      
	      //Details of Interim Application (IA)
	      
	      WebElement clickplus = driver.findElement(By.xpath("//button[@id='BtnDRTCDInterimApp']"));
	      clickplus.click();
	      WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtIADate']"));
	      dateoffiling.sendKeys("24-07-2024");
	      WebElement IAno = driver.findElement(By.xpath("//input[@id='TxtIANo']"));
	      IAno.sendKeys("545");
	      WebElement IAyear = driver.findElement(By.xpath("//select[@id='DrpIAYear']"));
	      Select IAyearSelect = new Select(IAyear);
	      IAyearSelect.selectByVisibleText("2024");
	      WebElement fileby = driver.findElement(By.xpath("//textarea[@id='TxtFileBy']"));
	      fileby.sendKeys("TEST");
	      WebElement purpose1 = driver.findElement(By.xpath("//textarea[@id='TxtCDPurpose']"));
	      purpose1.sendKeys("TEST");
	      WebElement dateoffilingcounter = driver.findElement(By.xpath("//input[@id='TxtCounterRply']"));
	      dateoffilingcounter.sendKeys("24-07-2024");
	      WebElement dateofdisposal = driver.findElement(By.xpath("//input[@id='TxtDisposalIA']"));
	      dateofdisposal.sendKeys("24-07-2024");
	      WebElement filedagainst = driver.findElement(By.xpath("//select[@id='DrpDRTInterAppealIA']"));
	      Select filedagainstSelect = new Select(filedagainst);
	      filedagainstSelect.selectByVisibleText("No");
	      
	      Thread.sleep(3000);
	      WebElement save5 = driver.findElement(By.xpath("//button[@id='BtnInterimAppDtlsSave']"));
	      save5.click();
	      Thread.sleep(3000);
	      WebElement saveagain3 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	      saveagain3.click();
	      Thread.sleep(3000);
	      
	      WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	      clickok.click();
	      
	      
         
        }}
            
