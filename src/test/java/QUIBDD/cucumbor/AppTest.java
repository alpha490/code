package QUIBDD.cucumbor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Unit test for simple App.
 */

public class AppTest {

public WebDriver driver;
public String printText;


	@Given("Open the chrome and launch the application")
	public void open_the_chrome_and_launch_the_application() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazona.webacademy.pro/");
		driver.manage().window().maximize();
	}

	@Then("Click on the Sign In button")
	public void click_on_the_sign_in_button() {
	
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).sendKeys(Keys.ENTER);
	}
	
	@When("Enter the Username and Password")
	public void enter_the_username_and_password() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumanmukherjee490@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("iamsuman");
		
		
	}

	@Then("click on Sing In button")
	public void click_on_sing_in_button() {
	
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	}
	
	@Then("verify the username is login and print it")
	public void verify_the_username_is_login_and_print_it() throws InterruptedException {
	
	System.out.println(driver.getTitle());	
	System.out.println(driver.getCurrentUrl());	
	
	Thread.sleep(10000);
	}

	@Then("click on the dropdown menu and choose the profile")
	public void click_on_the_dropdown_menu_and_choose_the_profile() {
		WebElement btn = driver.findElement(By.xpath("//div[@class='dropdown']"));
		Actions mouse = new Actions(driver);
		  mouse.moveToElement(btn).perform();
		 driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();

	
	}
	
	@Then("click on the user name and print it")
	public void click_on_the_user_name_and_print_it() throws InterruptedException {
		System.out.println("Current Url is "+driver.getCurrentUrl());
		
	Thread.sleep(20000);
    WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
    System.out.println("The user name is"+name.getText()); 
    WebElement ename = driver.findElement(By.xpath("//input[@id='email']"));
    System.out.println("The email is"+ename.getText()); 
    
    WebElement tv=driver.findElement(By.id("name"));
    String printText=tv.getAttribute("value");
    System.out.println(printText);
	
    if(printText == "suman mukherjee") {
		System.out.println("Test pass");
	} else {
		System.out.println("Test Fail");
	}
	} 
	
	@Then("verify menu user name same as the user profile")
	public void verify_menu_user_name_same_as_the_user_profile() {


	
	}
}
