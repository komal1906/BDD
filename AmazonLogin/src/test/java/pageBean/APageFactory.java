package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class APageFactory {
WebDriver driver;
	
	@FindBy(how=How.NAME, using="email")
	@CacheLookup
	WebElement pfemail;

	@FindBy(id="continue")
	@CacheLookup
	WebElement pfbcoutine;
	
	@FindBy(id="signInSubmit")
	@CacheLookup
	WebElement pfblogin;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement pfpwd;

	public APageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPfemail() {
		return pfemail;
	}

	public void setPfemail(String semail) {
		pfemail.sendKeys(semail);
	}

	public WebElement getPfbcoutine() {
		return pfbcoutine;
	}

	public void setPfbcoutine() {
		pfbcoutine.click();
	}

	public WebElement getPfblogin() {
		return pfblogin;
	}

	public void setPfblogin() {
		pfblogin.click();
	}

	public WebElement getPfpwd() {
		return pfpwd;
	}

	public void setPfpwd(String spwd) {
		pfpwd.sendKeys(spwd);
	}
}
