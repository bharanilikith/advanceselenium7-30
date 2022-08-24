package com.EducationalDomain.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EducationalDomain.Wipro.PomPages.CorejavaPage;
import com.EducationalDomain.Wipro.PomPages.LoginPage;
import com.EducationalDomain.Wipro.PomPages.WishlistPage;
import com.EducationalDomain.Wipro.genericLib.BaseClass;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException {
	test=reports.createTest("tc3");
	
	LoginPage lp=new LoginPage(driver);
	CorejavaPage c = lp.searchcourse(driver,fu.getPropertyFile("cn"));
	WishlistPage ad = c.corejavaselenium(driver);
	utilies.switchframe(driver);
	ad.playvideo();
	
	utilies.switchBackfromFrame(driver);
	ad.addtowishist();
	
	Assert.assertEquals(driver.getTitle(),fu.getPropertyFile("title"));
	}

}
