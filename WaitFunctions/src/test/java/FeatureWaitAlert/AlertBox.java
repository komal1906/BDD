package FeatureWaitAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox
{
	public static void main(String args[]) throws InterruptedException
	{
	

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\ChromePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Users/KAGRAWA1/Desktop/BDD/AlertBoxDemos.html");
		Thread.sleep(500);
		
		driver.findElement(By.id("alert")).click();
		Thread.sleep(500);
		
		Alert alert= driver.switchTo().alert();
		System.out.println("The alert message is : "+ alert.getText());
		alert.accept();//ok pr click
		Thread.sleep(500);
		
		
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(500);
		
		Alert confirm= driver.switchTo().alert();
		System.out.println("The alert message is : "+ confirm.getText());
		confirm.accept();
		Thread.sleep(500);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(500);
		confirm=driver.switchTo().alert();
		confirm.dismiss();
		Thread.sleep(500);
		

		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(500);
		
		Alert prompt= driver.switchTo().alert();
		String text=prompt.getText();
		System.out.println(text);
		prompt.sendKeys("Komal");
		Thread.sleep(500);
		
		prompt.accept();
		Thread.sleep(500);
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(500);
		
		prompt=driver.switchTo().alert();
		prompt.dismiss();
		Thread.sleep(500);
		driver.quit();
				
		
		
	}

}
