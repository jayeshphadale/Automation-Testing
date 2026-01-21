package Demo.Testcases;

import Demo.pages.DN_ManageCall_Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DN_Managecall_Login_Page_TestCase {

    WebDriver driver;
    DN_ManageCall_Login_Page loginPage;

    @BeforeClass
    public void setUp() {
        // Make sure to have ChromeDriver in PATH or specify its path here
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uat-ms-dn.demouat.in:4041/"); // Replace with your app URL
        loginPage = new DN_ManageCall_Login_Page(driver);
    }

    @Test(priority = 1)
    public void testInvalidUsername() throws InterruptedException {
        loginPage.InValidUserlogin("wrongUser", "validPassword");
    }

    @Test(priority = 2)
    public void testInvalidPassword() throws InterruptedException {
        loginPage.InValidpswdlogin("validUser", "wrongPassword");
    }

    @Test(priority = 3)
    public void testBlankUsername() throws InterruptedException {
        loginPage.BlankUsername("", "validPassword");
    }

    @Test(priority = 4)
    public void testBlankPassword() throws InterruptedException {
        loginPage.BlankPasswordField("validUser", "");
    }

    @Test(priority = 5)
    public void testValidLoginAndLogout() throws InterruptedException {
        loginPage.Validlogin("validUser", "validPassword");
        loginPage.logOut();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
