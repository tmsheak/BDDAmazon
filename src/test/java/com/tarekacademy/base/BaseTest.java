package com.tarekacademy.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 Write all the common method related to Test: Open browser, maximize, assertion,
 * constructor and driver involved here Super Constructor will provide the driver,
 *  app url , proxy, ssl, headless, Browser related.
 *  
 *****************BaseTest will extends by loginTest*********** 
 *   
 * Declaring Static ==> To access from other class       */

public class BaseTest {
	public static WebDriver driver;
	public static ChromeOptions chromeCaps;
	public static EdgeOptions edgeCaps;
	
	private static final long LONG_TEN = 10; // constant  
	private static final long LONG_FIFTY = 50; // constant
	private static final int PROXY_PORT_INT = 8080;
	private static final String PROXY_SERVER = "www.amazon.ad.bd";  
	private static final String gridServerURL = "www.amazon.ad.bd.sandbox"; 
	public static final String APPURL = "https://www.amazon.com/";
	
	// chrome() ==> opening https://www.amazon.com/
	public static WebDriver chrome() {  
		
		// browser have lots of options, there are some 
		chromeCaps = new ChromeOptions(); 
		chromeCaps.setCapability("EnableNativeEvent", false);
		chromeCaps.setCapability("ignoreZoomSetting", true);
		chromeCaps.setCapability("ignoreProtectedMoodSetting", false);
		chromeCaps.addArguments("enable-automation");
		chromeCaps.addArguments("--disable-extensions");
		chromeCaps.addArguments("--dns-prefetch-disable");
		chromeCaps.addArguments("--disable-gpu");   //Graphical processor unit
		chromeCaps.addArguments("--long-level=3");
		chromeCaps.addArguments("--silent");
		chromeCaps.setPageLoadStrategy(PageLoadStrategy.EAGER);   //EAGER: As soon as possible 
		// chromeCaps.setHeadless(true);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeCaps);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(LONG_TEN));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(LONG_FIFTY));		
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(LONG_TEN));
		
		// opening  : APPURL = https://www.amazon.com/
		driver.get(APPURL); 
		driver.manage().window().maximize();
		return driver;

	}


	public static WebDriver ChromeRemoteServer() throws MalformedURLException {
		Proxy proxy = new Proxy();  //import from selenium
		proxy.setSslProxy(PROXY_SERVER + ":" + PROXY_PORT_INT);
		proxy.setFtpProxy(PROXY_SERVER + ":" + PROXY_PORT_INT);
		proxy.setHttpProxy(PROXY_SERVER + ":" + PROXY_PORT_INT);
		ChromeOptions options = new ChromeOptions();
		options.setCapability("proxy", proxy);
		
		 // This will open remote server
		driver = new RemoteWebDriver(new URL(gridServerURL), options);  
		((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(LONG_TEN));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(LONG_FIFTY));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(LONG_TEN));
		
		
		driver.get(APPURL);
		driver.manage().window().maximize();
		return driver;

	} 

	public static WebDriver edge() {   

		edgeCaps = new EdgeOptions(); // EdgeOptions is a class, are giving all edgeCaps
		edgeCaps.setCapability("EnableNativeEvent", false);
		edgeCaps.setCapability("ignoreZoomSetting", true);
		edgeCaps.setCapability("ignoreProtectedMoodSetting", false);
		edgeCaps.addArguments("enable-automation");
		edgeCaps.addArguments("--disable-extensions");
		edgeCaps.addArguments("--dns-prefetch-disable");
		edgeCaps.addArguments("--disable-gpu");
		edgeCaps.addArguments("--long-level=3");
		edgeCaps.addArguments("--silent");
		edgeCaps.setPageLoadStrategy(PageLoadStrategy.EAGER);
		// edgeCaps.setHeadless(true);

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(edgeCaps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(LONG_TEN));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(LONG_FIFTY));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(LONG_TEN));
		driver.get(APPURL);
		driver.manage().window().maximize();
		return driver;

	} 
            
	/**
	 *IF YOU WRITE BELOW TWO BLOCK OF CODE, IT WILL BE EASY TO DEBUG,
	 * OTHERWISE YOU CAN JUST WRITE: driver.quit();
	 */
	public boolean ifDriverNull() {
		if (driver == null) {
			System.out.println("Driver Null");
			return true;
		} else {
			System.out.println("Driver Exist");
			return false;
		}
	}
	public void closeApplication() {    // closeApplication()    ==> Reusable method
		if (ifDriverNull() == false) {
			driver.quit();
		}
	}
}
	


