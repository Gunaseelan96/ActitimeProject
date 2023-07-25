package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id ="username")
	private WebElement usTxtBx;
	
	@FindBy(name ="pwd")
	private WebElement pwdTxtBx;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un, String pw) {
		usTxtBx.sendKeys(un);
		pwdTxtBx.sendKeys(pw);
		loginBtn.click();
	}
}
