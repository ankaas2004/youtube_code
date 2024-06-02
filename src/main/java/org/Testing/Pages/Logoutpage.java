package org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoutpage {
	
	ChromeDriver page;
	Properties pr;
	public Logoutpage(ChromeDriver page,Properties pr)
	{
	this.page=page;
	this.pr=pr;
	}
	public void logout1() 
	{
		WebElement accountmenu = page.findElement(By.xpath(pr.getProperty("accountmenu")));
		accountmenu.click();
		WebElement logoutbutton = page.findElement(By.xpath(pr.getProperty("logoutbutton")));
		logoutbutton.click();
	}

}
