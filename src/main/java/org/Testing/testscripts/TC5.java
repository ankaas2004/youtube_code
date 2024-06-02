package org.Testing.testscripts;

import java.util.concurrent.TimeUnit;

import org.Testing.Base.Base;
import org.Testing.Pages.Channelpage;
import org.Testing.Pages.Loginpage;
import org.Testing.Pages.Logoutpage;
import org.Testing.Pages.Searchpage;
import org.Testing.Pages.Videopage;
import org.testng.annotations.Test;
//Login + Video play + Channlen  Like + Logout
public class TC5 extends Base

{
	@Test
	public void videoplay() throws InterruptedException
	{
		page.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Loginpage loginobj=new Loginpage(page, pr);
		loginobj.login();
		page.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Searchpage searchobj=new Searchpage(page, pr);
		searchobj.searchvideo();
		Channelpage channelpageobj = new Channelpage(page, pr);
		channelpageobj.channelbutton();
		page.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Logoutpage logoutobj=new Logoutpage(page, pr);
		//logoutobj.logout1();

}
}