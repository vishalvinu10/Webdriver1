package pkg;

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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class npaaddcase {
  private WebDriver driver;
  private WebDriverWait wait;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
//  @AfterClass
//  public void tearDown() {
//    driver.quit();
//  }
  @Test
  public void liti() throws InterruptedException {
    driver.get("https://safallitigation.onlinesafe.in/");
    driver.manage().window().maximize();
    
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtAuthvalue"))).sendKeys("BU");
    wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSignin"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("NPA"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Cases"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#\\31_42987221 > .fa"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("101"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnRevBorrower"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("GuarantorRev"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("LegalHeirRev"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("RevCheck_1181"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnRevBorrowerSave"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#RevBorrowerModal .card-body"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnRRSelectedBorrowerSave"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpRevState"))).click();
    {
      WebElement dropdown =  wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpRevState")));
      dropdown.findElement(By.xpath("//option[. = 'Kerala']")).click();
    }
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpRevDistrict"))).click();
    {
      WebElement dropdown =  wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpRevDistrict")));
      dropdown.findElement(By.xpath("//option[. = 'Palakkad']")).click();
    }
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".col-md-3:nth-child(8) > fieldset"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpRevAuthorityName"))).click();
    {
      WebElement dropdown =  wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpRevAuthorityName")));
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[. = 'District Magistrate']"))).click();
    }
    WebElement dateoffiling =  wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtRevFilingDate")));
    dateoffiling.sendKeys("31-07-2024");
//    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("tr:nth-child(5) > .day:nth-child(4)"))).click();
//    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtRevAmtClaimed"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtRevAmtClaimed"))).sendKeys("7575674");
//    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtRevInterestClaim"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("TxtRevInterestClaim"))).sendKeys("21");
    wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpRevInterestTyp"))).click();
    {
      WebElement dropdown = driver.findElement(By.id("DrpRevInterestTyp"));
      dropdown.findElement(By.xpath("//option[. = 'Simple Interest']")).click();
    }
    driver.findElement(By.id("TxtRevCNRNo")).click();
    driver.findElement(By.id("TxtRevCNRNo")).sendKeys("GYFYUD8776745633");
    driver.findElement(By.id("TxtRevCaseNo")).click();
    driver.findElement(By.id("TxtRevCaseNo")).sendKeys("143");
    driver.findElement(By.id("DrpRevCaseYear")).click();
    {
      WebElement dropdown = driver.findElement(By.id("DrpRevCaseYear"));
      dropdown.findElement(By.xpath("//option[. = '2024']")).click();
      
      JavascriptExecutor js6 = (JavascriptExecutor) driver;
	  js6.executeScript("window.scrollBy(0, 2000)");
    }
    wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnRevSave"))).click();
    Thread.sleep(2000);
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".confirm"))).click();
    Thread.sleep(2000);
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".confirm"))).click();
  }
}
