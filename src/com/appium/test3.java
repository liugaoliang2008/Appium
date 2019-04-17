package com.appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class test3 {
	public static void main(String[] args) {
		try {
			//设置自动化相关参数
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        //使用哪种移动平台
	        capabilities.setCapability("platformName", "Android");
	        //启动哪种设备，是真机还是模拟器
	        capabilities.setCapability("deviceName","f3f0e8f9"); 
	        //设置安卓系统版本
	        capabilities.setCapability("platformVersion", "5.1.1");
	        //不要再次安装apk
	        //capabilities.setCapability("noReset",true);
	        //不用重新签名
	        //capabilities.setCapability("noSign",true);
	        //capabilities.setCapability("browserName", "Chrome");
			//设置包名
	        capabilities.setCapability("appPackage","com.android.chrome");
	        //设置activity
	        capabilities.setCapability("appActivity","com.google.android.apps.chrome.ChromeTabbedActivity");
	        //初始化
	        System.out.println("启动浏览器前");
	        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        System.out.println("11111");

			Thread.sleep(2000);
			System.out.println("2222");
			driver.get("https://www.baidu.com");
			System.out.println("3333");
			Thread.sleep(2000);
			driver.findElementById("index-kw").sendKeys("appium");
			driver.findElementById("index-bn").click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
