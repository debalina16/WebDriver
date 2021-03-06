/**
 * 
 */
package Project2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Project1.FileLib;

/**
 * @author Debalina
 *
 */
public class Testcase2 {
	WebDriver driver = null;
	FileLib fb=new FileLib();

	/* login to demo.guru99 and verified */
	@BeforeMethod
	void setup() {
		driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
	}

	@Test
	void loginVerified() throws Throwable {
		String login=fb.getExcelData("Sheet6", 1, 2);
		String passWd=fb.getExcelData("Sheet6", 1, 3);
		/* login to app */
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(login);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		/* login verified */
		String expTitle = "Guru99 Bank Manager HomePage";
		String actTitle = driver.getTitle();
		try {
			Assert.assertEquals(expTitle, actTitle);
			System.out.println("Login is Successful====>Pass");
		} catch (Exception e) {
			System.out.println("Login Failed====>Fail");
		}
	}

	@AfterMethod
	void teardown() {
		driver.quit();
	}
}
