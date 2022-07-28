package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogIn {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com");
		
		String expectedTitle="Gmail";
		String ActualTittle=driver.getTitle();
		if(ActualTittle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		driver.findElement(By.id("identifierId")).sendKeys("khairnarashish15@gmail.com");

		
	}

}
