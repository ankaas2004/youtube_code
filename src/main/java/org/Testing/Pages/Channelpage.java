package org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Channelpage {
	
	ChromeDriver page;
	Properties pr;
	
	public Channelpage(ChromeDriver page, Properties pr)
	{
		this.page=page;
		this.pr=pr;
	}

	public void channelbutton()
	{
	
		WebElement channelbutton1=page.findElement(By.id("subscribe-button-shape"));
		channelbutton1.click();
		WebElement videobutton = page.findElement(By.xpath(pr.getProperty("videobutton")));
		videobutton.click();

	}
}
