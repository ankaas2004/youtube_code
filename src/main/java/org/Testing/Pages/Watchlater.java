package org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Watchlater 
{
	ChromeDriver page;
	Properties pr;

	public Watchlater(ChromeDriver page , Properties pr) 
	{
		this.page=page;
		this.pr=pr;
		
	}
	public void watchlatermethod()
	{
		WebElement watchlaterbutton= page.findElement(By.xpath("//a[@title='Watch later']"));
		watchlaterbutton.click();
		
	}
}
