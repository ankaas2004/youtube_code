package org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Historypage 
{
	ChromeDriver page;
	Properties pr;
	public Historypage(ChromeDriver page,Properties pr)
	{
	this.page=page;
	this.pr=pr;
	}
	public void historypage1()
	{
		WebElement stylebutton = page.findElement(By.id(pr.getProperty("stylebutton")));
		stylebutton.click();
		WebElement historybutton = page.findElement(By.xpath(pr.getProperty("historybutton")));
		historybutton.click();		
	}
}
