package com.framework.selenium.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverAndWaitInitiation {
	
   private static  final ThreadLocal<WebDriverWait> wait=new ThreadLocal<WebDriverWait>();
   private static final ThreadLocal<RemoteWebDriver> driver= new ThreadLocal<RemoteWebDriver>();
   
   public void setWait() {
	   wait.set(new WebDriverWait(getDriver(),Duration.ofSeconds(30)));
   }
   
   public WebDriverWait getWait()
   {
	   return wait.get();
   }
   
   public void setDriver(String browser,boolean headless)
   {
	   switch(browser) {
	   case "chrome":
		   driver.set(new ChromeDriver());
		   break;
	   case "firefox":
		   driver.set(new FirefoxDriver());
		   break;
	   case "safari":
		   driver.set(new SafariDriver());
		   break;
	   case "edge":
		   driver.set(new EdgeDriver());
		   break;
	   case "ie":
		   driver.set(new InternetExplorerDriver());
		   break;
	   default:
		   break;
		   
	   
	   }
   }
   
   public RemoteWebDriver getDriver()
   {
	   return driver.get();
   }

}
