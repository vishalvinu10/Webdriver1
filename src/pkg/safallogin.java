package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class safallogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://safallitigation.onlinesafe.in/");
	     WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]")); 
	     usernameField.sendKeys("BU");
	     
	     WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	     signInButton.click();
	     try {
	            WebElement loggedInElement = driver.findElement(By.xpath("//*[@id=\"style-7\"]/ul/li[1]/a")); // Example element after successful login
	            if (loggedInElement.isDisplayed()) {
	                System.out.println("Authentication successful");
	            } else {
	                System.out.println("Authentication failed");
	            }
	        } catch (Exception e) {
	        	
	        	System.out.println("Authentication failed");
	        }

	        // Close the browser
	        driver.quit();
	    }
	
	        


	}


