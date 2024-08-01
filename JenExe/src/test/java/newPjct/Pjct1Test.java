package newPjct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pjct1Test {

	@Test
	public void pjct1Test()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
}
