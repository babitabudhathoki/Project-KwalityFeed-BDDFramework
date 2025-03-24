package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webElement.LoginPageElements;

public class LoginPageSteps {
	
	WebDriver driver;
    LoginPageElements loginPageElements;

    public LoginPageSteps() {
        this.driver = Base.driver;
        loginPageElements = PageFactory.initElements(driver, LoginPageElements.class);
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
    	loginPageElements.getLoginPageTitle();
        System.out.println(loginPageElements.getLoginPageTitle());
    }

    @When("I enter a valid {string} in the email field of admin panel")
    public void i_enter_a_valid_email(String email) {
    	loginPageElements.enterEmail(email);
    }

    @And("I enter a valid {string} in the password field of admin panel")
    public void i_enter_a_valid_password(String password) {
    	loginPageElements.enterPassword(password);
    }

    @And("I click on the login button of admin panel")
    public void i_click_on_the_login_button() {
    	loginPageElements.clickLoginButton();
    }

    @And("I should see the dashboard")
    public void i_should_see_the_dashboard() {
    	loginPageElements.getDashboardPageTitle();
    	System.out.println(loginPageElements.getDashboardPageTitle());
    }
    
    @Then("I click on the error popup")
    public void i_click_on_the_error_popup() {
    	loginPageElements.clickOnErrorOkButton();
    }

    @When("I click on the forgot password link")
    public void i_click_on_the_forgot_password_link() {
    	loginPageElements.clickForgotPasswordLink();
    }

    @Then("I should see the forgot password page")
    public void i_should_see_the_forgot_password_page() {
    }

    @When("I click on the seller panel button")
    public void i_click_on_the_seller_panel_button() {
    	loginPageElements.clickSellerPanelButton();
    }

    @Then("I should see the seller panel page")
    public void i_should_see_the_seller_panel_page() {
        loginPageElements.clickSellerPanelButton();
    }
    
    @And("I enter a valid {string} in the email field of seller account")
    public void i_enter_a_valid_in_the_email_field_of_seller_account() {
    	
    }
    
    @And("I enter a valid {string} in the password field of seller account")
    public void i_enter_valid_in_the_password_field_of_seller_account() {
    	
    }
    
    @Then("I click the seller login button")
    public void i_click_the_seller_login_button() {
    	
    }

    @When("I click on the delivery boy panel button")
    public void i_click_on_the_delivery_boy_panel_button() {
    	loginPageElements.clickDeliveryBoyPanelButton();
    }

    @Then("I should see the delivery boy panel page")
    public void i_should_see_the_delivery_boy_panel_page() {
        
    }
    
    @And("I enter a valid {string} in the email field of delivery boy account")
    public void i_enter_a_valid_in_the_email_field_of_delivery_boy_account(){
    	
    }
    
    @And("I enter a valid {string} in the password field of delivery boy account")
    public void i_enter_a_valid_in_the_password_field_of_delivery_boy_account() {
    	
    }
    
    @Then("I click the delivery boy login button")
    public void i_click_the_delivery_bot_login_button() {
}
}


