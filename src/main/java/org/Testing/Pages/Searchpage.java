package org.Testing.Pages;

import java.awt.Desktop.Action;
import java.util.Properties;

import javax.swing.text.TabableView;

import org.apache.logging.log4j.plugins.di.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Searchpage {
	
	ChromeDriver page;
	Properties pr;
	public Searchpage(ChromeDriver page, Properties pr)
	{
		this.page=page;
		this.pr=pr;
	}
	public void searchvideo() throws InterruptedException 
	{
	WebElement searchtextbox=page.findElement(By.xpath(pr.getProperty("searchtextbox")));
	searchtextbox.sendKeys("atoz");
	WebElement searchbutton = page.findElement(By.id(pr.getProperty("searchbutton")));

	searchbutton.click();
	Thread.sleep(1000);
	WebElement title=page.findElement(By.xpath(pr.getProperty("URL")));
	//Actions ac= new Actions(page);
	//ac.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
	title.click();
	}
}
