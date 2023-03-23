package stepDefinitions;

import java.io.File;
import java.io.IOException;

//import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import POM.PageObjectModel;
import businessLib.GuiLib1;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When; 
//import io.cucumber.java.en.When;
public class StepDefnopcommerce{
WebDriver driver;
PageObjectModel nop;
public GuiLib1 gui1;



@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN 7\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://admin-demo.nopcommerce.com/admin/");
	    nop=new PageObjectModel(driver);
	    gui1=new GuiLib1(driver);
}

@Given("some other precondition")//log in
public void some_other_precondition() {
	WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
	Email.clear();
	Email.sendKeys("admin@yourstore.com");
	WebElement passwrd=driver.findElement(By.xpath("//input[@name='Password']"));
	passwrd.clear();
	passwrd.sendKeys("admin");
	WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	File f1=new File("C:\\Users\\WIN 7\\Desktop\\section one\\ph.jpeg");
	try {
		FileHandler.copy(f, f1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
   
    //File f =((TakesScreenShot) driver).getScreenShotAs(OutputType.FILE);
}
@When("I complete action")
public void i_complete_action() {
	
//    File f =((TakesScreenShot) driver).getScreenShotAs(OutputType.FILE);
//    String Screenshot123 =((TakesScreenShot)driver).getScreenshot();
}

@When("some other action")
public void some_other_action() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("yet another action")
public void yet_another_action() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("check more outcomes")
public void check_more_outcomes() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I want to write a step with name1")
public void i_want_to_write_a_step_with_name1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I check for the {int} in step")
public void i_check_for_the_in_step(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I verify the success in step")
public void i_verify_the_success_in_step() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I want to write a step with name2")
public void i_want_to_write_a_step_with_name2() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I verify the Fail in step")
public void i_verify_the_fail_in_step() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
