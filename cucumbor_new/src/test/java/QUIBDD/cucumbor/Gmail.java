package QUIBDD.cucumbor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Gmail {
	public WebDriver driver;
	
	@Given("Open the chrome and launch the gmail login Page")
	public void open_the_chrome_and_launch_the_gmail_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	   
	}



	@Given("User enter the valid email on email filed and click on next")
	public void user_enter_the_valid_email_on_email_filed_and_click_on_next() throws InterruptedException {
	    
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sumanmukherjee495@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	   
	}


	@Given("user enter the valid Password and click ok next")
	public void user_enter_the_valid_password_and_click_ok_next() throws InterruptedException {
	    
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Iamsuman7.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(10000);
	}


	@Then("User should click on the Compose button")
	public void user_should_click_on_the_compose_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		Thread.sleep(5000);
	}


	@Then("enter the {string} in the subject box")
	public void enter_the_in_the_subject_box(String string) throws InterruptedException {
	    

		driver.findElement(By.xpath("//input[@id=':sb']")).sendKeys(string);
		Thread.sleep(3000);
	}


	@Then("enter the {string} in the body section")
	public void enter_the_in_the_body_section(String string) {
	    
		driver.findElement(By.xpath("//div[@id=':tg']")).sendKeys(string);
		
	}


	@Then("enter a email address in the Reseption section")
	public void enter_a_email_address_in_the_reseption_section() {
	    
		driver.findElement(By.xpath("//div[@id=':sm']")).sendKeys("sujanmukherjee9614@gmail.com");
	}



	@Then("click on the Send button")
	public void click_on_the_send_button() throws InterruptedException {
	    
		driver.findElement(By.xpath("//div[@id=':s1']")).click();
		Thread.sleep(3000);
	}
	
	
}
