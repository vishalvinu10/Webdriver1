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

public class Kvgb_addadvocate {
	
	private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    //add advocate
    
    @Test(priority=1)
    public void kvgbnpaaddadvocate() throws InterruptedException {
    	 driver.get("https://kvgb.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtLoginID']"));
	        usernameField.sendKeys("regionalofficer@gmail.com");
	        
	        WebElement passwordField = driver.findElement(By.xpath("//input[@id='TxtPassword']"));
	        passwordField.sendKeys("Ro@12345");

	        WebElement submitButton = driver.findElement(By.xpath("//a[@id='ButLogin']"));
	        submitButton.click();

	        Thread.sleep(2000);
	        
	        WebElement advempanellment = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
	        advempanellment.click();
	        
	        WebElement addadv = driver.findElement(By.xpath("//span[normalize-space()='Add Advocates']"));
	        addadv.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement advname = driver.findElement(By.xpath("//input[@id='TxtAdEmpNamAdvocate']"));
	        advname.sendKeys("balu");
	        
	        Thread.sleep(3000);
	        
	        WebElement dateofBIRTH = driver.findElement(By.xpath("//input[@id='TxtAdEmpBirthDate']"));
	        dateofBIRTH.click();
	        WebElement dateclick1 = driver.findElement(By.xpath("//th[normalize-space()='August 2024']"));
	        dateclick1.click();
	        WebElement dateclick2 = driver.findElement(By.xpath("//th[normalize-space()='2024']"));
	        dateclick2.click();
	        WebElement dateclick3 = driver.findElement(By.xpath("//div[@class='datepicker-years']//th[@class='prev'][normalize-space()='«']"));
	        dateclick3.click();
	        WebElement dateclick4 = driver.findElement(By.xpath("//div[@class='datepicker-years']//th[@class='prev'][normalize-space()='«']"));
	        dateclick4.click();
	        WebElement dateclick5 = driver.findElement(By.xpath("//span[normalize-space()='2000']"));
	        dateclick5.click();
	        WebElement dateclick6 = driver.findElement(By.xpath("//span[normalize-space()='Jan']"));
	        dateclick6.click();
	        WebElement dateclick7 = driver.findElement(By.xpath("//td[@class='day'][normalize-space()='2']"));
	        dateclick7.click();
	        
	        WebElement qualification = driver.findElement(By.xpath("//select[@id='DrpAdEmpEduQualification']"));
	        Select qualificationSelect = new Select(qualification);
	        qualificationSelect.selectByVisibleText("LLB");
	        
	        WebElement advtype = driver.findElement(By.xpath("//select[@id='DrpAdEmpAdvType']"));
	        Select advtypeSelect = new Select(advtype);
	        advtypeSelect.selectByVisibleText("Retainer for HO");
	        
	        WebElement dateofexpiry = driver.findElement(By.xpath("//input[@id='TxtAdEmpEnrolmentDate']"));
	        dateofexpiry.click();
	        WebElement dateofexpiry2 = driver.findElement(By.xpath("//td[@class='today day']"));
	        dateofexpiry2.click();
	        
	        WebElement experience = driver.findElement(By.xpath("//select[@id='DrpAdEmpTotalExperience']"));
	        Select experienceSelect = new Select(experience);
	        experienceSelect.selectByVisibleText("1");
	        
	        WebElement experienceinmonths = driver.findElement(By.xpath("//select[@id='DrpAdEmpMonths']"));
	        Select experienceinmonthsSelect = new Select(experienceinmonths);
	        experienceinmonthsSelect.selectByVisibleText("1");
	        
	        WebElement areaofpractice = driver.findElement(By.xpath("//button[@id='BtnAdEmpPracticeArea']"));
	        areaofpractice.click();
	        WebElement areaofpractice1 = driver.findElement(By.xpath("//select[@id='DrpAdvAreaOfPractice']"));
	        Select areaofpracticeSelect = new Select(areaofpractice1);
	        areaofpracticeSelect.selectByVisibleText("Civil");
	        WebElement add = driver.findElement(By.xpath("//button[@id='BtnAdAreaPracticingSave']"));
	        add.click();
	        WebElement close = driver.findElement(By.xpath("//button[@id='BtnAdAreaPracticingClose']"));
	        close.click();
	        
	        
	        WebElement incometax = driver.findElement(By.xpath("//select[@id='DrpAdEmpIncomeTax']"));
	        Select incometaxSelect = new Select(incometax);
	        incometaxSelect.selectByVisibleText("Yes");
	        
	        WebElement exemployeeof = driver.findElement(By.xpath("//input[@id='TxtAdEmpExemployee']"));
	        exemployeeof.sendKeys("high court");
	        
	        WebElement dateofempanellment = driver.findElement(By.xpath("//input[@id='TxtDatEmpOfAdv']"));
	        dateofempanellment.click();
	        WebElement dateofempanellment1 = driver.findElement(By.xpath("//td[@class='today day']"));
	        dateofempanellment1.click();
	        
	        WebElement mobile = driver.findElement(By.xpath("//input[@id='TxtAdEmpMobileNo']"));
	        mobile.sendKeys("8786542342");
	        WebElement email = driver.findElement(By.xpath("//input[@id='TxtAdEmpEmailID']"));
	        email.sendKeys("damf32@gmail.com");
	        
	        
	        WebElement advfileno = driver.findElement(By.xpath("//input[@id='TxtAdvFileNo']"));
	        advfileno.sendKeys("3322345");
	        
	        WebElement pannumber = driver.findElement(By.xpath("//input[@id='TxtAdvEmpPanNumber']"));
	        pannumber.sendKeys("grtdr3232r");
	        
	        WebElement addhar = driver.findElement(By.xpath("//input[@id='TxtAdvEmpAadharNumber']"));
	        addhar.sendKeys("4434 6678 5443");
	        
	        WebElement barcouncil = driver.findElement(By.xpath("//input[@id='TxtAdvEmpBarCunRegNo']"));
	        barcouncil.sendKeys("5455465656");
	        
	        WebElement regularpractice = driver.findElement(By.xpath("//input[@id='TxtAdvEmpRegPracRegNo']"));
	        regularpractice.sendKeys("434354");
	        
	        WebElement reportedtiIB = driver.findElement(By.xpath("//select[@id='DrpAdEmpRepIB']"));
	        Select reportedtiIBSelect = new Select(reportedtiIB);
	        reportedtiIBSelect.selectByVisibleText("Yes");
	        
	        WebElement dateofreporting = driver.findElement(By.xpath("//input[@id='TxtAdEmpDatOfReprt']"));
	        dateofreporting.click();
	        WebElement dateofreporting1 = driver.findElement(By.xpath("//td[normalize-space()='18']"));
	        dateofreporting1.click();
	        
	        
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("window.scrollBy(0, 250);");  
	        
	        WebElement empanelledwith = driver.findElement(By.xpath("//button[@id='BtnAdEmpEmpanelledwith']"));
	        empanelledwith.click();
	        WebElement empanelledwith1 = driver.findElement(By.xpath("//input[@id='TxtAdEmpanelledWith']"));
	        empanelledwith1.sendKeys("trstrst");
	        WebElement add1 = driver.findElement(By.xpath("//button[@id='BtnAdEmpanelledWithSave']"));
	        add1.click();
	        WebElement close1 = driver.findElement(By.xpath("//button[@id='BtnAdEmpanelledWithClose']"));
	        close1.click();
	        
	        
	        WebElement barassadv = driver.findElement(By.xpath("//button[@id='BtnNamOfBarAssoAdve']"));
	        barassadv.click();
	        WebElement barassadv1 = driver.findElement(By.xpath("//input[@id='TxtNamOfBarAssoAdvName']"));
	        barassadv1.sendKeys("ghtrhtrtr");
	        WebElement add2 = driver.findElement(By.xpath("//button[@id='BtnNamOfBarAssoAdvSave']"));
	        add2.click();
	        WebElement close2 = driver.findElement(By.xpath("//button[@id='BtnNamOfBarAssoAdvClose']"));
	        close2.click();
	        
	        
	        WebElement pracatstate = driver.findElement(By.xpath("//button[@id='BtnAdEmpState']"));
	        pracatstate.click();
	        WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='CheckState_1431']"));
	        if (!checkbox3.isSelected()) {
	            checkbox3.click();
	        }
//	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//	        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        WebElement add3 = driver.findElement(By.xpath("//button[@id='BtnStateSave']"));
	        add3.click();
	        
	        
	        WebElement pracatdistrict = driver.findElement(By.xpath("//button[@id='BtnAdEmpDistrict']"));
	        pracatdistrict.click();
	        WebElement clicknext = driver.findElement(By.xpath("//a[@id='Tbl_DistrictList_next']"));
	        clicknext.click();
	        
	        WebElement checkbox4 = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/input[1]"));
	        if (!checkbox4.isSelected()) {
	        	checkbox4.click();
	        }
	        WebElement add4 = driver.findElement(By.xpath("//button[@id='BtnDistrictSave']"));
	        add4.click();
	        
	        
	        WebElement taluk = driver.findElement(By.xpath("//button[@id='BtnAdEmpTaluk']"));
	        taluk.click();
	        WebElement checkbox5 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/input[1]"));
	        if (!checkbox5.isSelected()) {
	        	checkbox5.click();
	        }
	        WebElement add5 = driver.findElement(By.xpath("//button[@id='BtnTalukSave']"));
	        add5.click();
	        
	        
	        
	        WebElement AccountnumberandbankdetailsofAdvocate = driver.findElement(By.xpath("//textarea[@id='TxtAdvNoBnkDetAdv']"));
	        AccountnumberandbankdetailsofAdvocate.sendKeys("fergeg");
	        
	        WebElement ResidentialAddress = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpResidentAdress']"));
	        ResidentialAddress.sendKeys("dharwad");
	        WebElement checkbox6 = driver.findElement(By.xpath("//div[@id='CheckHide']//span[1]//*[name()='svg']"));
	        if (!checkbox6.isSelected()) {
	        	checkbox6.click();
	        }
	        
	        WebElement doctype = driver.findElement(By.xpath("//input[@id='TxtAdEmpUDDocumentTyp']"));
	         doctype.sendKeys("picture");
	         
	         WebElement docdesc = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpUDDescription']"));
	         docdesc.sendKeys("picture");
	         
	         WebElement uploadfile1 = driver.findElement(By.xpath("//input[@id='UploadAdEmpUDPermission']"));
	         String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\SAFE\\field alignment issue.jpg";
	         uploadfile1.sendKeys(filePath);
	         
	         WebElement clickupload = driver.findElement(By.xpath("//button[@id='BtnAdEmpUpload']"));
	         clickupload.click();
	         
	         WebElement text = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpEligibilityConfirm']"));
	         text.sendKeys("picture");
	         WebElement text1 = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpAdvocateGround']"));
	         text1.sendKeys("picture");
	        
	        
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        
	        Thread.sleep(2000);
            
            WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnAdvSave']"));
            clicksave.click();
            
            Thread.sleep(2000);
            
            WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
            clickok.click();
            
            Thread.sleep(2000);
            
            WebElement clickokagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
            clickokagain.click();
            
            
           

            
	        
	        
	
	

}}
