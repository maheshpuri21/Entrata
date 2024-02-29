package com.EntrataApplication.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EntrataApplication.BasePackage.BaseClass;
import com.EntrataApplication.pages.HomePage;
import com.EntrataApplication.pages.LoginPage;
import com.EntrataApplication.utilis.Log;

public class HomepageTest extends BaseClass{

	public WebDriver driver;
	LoginPage loginpage;
	HomePage homePage;

	public HomepageTest()
	{
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

	@Test(enabled = true,priority = 1)
	public void Homepage_Tittle_Test()
	{
		String expctedtiitle="Property Management Software | Entrata";
		String actualttitle=homePage.Homepage_tiitle();
		Assert.assertEquals(expctedtiitle, actualttitle);
	}

	@Test(enabled = true,priority = 2)
	public void Element_visiblity_Test()
	{
		SoftAssert sa=new SoftAssert();


		Log.info("ProductDropdownmenu_Vsibility_value Test");
		boolean ProductDropdownmenu_Vsibility_value = homePage.ProductDropdownmenu_Vsibility();
		sa.assertEquals(ProductDropdownmenu_Vsibility_value, true);


		Log.info("SolutionDropdown_Visibility_value Test");
		boolean SolutionDropdown_Visibility_value = homePage.SolutionDropdown_Visibility();
		sa.assertEquals(SolutionDropdown_Visibility_value, true);

		Log.info("ResourseLink_Visiblity_value");
		boolean ResourseLink_Visiblity_value = homePage.ResourseLink_Visiblity();
		sa.assertEquals(ResourseLink_Visiblity_value, true);

		Log.info("BaseCampLink_Visibility_value");
		boolean BaseCampLink_Visibility_value = homePage.BaseCampLink_Visibility();
		sa.assertEquals(BaseCampLink_Visibility_value, true);

		Log.info("WatchDemo_visiblity_value");
		boolean WatchDemo_visiblity_value = homePage.WatchDemo_visiblity();
		sa.assertEquals(WatchDemo_visiblity_value, true);

		Log.info("SignIn_visiblity_value ");
		boolean SignIn_visiblity_value = homePage.SignIn_visiblity();
		sa.assertEquals(SignIn_visiblity_value, true);

		sa.assertAll();

	}
}
