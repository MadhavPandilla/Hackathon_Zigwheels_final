package com.zigwheels.Pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zigwheels.Factory.BaseClass;
import com.zigwheels.Utilities.ExcelUtils;

public class Login extends BasePage {
	public Login(WebDriver driver) {
		super(driver);// Invoking the properties of parent class
	}

	String File = System.getProperty("user.dir") + "/src/test/resources/Excel/Book1.xlsx";
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	@FindBy(id = "forum_login_wrap_lg")
	WebElement signin;

	@FindBy(xpath = "(//div[@class='newgf-login'])[2]")
	WebElement google;

	@FindBy(id = "identifierId")
	WebElement gmail;

	@FindBy(xpath = "(//div[@class='VfPpkd-RLmnJb'])[3]")
	WebElement click;

	@FindBy(xpath = "//div[@class='LXRPh']/div/div")
	WebElement error;

	@FindBy(xpath = "//*[@id=\"Header\"]/div/div[1]/div[1]/a/img")
	WebElement Homepage;

	@FindBy(id = "report_submit_close_login")
	WebElement closelogin;

//	Clicking on google
	public void Google() throws InterruptedException {
		google.click();
	}

//	Sending invalid gmail account details 
	public void invaliddetailsemail() throws InterruptedException, IOException {
		Set<String> y = new HashSet<String>();
		y = driver.getWindowHandles();
		List<String> m = new ArrayList<String>(y);
		String d = m.get(1);
		driver.switchTo().window(d);// switching driver
		gmail.sendKeys(BaseClass.getProperties().getProperty("username"));
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// scrolling till end to click next button
		js.executeScript("arguments[0].click();", click);// clicking on next button
	}

//	Capturing the error message
	public void invalidusername() throws IOException {
		String error1 = error.getText();
		System.out.println("*************Error Message***********");
		System.out.println(error1);
		ExcelUtils.setCellData(File, "Invalid Email", 0, 0, "Error Message for Invalid Email");
		ExcelUtils.fillBlueColor(File, "Invalid Email", 0, 0);// excel
		ExcelUtils.setCellData(File, "Invalid Email", 1, 0, error1);
		driver.close();
	}

// Closing the login page
	public void close() {
		Set<String> y = new HashSet<String>();
		y = driver.getWindowHandles();
		List<String> m = new ArrayList<String>(y);
		String q = m.get(0);
		driver.switchTo().window(q);
		closelogin.click();
	}

// Navigating Back to Homepage
	public void navigatingbacktohomepage() {
		Homepage.click();
	}
}
