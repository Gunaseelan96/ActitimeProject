package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(xpath = "//a[@class='logout']")//a[text()='Logout' and @id='logoutLink']
	private WebElement logOutBtn;
	
	@FindBy(xpath ="//div[text()='Tasks']")
	public WebElement taskLink;
	
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogOut() {
		logOutBtn.click();
	}
	
	public void SetTaskLink() {
		taskLink.click();
	}
}
