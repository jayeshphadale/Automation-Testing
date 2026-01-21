package Demo.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Demo.pages.DN_ManageCall_Login_Page;
import Demo.pages.TicketCenterDemo_Pages;

public class TicketCenterDemo_TestCases extends Base
{
	DN_ManageCall_Login_Page loginpage;
	TicketCenterDemo_Pages tcdpage;
	
	@BeforeClass
	public void Initialization()
	{
		launchBrowser("https://uat-ms-dn.demouat.in:4041/", "Chrome");
		loginpage = new DN_ManageCall_Login_Page (driver);
		tcdpage = new TicketCenterDemo_Pages (driver);
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException
	{
		loginpage.Validlogin("Maximus", "admin@123456");
	}
	
	@Test(priority = 2)
	public void managecall() throws InterruptedException
	{
		tcdpage.managecall();
		tcdpage.ticketcenter();
		tcdpage.btn_ShowHide();
	}
	
	
	@Test(priority = 3)
	public void Bank() throws InterruptedException
	{
		String[] banks = {"CBI","HDFC","INDUSIND"};
		
		for(String bank : banks)
		{
			tcdpage.Bank();
			tcdpage.SelectBank(bank);
			tcdpage.SearchButton();
			tcdpage.ClearButton();
		}
	}
	
	@Test(priority = 4)
	public void LocationType() throws InterruptedException
	{
		String[] locationtype = {"Metro", "Rural", "Semi Urban", "Urban"};
		
		for(String SelectLocationType : locationtype)
		{
			tcdpage.LocationType();
			tcdpage.SelectLocationType(SelectLocationType);
			tcdpage.SearchButton();
			tcdpage.ClearButton();
		}
	}
	
	@Test(priority = 5)
	public void ExportButton() throws InterruptedException
	{
		tcdpage.SearchButton();
		tcdpage.ExportButton();
		
	}

	

}
