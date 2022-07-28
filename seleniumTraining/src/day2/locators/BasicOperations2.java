package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("get current page Tittle"+driver.getTitle());
		String pagetitle=driver.getTitle();
		System.out.println("Current Page title is"+pagetitle);
		System.out.println("current  page url"+driver.getCurrentUrl());
		System.out.println("Current web page source code: "+driver.getPageSource());
		driver.close();
		
	}

}
