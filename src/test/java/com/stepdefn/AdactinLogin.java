package com.stepdefn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AdactinLogin {
	WebDriver driver;
	@Given("User is in the Adactin Homepage")
	public void tc00() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("User should enter Username and password")
	public void tc01() {
		WebElement txtUsername = driver.findElement(By.id("email"));
		   txtUsername.sendKeys("1balagurur1992");
		   WebElement password = driver.findElement(By.id("pass"));
		   password.sendKeys("7845751512");
	}

	@When("User should click login button")
	public void tc02() {
	   WebElement loginbtn = driver.findElement(By.name("login"));
	   loginbtn.click();
	}

	@Then("User should check title second page and verify success")
	public void tc03() {
		String title = driver.getTitle();
		System.out.println(title);
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		
	    
	}

	
}
