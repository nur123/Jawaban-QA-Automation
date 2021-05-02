package myfirstproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcomSignUp {

 public static void main(String[] args) {
 
  WebDriver driver=new ChromeDriver();
  String URL="http://automationpractice.com/index.php";

  driver.get(URL);
  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
  driver.manage().window().maximize();
  
  // Click on Sign in
  driver.findElement(By.linkText("Sign in")).click();
  
  // Positive Testcase
  // Enter email address
  driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("test1258@test.com");
  
  // Negative Testcase if you want to run it unmark //
  // Invalid email address in the email box and click enter
  //driver.findElement(By.cssSelector("[[name='email_create']]")).sendKeys("xxx.com");
  
  // Negative Testcase jika ingin menjalankannya hapus tanda //
  // Blank email address in the email box and click enter
  //driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("");
  
  // Click on "Create an account"
  driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
  
  // Select Title Testcase Positive 
  WebDriverWait wait = new WebDriverWait(driver, 30);
  WebElement selectGender = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
  selectGender.click();
  driver.findElement(By.name("customer_firstname")).sendKeys("Test User");
  driver.findElement(By.name("customer_lastname")).sendKeys("Nur");
  driver.findElement(By.name("passwd")).sendKeys("PKR@PKR");
  
  //Select Title Test case Negative if you want to run it unmark //
  //Blank Title
  //driver.findElement(By.name("id_gender")).click();
  //driver.findElement(By.name("customer_firstname")).sendKeys("");
  //driver.findElement(By.name("customer_lastname")).sendKeys("");
  //driver.findElement(By.name("passwd")).sendKeys("");
  
  
  // Enter your address Testcase Positive
  driver.findElement(By.name("firstname")).sendKeys("Test User");
  driver.findElement(By.name("lastname")).sendKeys("Nur");
  driver.findElement(By.name("company")).sendKeys("Nur");
  driver.findElement(By.name("address1")).sendKeys("Test 81/1,2nd cross");
  driver.findElement(By.name("city")).sendKeys("XYZ");
  
  // Enter your address Testcase Negative if you want to run it unmark //
  // Invalid input 
  //driver.findElement(By.name("firstname")).sendKeys("123456");
  //driver.findElement(By.name("lastname")).sendKeys("7890123");
  //driver.findElement(By.name("city")).sendKeys("123456");
  
  //Enter your address Testcase Negative if you want to run it unmark //
  //Blank your address 
  //driver.findElement(By.name("firstname")).sendKeys("");
  //driver.findElement(By.name("lastname")).sendKeys("");
  //driver.findElement(By.name("company")).sendKeys("");
  //driver.findElement(By.name("address1")).sendKeys("");
  //driver.findElement(By.name("city")).sendKeys("");
  
  
  // Select State Testcase Positive 
  WebElement statedropdown=driver.findElement(By.name("id_state"));
  Select oSelect = new Select(statedropdown);
  oSelect.selectByValue("4");
  
  driver.findElement(By.name("postcode")).sendKeys("51838");
  
  // Select State Testcase Negative if you want to run it unmark //
  // Inavlid input post code
  //driver.findElement(By.name("postcode")).sendKeys("ANBCD");
  
  //Select State Testcase Negative if you want to run it unmark //
  //Blank Select State 
  //WebElement statedropdown=driver.findElement(By.name("id_state"));
  //Select oSelect = new Select(statedropdown);
  //oSelect.selectByValue("");
  
  //driver.findElement(By.name("postcode")).sendKeys("");
  
  
  // Select Country Testcase Positive
  WebElement countrydropDown = driver.findElement(By.name("id_country"));
  Select oSelectC = new Select(countrydropDown);
  oSelectC.selectByVisibleText("United States");
  
  // Select Country Testcase Negative if you want to run it unmark //
  // Blank Select Country
  //WebElement countrydropDown = driver.findElement(By.name("id_country"));
  //Select oSelectC = new Select(countrydropDown);
  //oSelectC.selectByVisibleText("");
  
  // Enter Mobile Number Testcase Positive
  driver.findElement(By.name("phone_mobile")).sendKeys("234567890");
  driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
  driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
  driver.findElement(By.name("submitAccount")).click();
  String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
  
  // Enter Mobile Number Testcase Negative if you want to run it unmark //
  // Invalid input Mobile Number
  //driver.findElement(By.name("phone_mobile")).sendKeys("ANCBDFAOALA");
  
  //Enter Mobile Number Testcase Negative jika ingin menjalankannya hapus tanda //
  // Blank Mobile Number
  //driver.findElement(By.name("phone_mobile")).sendKeys("");
  //driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
  //driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("");
  //driver.findElement(By.name("submitAccount")).click();
  
  //String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
  // Validate that user has created
  if(userText.contains("Nur")) {
	  System.out.println("User Verified,Test case Passed");
  }
  else {
	  System.out.println("User Verification Failed,Test case Failed");
  }
 }
}