package org.Testing.testscripts;

import java.util.concurrent.TimeUnit;
import org.Testing.Base.Base;
import org.Testing.Pages.Channelpage;
import org.Testing.Pages.Loginpage;
import org.Testing.Pages.Searchpage;
import org.Testing.Pages.Watchlater;
import org.testng.annotations.Test;

public class TC7 extends Base {
	
	
		@Test
		public void videoplay() throws InterruptedException
		{
			page.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Loginpage loginobj=new Loginpage(page, pr);
			loginobj.login();
			Watchlater watchlaterobj= new Watchlater(page, pr);
			watchlaterobj.watchlatermethod();
			page.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Logoutpage logoutobj=new Logoutpage(page, pr);
			//logoutobj.logout1();

	}

}
