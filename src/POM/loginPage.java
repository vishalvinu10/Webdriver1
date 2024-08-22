package POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	private WebDriver driver;

    private By usernameField = By.xpath("//*[@id=\"TxtAuthvalue\"]");
    private By signInButton = By.xpath("//*[@id=\"ButSignin\"]");

    public loginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }
}


