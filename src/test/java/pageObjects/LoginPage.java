package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "exampleInputEmail1")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "exampleInputPassword1")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(id = "member_login")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id=\"navbarResponsive\"]/ul/li[5]/a")
	@CacheLookup
	WebElement btnSignin;
	
	
	
	@FindBy(xpath = "//*[@id=\"dropdown09\"]/span")
	@CacheLookup
	WebElement userdropdown;
	
	
	
	@FindBy(xpath = "//*[@id=\"block-menu-menu-after-login-menu\"]/div/ul/li[6]/a")
	@CacheLookup
	WebElement lnkLogout;

	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickDropdown() {
		userdropdown.click();
	}
	
	public void clickLogin() {
		btnLogin.click();
	}


public void clicksignin() {
	btnSignin.click();
}

	public void clickLogout() {
		lnkLogout.click();
	}
}
