package FeatureLoginA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.APageFactory;

public class StepDefA {
	private WebDriver driver;
	private APageFactory hf;

@Given("^User is on Amazon application page$")
public void user_is_on_Amazon_application_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\ChromePath\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	hf = new APageFactory(driver);
	driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
}

@When("^user enters valid data$")
public void user_enters_valid_data() throws Throwable {
	hf.setPfemail("917500800149");
	   Thread.sleep(1000);
	   hf.setPfbcoutine();
	   Thread.sleep(1000);
	   hf.setPfpwd("28081998");
	   Thread.sleep(1000);
	   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	  hf.setPfblogin();
}

@Then("^navigate to shopping form page$")
public void navigate_to_shopping_form_page() throws Throwable {
	driver.navigate().to("https://www.amazon.in/ap/signin");
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	Thread.sleep(1000);
	driver.close();
}

@When("^user leaves MobileNo empty$")
public void user_leaves_MobileNo_empty() throws Throwable {
	 hf.setPfemail("");
	    Thread.sleep(1000);
}

@When("^clicks the continue button$")
public void clicks_the_continue_button() throws Throwable {
	hf.setPfbcoutine();
	   Thread.sleep(1000);
}

@Then("^display alert mobileNo msg$")
public void display_alert_mobileNo_msg() throws Throwable {
	driver.findElement(By.className("a-alert-content"));
}

@When("^user leaves password empty$")
public void user_leaves_password_empty() throws Throwable {
	hf.setPfemail("917500800149");
	   Thread.sleep(1000);
	   hf.setPfbcoutine();
	   Thread.sleep(1000);
	   hf.setPfpwd("");
	   Thread.sleep(1000);
}

@When("^clicks the Login button$")
public void clicks_the_Login_button() throws Throwable {
	hf.setPfblogin();
    Thread.sleep(1000);
}

@Then("^display alert password msg$")
public void display_alert_password_msg() throws Throwable {
	driver.findElement(By.className("a-alert-content"));
}

@When("^user enters MobileNo wrong$")
public void user_enters_MobileNo_wrong() throws Throwable {
	 hf.setPfemail("12345");
	    Thread.sleep(1000);
}

@Then("^display alert mobileNo msg box$")
public void display_alert_mobileNo_msg_box() throws Throwable {
	driver.findElement(By.className("a-alert-heading")).getText();
	driver.findElement(By.className("a-list-item")).getText();
}

@When("^user enters password wrong$")
public void user_enters_password_wrong() throws Throwable {
	hf.setPfemail("917500800149");
	   Thread.sleep(1000);
	   hf.setPfbcoutine();
	   Thread.sleep(1000);
	   hf.setPfpwd("sdguyedf");
	   Thread.sleep(1000);
}

@Then("^display alert password msg box$")
public void display_alert_password_msg_box() throws Throwable {
	driver.findElement(By.className("a-alert-heading")).getText();
	driver.findElement(By.className("a-alert-content")).getText();
}



}

