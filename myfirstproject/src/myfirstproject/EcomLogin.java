package myfirstproject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EcomLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String URL = "http://automationpractice.com/index.php";
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		//Click on Sign in
		 driver.findElement(By.linkText("Sign in")).click();
		 
		// Click on "Login account Testcase Positive"
		// Positive Testcase if you want to run it unmark //
		driver.findElement(By.id("email")).sendKeys("test1258@test.com");
		driver.findElement(By.name("passwd")).sendKeys("PKR@PKR");
		driver.findElement(By.id("SubmitLogin")).click();
		
		// Click on "Login account  Testcase negative"
		// Negative Testcase if you want to run it unmark //
		// Invalid email address in the email box and click sign
		//driver.findElement(By.id("email")).sendKeys("test1257@test.com");
		//driver.findElement(By.name("passwd")).sendKeys("PKR@PKR");
		//driver.findElement(By.id("SubmitLogin")).click();
		
		// Click on "Login account Testcase negative"
		// Negative Testcase if you want to run it unmark //
		// Invalid password address in the email box and click sign
		//driver.findElement(By.id("email")).sendKeys("test1256@test.com");
		//driver.findElement(By.name("passwd")).sendKeys("Satria123");
		//driver.findElement(By.id("SubmitLogin")).click();
		
		// Click on "Login account Testcase negative"
		// Negative Testcase if you want to run it unmark //
		// Blank email address in the email box and password in the password box and click sign
		//driver.findElement(By.id("email")).sendKeys("");
		//driver.findElement(By.name("passwd")).sendKeys("");
		//driver.findElement(By.id("SubmitLogin")).click(); 
		
		String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
		if(userText.contains("Nur")) {
			System.out.println("User Login Successfully,Test case Passed");
		}
		else { 
			System.out.println("User Login Not Successfully,Test case Failed");
		}
	}
}