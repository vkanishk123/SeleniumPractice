package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.LibraryFunctions;

public class jQuery {
	
	public static By RightClickMe = By.xpath("//span[contains(text(),'right click me')]");
	public static By Paste = By.xpath("//span[text()='Paste']");
	public static By Copy = By.xpath("//span[text()='Copy']");
	public static By Frame = By.id("content");
	public static By DoubleClickBox = By.id("doubleClickBtn");
	public static By Draggable = By.id("column-a");
	public static By Droppable = By.id("column-b");

	
	public void clickAction(By element) {
		LibraryFunctions.driver.findElement(element).click();;
	}
	

}
