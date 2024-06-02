package org.Testing.testscripts;

import java.util.concurrent.TimeUnit;

import org.Testing.Base.Base;
import org.Testing.Pages.Library;
import org.Testing.Pages.Loginpage;
import org.Testing.Pages.Watchlater;
import org.testng.annotations.Test;

public class TC8 extends Base
{


	@Test
	public void videoplay() throws InterruptedException
	{
		page.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Loginpage loginobj=new Loginpage(page, pr);
		loginobj.login();
		Library libraryobj = new Library(page, pr);
		libraryobj.librarymethod();
		//Logoutpage logoutobj=new Logoutpage(page, pr);
		//logoutobj.logout1();

}
}