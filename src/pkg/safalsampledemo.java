package pkg;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class safalsampledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Setup WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Replace with the URL of the login page
            driver.get("https://safallitigation.onlinesafe.in/");
            
            // Replace with the username field ID or other locator
            WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
            
            // Replace with the submit button ID or other locator
            WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
            
            // List of valid usernames
            List<String> validUsernames = Arrays.asList("BU", "BM", "RO", "HO");
            
            // Test different usernames
            String[] testUsernames = {"BU", "BM", "RO", "HO", "INVALID"};
            
            for (String username : testUsernames) {
                usernameField.clear();
                usernameField.sendKeys(username);
                submitButton.click();
                
                if (validUsernames.contains(username)) {
                    System.out.println(username + " is a valid username.");
                    // Add your code here to verify successful login if needed
                } else {
                    System.out.println(username + " is an invalid username.");
                    // Replace with the error message field ID or other locator
                    WebElement errorMessage = driver.findElement(By.id("errorMessageId"));
                    if (errorMessage.isDisplayed()) {
                        System.out.println("Error message displayed: " + errorMessage.getText());
                    } else {
                        System.out.println("Error message not displayed for invalid username: " + username);
                    }
                }
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }

	}


