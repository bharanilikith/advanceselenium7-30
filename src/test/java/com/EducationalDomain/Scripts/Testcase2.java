package com.EducationalDomain.Scripts;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.EducationalDomain.Wipro.PomPages.ContactUspage;
import com.EducationalDomain.Wipro.PomPages.LoginPage;
import com.EducationalDomain.Wipro.genericLib.BaseClass;
import com.EducationalDomain.Wipro.genericLib.Demo;
import com.EducationalDomain.Wipro.genericLib.FileUtilies;

public class Testcase2 extends Demo{
	
	@Test(dataProvider = "readExceldata")
	public void tc2(String name,String mail,String sub,String msg) throws InterruptedException {
		test=reports.createTest("tc2");
		LoginPage lp=new LoginPage(driver);
//		Thread.sleep(5000);
//		Point loc = lp.getContactus().getLocation();
//		int x = loc.getX();
//		int y=loc.getY();
//		 utilies.scrollBar(driver, x, y);
		ContactUspage cp = lp.contact(driver);
		Thread.sleep(4000);
		cp.sendDetails(name, mail, sub, msg);
	}

}
