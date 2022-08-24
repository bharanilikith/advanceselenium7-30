package com.EducationalDomain.Wipro.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement play;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playvideo() throws InterruptedException {
		play.click();
		Thread.sleep(3000);
		pause.click();
	}
	
	
	public void addtowishist() {
		addtowishlist.click();
	}

}
