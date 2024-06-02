package org.Testing.testscripts;

import java.util.concurrent.TimeUnit;

import org.Testing.Base.Base;
import org.Testing.Pages.Channelpage;
import org.Testing.Pages.Comments;
import org.Testing.Pages.Loginpage;
import org.Testing.Pages.Logoutpage;
import org.Testing.Pages.Searchpage;
import org.testng.annotations.Test;

public class TC6 extends Base {
	
	
		@Test
		public void videoplay() throws InterruptedException
		{
			page.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Loginpage loginobj=new Loginpage(page, pr);
			loginobj.login();
			page.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Comments commentobj= new Comments(page, pr);
			commentobj.comments1();
			Logoutpage logoutobj=new Logoutpage(page, pr);
			logoutobj.logout1();

	}

}