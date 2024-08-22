package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addadvocatetestng {
	
	 WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }
	     @BeforeMethod
		    public void url() {
	        
	        driver.get("https://safallitigation.onlinesafe.in/");
	    }

	    @Test
	    @Parameters({
	        "username", "advocateName", "dateOfBirth", "qualification",
	        "dateOfEnrollment", "totalExperience", "months", "practiceArea",
	        "incomeTax", "category", "exEmployee", "empanelledWith",
	        "residentialAddress", "mobileNumber", "emailId",
	        "docType", "docDesc", "filePath", "eligibilityConfirm", "advocateGround"
	    })
	    
	    public void testAddAdvocate(
	            String username, String advocateName, String dateOfBirth, String qualification,
	            String dateOfEnrollment, String totalExperience, String months, String practiceArea,
	            String incomeTax, String category, String exEmployee, String empanelledWith,
	            String residentialAddress, String mobileNumber, String emailId,
	            String docType, String docDesc, String filePath, String eligibilityConfirm, String advocateGround
	        ) throws InterruptedException {
	            
	            
	            WebElement usernameField = driver.findElement(By.xpath("//*[@id='TxtAuthvalue']"));
	            usernameField.sendKeys(username);

	            WebElement signInButton = driver.findElement(By.xpath("//*[@id='ButSignin']"));
	            signInButton.click();

	            Thread.sleep(5000);

	            WebElement advEmpanell = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
	            advEmpanell.click();

	            WebElement addAdv = driver.findElement(By.xpath("//a[@href='/Empanelment/AdvocateEmpanelment']"));
	            addAdv.click();

	            WebElement advocateNameField = driver.findElement(By.xpath("//input[@id='TxtAdEmpNamAdvocate']"));
	            advocateNameField.sendKeys(advocateName);

	            WebElement dateOfBirthField = driver.findElement(By.xpath("//input[@id='TxtAdEmpBirthDate']"));
	            dateOfBirthField.sendKeys(dateOfBirth);

	            WebElement qualificationDropdown = driver.findElement(By.xpath("//select[@id='DrpAdEmpEduQualification']"));
	            Select qualificationSelect = new Select(qualificationDropdown);
	            qualificationSelect.selectByVisibleText(qualification);

	            WebElement dateOfEnrollmentField = driver.findElement(By.xpath("//input[@id='TxtAdEmpEnrolmentDate']"));
	            dateOfEnrollmentField.sendKeys(dateOfEnrollment);

	            WebElement totalExperienceDropdown = driver.findElement(By.xpath("//select[@id='DrpAdEmpTotalExperience']"));
	            Select totalExperienceSelect = new Select(totalExperienceDropdown);
	            totalExperienceSelect.selectByVisibleText(totalExperience);

	            WebElement monthsDropdown = driver.findElement(By.xpath("//select[@id='DrpAdEmpMonths']"));
	            Select monthsSelect = new Select(monthsDropdown);
	            monthsSelect.selectByVisibleText(months);

	            WebElement empPractice = driver.findElement(By.xpath("//button[@id='BtnAdEmpPracticeArea']"));
	            empPractice.click();

	            WebElement empPracticeDropdown = driver.findElement(By.xpath("//select[@id='DrpAdvAreaOfPractice']"));
	            Select empPracticeSelect = new Select(empPracticeDropdown);
	            empPracticeSelect.selectByVisibleText(practiceArea);

	            WebElement addEmpPractice = driver.findElement(By.xpath("//button[@id='BtnAdAreaPracticingSave']"));
	            addEmpPractice.click();

	            WebElement closeEmpPractice = driver.findElement(By.xpath("//button[@id='BtnAdAreaPracticingClose']"));
	            closeEmpPractice.click();

	            WebElement incomeTaxElement = driver.findElement(By.xpath("//select[@id='DrpAdEmpIncomeTax']"));
	            Select incomeTaxSelect = new Select(incomeTaxElement);
	            incomeTaxSelect.selectByVisibleText(incomeTax);

	            WebElement categoryElement = driver.findElement(By.xpath("//select[@id='DrpAdEmpCategory']"));
	            Select categorySelect = new Select(categoryElement);
	            categorySelect.selectByVisibleText(category);

	            WebElement exEmployeeField = driver.findElement(By.xpath("//input[@id='TxtAdEmpExemployee']"));
	            exEmployeeField.sendKeys(exEmployee);

	            WebElement empWith = driver.findElement(By.xpath("//button[@id='BtnAdEmpEmpanelledwith']"));
	            empWith.click();

	            WebElement empWithText = driver.findElement(By.xpath("//input[@id='TxtAdEmpanelledWith']"));
	            empWithText.sendKeys(empanelledWith);

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
	            WebElement residentialAddressField = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpResidentAdress']"));
	            residentialAddressField.sendKeys(residentialAddress);

	            WebElement checkbox3 = driver.findElement(By.xpath("//div[@id='CheckHide']//span[1]//*[name()='svg']"));
	            if (!checkbox3.isSelected()) {
	                checkbox3.click();
	            }

	            WebElement mobileNumberField = driver.findElement(By.xpath("//input[@id='TxtAdEmpMobileNo']"));
	            mobileNumberField.sendKeys(mobileNumber);

	            WebElement emailIdField = driver.findElement(By.xpath("//input[@id='TxtAdEmpEmailID']"));
	            emailIdField.sendKeys(emailId);

	            // Upload documents
	            WebElement docTypeField = driver.findElement(By.xpath("//input[@id='TxtAdEmpUDDocumentTyp']"));
	            docTypeField.sendKeys(docType);

	            WebElement docDescField = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpUDDescription']"));
	            docDescField.sendKeys(docDesc);

	            WebElement uploadFile1 = driver.findElement(By.xpath("//input[@id='UploadAdEmpUDPermission']"));
	            uploadFile1.sendKeys(filePath);

	            WebElement clickUpload = driver.findElement(By.xpath("//button[@id='BtnAdEmpUpload']"));
	            clickUpload.click();

	            // Confirmation details
	            WebElement confirmation = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpEligibilityConfirm']"));
	            confirmation.sendKeys(eligibilityConfirm);

	            WebElement grounds = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpAdvocateGround']"));
	            grounds.sendKeys(advocateGround);

	            // SAVE BUTTON
	            WebElement saveButton = driver.findElement(By.xpath("//button[@id='BtnAdvSave']"));
	            saveButton.click();

	            Thread.sleep(5000);

	            WebElement confirmSaveButton = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	            confirmSaveButton.click();

	            Thread.sleep(5000);
	        }

	        @AfterClass
	        public void tearDown() {
	            if (driver != null) {
	                driver.quit();
	            }
	        }
	    }
	


