package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngdemo {
	
	 private WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testGoogleSearch() throws InterruptedException {
	        driver.get("https://www.google.com");

	        // Locate the search box using its name attribute
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("TestNG");

	        // Submit the search
	        searchBox.submit();

	        // Wait for some time to get the results
	        Thread.sleep(2000);

	        // Verify that the results page is displayed
	        Assert.assertTrue(driver.getTitle().contains("TestNG"), "Page title does not contain 'TestNG'");
	    }

	    @AfterClass
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }}
