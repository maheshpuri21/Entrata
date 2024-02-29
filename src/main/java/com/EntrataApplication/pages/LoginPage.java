package com.EntrataApplication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name =  "company_user[username]")
	private WebElement Username;

	@FindBy(name="company_user[password]")
	private WebElement Password;


	@FindBy(xpath = "//a[contains(text(),'Property Manager Login')]")
	private WebElement PropertymanagerLogin;

	@FindBy(xpath = "//button[@aria-label='Accept cookies']")
	private WebElement Acceptcookies;


	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	private WebElement btn_signin;


	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Actions
	public void Enterusername(String EmailText) {
		Username.sendKeys(EmailText);
	}

	public void EnterPassword(String PasswordText) {
		Password.sendKeys(PasswordText );
	}


	public void click_acceptcookies()
	{
		Acceptcookies.click();
	}







	/*	public boolean ForgottenPassword_visible()
	{
		boolean ForgotpaswordLink = ForgottenpasswordLink.isDisplayed();
		return ForgotpaswordLink;
	} */




	public String Pagetiitle_loginpage()
	{
		return driver.getTitle();
	}

	public void Click_PropertymanagerLogin()
	{
		PropertymanagerLogin.click();

	}

	public void Click_SignInButton()
	{
		btn_signin.click();
	}

}
