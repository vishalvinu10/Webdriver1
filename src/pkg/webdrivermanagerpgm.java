package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanagerpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String exp="Google";
		String actual=driver.getTitle();
		if(exp.contentEquals(actual))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}

}
