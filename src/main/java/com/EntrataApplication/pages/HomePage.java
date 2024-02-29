package com.EntrataApplication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	WebDriver driver;

	@FindBy(xpath="//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	private WebElement ProductDropMenu;

	@FindBy(xpath="//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
	private WebElement SolutionDropDown;

	@FindBy(xpath = "//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]")
	private WebElement ResourseLink;

	@FindBy(xpath =  "//div[@class='header-nav-item']//a[@class='main-nav-link'][normalize-space()='Base Camp']")
	private WebElement Basecamp_Link;

	@FindBy(xpath = "//a[@class='button-default outline-dark-button']")
	private WebElement signin;

	@FindBy(xpath = "//a[@class='button-default solid-dark-button'][1]")
	private WebElement watchdemo;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Actions

	public void clickonProductDropdown() {
		ProductDropMenu.click();

	}

	public void ClickOnSolutionDropdwon()
	{
		SolutionDropDown.click();
	}

	public void clickOnresourseLink()
	{
		ResourseLink.click();
	}

	public void clickOnBaseCamp()
	{
		Basecamp_Link.click();
	}

	public LoginPage SelectLoginOpetion() {
		signin.click();
		return new LoginPage(driver);
	}

	public String Homepage_tiitle()
	{
		return driver.getTitle();
	}

	public boolean ProductDropdownmenu_Vsibility()
	{
		return ProductDropMenu.isDisplayed();
	}

	public boolean SolutionDropdown_Visibility()
	{
		return SolutionDropDown.isDisplayed();
	}

	public boolean ResourseLink_Visiblity()
	{
		return ResourseLink.isDisplayed();
	}

	public boolean BaseCampLink_Visibility()
	{
		return Basecamp_Link.isDisplayed();
	}

	public boolean SignIn_visiblity()
	{
		return signin.isDisplayed();
	}

	public boolean WatchDemo_visiblity()
	{
		return watchdemo.isDisplayed();
	}


}
