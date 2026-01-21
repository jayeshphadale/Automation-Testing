package Demo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import Resources.Utility;

public class TicketCenterDemo_Pages extends Utility
{
	WebDriver driver;
	WebDriverWait wait;
	
	SoftAssert softAssert = new SoftAssert();
	
	public TicketCenterDemo_Pages(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'ManageCall')]")
	WebElement btn_managecall;
	
	public void managecall() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(btn_managecall));
        Thread.sleep(1000);
        btn_managecall.click();
		System.out.println("ManageCall button clicked");
	}
	
	@FindBy(xpath = "(//span[@class='list-line-text' and text()='Ticket Center'])[2]")
	WebElement btn_ticketcenter;
	
	public void ticketcenter() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(btn_ticketcenter));
        Thread.sleep(3000);
        btn_ticketcenter.click();
		System.out.println("Ticket Center page is displayed");
	}
	
	@FindBy(xpath = "(//p[text()='Show / Hide'])[1]")
	WebElement btn_ShowHide;
	
	public void btn_ShowHide() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(btn_ShowHide));
        Thread.sleep(3000);
        btn_ShowHide.click();
		System.out.println("Show Hide button Clicked");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMain_btnSearchGrid']")
	WebElement SearchButton;
	
	public void SearchButton() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
        Thread.sleep(3000);
        SearchButton.click();
        Thread.sleep(5000);
		System.out.println("Click on search button");
	}
	
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMain_btnClearSearch']")
	WebElement ClearButton;
	
	public void ClearButton() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(ClearButton));
        Thread.sleep(5000);
        ClearButton.click();
		System.out.println("Click on search button");
	}
	
//===================================== Bank =================================================================================//	
	
	@FindBy(xpath = "(//button[text()='--All--'])[1]")
	WebElement Bank;
	
	public void Bank() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(Bank));
        Thread.sleep(3000);
        Bank.click();
        Thread.sleep(5000);
		System.out.println("Bank field drop down Clicked");
	}
	
	
	
	@FindBy(xpath = "//label[normalize-space()='HDFC']/input")
	WebElement SelectBank;
	
	public void SelectBank(String bank) throws InterruptedException
	{
		String xpath = "//label[normalize-space()='"+ bank + "']/input";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250)); // 10 seconds timeout
		 WebElement bankCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        Thread.sleep(2000);
        bankCheckbox.click();
        Thread.sleep(5000);
		System.out.println("Bank drop down select");
	}
	
// ===================================== Location Type ========================================================================//	
	
	@FindBy(xpath = "(//div[@class='ms-options-wrap']//button[normalize-space()='--All--'])[2]")

	WebElement LocationType;
	
	public void LocationType() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(LocationType));
        Thread.sleep(3000);
        LocationType.click();
        Thread.sleep(5000);
		System.out.println("Location Type field drop down Clicked");
	}
	
	@FindBy(xpath = "//label[normalize-space()='Metro']")
	WebElement SelectLocationType;
	
	public void SelectLocationType(String locationtype) throws InterruptedException
	{
		String xpath = "//label[normalize-space()='"+ locationtype + "']/input";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250)); // 10 seconds timeout
		 WebElement bankCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        Thread.sleep(2000);
        bankCheckbox.click();
        Thread.sleep(5000);
		System.out.println("Location Type drop down select ");
	}
	
//=================================== Export ===========================================================================
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMain_btnExportCenter']")
	WebElement ExportButton;
	
	public void ExportButton() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(ExportButton));
        Thread.sleep(3000);
        ExportButton.click();
        Thread.sleep(5000);
		System.out.println("Export button Clicked");
	}
	

	
}
	


