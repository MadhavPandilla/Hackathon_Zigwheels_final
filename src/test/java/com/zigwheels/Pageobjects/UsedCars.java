package com.zigwheels.Pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zigwheels.Utilities.ExcelUtils;

public class UsedCars extends BasePage {

	public UsedCars(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//a[@class='c-p'])[4]")
	WebElement usedcars;

	@FindBy(xpath = "(//span[contains(text(),'Chennai')])[1]")
	WebElement chennai;

	@FindBy(xpath = "//div[@class='gsc_thin_scroll']/ul/li")
	List<WebElement> popularmodels;

	@FindBy(xpath = "//a[@class='fnt-22 zm-cmn-colorBlack n zw-sr-headingPadding clickGtm saveslotno']")
	List<WebElement> carname;

	@FindBy(xpath = "//span[@class='zw-cmn-price n pull-left mt-3']")
	List<WebElement> carprice;

	@FindBy(xpath = "//span[@class='zc-7 fnt-14 uLm block']")
	List<WebElement> carcity;

	@FindBy(xpath = "//input[@class='carmmCheck']")
	List<WebElement> popular;

	@FindBy(xpath = "//span[@class='uFm text-center zw-cmn-cursorPointer']")
	WebElement filter;

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	Actions act = new Actions(driver);
	String File = System.getProperty("user.dir") + "/src/test/resources/Excel/Book1.xlsx";

//	List of all popular models of used cars
	public void Popularmodels() throws IOException, InterruptedException {
		js.executeScript("arguments [0].scrollIntoView();", filter);
		int m = 0;
		ExcelUtils.setCellData(File, "Popular Models", m, 0, "Popular Models");
		ExcelUtils.fillBlueColor(File, "Popular Models", m, 0);
		m += 1;
		for (WebElement l : popularmodels) {
			String h = l.getText();
			ExcelUtils.setCellData(File, "Popular Models", m, 0, h);
			System.out.println(l.getText());
			m += 1;
		}
	}

// Clicking on each popular models and extracting all cars of clicked model
	public void popularmodelslist() throws InterruptedException, IOException {
		System.out.println("*************All the cars of clicked popular model************");
		for (int i = 0; i < popular.size(); i++) {
			System.out.println(popularmodels.get(i).getText());
			System.out.println("....................................");
			String popular1 = popularmodels.get(i).getText();
			ExcelUtils.setCellData(File, popular1, 0, 0, "Car Name");
			ExcelUtils.setCellData(File, popular1, 0, 1, "Car Price");
			ExcelUtils.setCellData(File, popular1, 0, 2, "Location");
			ExcelUtils.fillBlueColor(File, popular1, 0, 0);
			ExcelUtils.fillBlueColor(File, popular1, 0, 1);
			ExcelUtils.fillBlueColor(File, popular1, 0, 2);
			js.executeScript("arguments [0].scrollIntoView();", filter);
			js.executeScript("arguments [0].click();", popular.get(i));
			Thread.sleep(5000);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			int row = 1;
			for (int j = 0; j < carname.size(); j++) {
				System.out.print(j + 1);
				System.out.println(" ." + carname.get(j).getText());
				String name = carname.get(j).getText();
				ExcelUtils.setCellData(File, popular1, row, 0, name);
				System.out.println(carprice.get(j).getText());
				String Price = carprice.get(j).getText();
				ExcelUtils.setCellData(File, popular1, row, 1, Price);
				try { // Location of the car
					System.out.println(carcity.get(j).getText());
					String loc = carcity.get(j).getText();
					ExcelUtils.setCellData(File, popular1, row, 2, loc);
				} catch (Exception e) {
					ExcelUtils.setCellData(File, popular1, row, 2, "Not Available");
				}
				row += 1;
			}
			row = 1;
			System.out.println("....................................");
			js.executeScript("arguments [0].click();", popular.get(i));
			Thread.sleep(5000);
		}
	}

//	Clicking on popular model maruthi 800 car
	public void clickingfilter() throws InterruptedException {
		js.executeScript("arguments [0].click();", popular.get(0));
		Thread.sleep(5000);
	}

//	Maruthi 800 cars in popular model
	public void carinformation() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		for (int j = 0; j < carname.size(); j++) {
			System.out.print(j + 1);
			System.out.println(" ." + carname.get(j).getText());
			System.out.println(carprice.get(j).getText());
			try {
				System.out.println(carcity.get(j).getText());
			} catch (Exception e) {
			}
		}
	}

}
