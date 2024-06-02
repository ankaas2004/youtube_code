package org.Testing.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	
	ChromeDriver page;
	Properties pr;
	public Loginpage(ChromeDriver page, Properties pr) 
	{
	this.page=page;
	this.pr=pr;
	}

	public void login()
	{
		WebElement login = page.findElement(By.xpath(pr.getProperty("login")));
		login.click();
		WebElement email = page.findElement(By.name(pr.getProperty("email")));
		email.sendKeys("dummytestingproject.23@gmail.com");
		WebElement nextbutton = page.findElement(By.id(pr.getProperty("nextbutton" )));
		nextbutton.click();
		WebElement password = page.findElement(By.name(pr.getProperty("password")));
		password.sendKeys("Welcome-23");
		page.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement nextbutton1= page.findElement(By.id(pr.getProperty("nextbutton1")));
		nextbutton1.click();	
	}
}
