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


public class coadvocate {
	
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
	    public void testAddAdvocateonCO() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("CO");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

	        Thread.sleep(5000);

	        WebElement advEmpanelment = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
	        advEmpanelment.click();

	        WebElement addAdv = driver.findElement(By.xpath("//span[normalize-space()='Add Advocates']"));
	        addAdv.click();

	        WebElement advocateNameField = driver.findElement(By.xpath("//input[@id='TxtAdEmpNamAdvocate']"));
	        advocateNameField.sendKeys("girish");

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
	        WebElement checkbox = driver.findElement(By.xpath("//input[@id='CheckState_1432']"));
	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }

	        WebElement addButton2 = driver.findElement(By.xpath("//button[@id='BtnStateSave']"));
	        addButton2.click();

	        WebElement pracWithDistrict = driver.findElement(By.xpath("//button[@id='BtnAdEmpDistrict']"));
	        pracWithDistrict.click();
	        WebElement clicknext = driver.findElement(By.xpath("//a[@id='Tbl_DistrictList_next']"));
	        clicknext.click();	        
	        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[44]"));
	        if (!checkbox2.isSelected()) {
	            checkbox2.click();
	        }

	        WebElement addButton3 = driver.findElement(By.xpath("//button[@id='BtnDistrictSave']"));
	        addButton3.click();

	        // Address
	        WebElement residentialAddress = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpResidentAdress']"));
	        residentialAddress.sendKeys("palakkad");

	        WebElement checkbox3 = driver.findElement(By.xpath("//div[@id='CheckHide']//span[1]//*[name()='svg']"));
	        if (!checkbox3.isSelected()) {
	            checkbox3.click();
	        }

	        WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='TxtAdEmpMobileNo']"));
	        mobileNumber.sendKeys("9977456765");

	        WebElement emailId = driver.findElement(By.xpath("//input[@id='TxtAdEmpEmailID']"));
	        emailId.sendKeys("io54@gmail.com");

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
	        

}

@Test(priority=2)
public void testApprovalProcessofCO1() throws InterruptedException {
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

    WebElement approvalDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]"));
    approvalDetails.click();
    
    Thread.sleep(5000);

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,2000)");
    
    WebElement uploadFile = driver.findElement(By.xpath("//input[@id='UploadAdEmpApprPermission']"));
    String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\SAFE\\field alignment issue.jpg";
    uploadFile.sendKeys(filePath);
    
    
    Thread.sleep(3000);
    
    WebElement clickapprove = driver.findElement(By.xpath("//button[@id='BtnAdEmpApprove']"));
    clickapprove.click();
    
//    WebElement clickpushback = driver.findElement(By.xpath("//button[@id='BtnAdEmpRevert']"));
//    clickpushback.click();
//    
//    WebElement clickreject = driver.findElement(By.xpath("//button[@id='BtnAdEmpReject']"));
//    clickreject.click();
    
    Thread.sleep(3000);
    
    WebElement okButton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
    okButton.click();
    Thread.sleep(3000);
    WebElement okButtonagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
    okButtonagain.click();
    
    
   
    
}}
