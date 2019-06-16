package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verify {
  @Test
  public void verifysite() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://3.88.248.170");
		Thread.sleep(3000);
		
		driver.findElement(By.id("About Us")).click();
		Thread.sleep(3000);
		String x=driver.findElement(By.id("PID-ab2-pg")).getText();
		String original="This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		System.out.println("Printing the value from page:");
		System.out.println(x);
		System.out.println("Printing original value::");
		System.out.println(original);
	    Assert.assertEquals(x, original);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.findElement(By.id("Products")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.findElement(By.id("Contact")).click();
		Thread.sleep(3000);
		driver.navigate().back();

  }
}
