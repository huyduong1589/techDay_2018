package common.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	public static WebDriver createDriver() {
		String browser = System.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver;
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		return driver;

	}

}
