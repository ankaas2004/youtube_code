package org.Testing.testscripts;

import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.TimeUnit;

import org.Testing.Base.Base;
import org.Testing.Pages.Historypage;
import org.Testing.Pages.Loginpage;
import org.Testing.Pages.Logoutpage;
import org.Testing.Pages.Subscriptionspage;
import org.testng.annotations.Test;

public class TC3 extends Base{
	//Login + subscriptions + Logout
	@Test
	public void tranding() throws InterruptedException
	{
		page.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Loginpage loginobj=new Loginpage(page, pr);
		loginobj.login();
		page.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Subscriptionspage subscriptionsobj=new Subscriptionspage(page, pr);
		subscriptionsobj.subscriptionpage1();
		Logoutpage logoutobj=new Logoutpage(page, pr);
		logoutobj.logout1();
	}	

}
