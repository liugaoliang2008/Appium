package com.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


public class test {
	public static  AppiumDriver driver;
	public static void main(String[] args){
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformVersion", "5.1.1");
		cap.setCapability("unicodeKeybord", "true");
		cap.setCapability("resetKeyboard", "true");
		cap.setCapability("appPackage", "com.netease.yanxuan");
		cap.setCapability("appActivity", "com.netease.yanxuan.module.splash.SplashActivity");
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementById("com.netease.yanxuan:id/tv_home_search").click();
		driver.findElementById("com.netease.yanxuan:id/tv_home_search").sendKeys("123");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
     
		
	}

}
