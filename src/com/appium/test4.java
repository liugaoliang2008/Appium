package com.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class test4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workSpace\\tool\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.baidu.com/");
		String js ="arguments[0].click();";
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.id("kw")).sendKeys("JAVA");
		WebElement searchButton = driver.findElement(By.id("su"));
		((JavascriptExecutor) driver).executeScript(js,searchButton);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();


		
	}
	

}
