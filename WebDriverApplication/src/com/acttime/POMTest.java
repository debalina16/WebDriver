/**
 * 
 */
package com.acttime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.genericlib.WebdriverCommonLib;
import com.actitime.objectRepositoryLib.Home;
import com.actitime.objectRepositoryLib.Login;

/**
 * @author Debalina
 *
 */
@Listeners(com.actitime.genericlib.ListenerImpClass.class)
public class POMTest {
@Test
public void loginTest() throws Throwable {
	WebDriver driver=new FirefoxDriver();
	WebdriverCommonLib wb=new WebdriverCommonLib();
	wb.waitForPageToLoad(driver);
	driver.get("http://localhost/login.do;jsessionid=2ttojxeeiqms8");
	Login lpage=PageFactory.initElements(driver, Login.class);
	lpage.loginToApp();
	Home hp=PageFactory.initElements(driver, Home.class);
	hp.logout();
	driver.close();
}
@Test
public void loginWithoutPasswordTest() {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do;jsessionid=2ttojxeeiqms8");
	Login lpage=PageFactory.initElements(driver, Login.class);
	lpage.getUsernameEdt().sendKeys("admin");
	lpage.getLoginButton().click();
	
    }
}
