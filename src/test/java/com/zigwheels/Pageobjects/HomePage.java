package com.zigwheels.Pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));// Explicit wait
	Actions act = new Actions(driver);// Actions class
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(id = "forum_login_wrap_lg")
	WebElement signin;

	@FindBy(xpath = "(//div[@class='newgf-login'])[2]")
	WebElement google;

	@FindBy(xpath = "//a[contains(text(), 'New Bikes')]")
	WebElement newbikes;

	@FindBy(xpath = "//span[contains(text(), 'Upcoming Bikes')]")
	WebElement upcomingbikes;

	@FindBy(xpath = "(//a[@class='c-p'])[4]")
	WebElement usedcars;

	@FindBy(id = "report_submit_close_login")
	WebElement closelogin;

	@FindBy(id = "headerSearch")
	WebElement search;

	@FindBy(xpath = "//span[@class='h-s-v1 h-srh-i abs i-b c-p']")
	WebElement searching;

	@FindBy(id = "forum_login_title_lg")
	WebElement signinbutton;

	@FindBy(xpath = "//h1[@class=' clr-bl pull-left m-0 pb-15']")
	WebElement honda;

	@FindBy(xpath = "(//span[contains(text(),'Chennai')])[1]")
	WebElement chennai;

	@FindBy(xpath = "//div[@class='h-dd-r']/ul/li")
	List<WebElement> city;

	@FindBy(id = "usedcarttlID")
	WebElement usedcarcity;

	// Verifying the zigwheels page
	public void zigwheelspage() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "New Cars & Bikes, Prices, News, Reviews, Buy & Sell Used Cars - ZigWheels.com");
		System.out.println("Zigwheels Page is Opened without any errors");
	}

	// Method to verify signin button functionality
	public void signinbuttonverification() {
		Boolean signin = signinbutton.isDisplayed();
		Assert.assertEquals(true, signin);
		System.out.println("Login/Signin button is present");
	}

//	clicking on signin 
	public void clickingonsignin() {
		signin.click();
	}

	// Verifying whether signin page displayed or not
	public void verifyingsiginpage() {
		Boolean Google = google.isDisplayed();
		Assert.assertEquals(true, Google);
		System.out.println("Login/Register page is opened");
		closelogin.click();// closing the login page
	}

//	Searching for Honda bikes
	public void searchbutton() {
		search.sendKeys("Honda Bikes");
		searching.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

//	Checking for Honda Bikes
	public void checkingforhondabikes() {
		Boolean Honda = honda.isDisplayed();
		Assert.assertEquals(true, Honda);
		System.out.println("Honda Bikes are present");
	}

	// Checking New Bikes in Header section
	public void newbikeschecking() {
		Boolean Newbikes = newbikes.isDisplayed();
		Assert.assertEquals(true, Newbikes);
		System.out.println("New Bikes is present");
	}

//	Clicking on New Bikes
	public void Newbikes() {
		act.moveToElement(newbikes).perform();
	}

//	Checking the Upcoming bikes present in New Bikes dropdown
	public void upcomingbikes() {
		wait.until(ExpectedConditions.elementToBeClickable(upcomingbikes));
		Assert.assertEquals(true, upcomingbikes.isDisplayed());
		System.out.println("Upcoming bikes option is there");
	}

//	Clicing on used cars in header section
	public void Usedcars2() {
		usedcars.click();
	}

// Verifying the navigation to used cars page
	public void usedcarschecking() {
		String u = driver.getTitle();
		Assert.assertEquals(u, "Used Cars for Sale, Buy Second Hand Cars in India @ Zigwheels");
		System.out.println("Succesfully navigated to used cars");
	}

// 	Mouse Hover Action on used cars
	public void Usedcars1() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		act.moveToElement(usedcars).perform();
	}

//	Clicking on chennai
	public void Chennai() {
		wait.until(ExpectedConditions.elementToBeClickable(chennai));
		act.moveToElement(chennai).click().perform();
	}

//	Clicking on different cities present in header section
	public void city(String c) {
		int size = city.size();
		for (int i = 0; i < size; i++) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			act.moveToElement(usedcars).perform();
			if (c.equalsIgnoreCase(city.get(i).getText())) {
				wait.until(ExpectedConditions.elementToBeClickable(city.get(i)));
				act.moveToElement(city.get(i)).click().perform();
				break;
			}
		}
	}

//	Verifying whether sucessfully navigated to clicked city
	public void check(String h) {
		System.out.println(">>>>>>>>>Regression Test>>>>>>>>>>>>>");
		System.out.println("Successfully Navigated to" + usedcarcity.getText());

	}

}
