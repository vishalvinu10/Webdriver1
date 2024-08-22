package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kvgb_npa_drt {

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
		         
		         
		         WebElement clickacase = driver.findElement(By.xpath("(//a[normalize-space()='DRT'])[1]"));
		         clickacase.click();
		         
		         WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseDRTCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
		         clickclose.click();
		         
		         WebElement clickcobguarator = driver.findElement(By.xpath("//button[@id='BtnBorrower']"));
		         clickcobguarator.click();
		         
		         WebElement checkbox = driver.findElement(By.xpath("//input[@id='DRTCheck_424621']"));
			        if (!checkbox.isSelected()) {
			            checkbox.click();
			        }
			        
			        WebElement addbutton = driver.findElement(By.xpath("//button[@id='BtnDRTBorrowerSave']"));
			        addbutton.click();
			        
			        WebElement radiobutton = driver.findElement(By.xpath("//input[@id='GuarantorDRT']"));
			        radiobutton.click();
			        
			        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='DRTCheck_47634']"));
			        if (!checkbox2.isSelected()) {
			            checkbox2.click();
			        }
			        
			        WebElement addbutton2 = driver.findElement(By.xpath("//button[@id='BtnDRTBorrowerSave']"));
			        addbutton2.click();
			        
			        WebElement clickok = driver.findElement(By.xpath("//button[@id='BtnDRTSelectedBorrowerSave']"));
			        clickok.click();
			        
			        ///
			        
			        WebElement clicklegalheirs = driver.findElement(By.xpath("//button[@id='BtnLegalheir']"));
				       
			        clicklegalheirs.click();
			        
			        WebElement addbutton3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]"));
			        addbutton3.click();
			        
			        WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='DRTCheck_661']"));
			        if (!checkbox3.isSelected()) {
			            checkbox3.click();
			        }
			        
		
//			        JavascriptExecutor js = (JavascriptExecutor) driver;
//			        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");  //SCROLL DOWN IN A TABLE
			        
			        WebElement addbutton4 = driver.findElement(By.xpath("//button[@id='BtnDRTLegalHeiralSave']"));  // Adjust the XPath as needed
			        
			        // Scroll to the element
			        JavascriptExecutor js = (JavascriptExecutor) driver;
			        js.executeScript("arguments[0].scrollIntoView(true);", addbutton4);
			        addbutton4.click();
			        
//			        WebElement addbutton4 = driver.findElement(By.xpath("//button[@id='BtnDRTLegalHeiralSave']"));
//			        addbutton4.click();
			        
			        WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnDRTSelectedLegalHeirSave']"));
			        savebutton.click();
			        
			        WebElement branchloanno = driver.findElement(By.xpath("//input[@id='TxtDRTBranchFileno']"));
			        branchloanno.sendKeys("8765757");
			        
			        WebElement districtofcourt = driver.findElement(By.xpath("//select[@id='DrpDRTDistrict']"));
			        Select districtofcourtSelect = new Select(districtofcourt);
			        districtofcourtSelect.selectByVisibleText("Dharwad");
			        
			        WebElement taluk = driver.findElement(By.xpath("//select[@id='DrpDRTTaluk']"));
			        Select talukSelect = new Select(taluk);
			        talukSelect.selectByVisibleText("DHARWAD");
			        
			        WebElement nameofcourt = driver.findElement(By.xpath("//select[@id='DrpCourtName']"));
			        Select nameofcourtSelect = new Select(nameofcourt);
			        nameofcourtSelect.selectByVisibleText("DRT");
			        
			        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpBench']"));
			        Select benchSelect = new Select(bench);
			        benchSelect.selectByVisibleText("BANGALORE1");
			        
			        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpCaseTyp']"));
			        Select casetypeSelect = new Select(casetype);
			        casetypeSelect.selectByVisibleText("Miscellaneous Application");
			        
			        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpCaseStage']"));
			        Select casestageSelect = new Select(casestage);
			        casestageSelect.selectByVisibleText("Hearing");
			        
			        WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtFilingDate']"));
			        dateoffiling.click();
			        WebElement dateclick1 = driver.findElement(By.xpath("//td[@class='today day']"));
			        dateclick1.click();
			        
			        WebElement roleofbank = driver.findElement(By.xpath("//select[@id='DrpDRTCanaraRole']"));
			        Select roleofbankSelect = new Select(roleofbank);
			        roleofbankSelect.selectByVisibleText("Petitioner(s)");
			        
			        Thread.sleep(5000);
			        
			        JavascriptExecutor js1 = (JavascriptExecutor) driver;
			        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			        
			        WebElement bankadv = driver.findElement(By.xpath("//button[@id='BtnAdvctName']"));
			        bankadv.click();
			        WebElement districtofadv = driver.findElement(By.xpath("//select[@id='DrpAdvDRTDistrict']"));
			        Select districtofadvSelect = new Select(districtofadv);
			        districtofadvSelect.selectByVisibleText("Dharwad");
			        WebElement talukofadv = driver.findElement(By.xpath("//select[@id='DrpAdvDRTTaluk']"));
			        Select talukofadvSelect = new Select(talukofadv);
			        talukofadvSelect.selectByVisibleText("DHARWAD");
			        WebElement clicksearch = driver.findElement(By.xpath("//button[@id='BtnAdvIDDSearch']"));
			        clicksearch.click();
			        
			        WebElement checkbox4 = driver.findElement(By.xpath("//input[@id='CheckDAdvt_825']"));
			        if (!checkbox4.isSelected()) {
			            checkbox4.click();
			        }
			        
			        WebElement clickadd = driver.findElement(By.xpath("//button[@id='BtnAdvctSave']"));
			        JavascriptExecutor js2 = (JavascriptExecutor) driver;
			        js2.executeScript("arguments[0].scrollIntoView(true);", clickadd);
			        clickadd.click();
			      
			        
			        
			        WebElement diaryno = driver.findElement(By.xpath("//input[@id='TxtDiaryNo']"));
			        diaryno.sendKeys("8567464653");
			        
			        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtDRTCNRNo']"));
			        cnrno.sendKeys("hgrrgrjer546556765");
			        
			        
			        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtCaseNo']"));
			        caseno.sendKeys("543434");
			        
			        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpCaseYear']"));
			        Select caseyearSelect = new Select(caseyear);
			        caseyearSelect.selectByVisibleText("2024");
			        
			        Thread.sleep(3000);
			        
			        WebElement savebutton1 = driver.findElement(By.xpath("//button[@id='BtnDRTSave']"));
			        savebutton1.click();
			        
			        Thread.sleep(3000);
			        
			        WebElement clickok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
			        clickok1.click();
			        
			        Thread.sleep(3000);
			        
			        WebElement clickokagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
			        clickokagain.click();
			        
			        
			        
			        
			        
			        
			        
			        
			      
			        
			        
			        

	}

}
