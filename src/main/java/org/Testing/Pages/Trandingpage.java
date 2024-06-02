package org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trandingpage 
{
	ChromeDriver page;
	Properties pr;
	
	public Trandingpage(ChromeDriver page,Properties pr)
	{
	this.page=page;
	this.pr=pr;
	}
	public void trandingpage1()
	{
		WebElement stylebutton = page.findElement(By.id(pr.getProperty("stylebutton")));
		stylebutton.click();
		WebElement trandingbutton = page.findElement(By.xpath(pr.getProperty("trandingbutton")));
		trandingbutton.click();	
	}
}
