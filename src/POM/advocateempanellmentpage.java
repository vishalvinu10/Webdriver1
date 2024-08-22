package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class advocateempanellmentpage {
	
	 private WebDriver driver;

	    private By advEmpanelment = By.xpath("//span[normalize-space()='Advocate Empanelment']");
	    private By addAdv = By.xpath("//a[@href='/Empanelment/AdvocateEmpanelment']");
	    private By advocateNameField = By.xpath("//input[@id='TxtAdEmpNamAdvocate']");
	    private By dateOfBirthField = By.xpath("//input[@id='TxtAdEmpBirthDate']");
	    private By qualificationDropdown = By.xpath("//select[@id='DrpAdEmpEduQualification']");
	    private By dateOfEnrollmentField = By.xpath("//input[@id='TxtAdEmpEnrolmentDate']");
	    private By totalExperienceDropdown = By.xpath("//select[@id='DrpAdEmpTotalExperience']");
	    private By monthsDropdown = By.xpath("//select[@id='DrpAdEmpMonths']");
	    private By empPractice = By.xpath("//button[@id='BtnAdEmpPracticeArea']");
	    private By empPracticeDropdown = By.xpath("//select[@id='DrpAdvAreaOfPractice']");
	    private By addEmpPractice = By.xpath("//button[@id='BtnAdAreaPracticingSave']");
	    private By closeEmpPractice = By.xpath("//button[@id='BtnAdAreaPracticingClose']");
	    private By incomeTax = By.xpath("//select[@id='DrpAdEmpIncomeTax']");
	    private By category = By.xpath("//select[@id='DrpAdEmpCategory']");
	    private By exEmployee = By.xpath("//input[@id='TxtAdEmpExemployee']");
	    private By empWith = By.xpath("//button[@id='BtnAdEmpEmpanelledwith']");
	    private By empWithText = By.xpath("//input[@id='TxtAdEmpanelledWith']");
	    private By addButton = By.xpath("//button[@id='BtnAdEmpanelledWithSave']");
	    private By closeButton = By.xpath("//button[@id='BtnAdEmpanelledWithClose']");
	    private By pracWithState = By.xpath("//button[@id='BtnAdEmpState']");
	    private By checkbox = By.xpath("//input[@id='CheckState_1426']");
	    private By addButton1 = By.xpath("//button[@id='BtnStateSave']");
	    private By pracWithDistrict = By.xpath("//button[@id='BtnAdEmpDistrict']");
	    private By checkbox2 = By.xpath("//tr[@class='odd']//input[@id='CheckDist_1426']");
	    private By addButton2 = By.xpath("//button[@id='BtnDistrictSave']");
	    private By residentialAddress = By.xpath("//textarea[@id='TxtAdEmpResidentAdress']");
	    private By checkbox3 = By.xpath("//div[@id='CheckHide']//span[1]//*[name()='svg']");
	    private By mobileNumber = By.xpath("//input[@id='TxtAdEmpMobileNo']");
	    private By emailId = By.xpath("//input[@id='TxtAdEmpEmailID']");
	    private By docType = By.xpath("//input[@id='TxtAdEmpUDDocumentTyp']");
	    private By docDesc = By.xpath("//textarea[@id='TxtAdEmpUDDescription']");
	    private By uploadFile = By.xpath("//input[@id='UploadAdEmpUDPermission']");
	    private By clickUpload = By.xpath("//button[@id='BtnAdEmpUpload']");
	    private By confirmation = By.xpath("//textarea[@id='TxtAdEmpEligibilityConfirm']");
	    private By grounds = By.xpath("//textarea[@id='TxtAdEmpAdvocateGround']");
	    private By saveButton = By.xpath("//button[@id='BtnAdvSave']");
	    private By confirmSaveButton = By.xpath("//button[normalize-space()='OK']");

	    public advocateempanellmentpage (WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickAdvEmpanelment() {
	        driver.findElement(advEmpanelment).click();
	    }

	    public void clickAddAdv() {
	        driver.findElement(addAdv).click();
	    }

	    public void enterAdvocateName(String name) {
	        driver.findElement(advocateNameField).sendKeys(name);
	    }

	    public void enterDateOfBirth(String dob) {
	        driver.findElement(dateOfBirthField).sendKeys(dob);
	    }

	    public void selectQualification(String qualification) {
	        new Select(driver.findElement(qualificationDropdown)).selectByVisibleText(qualification);
	    }

	    public void enterDateOfEnrollment(String doe) {
	        driver.findElement(dateOfEnrollmentField).sendKeys(doe);
	    }

	    public void selectTotalExperience(String experience) {
	        new Select(driver.findElement(totalExperienceDropdown)).selectByVisibleText(experience);
	    }

	    public void selectMonths(String months) {
	        new Select(driver.findElement(monthsDropdown)).selectByVisibleText(months);
	    }

	    public void clickEmpPractice() {
	        driver.findElement(empPractice).click();
	    }

	    public void selectEmpPractice(String practice) {
	        new Select(driver.findElement(empPracticeDropdown)).selectByVisibleText(practice);
	    }

	    public void clickAddEmpPractice() {
	        driver.findElement(addEmpPractice).click();
	    }

	    public void clickCloseEmpPractice() {
	        driver.findElement(closeEmpPractice).click();
	    }

	    public void selectIncomeTax(String incomeTax) {
	        new Select(driver.findElement(this.incomeTax)).selectByVisibleText(incomeTax);
	    }

	    public void selectCategory(String category) {
	        new Select(driver.findElement(this.category)).selectByVisibleText(category);
	    }

	    public void enterExEmployee(String exEmployee) {
	        driver.findElement(this.exEmployee).sendKeys(exEmployee);
	    }

	    public void clickEmpWith() {
	        driver.findElement(empWith).click();
	    }

	    public void enterEmpWithText(String text) {
	        driver.findElement(empWithText).sendKeys(text);
	    }

	    public void clickAddButton() {
	        driver.findElement(addButton).click();
	    }

	    public void clickCloseButton() {
	        driver.findElement(closeButton).click();
	    }

	    public void clickPracWithState() {
	        driver.findElement(pracWithState).click();
	    }

	    public void clickCheckbox() {
	        if (!driver.findElement(checkbox).isSelected()) {
	            driver.findElement(checkbox).click();
	        }
	    }

	    public void clickAddButton1() {
	        driver.findElement(addButton1).click();
	    }

	    public void clickPracWithDistrict() {
	        driver.findElement(pracWithDistrict).click();
	    }

	    public void clickCheckbox2() {
	        if (!driver.findElement(checkbox2).isSelected()) {
	            driver.findElement(checkbox2).click();
	        }
	    }

	    public void clickAddButton2() {
	        driver.findElement(addButton2).click();
	    }

	    public void enterResidentialAddress(String address) {
	        driver.findElement(residentialAddress).sendKeys(address);
	    }

	    public void clickCheckbox3() {
	        if (!driver.findElement(checkbox3).isSelected()) {
	            driver.findElement(checkbox3).click();
	        }
	    }

	    public void enterMobileNumber(String mobile) {
	        driver.findElement(mobileNumber).sendKeys(mobile);
	    }

	    public void enterEmailId(String email) {
	        driver.findElement(emailId).sendKeys(email);
	    }

	    public void enterDocType(String docType) {
	        driver.findElement(this.docType).sendKeys(docType);
	    }

	    public void enterDocDesc(String docDesc) {
	        driver.findElement(this.docDesc).sendKeys(docDesc);
	    }

	    public void uploadFile(String filePath) {
	        driver.findElement(uploadFile).sendKeys(filePath);
	    }

	    public void clickUpload() {
	        driver.findElement(clickUpload).click();
	    }

	    public void enterConfirmation(String confirmation) {
	        driver.findElement(this.confirmation).sendKeys(confirmation);
	    }

	    public void enterGrounds(String grounds) {
	        driver.findElement(this.grounds).sendKeys(grounds);
	    }

	    public void clickSaveButton() {
	        driver.findElement(saveButton).click();
	    }

	    public void clickConfirmSaveButton() {
	        driver.findElement(confirmSaveButton).click();
	    }
	}


