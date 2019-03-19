package FeatureAlertHotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelAlertBox {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Users/KAGRAWA1/Desktop/BDD/hotelbooking.html");
		
		driver.findElement(By.id("txtFirstName")).sendKeys("");
		callAlert();
		
		driver.findElement(By.id("txtFirstName")).sendKeys("Komal");
		driver.findElement(By.id("txtLastName")).sendKeys("");
		callAlert();
		
		driver.findElement(By.id("txtLastName")).sendKeys("Agrawal");
		driver.findElement(By.id("txtEmail")).sendKeys("");
		callAlert();

		driver.findElement(By.id("txtEmail")).sendKeys("komal@gmail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("");
		callAlert();
		
		driver.findElement(By.id("txtPhone")).sendKeys("18940");//invalid
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}']")).sendKeys("7894561230");//validation
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("");
		callAlert();
		
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("talawade road");
		Select drpCity=new Select(driver.findElement(By.name("city")));
		drpCity.selectByIndex(0);
		callAlert();
		

		drpCity.selectByIndex(1);
		Select drpState=new Select(driver.findElement(By.name("state")));
		drpState.selectByIndex(0);
		callAlert();
		
		drpState.selectByIndex(1);
		Select drpPerson=new Select(driver.findElement(By.name("persons")));
		drpPerson.selectByIndex(0);
		callAlert();
		
		drpPerson.selectByIndex(2);
		driver.findElement(By.id("txtCardholderName")).sendKeys("");
		callAlert();
		
		driver.findElement(By.id("txtCardholderName")).sendKeys("Komal Agrawal");
		driver.findElement(By.id("txtDebit")).sendKeys("");
		callAlert();
		
		driver.findElement(By.id("txtDebit")).sendKeys("123456789012");
		driver.findElement(By.id("txtCvv")).sendKeys("");
		callAlert();
		
		driver.findElement(By.id("txtCvv")).sendKeys("123");
		driver.findElement(By.id("txtMonth")).sendKeys("");
		callAlert();
		
		driver.findElement(By.id("txtMonth")).sendKeys("10");
		driver.findElement(By.id("txtYear")).sendKeys("");
		callAlert();
		
		driver.findElement(By.id("txtYear")).sendKeys("2020");
		driver.findElement(By.id("btnPayment")).click();
		
		driver.quit();
		
	}
	public static void callAlert() throws InterruptedException
	{
			driver.findElement(By.id("btnPayment")).click();
			String alertmes=driver.switchTo().alert().getText();
			System.out.println(alertmes);
			Thread.sleep(500);
			driver.switchTo().alert().accept();
			Thread.sleep(500);
				
	}
}
