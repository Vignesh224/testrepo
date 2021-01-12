package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\eclipse-workspace\\Basics & Test Run\\Chrome integration\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWa it(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestinghelp.com/selenium-find-element-by-text/");
//		driver.navigate().to("https://www.facebook.com/");
//		driver.findElement(By.xpath("")).sendKeys("1234");
//		driver.findELements(By.xpath("")).click();
				
		String s = driver.getCurrentUrl();
		System.out.println("URL :" + s);
		
//		WebElement webelement1 = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you')]"));
//		
//		if(webelement1.isDisplayed())
//		{
//			String text = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you')]")).getText();
//			System.out.println("Text displayed as: " + text);
//		}
//		
//		else 
//		{ 
//			System.out.println("Text not displayed");
//		}
		
		
		
		if(driver.findElement(By.partialLinkText("Automation1")).isDisplayed())
		{
//			String text = webelement2.getText();
			System.out.println("Text displayed as: ");
		}
		
		else 
		{ 
			System.out.println("Text not displayed");
		}
		
			
		driver.close();

	}

}
