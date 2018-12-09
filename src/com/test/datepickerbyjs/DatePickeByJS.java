package com.test.datepickerbyjs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickeByJS {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement date = driver.findElement(By.id("hp-widget__depart"));
		String dateValue = "9 Dec, Sun";
		selectDateByJS(driver, date, dateValue);
	}

	public static void selectDateByJS(WebDriver driver, WebElement elem, String dateValue) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", elem);

	}

}
