package com.EducationalDomain.Wipro.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author QSP
 *
 */
public class LoginPage {
	/**
	 * it is used to store all the login elements
	 */
@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gearsbtn;

@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement skillrarydemoapp;


@FindBy(xpath="//a[text()=' Contact Us ']")
private WebElement contactus;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public SkillraryDemoLoginPage demoApp(WebDriver driver) {
	gearsbtn.click();
	skillrarydemoapp.click();
	return new SkillraryDemoLoginPage(driver);
}

public ContactUspage contact(WebDriver driver) {
	contactus.click();
	return new ContactUspage(driver);
	
}

public WebElement getContactus() {
	return contactus;
}

public WebElement getGearsbtn() {
	return gearsbtn;
}

public WebElement getSkillrarydemoapp() {
	return skillrarydemoapp;
}


}
