package pkg;

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
import java.util.Random;
import java.util.UUID;

public class demoROrandom {
	
	 public static void main(String[] args) {
         System.out.println(generateRandomPhoneNumber1());
         System.out.println(generateRandomEmail1());
     }

     public static String generateRandomPhoneNumber1() {
         Random rand = new Random();
         int num1 = (rand.nextInt(7) + 1) * 10 + rand.nextInt(10);
         int num2 = rand.nextInt(100);
         int num3 = rand.nextInt(1000);

         return String.format("%03d%03d%04d", num1, num2, num3);
     }

     public static String generateRandomEmail1() {
    	    Random rand = new Random();
    	    String[] domains = {"@gmail.com", "@yahoo.com"};
    	    String[] names = {"John", "Emily", "Michael", "Sarah", "William", "Olivia", "James", "Ava", "George", "Isabella"};

    	    String name = names[rand.nextInt(names.length)];
    	    String domain = domains[rand.nextInt(domains.length)];
    	    String uniqueId = UUID.randomUUID().toString().substring(0, 8);

    	    return name + uniqueId + domain;
    	}
	
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
    public void testAddAdvocateonRO() throws InterruptedException {
        driver.get("https://safallitigation.onlinesafe.in/");

        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
        usernameField.sendKeys("RO");

        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
        signInButton.click();

        Thread.sleep(5000);

        WebElement advEmpanelment = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
        advEmpanelment.click();

        WebElement addAdv = driver.findElement(By.xpath("//a[@href='/Empanelment/AdvocateEmpanelment']"));
        addAdv.click();

        WebElement advocateNameField = driver.findElement(By.xpath("//input[@id='TxtAdEmpNamAdvocate']"));
        advocateNameField.sendKeys("ambareesh");

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
        
        for (int i = 0; i < 10; i++) {
            WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='TxtAdEmpMobileNo']"));
            mobileNumber.sendKeys(generateRandomPhoneNumber1());

            WebElement emailId = driver.findElement(By.xpath("//input[@id='TxtAdEmpEmailID']"));
            emailId.sendKeys(generateRandomEmail1());
            
        }

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

	private CharSequence generateRandomEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	private CharSequence generateRandomPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}
