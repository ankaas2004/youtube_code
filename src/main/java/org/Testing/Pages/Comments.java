package org.Testing.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comments {

	ChromeDriver page;
	Properties pr;
	
	public Comments(ChromeDriver page, Properties pr)
	{
	this.page=page;
	this.pr=pr;
	}
	
	public void comments1() throws InterruptedException
	{
		WebElement searchtextbox=page.findElement(By.xpath(pr.getProperty("searchtextbox")));
		searchtextbox.sendKeys("Sundays with Me");
		WebElement searchbutton = page.findElement(By.id(pr.getProperty("searchbutton")));
		searchbutton.click();
		Thread.sleep(1000);
		WebElement title=page.findElement(By.xpath(pr.getProperty("URL1")));
		title.click();	
		page.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement addcomment1=page.findElement(By.xpath("//yt-formatted-string[@id='simplebox-placeholder']"																																																																																															));
		addcomment1.click();
		WebElement addcomment=page.findElement(By.xpath(pr.getProperty("addcomment")));
		addcomment.click();
		addcomment.sendKeys("comment");
		WebElement commentbutton = page.findElement(By.xpath("//ytd-button-renderer[@id='submit-button']"));
		commentbutton.click();
	}
}
