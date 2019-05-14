package Annotation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author Debalina
 *
 */
public class CustomerBeforeAfterMethodTest {
	@BeforeMethod
	public void configBM() {
		System.out.println("Login");
	}

	@Test
	public void createCustomerTest() {
		System.out.println("createCustomerTest");
	}

	@Test
	public void modifyCustomerTest() {
		System.out.println("modifyCustomerTest");
	}

	@Test
	public void deleteCustomerTest() {
		System.out.println("deleteCustomerTest");
	}

	@AfterMethod
	public void configAM() {
		System.out.println("Logout");
	}
}
