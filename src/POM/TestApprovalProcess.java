package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import POM.loginPage;
import POM.approvalPage;

public class TestApprovalProcess {
	
	private WebDriver driver;
    private loginPage loginPage;
    private approvalPage approvalPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new loginPage(driver);
        approvalPage = new approvalPage(driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testApprovalProcess() throws InterruptedException {
        driver.get("https://safallitigation.onlinesafe.in/");

        loginPage.enterUsername("BM");
        loginPage.clickSignIn();
        Thread.sleep(5000);

        approvalPage.clickAdvEmpanelment();
        approvalPage.clickApprovals();
        Thread.sleep(5000);
        approvalPage.clickApprovalDetails();
        Thread.sleep(5000);
        approvalPage.scrollToBottom();
        Thread.sleep(5000);
        approvalPage.clickApproveButton();
        Thread.sleep(5000);
        approvalPage.clickOkButton1();
        Thread.sleep(5000);
        approvalPage.clickOkButton2();
        Thread.sleep(5000);
    }
}


