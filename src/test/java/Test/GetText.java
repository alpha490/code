package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {



	public static void main(String[] args) throws InterruptedException {
		int a = 15;
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.seleniumeasy.com/test/");
       Thread.sleep(10000);
       System.out.println(driver.getCurrentUrl()+"Here the Current URL");
       System.out.println(driver.getTitle()+"Here the Page Title");
       driver.manage().window().maximize();

       driver.findElement(By.id("btn_basic_example")).click();
       driver.findElement(By.className("list-group-item")).click();
       Thread.sleep(7000);
       String messsage = "This is a test Case" ;
       driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys(messsage);
       driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
       Thread.sleep(7000);
       WebElement display = driver.findElement(By.xpath("//span[@id='display']"));
       System.out.println("Here the text :"+display.getText());
       if(display.getText().equals(messsage)) {
    	   System.out.println("Test Passes");
       }else
       {
    	   System.out.println("Test Failed");
       }

       driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("8");
       driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("7");
       driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
       Thread.sleep(7000);
       WebElement display2 = driver.findElement(By.xpath("//span[@id='displayvalue']"));
       System.out.println("Here the text :"+display2.getText());
         
       if(display2.getText().equals("15")) {
    	   System.out.println("Test Passes");
       }else
       {
    	   System.out.println("Test Failed");
       }
	}

}
