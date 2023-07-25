package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
   
	@BeforeTest
	public void openBrowser(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void logIn() throws IOException{
		FileLib f=new FileLib();
		String url = f.getPropertyData("./data/commonData.property", "Url");
		String un = f.getPropertyData("./data/commonData.property", "Username");
		String pw = f.getPropertyData("./data/commonData.property", "Password");
		driver.get(url);
		LoginPage l= new LoginPage(driver);
		l.setLogin(un, pw);
		
	}
	
	@AfterMethod
	public void logOut() {
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.setLogOut();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}
	
	
	
	
}
