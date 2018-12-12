package com.syntax.cucumberproject.test.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewUserSteps {

	WebDriver driver;

	@Given("^I open the browser$")
	public void i_open_browser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^I navigate to FreeCRM$")
	public void i_navigate_to_the_FreeCRM() {
		driver.get("https://www.freecrm.com");
	}

	@When("^I am on FreeCRM site I click on signup$")
	public void i_am_on_FreeCRM_site_I_click_on_signup() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[2]//a[1]")).click();
	}

	@When("^I click on drop down menu and select Free Edition$")
	public void i_click_on_drop_down_menu_and_select_Free_Edition() throws InterruptedException {
		Thread.sleep(2000);
		Select edition = new Select(driver.findElement(By.xpath("//select[@id='payment_plan_id']")));
		edition.selectByVisibleText("Free Edition");
	}

	@When("^I fill in the new user information$")
	public void i_fill_in_the_new_user_information() throws InterruptedException {
		driver.findElement(By.name("first_name")).sendKeys("John");
		driver.findElement(By.name("surname")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("johndoe00@jd.com");
		driver.findElement(By.name("email_confirm")).sendKeys("johndoe00@jd.com");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("johndoe0000");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abcd23343");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("abcd23343");

	}

	@When("^I click on the agree terms box$")
	public void i_click_on_the_agree_terms_box() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='myButton']")).click();

	}

	@When("^I fill in the company name and number$")
	public void i_fill_in_the_company_information_and_I_select_country() {
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("abcd1234 lc");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456789");
	}

	@When("^I click on continue button$")
	public void i_click_on_continue_button() {
		driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();

	}

	@Then("^I successfully created new user$")
	public void i_successfully_created_new_user() throws InterruptedException {
		System.out.println("NEW USER ACCOUNT CREATED SUCCESSFULLY");
	}

}
