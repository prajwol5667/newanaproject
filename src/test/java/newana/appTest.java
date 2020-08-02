package newana;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class appTest {
	
		public static void main(String[] args) {
			try {
				test1();
			}catch(Exception exc) {
				exc.getCause();
			}
			
		}
	
	
	public static void test1() throws MalformedURLException{
	 
	// Create object of  DesiredCapabilities class and specify android platform
	DesiredCapabilities capabilities=new DesiredCapabilities();
	 
	 
	// set the capability to execute our test in Android Platform
	   capabilities.setCapability("udid","a6e4479c");
	 
	// we need to define platform name
	  capabilities.setCapability("platformName","Android");
	 
	// Set the device name as well (you can give any name)
	 capabilities.setCapability("deviceName","my phone");
	 
	 // set the android version as well 
	   capabilities.setCapability("platformVersion","10");
	   
	   capabilities.setCapability("appPackage", "com.skyappprod");
	   
	   capabilities.setCapability("appActivity", "com.skyapp.MainActivity");
	   
	   capabilities.setCapability("noReset", "true");
	 
	 // Create object of URL class and specify the appium server address
	 URL url= new URL("http://127.0.0.1:4723/wd/hub");
	 
	// Create object of  AndroidDriver class and pass the url and capability that we created
	 WebDriver driver = new AndroidDriver(url, capabilities);
	 
	System.out.println("app started .....");
	driver.quit();
	 
	 
	 
	 
	}

}
