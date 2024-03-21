package p1;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCAdmin\\Downloads\\chromedriver-win64\\chromedriver-win64");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.seleniumeasy.com");
		
	}

}
