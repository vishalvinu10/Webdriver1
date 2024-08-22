package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
        
        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();
        
 
            // Open the target URL
            driver.get("https://safallitigation.onlinesafe.in/");
            
            // Maximize the browser window
            driver.manage().window().maximize();
            
            WebElement authField = driver.findElement(By.xpath("//input[@id='TxtAuthvalue']"));
            authField.sendKeys("BU");
            
            // Find and click the sign-in button
            WebElement signInButton = driver.findElement(By.xpath("//button[@id='ButSignin']"));
            signInButton.click();
            
            WebElement npaButton = driver.findElement(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[2]/a[1]"));
            npaButton.click();
            
            // Click on the Add Cases button
            WebElement addCasesButton = driver.findElement(By.xpath("//a[@href='/NPA/NPA']"));
            addCasesButton.click();
            WebElement addCases= driver.findElement(By.xpath("//button[@id='1_42987221']//i[@class='fa fa-ellipsis-v']"));
            addCases.click();
            WebElement civilcourt= driver.findElement(By.xpath("//a[@id='1']"));
            civilcourt.click();
            
            WebElement closebar= driver.findElement(By.xpath("//button[@id='CloseCCCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
            closebar.click();
            
            WebElement StateofCourt = driver.findElement(By.xpath("//select[@id='DrpCCState']"));
            Select dropdown = new Select(StateofCourt);
            dropdown.selectByVisibleText("Kerala");

            WebElement dateInput = driver.findElement(By.xpath("//input[@id='TxtCCFilingDate']"));
            dateInput.sendKeys("01-01-2024");
           
            WebElement LocationoftheCourt = driver.findElement(By.xpath("//select[@id='DrpCCDistrict']"));
            Select dropdown1 = new Select(LocationoftheCourt);
            dropdown1.selectByVisibleText("Palakkad");
            
            WebElement nameoftheCourt = driver.findElement(By.xpath("//select[@id='DrpCCCourtName']"));
            Select dropdown2 = new Select(nameoftheCourt);
            dropdown2.selectByVisibleText("CIVIL COURT");
            
            
	     

	}}
