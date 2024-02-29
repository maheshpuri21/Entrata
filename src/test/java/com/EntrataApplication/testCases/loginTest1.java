package com.EntrataApplication.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.EntrataApplication.BasePackage.BaseClass;
import com.EntrataApplication.pages.HomePage;
import com.EntrataApplication.pages.LoginPage;
import com.EntrataApplication.utilis.Log;

public class loginTest1  extends BaseClass{

	public WebDriver driver;
	LoginPage loginpage;
	HomePage homePage;


	public loginTest1() {
		super();
	}


	@Parameters("browser")
	@BeforeMethod
	public void setUp(String broswername) {

		Log.info("Browser Got launched");  
		//driver=initilizeBrowser(prop.getProperty("browser"));
		driver=initilizeBrowser(broswername);
		Log.info("Broswer Launched successfully");
		homePage=new HomePage(driver);

	}

	@AfterMethod
	public void tearDown()
	{
		Log.info("Driver got Closed");
		driver.quit();
	}




	@Test(priority = 1, enabled = true)
	public void verifylogintittle()
	{


		Log.startTestCase("verifylogintittle");

		Log.info("Click on signin Link");



		loginpage = homePage.SelectLoginOpetion();

		String exoptedtiitle="Entrata Sign In";
		String actualtittle=loginpage.Pagetiitle_loginpage();
		Assert.assertEquals(exoptedtiitle, actualtittle);
	}


	//Below Test case is Shows Screenshot Functionality Of Failed Test case and Attach with Reports 
	@Test(priority = 2,enabled = true)
	public void login_with_credentials()
	{
		Log.info("Click on sign in button of homepage");
		homePage.SelectLoginOpetion();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Log.info("Accept popup");
		loginpage.click_acceptcookies();

		Log.info("Click on Property manger Sign in button");
		loginpage.Click_PropertymanagerLogin();



		Log.info("Enter the value of username");

		loginpage.Enterusername("abc");

		Log.info("Enter the value of password");

		loginpage.EnterPassword("bdcd");

		Log.info("Click on sign in button");

		loginpage.Click_SignInButton();


	}

}
