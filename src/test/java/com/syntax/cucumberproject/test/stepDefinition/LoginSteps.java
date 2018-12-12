package com.syntax.cucumberproject.test.stepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;

	  @Given("^I open browser$")
	    public void i_open_browser() throws Throwable {
	         System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	         driver.manage().window().maximize();
	    }

	    @Given("^I navigate to the FreeCRM$")
	    public void i_navigate_to_the_FreeCRM() throws Throwable {
	        driver.get("https://www.freecrm.com");
	    }

	    @When("^I enter valid username and password$")
	    public void i_enter_valid_username_and_password() throws Throwable {
	       driver.findElement(By.name("username")).clear();
	       driver.findElement(By.name("username")).sendKeys("blackhonda2015");
	       driver.findElement(By.name("password")).clear();
	       driver.findElement(By.name("password")).sendKeys("Fly@honda123");
	       Thread.sleep(2000);
	    }

	    @When("^I click login button$")
	    public void i_click_login_button() throws Throwable {
	        driver.findElement(By.xpath("//input[@class=\"btn btn-small\"]")).click();
	    }

	    @Then("^I successfully logged in$")
	    public void i_successfully_logged_in() throws Throwable {
	    	String title=driver.getTitle();
	    	Assert.assertEquals("CRMPRO", title);
	    	Assert.assertEquals("CRMPRO", driver.getTitle());
	    	System.out.println("i successfully logged in");
	    }
	    
	    @Then("^I close the browser$")
	    public void i_close_the_browser() {
	        driver.quit();
	    }


	    @When("^I enter invalid username and password$")
	    public void i_enter_invalid_username_and_password() throws Throwable {
	    	driver.findElement(By.name("username")).clear();
		       driver.findElement(By.name("username")).sendKeys("inv223");
		       driver.findElement(By.name("password")).clear();
		       driver.findElement(By.name("password")).sendKeys("adfadf");
		       Thread.sleep(2000);
		    }

	    @Then("^I see the error message$")
	    public void i_see_the_error_message() throws Throwable {
	    	String title=driver.getTitle();
	    	Assert.assertEquals("CRMPRO", title);
	    	Assert.assertEquals("CRMPRO", driver.getTitle());
	        System.out.println("I see the error message");
	    }

	}