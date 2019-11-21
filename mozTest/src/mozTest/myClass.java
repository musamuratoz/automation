package mozTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myClass {
	 public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.gecko.driver", "C://geckoDriver/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://eusb.webcomcpq.com/login.aspx");
		 
		 String aXpath = "//*[@id='ctl00_MainContentPlaceHolder_txtUsername']";
		 
		 WebElement element;
		 element = driver.findElement(By.xpath(aXpath));
		 
		 element.sendKeys("Denizcan");
		 
		 String bXpath = "//*[@id='ctl00_MainContentPlaceHolder_btnLogin']";
		 
		 element = driver.findElement(By.xpath(bXpath));
		 
		 element.click();
		 
		 
		 //Thread.sleep(5000);
		 //driver.quit();
		 }
}


//*[@id='ctl00_MainContentPlaceHolder_btnLogin']