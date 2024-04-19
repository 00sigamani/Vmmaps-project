package Step_Demo;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "path_to_chrome_driver");
        driver = new ChromeDriver();
        driver.get("https://accounts.vmmaps.com/");
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        driver.findElement(By.id("username")).sendKeys("deivasigamani588@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Siga1234");
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        // Add verification steps for successful login
    }

    @When("I click on forgot password link")
    public void i_click_on_forgot_password_link() {
        driver.findElement(By.linkText("Forgot Password")).click();
    }

    @Then("I should be redirected to the forgot password page")
    public void i_should_be_redirected_to_the_forgot_password_page() {
        // Add verification steps for redirecting to forgot password page
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
