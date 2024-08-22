package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mvish\\Downloads\\selenium\\chrome driver 126\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();  //object creation of chromedriver class
	  driver.get("https://www.google.com");
	}

}
