package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepo.HomePage;
import objectRepo.LoginPage;
import objectRepo.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	public FileUtility fLib;

	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;

	@BeforeClass
	public void launchBrowser() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		fLib = new FileUtility();
		String URL = fLib.getDatafromProperty("url");
		driver.get(URL);

	}

	@BeforeMethod
	public void login() throws IOException {
		wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		lp = new LoginPage(driver);
		String EMAIL = fLib.getDatafromProperty("Email");
		String PASSWORD = fLib.getDatafromProperty("Password");
		lp.getEmailTextField().sendKeys(EMAIL);
		lp.getPasswordTextrField().sendKeys(PASSWORD);
		lp.getLoginButton().click();

	}

	@AfterMethod
	public void logout() {
		hp = new HomePage(driver);
		hp.getLogoutlink().click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
