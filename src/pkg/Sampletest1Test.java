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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Sampletest1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  @org.testng.annotations.Test
  public void sampletest1() {
    driver.get("https://safallitigation.onlinesafe.in/");
    driver.manage().window().setSize(new Dimension(1382, 736));
    driver.findElement(By.id("TxtAuthvalue")).click();
    driver.findElement(By.id("TxtAuthvalue")).sendKeys("BU");
    driver.findElement(By.id("ButSignin")).click();
    driver.findElement(By.xpath("//div[@id=\'style-7\']/ul/li[9]/a")).click();
    driver.findElement(By.cssSelector(".pcoded-trigger li:nth-child(1) .pcoded-mtext")).click();
    driver.findElement(By.xpath("//a[@id=\'BtnOTSCustSelect\']/i")).click();
    driver.findElement(By.id("BtnOTSNextto2")).click();
    driver.findElement(By.id("BtnOTSNextto3")).click();
    driver.findElement(By.id("BtnOTSNextto4")).click();
    driver.findElement(By.id("BtnOTSNextto5")).click();
    driver.close();
  }
}
