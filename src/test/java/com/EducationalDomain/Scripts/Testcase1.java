package com.EducationalDomain.Scripts;

import javax.swing.text.Utilities;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.EducationalDomain.Wipro.PomPages.AddtocartPage;
import com.EducationalDomain.Wipro.PomPages.LoginPage;
import com.EducationalDomain.Wipro.PomPages.SkillraryDemoLoginPage;
import com.EducationalDomain.Wipro.genericLib.BaseClass;


public class Testcase1 extends BaseClass{
	@Test
	public void testcase1() {
		test=reports.createTest("testcase1");
		LoginPage l=new LoginPage(driver);
		SkillraryDemoLoginPage hp = l.demoApp(driver);
		utilies.switchTabs(driver);
		utilies.mouseHover(driver,hp.getCoursebtn());
		AddtocartPage cart = hp.couse(driver);
		utilies.doubleclick(driver,cart.getAddbtn());
		cart.getAddtocartbtn().click();
		utilies.alertPopupok(driver);
	}

}
