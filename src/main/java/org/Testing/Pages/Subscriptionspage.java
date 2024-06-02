package org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subscriptionspage 
{
ChromeDriver page;
Properties pr;

public Subscriptionspage(ChromeDriver page, Properties pr)
{
	this.page=page;
	this.pr =pr;
}

public void subscriptionpage1()
{

	WebElement stylebutton = page.findElement(By.id(pr.getProperty("stylebutton")));
	stylebutton.click();
	WebElement Subscriptionsbutton = page.findElement(By.xpath(pr.getProperty("Subscriptionsbutton")));
	Subscriptionsbutton.click();	
}
}
