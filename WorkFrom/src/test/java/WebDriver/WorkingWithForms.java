package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WorkingWithForms
{

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\ChromePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file://ndafile/GLC-G102/BDD/WorkingWithForms.html");
		
		try {
			
		driver.findElement(By.id("txtUserName")).sendKeys("Komal19");
		//Thread.sleep(1000);
		
		driver.findElement(By.name("txtPwd")).sendKeys("komal123");
		
		driver.findElement(By.className("Format")).sendKeys("komal123");
		
		driver.findElement(By.cssSelector("input.Format1")).sendKeys("Komal");
		
		driver.findElement(By.name("txtLN")).sendKeys("Agrawal");
		
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		
		driver.findElement(By.name("DtOB")).sendKeys("12/15/1997");
		
		driver.findElement(By.name("Email")).sendKeys("komal.@gmail.com");
		
		driver.findElement(By.name("Address")).sendKeys("Tilak Nagar");
		
		Select drpCity=new Select(driver.findElement(By.name("City")));
		//drpCity.selectByVisibleText("Mumbai");
		drpCity.selectByIndex(1);
		//drpCity.selectByIndex(2);
		
		driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("7894561230");
		
		driver.findElement(By.cssSelector("input[value='Reading'")).click();
		driver.findElement(By.cssSelector("input[value='Music'")).click();
		/*List<WebElement> element= driver.findElements(By.name("chkHobbies"));
		for(WebElement val: element)
		{
			val.click();
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage);
			}
		}*/
	
		
		driver.findElement(By.xpath(".//*[@id='myStyle']")).click();
		
		}
	
	catch(Exception e)
	{
		System.out.println("some exception");
		
	}
	}
}
