package FeatureLoginHotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelBookingPageFactory;

public class StepDefHJotel {
	private WebDriver driver;
	private HotelBookingPageFactory hf;
	
	@Given("^User is on hotel booking application page$")
	public void user_is_on_hotel_booking_application_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\ChromePath\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		hf = new HotelBookingPageFactory(driver);
		driver.get("file:///D:/Users/KAGRAWA1/Desktop/BDD/login.html");
	}

	@Then("^Check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
		
		String title=driver.findElement(By.xpath(".//*[@id='mainCnt']/div/div[1]/h1")).getText();
		System.out.println("Print  " + title);
		if(title.contentEquals("Hotel Booking Application")) 
			System.out.println("Title Matched");
		else 
			System.out.println("Title Not Matched");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.close();
	}

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		hf.setPfuname("capgemini");
		   Thread.sleep(1000);
		   hf.setPfpwd("capg1234");
		   Thread.sleep(1000);
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   hf.setPfbutton();
	}

	@Then("^navigate to hotel booking form page$")
	public void navigate_to_hotel_booking_form_page() throws Throwable {
		driver.navigate().to("file://///ndafile/GLC-G102/BDD/Selenium/hotelbooking.html");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.close();
	}

	@When("^user leaves user Name blank$")
	public void user_leaves_user_Name_blank() throws Throwable {
		   hf.setPfuname("");
		   Thread.sleep(1000);
	}

	@When("^clicks the Login button$")
	public void clicks_the_Login_button() throws Throwable {
	    hf.setPfbutton();
	    Thread.sleep(1000);
	}

	@Then("^display alert username msg$")
	public void display_alert_username_msg() throws Throwable {
	   driver.findElement(By.id("userErrMsg"));
	}

	@When("^user leaves password blank And clicks the button$")
	public void user_leaves_password_blank_And_clicks_the_button() throws Throwable {
		hf.setPfuname("capgemini");
		   Thread.sleep(1000);
		   hf.setPfpwd("");
		   Thread.sleep(1000);
		   hf.setPfbutton();
	}

	@Then("^display alert password msg$")
	public void display_alert_password_msg() throws Throwable {
	    driver.findElement(By.id("pwdErrMsg"));
	}

	@When("^user entry wrong details And clicks the button$")
	public void user_entry_wrong_details_And_clicks_the_button() throws Throwable {
		hf.setPfuname("capge");
		   Thread.sleep(1000);
		   hf.setPfpwd("cagr");
		   Thread.sleep(1000);
		   hf.setPfbutton();
	}

	@Then("^display alert msg box$")
	public void display_alert_msg_box() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	    System.out.println(alertMessage);
	    driver.close();
	}

}

