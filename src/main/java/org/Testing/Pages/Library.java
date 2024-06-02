package org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library
{
  ChromeDriver page;
  Properties pr;
  
  public Library(ChromeDriver page, Properties pr) 
  {
	this.page=page;
	this.pr=pr;
  }
  public void librarymethod()
  {
	WebElement librarybutton = page.findElement(By.xpath("//a[@title='You' and @class='yt-simple-endpoint style-scope ytd-mini-guide-entry-renderer']"));
	librarybutton.click();
}
}
