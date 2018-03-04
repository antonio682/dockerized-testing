package com.testator.dockerizedtesting.bbd.steps;

import com.testator.dockerizedtesting.bbd.config.CucumberConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;


public class FacebookLoginSteps extends CucumberConfig {

    private WebDriver driver;

    @Given("^we want to log in facebook$")
    public void fillCredentials(String email, String pass) throws Throwable {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        driver.get("https://www.facebook.es");
        System.out.print("Done!");
    }

    @When("^we tΩry login with email \"([^\"]*)\" and  password \"([^\"]*)\"$")
    public void wePerformTheSearch(String emailAddress, String pass) throws Throwable {
       WebElement email = driver.findElement(By.name("email"));
       email.sendKeys(emailAddress);


       WebElement password = driver.findElement(By.name("pass"));
       password.sendKeys(pass);


       WebElement button = driver.findElement(By.id("u_0_3"));
       button.click();
       System.out.print("Done 2!");
    }

    @Then("^successful if title web page is \"([^\"]*)\"$")
    public void weReceiveAResponse(String title) throws Throwable {
        Assert.assertTrue("Bad title", driver.getTitle().equalsIgnoreCase(title));
        driver.quit();
        System.out.print("Done 3!");
    }
}
