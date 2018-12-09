package com.test.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableTest {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		

		String before_xpath = ".//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[1]/input";

		for (int i = 4; i < 24; i++) {
			String name = driver.findElement(By.xpath(before_xpath+ i +after_xpath)).getText();
			System.out.println(name);
		}
	}
}
