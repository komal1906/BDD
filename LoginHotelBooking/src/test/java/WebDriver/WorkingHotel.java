package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageBean.HotelBookingPageFactory;

public class WorkingHotel
{

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\ChromePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("file:///D:/Users/KAGRAWA1/Desktop/BDD/login.html");
		
		try {
			
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		Thread.sleep(1000);
		
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='mainCnt']/div/div[1]/form/table/tbody/tr[4]/td[2]/input")).click();
		Thread.sleep(1000);
		
		driver.close();
		}
	
	catch(Exception e)
	{
		System.out.println("some exception");
		
	}
	}
}
