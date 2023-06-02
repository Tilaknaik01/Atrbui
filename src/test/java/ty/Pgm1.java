package ty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pgm1
{
	public static void  main(String[] args)
	{
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			System.out.println(driver.getTitle());
			System.out.println("laka laka tilaka");
		}
	}
}