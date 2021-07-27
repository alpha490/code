package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/QA_site/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("Covid 19");
		 driver.findElement(By.xpath("(//input[@type = 'submit'])[3]")).click();
		 driver.findElement(By.xpath("(//*[contains(text(),'News')])[1]")).click();
		 
		 
	}

}
