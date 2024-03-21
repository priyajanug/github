package testannota;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class a1 {

	 ChromeDriver driver;
		
		
		@BeforeTest
		public void bt()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCAdmin\\Downloads\\chromedriver-win64\\chromedriver.exe");
			   driver=new ChromeDriver();
				driver.get("http://www.google.com");
			System.out.println("before test ");
		}
		
		@AfterTest
		public void at()
		{
			System.out.println("after test ");
			driver.quit();
		}
		
		@BeforeClass
		public void bc()
		{
			System.out.println("before class ");
			driver.manage().window().maximize();
		}
		
		@AfterClass
		public void atc()
		{
			System.out.println("after class "+ driver.getCurrentUrl());
		}
		
		@BeforeMethod
		public void btm()
		{
			System.out.println("before method ");
			driver.navigate().refresh();
		}
		
		@AfterMethod
		public void atm()
		{
			System.out.println("after method ");
			driver.manage().deleteAllCookies();
		}
	}
	
