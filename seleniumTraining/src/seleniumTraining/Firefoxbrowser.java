package seleniumTraining;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) {
	String path=".\\executables\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver", path);
	FirefoxDriver fdriver= new FirefoxDriver();

	}

}
