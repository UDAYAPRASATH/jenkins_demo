package org.framework.selenium.design;

import org.openqa.selenium.WebElement;

public interface Elements {
	
	public void click(WebElement element);
	
	public void sendText(WebElement ele,String text);
	
	public void clear(WebElement ele);
	
	public void clearAndType(WebElement ele,String text);
	
	public boolean verifyEnabled(WebElement element);
	
	public boolean verifySelected(WebElement element);
	
	public boolean verifyDisplayed(WebElement element);
	
	public boolean verifyDisappered(WebElement element);
	
	public void selectUsingText(WebElement ele, String text);
	
	public void selectUsingIndex(WebElement ele,int index);
	
	public void selectusingValue(WebElement ele,String value);
	
	

}
