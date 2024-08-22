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

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class CABCUMULATIVETest {
  private WebDriver driver;
  private WebDriverWait wait;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  
  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    WebDriverManager.chromedriver().clearDriverCache().setup();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }
  
  
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  
  
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @org.testng.annotations.Test
  public void CABCUMULATIVE() {
	  
    driver.get("https://safallitigation.onlinesafe.in/");
    driver.manage().window().maximize();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("TxtAuthvalue"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("TxtAuthvalue"))).sendKeys("BU");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ButSignin"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Report"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("CAB Cumulative"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("TxtCabFrmDate"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".datepicker-days .datepicker-switch"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".datepicker-months .datepicker-switch"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".year:nth-child(1)"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".month:nth-child(1)"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tr:nth-child(1) > .day:nth-child(3)"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("TxtCabToDate"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tr:nth-child(1) > .day:nth-child(5)"))).click();
    vars.put("window_handles", driver.getWindowHandles());
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BtnCabSearch"))).click();
    vars.put("win3665", waitForWindow(2000));
    driver.switchTo().window(vars.get("win3665").toString());
    vars.put("window_handles", driver.getWindowHandles());
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExportReportDataS"))).click();
    vars.put("win141", waitForWindow(2000));
    driver.switchTo().window(vars.get("win141").toString());
    driver.close();
    driver.switchTo().window(vars.get("win3665").toString());
  }
}
