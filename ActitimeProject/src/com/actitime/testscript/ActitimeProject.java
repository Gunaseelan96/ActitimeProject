package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;

import dev.failsafe.internal.util.Assert;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ActitimeProject extends BaseClass {

	@Test
	public void customerModule() throws EncryptedDocumentException, IOException {
		FileLib f = new FileLib();
		String custName = f.getExcelData("./data/CustomerModuleData.xlsx", "hello", 4, 5);
		String custDest = f.getExcelData("./data/CustomerModuleData.xlsx", "hello", 4, 6);

		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.SetTaskLink();

		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerBtn().click();
		t.getCustomerName().sendKeys(custName);
		t.getCustomerDescription().sendKeys(custDest);
		t.getSelectDropDown().click();
		t.getSelectBigBangCompany().click();
		t.getCreateBtn().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustName(), custName));

		String actualTxt = t.getActualCustName().getText();
		org.testng.Assert.assertEquals(actualTxt, custName);
	}

	@Test
	public void projectModule() throws EncryptedDocumentException, IOException {

		FileLib f = new FileLib();
		String projectName = f.getExcelData("./data/ProjectModuleData.xlsx", "CreateCustomer", 4, 5);
		String projectDescription = f.getExcelData("./data/ProjectModuleData.xlsx", "CreateCustomer", 4, 6);

		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.SetTaskLink();

		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewProjectBtn().click();
		t.getProjectName().sendKeys(projectName);
		t.getProjectDropDown().click();
		t.getSelectProjectDropDown().click();
		t.getProjectDescription().sendKeys(projectDescription);
		t.getCreateProjectBtn().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualProjectName(), projectName));

		String actualprojectName = t.getActualProjectName().getText();
		org.testng.Assert.assertEquals(actualprojectName, projectName);
	}

	@Test
	public void taskModule() throws EncryptedDocumentException, IOException {
		FileLib f = new FileLib();
		String TaskName = f.getExcelData("./data/TaskModuleData.xlsx", "CreateCustomer", 4, 5);

		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.SetTaskLink();

		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewTaskBtn().click();
		t.getTaskName().sendKeys(TaskName);
		t.getCreateTask().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualTaskName(), TaskName));

		String actualTaskName = t.getActualTaskName().getText();
		org.testng.Assert.assertEquals(actualTaskName, TaskName);
	}
}
