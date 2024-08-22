package safallitigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.testng.annotations.Test;

public class ServicemattersTest {
  private WebDriver driver;
  private WebDriverWait wait;

  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

	driver.manage().window().maximize();
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }
  
//  @AfterClass
//  public void tearDown() {
//    driver.quit();
//  }
  
  @Test
  
  public void servicematterscasefiling() throws InterruptedException {
    driver.get("https://safallitigation.onlinesafe.in/");
    
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtAuthvalue"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtAuthvalue"))).sendKeys("CO");
    wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSignin"))).click();
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pcoded-item > li:nth-child(3) .pcoded-mtext"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCircle"))).click();
    {
      WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCircle")));
      dropdown.findElement(By.xpath("//option[. = 'CIRCLE OFFICE DELHI']")).click();
    }
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCourtName"))).click();
    {
      WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCourtName")));
      dropdown.findElement(By.xpath("//option[. = 'Bombay High Court']")).click();
    }
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMBench"))).click();
    {
      WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMBench")));
      dropdown.findElement(By.xpath("//option[. = 'High Court of Bombay at Goa']")).click();
    }
//    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCaseTyp"))).click();
//    {
//      WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCaseTyp")));
//      dropdown.findElement(By.xpath("//option[. = 'Civil Appeal']")).click();
//    }
    WebElement DrpSMCaseTyp = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCaseTyp")));
    Select DrpSMCaseTypSelect = new Select(DrpSMCaseTyp);
    DrpSMCaseTypSelect.selectByVisibleText("Civil Appeal");
    
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCaseStage"))).click();
    {
      WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCaseStage")));
      dropdown.findElement(By.xpath("//option[. = 'Hearing']")).click();
    }
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCaseNature"))).click();
    {
      WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMCaseNature")));
      dropdown.findElement(By.xpath("//option[. = 'Termination']")).click();
    }
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtSMNoticeFiling"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtSMNoticeFiling']"))).sendKeys("02-08-2024");
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtSMStaffID"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtSMStaffID"))).sendKeys("4353453");
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMStaffRole"))).click();
    {
      WebElement dropdown = driver.findElement(By.id("DrpSMStaffRole"));
      dropdown.findElement(By.xpath("//option[. = 'Contract Workers']")).click();
    }
    driver.findElement(By.id("DrpSMCanaraRole")).click();
    {
      WebElement dropdown = driver.findElement(By.id("DrpSMCanaraRole"));
      dropdown.findElement(By.xpath("//option[. = 'Petitioner(s)']")).click();
    }
    driver.findElement(By.id("BtnSMRespondent")).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtSMRespondent"))).sendKeys("vdfbfd");
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnSMRespondentSave']"))).click();
    
    {
      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnSMRespondentSave")));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".confirm")).click();
    driver.findElement(By.id("DrpSMMonetaryTyp")).click();
    {
      WebElement dropdown = driver.findElement(By.id("DrpSMMonetaryTyp"));
      dropdown.findElement(By.xpath("//option[. = 'Yes']")).click();
    }
    driver.findElement(By.id("TxtSMCompensationClaim")).click();
    driver.findElement(By.id("TxtSMCompensationClaim")).sendKeys("4,35,455.00");
    
    driver.findElement(By.xpath("//input[@id='TxtSMInterestClaimedDate']")).sendKeys("02-08-2024");
    driver.findElement(By.id("DrpSMInterestTyp")).click();
    {
      WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpSMInterestTyp")));
      dropdown.findElement(By.xpath("//option[. = 'Simple Interest']")).click();
    }
    driver.findElement(By.id("TxtSMInterestClaim")).click();
    driver.findElement(By.id("TxtSMInterestClaim")).sendKeys("21");
    driver.findElement(By.id("TxtSMCostPenalty")).click();
    driver.findElement(By.id("TxtSMCostPenalty")).sendKeys("3,443.00");
    driver.findElement(By.id("BtnSMAdvctName")).click();
    driver.findElement(By.id("DrpAdvSMState")).click();
    {
      WebElement dropdown = driver.findElement(By.id("DrpAdvSMState"));
      dropdown.findElement(By.xpath("//option[. = 'Kerala']")).click();
    }
    driver.findElement(By.id("DrpAdvSMDistrict")).click();
    {
      WebElement dropdown = driver.findElement(By.id("DrpAdvSMDistrict"));
      dropdown.findElement(By.xpath("//option[. = 'Palakkad']")).click();
    }
    driver.findElement(By.id("BtnSMAdvctSearch")).click();
    {
      WebElement element = driver.findElement(By.id("BtnSMAdvctSearch"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("CheckDAdvt_1")).click();
    driver.findElement(By.id("BtnSMAdvctSave")).click();
    driver.findElement(By.id("TxtSMCNRNo")).click();
    driver.findElement(By.id("TxtSMCNRNo")).sendKeys("kRfwef4356565767");
    driver.findElement(By.cssSelector(".card-block > .row:nth-child(2)")).click();
    driver.findElement(By.id("TxtSMCaseNo")).click();
    driver.findElement(By.id("TxtSMCaseNo")).sendKeys("2121");
    driver.findElement(By.id("DrpSMCaseYear")).click();
    {
      WebElement dropdown = driver.findElement(By.id("DrpSMCaseYear"));
      dropdown.findElement(By.xpath("//option[. = '2024']")).click();
    }
//    driver.findElement(By.id("TxtSMrovision")).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtSMrovision"))).sendKeys("43,43,534.00");
   
    wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnSMave"))).click();
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".confirm"))).click();
    Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".confirm"))).click();
  }
}
