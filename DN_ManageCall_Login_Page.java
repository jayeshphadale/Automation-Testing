package Demo.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DN_ManageCall_Login_Page
{

	WebDriver driver;

	public DN_ManageCall_Login_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@FindBy(id = "txtUserName")
	WebElement txt_username;

	@FindBy(id = "txtPassword")
	WebElement txt_password;

	@FindBy(id = "btnLogin")
	WebElement btn_Submit;

	@FindBy(xpath = "//div//h5[@class='page-title']")
	WebElement PageTitle;

	@FindBy(xpath = "//label[@id='lblErrorMsg']")
	WebElement errormsg;

	@FindBy(id = "lblWelcome")
	WebElement welcome;

	@FindBy(id = "LbLoginStatus")
	WebElement logoutButton;

	public boolean isAlertPresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}

	// Method for valid login
	public void Validlogin(String user, String Pwd) throws InterruptedException
	{
		loginAttempt(user, Pwd);
		if (isAlertPresent() == true)
		{
			if (driver.switchTo().alert().getText()
					.contains("User Already Active ! You Want To Logout From Other Devicess?")) {
				driver.switchTo().alert().accept();
				loginAttempt(user, Pwd);
			}
		}
		Assert.assertTrue(PageTitle.isDisplayed(), "ManageCall page did not load successfully.");
		Thread.sleep(2000);
	}

	// Method for wrong Username login
	public void InValidUserlogin(String user, String Pwd) throws InterruptedException
	{
		txt_username.clear();
		txt_password.clear();
		Thread.sleep(1000);
		loginAttempt(user, Pwd);
		if (isAlertPresent() == true)
		{
			if (driver.switchTo().alert().getText()
					.contains("User Already Active ! You Want To Logout From Other Devicess?")) {
				driver.switchTo().alert().accept();
				loginAttempt(user, Pwd);
			}
		}

		Assert.assertTrue(errormsg.isDisplayed(), "Error message not displayed for invalid login.");
		System.out.println(errormsg.getText());

		Thread.sleep(2000);
	}

	// Method for wrong password login
	public void InValidpswdlogin(String user, String Pwd) throws InterruptedException
	{
		txt_username.clear();
		txt_password.clear();
		Thread.sleep(1000);
		loginAttempt(user, Pwd);
		if (isAlertPresent() == true)
		{
			if (driver.switchTo().alert().getText()
					.contains("User Already Active ! You Want To Logout From Other Devicess?")) {
				driver.switchTo().alert().accept();
				loginAttempt(user, Pwd);
			}
			Assert.assertTrue(errormsg.isDisplayed(), "Error message not displayed for invalid login.");
			System.out.println(errormsg.getText());

			Thread.sleep(2000);
		}
	}

	// Method for blank username login
	/*
	 * public void BlankUsernameField(String user, String Pwd) throws
	 * InterruptedException { txt_username.clear(); txt_password.clear();
	 * Thread.sleep(1000); loginAttempt(user, Pwd);
	 * 
	 * Assert.assertTrue(errormsg.isDisplayed(),
	 * "Error message not displayed for invalid login.");
	 * System.out.println(errormsg.getText()); }
	 */

	public void BlankUsername(String user, String Pwd) throws InterruptedException
	{

		txt_username.clear();
		txt_password.clear();

		Thread.sleep(2000);

		loginAttempt(user, Pwd);
		Thread.sleep(2000);

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		String validationMessage = (String) jsExecutor.executeScript("return arguments[0].validationMessage;",
				txt_username);

		System.out.println("Validation Message: " + validationMessage);
	}

	// Method for blank password login
	public void BlankPasswordField(String user, String Pwd) throws InterruptedException
	{
		txt_username.clear();
		txt_password.clear();
		Thread.sleep(1000);
		loginAttempt(user, Pwd);

		if (isAlertPresent() == true)
		{
			if (driver.switchTo().alert().getText().contains("Please enter Password"))
				Thread.sleep(1000);
			{
				driver.switchTo().alert().accept();

			}
		}
	}

	// Helper method for login attempt
	private void loginAttempt(String user, String Pwd) throws InterruptedException
	{
		txt_username.sendKeys(user);
		txt_password.sendKeys(Pwd);
		btn_Submit.click();
				
	}

	public void logOut() throws InterruptedException
	{
		welcome.click();
		Thread.sleep(2000);
		logoutButton.click();
		Thread.sleep(2000);
	}

	// Method to check if login is successful
	public boolean isLoginSuccessful() {
		try {
			return PageTitle.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isErrorMessageDisplayed() {
		try {
			return errormsg.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
}
