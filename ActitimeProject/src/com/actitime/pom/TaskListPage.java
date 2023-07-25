package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class TaskListPage {

	@FindBy(xpath = "//div[@class=\"addNewButton\"]")
	public WebElement addNewBtn;

	@FindBy(xpath = "//div[@class=\"item createNewCustomer\"]")
	public WebElement newCustomerBtn;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	public WebElement customerName;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	public WebElement customerDescription;

	@FindBy(xpath = "//div[text()='- Select Customer -']")
	public WebElement selectDropDown;

	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	public WebElement selectBigBangCompany;

	@FindBy(xpath = "//div[text()='Create Customer' ]")
	public WebElement createBtn;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
	public WebElement actualCustName;

	@FindBy(xpath = "//div[text()='+ New Project']")
	public WebElement newProjectBtn;

	@FindBy(xpath = "//input[@placeholder='Enter Project Name' and @class='projectNameField inputFieldWithPlaceholder inputNameField' ]")
	public WebElement projectName;

	@FindBy(xpath = "//div[@class='comboboxButton']/div[@class='dropdownButton']")
	public WebElement projectDropDown;

	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	public WebElement selectProjectDropDown;

	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	public WebElement projectDescription;

	@FindBy(xpath = "//div[text()='Create Project']")
	public WebElement createProjectBtn;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
	public WebElement actualProjectName;

	@FindBy(xpath = "//div[@class='item createNewTasks']")
	public WebElement newTaskBtn;

	@FindBy(xpath = "(//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'])[4]")
	public WebElement taskName;

	@FindBy(xpath = "//div[text()='Create Tasks']")
	public WebElement createTask;

	@FindBy(xpath = "//div[@class='namesCell_taskManagement']")
	public WebElement actualTaskName;

	public WebElement getCreateTask() {
		return createTask;
	}

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getCustomerDescription() {
		return customerDescription;
	}

	public WebElement getSelectDropDown() {
		return selectDropDown;
	}

	public WebElement getSelectBigBangCompany() {
		return selectBigBangCompany;
	}

	public WebElement getCreateBtn() {
		return createBtn;
	}

	public WebElement getActualCustName() {
		return actualCustName;
	}

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getProjectDropDown() {
		return projectDropDown;
	}

	public WebElement getSelectProjectDropDown() {
		return selectProjectDropDown;
	}

	public WebElement getProjectDescription() {
		return projectDescription;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getActualProjectName() {
		return actualProjectName;
	}

	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}

	public WebElement getTaskName() {
		return taskName;
	}

	public WebElement getActualTaskName() {
		return actualTaskName;
	}

}
