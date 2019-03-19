package FeatureScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	@Given("^Open the Firefox and Launch the application$")
	public void open_the_Firefox_and_Launch_the_application() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","D:\\ChromePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file://ndafile/GLC-G102/BDD/WorkingWithForms.html");
	}

	@When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void enter_the_Username_and_Password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("txtUserName")).sendKeys(arg1);
		driver.findElement(By.name("txtPwd")).sendKeys(arg2);
		
		Thread.sleep(1000);
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='myStyle']")).click();
	}

}
