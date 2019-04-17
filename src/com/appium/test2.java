package com.appium;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test2 {

	public static void main(String[] args) {
		// File classpathRoot = new File(System.getProperty("user.dir"));
		// File appDir = new File(classpathRoot, "app");
		// File app = new File(appDir, "123.apk");

		AndroidDriver driver = null;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "705eee66");// 小米5：705eee66
													// vivo:f3f0e8f9
		// cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("unicodeKeybord", "true");// 启用Unicode输入法，设置为true可以输入中文字符，默认为false
		// 在设定了`unicodeKeyboard`关键字运行Unicode测试结束后，将键盘重置为其原始状态
		// 如果单独使用，将会被忽略，默认值`false`
		// cap.setCapability("resetKeyboard", "true");
		// 设置为true，每次启动时覆盖session，否则第二次运行会报错不能新建session
		// cap.setCapability("sessionOverride", true);
		// cap.setCapability("app", app.getAbsolutePath());
		cap.setCapability("appPackage", "com.sheep.jiuyan.samllsheep");
		cap.setCapability("appActivity",
				"com.sheep.gamegroup.view.activity.SplashAct");

		// cap.setCapability("browserName", "Browser");
		// cap.setCapability("browserName", "Chrome");
		// cap.setCapability("appPackage", "com.android.chrome");// 被测app的包名
		// cap.setCapability("appActivity","com.google.android.apps.chrome.ChromeTabbedActivity");//
		// 被测app的入口Activity名称
		// 在Web上下文中，使用native（adb）方法获取屏幕截图，而不是代理ChromeDriver，默认为false
		// cap.setCapability("nativeWebScreenshot", true);
		// 移至非ChromeDriver网页浏览时，请停用ChromeDriver会话，默认为false
		// cap.setCapability("recreateChromeDriverSessions", true);

		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
					cap);
			// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		driver.findElement(By.id("login_type_toggle_icon")).click();
		driver.findElement(By.id("user_name_box")).sendKeys("test110");
		driver.findElement(By.id("password_box")).sendKeys("123456");
		// driver.hideKeyboard();
		driver.findElement(By.id("login_btn")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		driver.findElement(By.name("个人中心")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("意见反馈")).click();
		driver.findElement(By.id("feedbook_et")).sendKeys("11111");
		

		// driver.openNotifications();//打开通知栏
		// driver.runAppInBackground(2);//切换至后台
		// driver.removeApp("com.sheep.jiuyan.samllsheep");
/*
		driver.context("WEBVIEW_1");
		driver.get("https://www.baidu.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 搜索框输入Appium
		driver.findElement(By.id("index-kw")).sendKeys("Appium地方");
		// 点击百度一下
		// driver.findElement(By.id("index-bn")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		driver.quit();
		System.out.println("已退出");

	}

}
