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

public class Advapproval {

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
	    public void testAddAdvocate() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

	        Thread.sleep(5000);

	        WebElement advEmpanelment = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
	        advEmpanelment.click();

	        WebElement addAdv = driver.findElement(By.xpath("//a[@href='/Empanelment/AdvocateEmpanelment']"));
	        addAdv.click();

	        WebElement advocateNameField = driver.findElement(By.xpath("//input[@id='TxtAdEmpNamAdvocate']"));
	        advocateNameField.sendKeys("vignesh");

	        WebElement dateOfBirthField = driver.findElement(By.xpath("//input[@id='TxtAdEmpBirthDate']"));
	        dateOfBirthField.sendKeys("01-07-2000");

	        WebElement qualificationDropdown = driver.findElement(By.xpath("//select[@id='DrpAdEmpEduQualification']"));
	        Select qualificationSelect = new Select(qualificationDropdown);
	        qualificationSelect.selectByVisibleText("LLB");

	        WebElement dateOfEnrollmentField = driver.findElement(By.xpath("//input[@id='TxtAdEmpEnrolmentDate']"));
	        dateOfEnrollmentField.sendKeys("02-07-2024");

	        WebElement totalExperienceDropdown = driver.findElement(By.xpath("//select[@id='DrpAdEmpTotalExperience']"));
	        Select totalExperienceSelect = new Select(totalExperienceDropdown);
	        totalExperienceSelect.selectByVisibleText("1");

	        WebElement monthsDropdown = driver.findElement(By.xpath("//select[@id='DrpAdEmpMonths']"));
	        Select monthsSelect = new Select(monthsDropdown);
	        monthsSelect.selectByVisibleText("3");

	        WebElement empPractice = driver.findElement(By.xpath("//button[@id='BtnAdEmpPracticeArea']"));
	        empPractice.click();

	        WebElement empPracticeDropdown = driver.findElement(By.xpath("//select[@id='DrpAdvAreaOfPractice']"));
	        Select empPracticeDropdownSelect = new Select(empPracticeDropdown);
	        empPracticeDropdownSelect.selectByVisibleText("Criminal");

	        WebElement addEmpPractice = driver.findElement(By.xpath("//button[@id='BtnAdAreaPracticingSave']"));
	        addEmpPractice.click();

	        WebElement closeEmpPractice = driver.findElement(By.xpath("//button[@id='BtnAdAreaPracticingClose']"));
	        closeEmpPractice.click();

	        WebElement incomeTax = driver.findElement(By.xpath("//select[@id='DrpAdEmpIncomeTax']"));
	        Select incomeTaxSelect = new Select(incomeTax);
	        incomeTaxSelect.selectByVisibleText("Yes");

	        WebElement category = driver.findElement(By.xpath("//select[@id='DrpAdEmpCategory']"));
	        Select categorySelect = new Select(category);
	        categorySelect.selectByVisibleText("GENERAL");

	        WebElement exEmployee = driver.findElement(By.xpath("//input[@id='TxtAdEmpExemployee']"));
	        exEmployee.sendKeys("safe");

	        WebElement empWith = driver.findElement(By.xpath("//button[@id='BtnAdEmpEmpanelledwith']"));
	        empWith.click();

	        WebElement empWithText = driver.findElement(By.xpath("//input[@id='TxtAdEmpanelledWith']"));
	        empWithText.sendKeys("xyz");

	        WebElement addButton = driver.findElement(By.xpath("//button[@id='BtnAdEmpanelledWithSave']"));
	        addButton.click();

	        WebElement closeButton = driver.findElement(By.xpath("//button[@id='BtnAdEmpanelledWithClose']"));
	        closeButton.click();

	        WebElement pracWithState = driver.findElement(By.xpath("//button[@id='BtnAdEmpState']"));
	        pracWithState.click();

	        WebElement checkbox = driver.findElement(By.xpath("//input[@id='CheckState_1426']"));
	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }

	        WebElement addButton1 = driver.findElement(By.xpath("//button[@id='BtnStateSave']"));
	        addButton1.click();

	        WebElement pracWithDistrict = driver.findElement(By.xpath("//button[@id='BtnAdEmpDistrict']"));
	        pracWithDistrict.click();

	        WebElement checkbox2 = driver.findElement(By.xpath("//tr[@class='odd']//input[@id='CheckDist_1426']"));
	        if (!checkbox2.isSelected()) {
	            checkbox2.click();
	        }

	        WebElement addButton2 = driver.findElement(By.xpath("//button[@id='BtnDistrictSave']"));
	        addButton2.click();

	        // Address
	        WebElement residentialAddress = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpResidentAdress']"));
	        residentialAddress.sendKeys("palakkad");

	        WebElement checkbox3 = driver.findElement(By.xpath("//div[@id='CheckHide']//span[1]//*[name()='svg']"));
	        if (!checkbox3.isSelected()) {
	            checkbox3.click();
	        }

	        WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='TxtAdEmpMobileNo']"));
	        mobileNumber.sendKeys("9877456543");

	        WebElement emailId = driver.findElement(By.xpath("//input[@id='TxtAdEmpEmailID']"));
	        emailId.sendKeys("fhdd22@gmail.com");

	        // Upload documents
	        WebElement docType = driver.findElement(By.xpath("//input[@id='TxtAdEmpUDDocumentTyp']"));
	        docType.sendKeys("picture");

	        WebElement docDesc = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpUDDescription']"));
	        docDesc.sendKeys("picture");

	        WebElement uploadFile = driver.findElement(By.xpath("//input[@id='UploadAdEmpUDPermission']"));
	        String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\SAFE\\field alignment issue.jpg";
	        uploadFile.sendKeys(filePath);

	        WebElement clickUpload = driver.findElement(By.xpath("//button[@id='BtnAdEmpUpload']"));
	        clickUpload.click();

	        // Confirmation details
	        WebElement confirmation = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpEligibilityConfirm']"));
	        confirmation.sendKeys("confirmed");

	        WebElement grounds = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpAdvocateGround']"));
	        grounds.sendKeys("recommended");

	        // Save button
	        WebElement saveButton = driver.findElement(By.xpath("//button[@id='BtnAdvSave']"));
	        saveButton.click();

	        Thread.sleep(5000);

	        WebElement confirmSaveButton = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	        confirmSaveButton.click();

	        Thread.sleep(5000);
	        
//	        System.out.println("advocate "+advocateNameField+" added successfully by BU");
	    }

	    @Test(priority=2)
	    public void testApprovalProcessofBM() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtAuthvalue']"));
	        usernameField.sendKeys("BM");

	        WebElement signInButton = driver.findElement(By.xpath("//button[@id='ButSignin']"));
	        signInButton.click();

	        Thread.sleep(5000);

	        WebElement advEmpanelment = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
	        advEmpanelment.click();
	        
	        //Thread.sleep(5000);

	        WebElement approvals = driver.findElement(By.xpath("//a[@href='/Empanelment/AdvocateApproval']"));
	        approvals.click();
	        
	        Thread.sleep(5000);

	        WebElement approvalDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]"));
	        approvalDetails.click();
	        
	        Thread.sleep(5000);

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        
	        WebElement forward = driver.findElement(By.xpath("//select[@id='DrpAdEmpForward']"));
	        Select forwardSelect = new Select(forward);
	        forwardSelect.selectByVisibleText("RO");
	        
	        WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpDescription']"));
	        description.sendKeys("Forward to RO");
	        
	        Thread.sleep(5000);
	        
	        WebElement clickforward = driver.findElement(By.xpath("//button[@id='BtnAdEmpForward']"));
	        clickforward.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement okButton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        okButton.click();
	        Thread.sleep(3000);
	        WebElement okButtonagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        okButtonagain.click();
	       
	        
	    }
	    
	    
	    @Test(priority=3)
	    public void testApprovalProcessofRO() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtAuthvalue']"));
	        usernameField.sendKeys("RO1");

	        WebElement signInButton = driver.findElement(By.xpath("//button[@id='ButSignin']"));
	        signInButton.click();

	        Thread.sleep(5000);

	        WebElement advEmpanelment = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
	        advEmpanelment.click();
	       

	        WebElement approvals = driver.findElement(By.xpath("(//a[@href='/Empanelment/AdvocateApproval'])[1]"));
	        approvals.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement clickdrpforward1 = driver.findElement(By.xpath("//select[@id='DrpAdvFilterType']"));
	        Select clickdrpforward1Select = new Select(clickdrpforward1);
	        clickdrpforward1Select.selectByVisibleText("Forwarded");
	        
	        WebElement clicksearch = driver.findElement(By.xpath("//button[@id='BtnAdvApprvSearch']"));
	        clicksearch.click();
	        
	        Thread.sleep(3000);

	        WebElement approvalDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]"));
	        approvalDetails.click();
	        
	        Thread.sleep(5000);

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        
	        WebElement forward = driver.findElement(By.xpath("//select[@id='DrpAdEmpForward']"));
	        Select forwardSelect = new Select(forward);
	        forwardSelect.selectByVisibleText("CO");
	        
	        WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpDescription']"));
	        description.sendKeys("Forward to CO1");
	        
	        
	        
	        WebElement clickforward = driver.findElement(By.xpath("//button[@id='BtnAdEmpForward']"));
	        clickforward.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement okButton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        okButton.click();
	        Thread.sleep(5000);
	        WebElement okButtonagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        okButtonagain.click();
	        
	    }
	    
	    @Test(priority=4)
	    public void testApprovalProcessofCO() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtAuthvalue']"));
	        usernameField.sendKeys("CO1");

	        WebElement signInButton = driver.findElement(By.xpath("//button[@id='ButSignin']"));
	        signInButton.click();

	        Thread.sleep(5000);

	        WebElement advEmpanelment = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
	        advEmpanelment.click();
	        
	        //Thread.sleep(5000);

	        WebElement approvals = driver.findElement(By.xpath("//a[@href='/Empanelment/AdvocateApproval']"));
	        approvals.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement clickdrpforward = driver.findElement(By.xpath("//select[@id='DrpAdvFilterType']"));
	        Select clickdrpforwardSelect = new Select(clickdrpforward);
	        clickdrpforwardSelect.selectByVisibleText("Forwarded");
	        
	        WebElement clicksearch = driver.findElement(By.xpath("//button[@id='BtnAdvApprvSearch']"));
	        clicksearch.click();
	        
	        Thread.sleep(3000);

	        WebElement approvalDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]"));
	        approvalDetails.click();
	        
	        Thread.sleep(5000);

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        
	        WebElement forward = driver.findElement(By.xpath("//select[@id='DrpAdEmpForward']"));
	        Select forwardSelect = new Select(forward);
	        forwardSelect.selectByVisibleText("HO");
	        
	        WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpDescription']"));
	        description.sendKeys("Forward to HO");
	        
	        Thread.sleep(3000);
	        
	        WebElement clickforward = driver.findElement(By.xpath("//button[@id='BtnAdEmpForward']"));
	        clickforward.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement okButton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        okButton.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement okButtonagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        okButtonagain.click();
	    }    
	        
	    @Test(priority=5)
	    public void testApprovalProcessofHO() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//input[@id='TxtAuthvalue']"));
	        usernameField.sendKeys("HO");

	        WebElement signInButton = driver.findElement(By.xpath("//button[@id='ButSignin']"));
	        signInButton.click();

	        Thread.sleep(5000);

	        WebElement advEmpanelment = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
	        advEmpanelment.click();
	        
	        //Thread.sleep(5000);

	        WebElement approvals = driver.findElement(By.xpath("//a[@href='/Empanelment/AdvocateApproval']"));
	        approvals.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement clickdrpforward = driver.findElement(By.xpath("//select[@id='DrpAdvFilterType']"));
	        Select clickdrpforwardSelect = new Select(clickdrpforward);
	        clickdrpforwardSelect.selectByVisibleText("Forwarded");
	        
	        WebElement clicksearch = driver.findElement(By.xpath("//button[@id='BtnAdvApprvSearch']"));
	        clicksearch.click();
	        
	        Thread.sleep(3000);

	        WebElement approvalDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]"));
	        approvalDetails.click();
	        
	        Thread.sleep(5000);

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        
	    
	        WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpDescription']"));
	        description.sendKeys("approved from HO");
	        
	        Thread.sleep(3000);
	        
	        WebElement clickapprove = driver.findElement(By.xpath("//button[@id='BtnAdEmpApprove']"));
	        clickapprove.click();
	        
//	        WebElement pushback = driver.findElement(By.xpath("//button[@id='BtnAdEmpRevert']"));
//	        pushback.click();
//	        WebElement reject = driver.findElement(By.xpath("//button[@id='BtnAdEmpReject']"));
//	        reject.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement okButton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        okButton.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement okButtonagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        okButtonagain.click();
	    }         
////
////	        WebElement approveButton = driver.findElement(By.xpath("//button[@id='BtnAdEmpApprove']"));
////	        approveButton.click();
////	        
//	        Thread.sleep(5000);
//
//	        WebElement okButton1 = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
//	        okButton1.click();
//	        
//	        Thread.sleep(5000);
//
//	        WebElement okButton2 = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
//	        okButton2.click();
	        
	        

	        
	    }
	

