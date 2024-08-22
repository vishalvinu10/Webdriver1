package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import POM.loginPage;
import POM.advocateempanellmentpage;

public class testaddadvocate {
	
	public class TestAddAdvocate {
	    private WebDriver driver;
	    private loginPage loginPage;
	    private advocateempanellmentpage advocateEmpanelmentPage;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        loginPage = new loginPage(driver);
	        advocateEmpanelmentPage = new advocateempanellmentpage(driver);
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test
	    public void testAddAdvocate() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        loginPage.enterUsername("BU");
	        loginPage.clickSignIn();
	        Thread.sleep(5000);

	        advocateEmpanelmentPage.clickAdvEmpanelment();
	        advocateEmpanelmentPage.clickAddAdv();
	        advocateEmpanelmentPage.enterAdvocateName("vamika");
	        advocateEmpanelmentPage.enterDateOfBirth("01-07-2000");
	        advocateEmpanelmentPage.selectQualification("LLB");
	        advocateEmpanelmentPage.enterDateOfEnrollment("02-07-2024");
	        advocateEmpanelmentPage.selectTotalExperience("1");
	        advocateEmpanelmentPage.selectMonths("3");
	        advocateEmpanelmentPage.clickEmpPractice();
	        advocateEmpanelmentPage.selectEmpPractice("Criminal");
	        advocateEmpanelmentPage.clickAddEmpPractice();
	        advocateEmpanelmentPage.clickCloseEmpPractice();
	        advocateEmpanelmentPage.selectIncomeTax("Yes");
	        advocateEmpanelmentPage.selectCategory("GENERAL");
	        advocateEmpanelmentPage.enterExEmployee("safe");
	        advocateEmpanelmentPage.clickEmpWith();
	        advocateEmpanelmentPage.enterEmpWithText("gjff");
	        advocateEmpanelmentPage.clickAddButton();
	        advocateEmpanelmentPage.clickCloseButton();
	        advocateEmpanelmentPage.clickPracWithState();
	        advocateEmpanelmentPage.clickCheckbox();
	        advocateEmpanelmentPage.clickAddButton1();
	        advocateEmpanelmentPage.clickPracWithDistrict();
	        advocateEmpanelmentPage.clickCheckbox2();
	        advocateEmpanelmentPage.clickAddButton2();
	        advocateEmpanelmentPage.enterResidentialAddress("palakkad");
	        advocateEmpanelmentPage.clickCheckbox3();
	        advocateEmpanelmentPage.enterMobileNumber("8776765797");
	        advocateEmpanelmentPage.enterEmailId("suwa7@gmail.com");
	        advocateEmpanelmentPage.enterDocType("picture");
	        advocateEmpanelmentPage.enterDocDesc("picture");
	        String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\SAFE\\field alignment issue.jpg";
	        advocateEmpanelmentPage.uploadFile(filePath);
	        advocateEmpanelmentPage.clickUpload();
	        advocateEmpanelmentPage.enterConfirmation("confirmed");
	        advocateEmpanelmentPage.enterGrounds("recommended");
	        advocateEmpanelmentPage.clickSaveButton();
	        Thread.sleep(5000);
	        advocateEmpanelmentPage.clickConfirmSaveButton();
	        Thread.sleep(5000);
	    }
	}

}
