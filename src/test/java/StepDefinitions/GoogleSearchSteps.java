package StepDefinitions;

import DriverUtils.DriverInitiation;
import PageFactory.GoogleSearchPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchSteps {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    DriverInitiation driverInitiated = new DriverInitiation();
    WebDriver driver = driverInitiated.webdriver;

    public GoogleSearchSteps() throws Exception {
    }

    @Given("browser is open")
    public void browser_is_open() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step: browser_is_open");
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step: user_is_on_google_search_page");
        driver.get("https://www.google.com/");

//System.out.println("That button is there" + driver.findElement(noThanksButton).isDisplayed());
//        if (driver.findElement(noThanksButton).isDisplayed()) {
//            System.out.println("No thanks is the there");
//            driver.findElement(By.name("No thanks")).click();
//        }
    }

    @When("User enters a text in the search box")
    public void user_enters_a_text_in_the_search_box() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step: user_enters_a_text_in_the_search_box");
        driver.findElement(googleSearchPage.textboxXpath).click();
        driver.findElement(googleSearchPage.textboxXpath).click();
        driver.findElement(googleSearchPage.textboxXpath).sendKeys("automation step by step");

    }

    @And("user presses enter")
    public void user_presses_enter() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step: user_presses_enter");
        driver.findElement(googleSearchPage.textboxXpath).sendKeys(Keys.ENTER);

    }

    @Then("check search works on google")
    public void check_search_works_on_google() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step: check_search_works_on_google");
        By resultText = By.xpath("//*[(@id=\"result-stats\")]");
        String searchResultText = driver.findElement(resultText).getText();
        System.out.println("searchResultText is - " + searchResultText);
        driver.getPageSource().contains("Online Courses");
        driver.quit();
    }
}
