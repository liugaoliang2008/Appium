package com.appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class test3 {
	public static void main(String[] args) {
		try {
			//�����Զ�����ز���
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        //ʹ�������ƶ�ƽ̨
	        capabilities.setCapability("platformName", "Android");
	        //���������豸�����������ģ����
	        capabilities.setCapability("deviceName","f3f0e8f9"); 
	        //���ð�׿ϵͳ�汾
	        capabilities.setCapability("platformVersion", "5.1.1");
	        //��Ҫ�ٴΰ�װapk
	        //capabilities.setCapability("noReset",true);
	        //��������ǩ��
	        //capabilities.setCapability("noSign",true);
	        //capabilities.setCapability("browserName", "Chrome");
			//���ð���
	        capabilities.setCapability("appPackage","com.android.chrome");
	        //����activity
	        capabilities.setCapability("appActivity","com.google.android.apps.chrome.ChromeTabbedActivity");
	        //��ʼ��
	        System.out.println("���������ǰ");
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
