package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class couterclainbug {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     
	     
	     
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     
	     driver.get("https://safallitigation.onlinesafe.in/");
	     
	     driver.manage().window().maximize();
	     
	   
	     WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]")); 
	     usernameField.sendKeys("BU");
	     
	     WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	     signInButton.click();
	     
	     Thread.sleep(3000);
	     
	     WebElement litigationButton = driver.findElement(By.xpath("//*[@id=\"style-7\"]/ul/li[5]/a/i"));
	     litigationButton.click();
	     
	     WebElement disposedCasesButton = driver.findElement(By.xpath("//span[normalize-space()='Disposed Cases']"));
	     disposedCasesButton.click();
	     
	     
	     Thread.sleep(5000);
	     
	     
	     js.executeScript("window.scrollBy(0,1000)");
	     
	     String targetElementXpath = "//tbody/tr[15]/td[14]/a[1]/i[1]"; // Replace with your actual XPath
         WebElement targetElement = driver.findElement(By.xpath(targetElementXpath));
         
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", targetElement);
         
         
         WebElement interim = driver.findElement(By.xpath("//tbody/tr[16]/td[14]/a[1]/i[1]"));
         interim.click();

	     
	     
	    
	     
	     }}