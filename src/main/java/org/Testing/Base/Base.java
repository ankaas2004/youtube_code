package org.Testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

public ChromeDriver page;
public Properties pr;
	
	@BeforeMethod
	public void launch() throws IOException
	{
		page = new ChromeDriver();
		page.get("https://www.youtube.com");
		Options op = page.manage();
		Window w= op.window();
		w.maximize();
		File f = new File("..///Yourtubeframework/objectRepository.properties");
		FileInputStream fi = new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
		
	}
	
	/*@AfterMethod
	public void close()
	{
		page.close();
	}*/
}
