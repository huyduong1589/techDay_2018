package common.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebSupport {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public WebSupport(WebDriver driver123) {
		this.driver = driver123;
		this.wait = new WebDriverWait(this.driver, 30);
	}
	
	public void waitForLoading() {
		String spin = "//img[@src='/Portal/Content/images/loading.gif']";
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(spin)));
	}


}
