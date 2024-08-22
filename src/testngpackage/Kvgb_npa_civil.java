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

public class Kvgb_npa_civil {
		
		 private WebDriver driver;

		    @BeforeClass
		    public void setUp() {
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		    }

//		    @AfterClass
//		    public void tearDown() {
//		        if (driver != null) {
//		            driver.quit();
//		        }
//		    }

		    //CIVIL COURT CASE
		    
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
			         
			         
			         WebElement clickacase = driver.findElement(By.xpath("(//a[normalize-space()='Civil Court'])[1]"));
			         clickacase.click();
			         
			         WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseCCCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
			         clickclose.click();
			         
			         WebElement clickcobguarator = driver.findElement(By.xpath("//button[@id='BtnCCBorrower']"));
			         clickcobguarator.click();
			         
			         WebElement checkbox = driver.findElement(By.xpath("//input[@id='CivilCheck_424621']"));
				        if (!checkbox.isSelected()) {
				            checkbox.click();
				        }
				        
				        WebElement addbutton = driver.findElement(By.xpath("//button[@id='BtnCCCBorrowerSave']"));
				        addbutton.click();
				        
				        WebElement radiobutton = driver.findElement(By.xpath("//input[@id='CCGuaranteer']"));
				        radiobutton.click();
				        
				        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='CivilCheck_47634']"));
				        if (!checkbox2.isSelected()) {
				            checkbox2.click();
				        }
				        
				        WebElement addbutton2 = driver.findElement(By.xpath("//button[@id='BtnCCCBorrowerSave']"));
				        addbutton2.click();
				        
				        WebElement clickok = driver.findElement(By.xpath("//button[@id='BtnCCBorrowIDOK']"));
				        clickok.click();
				        
				        WebElement clicklegalheirs = driver.findElement(By.xpath("//button[@id='BtnCCLegalheir']"));
				       
				        clicklegalheirs.click();
				        
				        JavascriptExecutor js = (JavascriptExecutor) driver;
				        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");  //SCROLL DOWN IN A TABLE
				        
				        
				       
				        WebElement addbutton3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]"));
				        addbutton3.click();
				        
				        WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='CivilCheck_661']"));
				        if (!checkbox3.isSelected()) {
				            checkbox3.click();
				        }
				        
				        
				        WebElement addbutton4 = driver.findElement(By.xpath("//button[@id='BtnCIVILLegalHeiralSave']"));
				        addbutton4.click();
				        
				        WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnCIVILSelectedLegalHeirSave']"));
				        clicksave.click();
				        
				        WebElement loanno = driver.findElement(By.xpath("//input[@id='TxtCCBranchFileno']"));
				        loanno.sendKeys("678776");
				        
				        WebElement districtofcourt = driver.findElement(By.xpath("//select[@id='DrpCCDistrict']"));
				        Select districtofcourtSelect = new Select(districtofcourt);
				        districtofcourtSelect.selectByVisibleText("Bagalkot");
				        
				        WebElement taluk = driver.findElement(By.xpath("//select[@id='DrpCCTaluk']"));
				        Select talukSelect = new Select(taluk);
				        talukSelect.selectByVisibleText("HUNGUND");
				        
				        WebElement nameofcourt = driver.findElement(By.xpath("//select[@id='DrpCCCourtName']"));
				        Select nameofcourtSelect = new Select(nameofcourt);
				        nameofcourtSelect.selectByVisibleText("CIVIL COURT");
				        
				        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpCCBench']"));
				        Select benchSelect = new Select(bench);
				        benchSelect.selectByVisibleText("TEST1");
				        
				        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpCCCaseTyp']"));
				        Select casetypeSelect = new Select(casetype);
				        casetypeSelect.selectByVisibleText("Review");
				        
				        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpCCCaseStage']"));
				        Select casestageSelect = new Select(casestage);
				        casestageSelect.selectByVisibleText("Hearing");
				        
				        //date
				        
				        WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtCCFilingDate']"));
				        dateoffiling.click();
				        WebElement dateclick1 = driver.findElement(By.xpath("//td[@class='today day']"));
				        dateclick1.click();
//				        WebElement dateclick2 = driver.findElement(By.xpath("//th[normalize-space()='2024']"));
//				        dateclick2.click();
//				        WebElement dateclick3 = driver.findElement(By.xpath("//div[@class='datepicker-years']//th[@class='prev'][normalize-space()='«']"));
//				        dateclick3.click();
//				        WebElement dateclick4 = driver.findElement(By.xpath("//div[@class='datepicker-years']//th[@class='prev'][normalize-space()='«']"));
//				        dateclick4.click();
//				        WebElement dateclick5 = driver.findElement(By.xpath("//span[normalize-space()='2000']"));
//				        dateclick5.click();
//				        WebElement dateclick6 = driver.findElement(By.xpath("//span[normalize-space()='Jan']"));
//				        dateclick6.click();
//				        WebElement dateclick7 = driver.findElement(By.xpath("//td[@class='day'][normalize-space()='2']"));
//				        dateclick7.click();
				        
				        
				        WebElement roleofbank = driver.findElement(By.xpath("//select[@id='DrpCCCanaraRole']"));
				        Select roleofbankSelect = new Select(roleofbank);
				        roleofbankSelect.selectByVisibleText("Petitioner(s)");
				        
				        JavascriptExecutor js1 = (JavascriptExecutor) driver;
				        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				        
				        WebElement suitamount = driver.findElement(By.xpath("//input[@id='TxtCCSuitAmount']"));
				        suitamount.sendKeys("40000");
				        
				        WebElement intrestclaimed = driver.findElement(By.xpath("//input[@id='TxtCCInterestClaimed']"));
				        intrestclaimed.sendKeys("21");
				        
				        WebElement intresttype = driver.findElement(By.xpath("//select[@id='DrpCCInterestTyp']"));
				        Select intresttypeSelect = new Select(intresttype);
				        intresttypeSelect.selectByVisibleText("Simple Interest");
				        
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
				        
				        WebElement checkbox4 = driver.findElement(By.xpath("//input[@id='CheckCAdvt_806']"));
				        if (!checkbox4.isSelected()) {
				            checkbox4.click();
				        }
				        
				        WebElement clickadd = driver.findElement(By.xpath("//button[@id='BtnCCAdvctSave']"));
				        clickadd.click();
				        
				        WebElement courtfilingno = driver.findElement(By.xpath("//input[@id='TxtCCFilingNo']"));
				        courtfilingno.sendKeys("786");
				        
				        WebElement courtfilingyear = driver.findElement(By.xpath("//select[@id='DrpCCFilingYear']"));
				        Select courtfilingyearSelect = new Select(courtfilingyear);
				        courtfilingyearSelect.selectByVisibleText("2024");
				        
				        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtCCCNRNo']"));
				        cnrno.sendKeys("geuer84799696896");
				        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtCCCaseNo']"));
				        caseno.sendKeys(" 564");
				        
				        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpCCCaseYear']"));
				        Select caseyearSelect = new Select(caseyear);
				        caseyearSelect.selectByVisibleText("2024");
				        
				        Thread.sleep(3000);
				        
				        WebElement clicksave1 = driver.findElement(By.xpath("//button[@id='BtnCCSave']"));
				        clicksave1.click();
				        
				        Thread.sleep(3000);
				        
				        WebElement clickOK = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
				        clickOK.click();
				        
				        Thread.sleep(3000);
				        
				        WebElement clickOK1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
				        clickOK1.click();
	         

	}


       @Test(priority=2 )
       
       public void testkvgbnpacivilapproval() throws InterruptedException {
	    	    driver.get("https://kvgb.onlinesafe.in/");

		        WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtLoginID']"));
		        usernameField.sendKeys("branchmanager@gmail.com");
		        
		        WebElement passwordField = driver.findElement(By.xpath("//input[@id='TxtPassword']"));
		        passwordField.sendKeys("Bm@12345");

		        WebElement submitButton = driver.findElement(By.xpath("//a[@id='ButLogin']"));
		        submitButton.click();
		        
		        Thread.sleep(2000);
		        
		        WebElement clickapprovals = driver.findElement(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[3]/a[1]"));
		        clickapprovals.click();
		        
		        WebElement clickapproval = driver.findElement(By.xpath("//span[@class='pcoded-mtext span-align'][normalize-space()='Approval']"));
		        clickapproval.click();
		        
		        Thread.sleep(2000);
		        
		        WebElement clickeyebutton = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]/i[1]"));
		        clickeyebutton.click();
		        
		        Thread.sleep(3000);
		        
		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		        
		        WebElement forwardto = driver.findElement(By.xpath("//select[@id='DrpCivilForward']"));
		        Select forwardtoSelect = new Select(forwardto);
		        forwardtoSelect.selectByVisibleText("RO");
		        
		        WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtCCDescription']"));
		        description.sendKeys("forwarded to RO");
		        
		        WebElement clickforwardbutton = driver.findElement(By.xpath("//button[@id='BtncivilForward']"));
		        clickforwardbutton.click();
		        
		        Thread.sleep(3000);
		        
		        WebElement clickokbutton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
		        clickokbutton.click();
		        
		        Thread.sleep(3000);
		        
		        WebElement clickokagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
		        clickokagain.click();
}
       



  @Test(priority=3)
  public void civilforwardtoho() throws InterruptedException {
	 driver.get("https://kvgb.onlinesafe.in/");

        WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtLoginID']"));
        usernameField.sendKeys("regionalofficer@gmail.com");
        
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='TxtPassword']"));
        passwordField.sendKeys("Ro@12345");

        WebElement submitButton = driver.findElement(By.xpath("//a[@id='ButLogin']"));
        submitButton.click();

        Thread.sleep(3000);
        
        WebElement approvalsbutton = driver.findElement(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[4]/a[1]"));
        approvalsbutton.click();
        
        WebElement approval = driver.findElement(By.xpath("//span[normalize-space()='Approval']"));
        approval.click();
        
        Thread.sleep(3000);
        
   
        WebElement clickeyebutton = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]/i[1]"));
        clickeyebutton.click();
        
        Thread.sleep(3000);
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        WebElement forwardto = driver.findElement(By.xpath("//select[@id='DrpCivilForward']"));
        Select forwardtoSelect = new Select(forwardto);
        forwardtoSelect.selectByVisibleText("HO");
        
        WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtCCDescription']"));
        description.sendKeys("forwarded to HO");
        
        WebElement clickforwardbutton = driver.findElement(By.xpath("//button[@id='BtncivilForward']"));
        clickforwardbutton.click();
        
        Thread.sleep(3000);
        
        WebElement clickokbutton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        clickokbutton.click();
        
        Thread.sleep(3000);
        
        WebElement clickokagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        clickokagain.click();
        
  }
        
        @Test(priority=4)
        public void civilho() throws InterruptedException {
      	 driver.get("https://kvgb.onlinesafe.in/");

              WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtLoginID']"));
              usernameField.sendKeys("headofficer@gmail.com");
              
              WebElement passwordField = driver.findElement(By.xpath("//input[@id='TxtPassword']"));
              passwordField.sendKeys("Ho@12345");

              WebElement submitButton = driver.findElement(By.xpath("//a[@id='ButLogin']"));
              submitButton.click();

              Thread.sleep(2000);
              
              WebElement approvalsbutton = driver.findElement(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[5]/a[1]"));
              approvalsbutton.click();
              
              WebElement approval = driver.findElement(By.xpath("//span[normalize-space()='Approval']"));
              approval.click();
              
              Thread.sleep(3000);
              
              WebElement clickeyebutton = driver.findElement(By.xpath("//i[@id='BtnSelectApprovl']"));
              clickeyebutton.click();
              
              Thread.sleep(3000);
              
              JavascriptExecutor js1 = (JavascriptExecutor) driver;
              js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
              
              WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtCCDescription']"));
              description.sendKeys("APPROVED");
              
              Thread.sleep(2000);
              
              WebElement clickapprove = driver.findElement(By.xpath("//button[@id='BtncivilApprove']"));
              clickapprove.click();
              
              Thread.sleep(2000);
              
              WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
              clickok.click();
              
              Thread.sleep(2000);
              
              WebElement clickokagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
              clickokagain.click();
              
              
              
        
        
        
        
        
        
        
        
  }}