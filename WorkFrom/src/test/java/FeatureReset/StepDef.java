package FeatureReset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;
	
@Given("^Open the Firefox and launch the application$")
public void open_the_Firefox_and_launch_the_application() throws Throwable {
	
	
	System.setProperty("webdriver.chrome.driver","D:\\ChromePath\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file://ndafile/GLC-G102/BDD/WorkingWithForms.html");
	
}

@When("^Enter the Username And Password$")
public void enter_the_Username_And_Password() throws Throwable {
	
	driver.findElement(By.id("txtUserName")).sendKeys("Komal19");
	driver.findElement(By.name("txtPwd")).sendKeys("komal123");
	
	Thread.sleep(1000);

}

@Then("^Reset The credential$")
public void reset_The_credential() throws Throwable {
 
	driver.findElement(By.xpath(".//*[@id='myStyle']")).click();
   
}
}
