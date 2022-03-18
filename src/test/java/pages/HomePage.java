package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class HomePage extends BaseClass{
	
	private By oWelcome = By.xpath("//h3[contains(text(),' Welcome!')]");
	private By oLogout = By.xpath("//a[text()='Logout']");
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage validateHomePage() {
		if(driver.findElement(oWelcome).isDisplayed() && (driver.findElement(oLogout).isDisplayed())) {
			System.out.println("User Landed to the Home Page!!!");
			return this;
		}else {
			System.out.println("User not in Home Page.");
			return this;
		}
	}
	 
	public LoginPage clickonLogout() {
		driver.findElement(oLogout).click();
		return new LoginPage(driver);
	}
	
	
}
