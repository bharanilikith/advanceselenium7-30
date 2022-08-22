package com.EducationalDomain.Wipro.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUspage {
	@FindBy(name="name")
	private WebElement nametb;
	
	@FindBy(name="sender")
	private WebElement sendertb;
	
	@FindBy(name="subject")
	private WebElement subjecttb;
	
	@FindBy(name="message")
	private WebElement messagetb;
	
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement mailtb;
	
	public ContactUspage(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}
	
	public void sendDetails(String name,String mail,String sub,String msg) {
		nametb.sendKeys(name);
		sendertb.sendKeys(mail);
		subjecttb.sendKeys(sub);
		messagetb.sendKeys(msg);
		mailtb.click();
		
	}

}
