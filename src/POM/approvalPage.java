package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class approvalPage {
	
	private WebDriver driver;

    private By advEmpanelment = By.xpath("//span[normalize-space()='Advocate Empanelment']");
    private By approvals = By.xpath("//a[@href='/Empanelment/AdvocateApproval']");
    private By approvalDetails = By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]");
    private By approveButton = By.xpath("//button[@id='BtnAdEmpApprove']");
    private By okButton1 = By.xpath("//button[normalize-space()='OK']");
    private By okButton2 = By.xpath("//button[normalize-space()='OK']");

    public approvalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAdvEmpanelment() {
        driver.findElement(advEmpanelment).click();
    }

    public void clickApprovals() {
        driver.findElement(approvals).click();
    }

    public void clickApprovalDetails() {
        driver.findElement(approvalDetails).click();
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
    }

    public void clickApproveButton() {
        driver.findElement(approveButton).click();
    }

    public void clickOkButton1() {
        driver.findElement(okButton1).click();
    }

    public void clickOkButton2() {
        driver.findElement(okButton2).click();
    }
}


