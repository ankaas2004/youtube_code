package org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videopage 
{
ChromeDriver page;
Properties pr;

public Videopage(ChromeDriver page, Properties pr) 
{
	this.page=page;
	this.pr=pr;
}
	public void videoplaybutton() throws InterruptedException
	{
	WebElement likebutton = page.findElement(By.xpath(pr.getProperty("likebutton")));
	likebutton.click();
	WebElement videobutton = page.findElement(By.xpath(pr.getProperty("videobutton")));
	videobutton.click();
	//Thread.sleep(1000);

	}

}
