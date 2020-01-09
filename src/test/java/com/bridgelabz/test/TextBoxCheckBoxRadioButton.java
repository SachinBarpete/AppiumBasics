package com.bridgelabz.test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.bridgelabz.base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TextBoxCheckBoxRadioButton extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = setDesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.APP,
				System.getProperty("user.dir") + "/apk/ApiDemo.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, desiredCapabilities);
		Thread.sleep(500);
		// Views
		driver.findElementsById("android:id/text1").get(10).click();
		Thread.sleep(500);
		// Controls
		driver.findElementByAccessibilityId("Controls").click();
		Thread.sleep(500);
		// Dark theme
		driver.findElementByAccessibilityId("2. Dark Theme").click();
		Thread.sleep(500);
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("welcome");
		Thread.sleep(200);
		driver.findElementById("io.appium.android.apis:id/check1").click();
		Thread.sleep(200);
		driver.findElementById("io.appium.android.apis:id/check2").click();
		Thread.sleep(200);
		driver.findElementById("io.appium.android.apis:id/radio1").click();
		Thread.sleep(500);
		driver.findElementById("io.appium.android.apis:id/radio2").click();
		Thread.sleep(500);
		driver.findElementById("io.appium.android.apis:id/spinner1").click();
		Thread.sleep(200);
		driver.findElementsById("android:id/text1").get(2).click();
		Thread.sleep(2000);
		driver.quit();

	}
}