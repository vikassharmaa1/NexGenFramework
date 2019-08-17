package com.freecrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(name = "email")
	WebElement uname;
	@FindBy(name = "password")
	WebElement pass;
	@FindBy(xpath = "/html/body/div[1]/div/div/form/div/div[3]")
	WebElement loginButton;

	public void loginToCRM(String usernameApp, String passwordApp) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		uname.sendKeys(usernameApp);
		pass.sendKeys(passwordApp);
		loginButton.click();
	}

}
