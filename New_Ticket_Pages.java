package Demo.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import Resources.Utility;

public class New_Ticket_Pages extends Utility
{

	WebDriver driver;
	WebDriverWait wait;
	
	SoftAssert softAssert = new SoftAssert();
	
	public New_Ticket_Pages(WebDriver driver)
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
	
	@FindBy(xpath = "(//span[text()='New Ticket'])[2]")
	WebElement NewTicket;
	
	public void NewTicket() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(NewTicket));
        Thread.sleep(1000);
        NewTicket.click();
		System.out.println("New Ticket button clicked");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_txtCustomerAssetID']")
	WebElement AtmId;
	
	public void AtmId() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(AtmId));
        Thread.sleep(1000);
        AtmId.sendKeys("P1DCBU20");
		System.out.println("ATM Id insert in the field");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_btnGo']")
	WebElement SearchButton;
	
	public void SearchButton() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
        Thread.sleep(1000);
        SearchButton.click();
		System.out.println("Search button clicked");
	}
	
	@FindBy(xpath = "//span[@id='select2-ctl00_CPHMasterMainTickets_ddlCallType-container']")
	WebElement CallTypefield;
	
	public void CallTypefield() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(CallTypefield));
        Thread.sleep(2000);
        CallTypefield.click();
        System.out.println("CallType field clicked");
	}
	
	@FindBy(xpath = "//input[contains(@class, 'select2-search__field')]")
	WebElement CallTypesearchbox;
	
	public void CallTypesearchbox() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(CallTypesearchbox));
        Thread.sleep(2000);
        CallTypesearchbox.sendKeys("Link:down",Keys.ENTER);
        System.out.println("CallType field clicked and insert a value");
	}
	
	@FindBy(xpath = "//span[@id='select2-ctl00_CPHMasterMainTickets_ddlCallMode-container']")
	WebElement Callmode;
	
	public void Callmode() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(Callmode));
        Thread.sleep(2000);
        Callmode.click();
        System.out.println("Call Mode field clicked");
	}
	
	@FindBy(xpath = "//input[@aria-controls='select2-ctl00_CPHMasterMainTickets_ddlCallMode-results']")
	WebElement CallModeSearchbox;
	
	public void CallModeSearchbox() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(CallModeSearchbox));
        Thread.sleep(2000);
        CallModeSearchbox.sendKeys("Direct",Keys.ENTER);
        System.out.println("Call Mode field Direct dropdown Select");
	}
	
	@FindBy(xpath = "//span[@id='select2-ctl00_CPHMasterMainTickets_tcDocketUpdation_tpDocketUpdation_ddlEngineer-container']")
	WebElement AssignedTo;
	
	public void AssignedTo() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(AssignedTo));
        Thread.sleep(2000);
        AssignedTo.click();
        System.out.println("Assigned To field clicked");
	}
	
	@FindBy(xpath = "//input[@class='select2-search__field' and @role='searchbox']")
	WebElement AssigneToSearchbox;
	
	public void AssigneToSearchbox() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(AssigneToSearchbox));
        Thread.sleep(2000);
        AssigneToSearchbox.sendKeys("HCMS(FLM)",Keys.ENTER);
        System.out.println("Assigned To field HCMS(FLM) Select");
	}
	
	@FindBy(xpath = "//label[@for='ctl00_CPHMasterMainTickets_tcDocketUpdation_tpDocketUpdation_rbtnManualDocket']")
	WebElement ManualInput;
	
	public void ManualInput() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(ManualInput));
        Thread.sleep(2000);
        ManualInput.click();
        System.out.println("Manual Input button clicked");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_tcDocketUpdation_tpDocketUpdation_txtFCRNumber']")
	WebElement DocketNo;
	
	public void DocketNo() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(DocketNo));
        Thread.sleep(2000);
        DocketNo.sendKeys("12345",Keys.ENTER);
        System.out.println("Docket numbet enter");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_tcDocketUpdation_tpDocketUpdation_btnDummy']")
	WebElement AddVisit;
	
	public void AddVisit() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(AddVisit));
        Thread.sleep(2000);
        AddVisit.click();
        System.out.println("Add Visit button clicked");
	}
	
	@FindBy(xpath = "//textarea[@id='ctl00_CPHMasterMainTickets_txtComments']")
	WebElement InternalCommnets;
	
	public void InternalCommnets() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(InternalCommnets));
        Thread.sleep(2000);
        InternalCommnets.sendKeys("Testing purpose only");
        System.out.println("Internal Comment Insert");
	}
	
	@FindBy(xpath = "//textarea[@id='ctl00_CPHMasterMainTickets_txtbankcomment']")
	WebElement StandardComments;
	
	public void StandardComments() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(StandardComments));
        Thread.sleep(2000);
        StandardComments.sendKeys("Only for Testing");
        System.out.println("Standard Comment Insert");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_chkNexSchedule']")
	WebElement NextFollowUp;
	
	public void NextFollowUp() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(NextFollowUp));
        Thread.sleep(2000);
        NextFollowUp.click();
        System.out.println("Next Follow up checkbox clicked");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_txtNextSchdlDate']")
	WebElement NextFollowupDate;
	
	public void NextFollowupDate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(NextFollowupDate));
        Thread.sleep(2000);
        NextFollowupDate.click();
        System.out.println("Next follow up date clicked");
	}
	
	@FindBy(xpath = "//div[@class='ajax__calendar_day' and @title='Thursday, January 22, 2026']")
	WebElement dateInFollowup;
	
	public void dateInFollowup() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(dateInFollowup));
        Thread.sleep(2000);
        dateInFollowup.click();
        System.out.println("22nd Jan 2026 follow up date select");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_txtNextSchdlTime']")
	WebElement FollowUpTime;
	
	public void FollowUpTime() throws InterruptedException {
	    // Wait until the element is clickable
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
	    wait.until(ExpectedConditions.elementToBeClickable(FollowUpTime));
	    
	    // Optional: small pause to make sure calendar/input scripts are ready
	    Thread.sleep(1000);

	    // Use JavaScript to set the exact value and place cursor at the end
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript(
	        "var input = arguments[0];" +
	        "input.value='18:20';" +          // Set the exact time
	        "input.focus();" +                 // Focus the field
	        "input.setSelectionRange(input.value.length, input.value.length);", // Cursor at end
	        FollowUpTime
	    );

	    System.out.println("Follow up Time inserted correctly");
	}

	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_chkNextETA']")
	WebElement ETACheckbox;
	
	public void ETACheckbox() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(ETACheckbox));
        Thread.sleep(2000);
        ETACheckbox.click();
        System.out.println("ETA Checkbox clicked");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_txtNextETA_Date']")
	WebElement ETADate;
	
	public void ETADate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(ETADate));
        Thread.sleep(2000);
        ETADate.click();
        System.out.println("ETA date clicked");
	}
	
	@FindBy(xpath = "//div[contains(@id,'cechkNextETA_day') and text()='26']")
	WebElement ETADateSelect;
	
	public void ETADateSelect() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(ETADateSelect));
        Thread.sleep(2000);
        ETADateSelect.click();
        System.out.println("26th Jan 2026 follow up date select");
	}
	
	@FindBy(xpath = "//input[@id='ctl00_CPHMasterMainTickets_txtNextETA_Time']")
	WebElement ETATime;
	
	public void ETATime() throws InterruptedException {
	    // Wait until the element is clickable
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
	    wait.until(ExpectedConditions.elementToBeClickable(ETATime));
	    
	    // Optional: small pause to make sure calendar/input scripts are ready
	    Thread.sleep(1000);

	    // Use JavaScript to set the exact value and place cursor at the end
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript(
	        "var input = arguments[0];" +
	        "input.value='20:45';" +          // Set the exact time
	        "input.focus();" +                 // Focus the field
	        "input.setSelectionRange(input.value.length, input.value.length);", // Cursor at end
	        ETATime
	    );

	    System.out.println("ETA Time inserted correctly");
	}
	
// Sroll down the page 
	
	public void ScrollDownPage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	@FindBy(xpath = "//a[@id='ctl00_CPHMasterMainTickets_hlnkVendorHistory']")
	WebElement DispatchHistory;
	
	public void DispatchHistory() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(DispatchHistory));
        Thread.sleep(2000);
        DispatchHistory.click();
        System.out.println("Dispatch History clicked");
	}
	
	@FindBy(xpath = "//a[@id='ctl00_CPHMasterMainTickets_lbtnMonth5']")
	WebElement Dec2025History;
	
	public void Dec2025History() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // 10 seconds timeout
        wait.until(ExpectedConditions.elementToBeClickable(Dec2025History));
        Thread.sleep(2000);
        Dec2025History.click();
        System.out.println("Dec 2025 Dispatch History clicked");
	}
	
	
	

	
}
