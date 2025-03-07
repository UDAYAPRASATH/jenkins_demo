package org.framework.selenium.design;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface Browser {
	
	
	public void startApp(String url,boolean headless);
	
	public void startApp(String browser,String url,boolean headless);
	
	public WebElement locateElement(Locators locator,String value);
	
	public WebElement locateElement(String value);
	
	public List<WebElement>locateElements(String value);
	
	public List<WebElement>locateElements(Locators locator,String value);
	
	public void switchToAlert();
	
	public void acceptAlert();
	
	public void dismissAlert();
	
	public void textingAlert(String text);
	
	public String getAlertText();
	
	public void switchToFrame(int index);
	
	public void switchToFrame(String idOrName);
	
	public void switchtoFrame(WebElement element);
	
	public void defaultContent();
	
	public void parentFrame();
	
	public void switchToWindow(String title);
	
	public void switchToWindow(int indexOfHandles);
	
	public boolean verifyurl(String url);
	
	public boolean verifyTitle(String title);
	
	public void close();
	
	public void quit();
	

}
