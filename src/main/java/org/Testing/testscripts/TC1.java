package org.Testing.testscripts;

import java.util.concurrent.TimeUnit;

import org.Testing.Base.Base;
import org.Testing.Pages.Loginpage;
import org.Testing.Pages.Logoutpage;
import org.Testing.Pages.Trandingpage;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC1 extends Base {
	//Login + tranding + Logout
	@Test
	public void tranding() throws InterruptedException
	{
		page.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Loginpage loginobj=new Loginpage(page, pr);
		loginobj.login();
		page.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Trandingpage trandingobj=new Trandingpage(page, pr);
		trandingobj.trandingpage1();
		Logoutpage logoutobj=new Logoutpage(page, pr);
		logoutobj.logout1();
	}	

}
