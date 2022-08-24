package com.EducationalDomain.Wipro.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitPage {
	
	@FindBy(xpath="(//a[text()='munit testing '])[2]")
	private WebElement junit;
	
	public JunitPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getJunit() {
		return junit;
	}
	
	

}
