package safallitigation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class revenuerecoveryaddcase {
	
	 private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test(priority=1)
	    public void testAddAdvocateonRO() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

	        Thread.sleep(5000);
	        
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        clicknpa.click();
	        Thread.sleep(3000);
	        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
	        addcase.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]"));
	        clickthreedots.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickrevenuerecovery = driver.findElement(By.xpath("(//a[normalize-space()='Revenue Recovery'])[1]"));
	        clickrevenuerecovery.click();
	        
	        Thread.sleep(3000);
	        
	        
	        //coborrower/Guarantor/Legal Heirs
	        
	        WebElement clickaddbutton = driver.findElement(By.xpath("//button[@id='BtnRevBorrower']"));
	        clickaddbutton.click();
	        
	        WebElement clicklegalheirs = driver.findElement(By.xpath("//input[@id='LegalHeirRev']"));
	        clicklegalheirs.click();
	        
	        WebElement checkbox = driver.findElement(By.xpath("(//input[@id='RevCheck_1162'])[1]"));
	        if (!checkbox.isSelected()) {
	        	checkbox.click();
	        }
	        
	        WebElement clickaddbutton1 = driver.findElement(By.xpath("//button[@id='BtnRevBorrowerSave']"));
	        clickaddbutton1.click();
	        WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnRRSelectedBorrowerSave']"));
	        savebutton.click();
	        
            //state of court
	        
	        WebElement StateofCourt = driver.findElement(By.xpath("//select[@id='DrpRevState']"));
	        Select StateofCourtSelect = new Select(StateofCourt);
	        StateofCourtSelect.selectByVisibleText("Kerala");
	        

	        //Location of the Court
	        
	        WebElement LocationoftheCourt = driver.findElement(By.xpath("//select[@id='DrpRevDistrict']"));
	        Select LocationoftheCourtSelect = new Select(LocationoftheCourt);
	        LocationoftheCourtSelect.selectByVisibleText("Palakkad");
	        
	        
	        //Name of the Authority
	        
	        WebElement Authority = driver.findElement(By.xpath("//select[@id='DrpRevAuthorityName']"));
	        Select AuthoritySelect = new Select(Authority);
	        AuthoritySelect.selectByVisibleText("District Collector");
	        
	        
	        //Date of Filing
	        
	        WebElement DateofFiling = driver.findElement(By.xpath("//input[@id='TxtRevFilingDate']"));
	        DateofFiling.sendKeys("09-07-2024");
	        
	        //Amount Claimed
	        
	        WebElement claimed = driver.findElement(By.xpath("//input[@id='TxtRevAmtClaimed']"));
	        claimed.sendKeys("43345");
	        
           //Interest Claimed (%)
	        
	        WebElement Interest = driver.findElement(By.xpath("//input[@id='TxtRevInterestClaim']"));
	        Interest.sendKeys("20");
	        
	        //Interest Type
		       
	        WebElement InterestType = driver.findElement(By.xpath("//select[@id='DrpRevInterestTyp']"));
	        Select InterestTypeSelect = new Select(InterestType);
	        InterestTypeSelect.selectByVisibleText("Simple Interest");
	        
	        //CNR No
	        WebElement CNR = driver.findElement(By.xpath("//input[@id='TxtRevCNRNo']"));
	        CNR.sendKeys("drgr546576878768");
	        
	        //case no
	        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtRevCaseNo']"));
	        caseno.sendKeys("3434");
	        
            //case year
	        
	        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpRevCaseYear']"));
	        Select caseyearSelect = new Select(caseyear);
	        caseyearSelect.selectByVisibleText("2024");
	        
	        WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnRevSave']"));
	        clicksave.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        clickok.click();
	        
            Thread.sleep(3000);
	        
	        WebElement clickok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        clickok1.click();
	        
	        
	        
	        
	        

}}
