package Demo.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Demo.pages.DN_ManageCall_Login_Page;
import Demo.pages.New_Ticket_Pages;

public class New_Ticket_TestCases extends Base
{
	
	DN_ManageCall_Login_Page loginpage;
	New_Ticket_Pages ntppage;
	
	@BeforeClass
	public void Initialization()
	{
		launchBrowser("https://uat-ms-dn.demouat.in:4041/", "Chrome");
		loginpage = new DN_ManageCall_Login_Page (driver);
		ntppage = new New_Ticket_Pages (driver);
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException
	{
		loginpage.Validlogin("Maximus", "admin@123456");
	}
	
	@Test(priority = 2)
	public void NewTicket() throws InterruptedException
	{
		ntppage.managecall();
		ntppage.NewTicket();
		ntppage.AtmId();
		ntppage.SearchButton();
		ntppage.CallTypefield();
		ntppage.CallTypesearchbox();
		ntppage.Callmode();
		ntppage.CallModeSearchbox();
		ntppage.AssignedTo();
		ntppage.AssigneToSearchbox();
		ntppage.ManualInput();
		ntppage.DocketNo();
		ntppage.AddVisit();
		ntppage.InternalCommnets();
		ntppage.StandardComments();
		ntppage.NextFollowUp();
		ntppage.NextFollowupDate();
		ntppage.dateInFollowup();
		ntppage.FollowUpTime();
		ntppage.ETACheckbox();
		ntppage.ETADate();
		ntppage.ETADateSelect();
		ntppage.ETATime();
		ntppage.ScrollDownPage();
	}
	
	@Test(priority = 3)
	public void DispatchHistory() throws InterruptedException
	{
		ntppage.DispatchHistory();
		ntppage.Dec2025History();
	}

}
