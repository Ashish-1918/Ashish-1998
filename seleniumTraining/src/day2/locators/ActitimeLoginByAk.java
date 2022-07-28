package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginByAk {

	private static Object actualHomePageTittle;

	public static void main(String[] args) {
	String driverPath = System.getProperty("user.dir") +"\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
//	System.setProperty("webdriver.chrome.driver", driverPath);
//	WebDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	// implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
	driver.get("https://demo.actitime.com/login.do");
	
	String expectedTitle="actiTIME - Login";
	String actualTitle=driver.getTitle();
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("Login page opened sucessfully...");
	}else {
		System.out.println("Either login page not opened or page title got changed");
	}
	WebElement usernameInputField=driver.findElement(By.id("username"));
	usernameInputField.sendKeys("admin1234");
	usernameInputField.clear();
	usernameInputField.sendKeys("admin");
	WebElement passwoedinputfield=driver.findElement(By.name("pwd"));
	passwoedinputfield.sendKeys("manager");
	WebElement loginButton=driver.findElement(By.id("loginButton"));
	loginButton.click();
	
	WebElement logoutbutton=driver.findElement(By.id("logoutLink"));
	//logoutbutton.click();
	//explicit wait
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));
	
	String actualHomePageTittle=driver.getTitle();
	System.out.println("Actualhomepage tittle" +actualHomePageTittle);
	String expectedHomePageTittle="actiTIME - Enter Time-Track";
	
	if(actualHomePageTittle.equals(expectedHomePageTittle)) {
		System.out.println("Login is successfull and home page title is also varified..");
	}else {
		System.out.println("Either Login is failed or home page title is changed");
	}
	
   // driver.findElement(By.linkText("Logout")).click();
	driver.findElement(By.id("logoutLink")).click();
	
	driver.close();
	
	}
}
