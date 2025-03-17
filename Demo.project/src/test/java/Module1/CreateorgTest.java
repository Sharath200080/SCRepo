package Module1;

import org.testng.annotations.Test;

public class CreateorgTest {
	@Test(groups = "smoketest,Regressiontest")
	public void orgTest() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USER = System.getProperty("user");
		String PASS = System.getProperty("pass");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USER);
		System.out.println(PASS);
		System.out.println("===========done================");
		
		System.out.println("launch browser");
		System.out.println("login");
		System.out.println("home page");
		System.out.println("click on new org");
		System.out.println("org created success");
		System.out.println("log out ");
		System.out.println("=============================================");
		
		
	}
@Test(groups = "smoketest,Regressiontest")
public void orgWithTypeTest() {
	System.out.println("launch browser");
	System.out.println("login");
	System.out.println("home page");
	System.out.println("click on new org with type");
	System.out.println("org type created success");
	System.out.println("log out ");
	System.out.println("=============================================");
	
}

}
