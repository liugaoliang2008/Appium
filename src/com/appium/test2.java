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
		cap.setCapability("deviceName", "705eee66");// С��5��705eee66
													// vivo:f3f0e8f9
		// cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("unicodeKeybord", "true");// ����Unicode���뷨������Ϊtrue�������������ַ���Ĭ��Ϊfalse
		// ���趨��`unicodeKeyboard`�ؼ�������Unicode���Խ����󣬽���������Ϊ��ԭʼ״̬
		// �������ʹ�ã����ᱻ���ԣ�Ĭ��ֵ`false`
		// cap.setCapability("resetKeyboard", "true");
		// ����Ϊtrue��ÿ������ʱ����session������ڶ������лᱨ�����½�session
		// cap.setCapability("sessionOverride", true);
		// cap.setCapability("app", app.getAbsolutePath());
		cap.setCapability("appPackage", "com.sheep.jiuyan.samllsheep");
		cap.setCapability("appActivity",
				"com.sheep.gamegroup.view.activity.SplashAct");

		// cap.setCapability("browserName", "Browser");
		// cap.setCapability("browserName", "Chrome");
		// cap.setCapability("appPackage", "com.android.chrome");// ����app�İ���
		// cap.setCapability("appActivity","com.google.android.apps.chrome.ChromeTabbedActivity");//
		// ����app�����Activity����
		// ��Web�������У�ʹ��native��adb��������ȡ��Ļ��ͼ�������Ǵ���ChromeDriver��Ĭ��Ϊfalse
		// cap.setCapability("nativeWebScreenshot", true);
		// ������ChromeDriver��ҳ���ʱ����ͣ��ChromeDriver�Ự��Ĭ��Ϊfalse
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
		
		driver.findElement(By.name("��������")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("�������")).click();
		driver.findElement(By.id("feedbook_et")).sendKeys("11111");
		

		// driver.openNotifications();//��֪ͨ��
		// driver.runAppInBackground(2);//�л�����̨
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
		// ����������Appium
		driver.findElement(By.id("index-kw")).sendKeys("Appium�ط�");
		// ����ٶ�һ��
		// driver.findElement(By.id("index-bn")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		driver.quit();
		System.out.println("���˳�");

	}

}
