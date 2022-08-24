package com.EducationalDomain.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.EducationalDomain.Wipro.PomPages.JunitPage;
import com.EducationalDomain.Wipro.PomPages.LoginPage;
import com.EducationalDomain.Wipro.PomPages.SkillraryDemoLoginPage;
import com.EducationalDomain.Wipro.genericLib.BaseClass;

public class Testcase4 extends BaseClass{
	@Test
	public void tc4() throws FileNotFoundException, IOException, SQLException {
		test=reports.createTest("tc4");
	LoginPage lp=new LoginPage(driver);
	SkillraryDemoLoginPage hp = lp.demoApp(driver);
	utilies.switchTabs(driver);
	utilies.dropdown(hp.getCoursedd(),fu.getPropertyFile("dd"));
	JunitPage j=new JunitPage(driver);
	String query="select * from course";
	String data = fu.queryExecution(query,1,"INR 19.00");
	
	
	}

}
