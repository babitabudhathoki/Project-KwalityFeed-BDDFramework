package webElement;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageElements {
	
	WebDriver driver;
	WebDriverWait wait;

    public LoginPageElements(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type = 'email']")WebElement emailTextField;

    @FindBy(xpath = "//input[@type = 'password']")WebElement passwordTextField;

    @FindBy(xpath = "//button[@class = 'btn btn-primary btn-block btn-lg shadow-lg mt-5 auth-btn']")WebElement loginButton;

    @FindBy(linkText = "Forgot Password?")WebElement forgotPasswordLink;

    @FindBy(linkText = "Seller Panel")WebElement sellerPanelButton;

    @FindBy(linkText = "Delivery Boy Panel")WebElement deliveryBoyPanelButton;
    
    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")WebElement errorOkButton;
    
    public String getLoginPageTitle() {
    	String title = driver.getTitle();
    	return title;
    }

    public void enterEmail(String email) {
    	wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.sendKeys(email);
    }

    public void enterPassword(String password) {
    	wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        passwordTextField.sendKeys(password);
    }

    public void clickLoginButton() {
    	wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }
    
    public String getDashboardPageTitle() {
    	String title = driver.getCurrentUrl();
    	return title;
    }

    public void clickForgotPasswordLink() {
    	wait.until(ExpectedConditions.elementToBeClickable(forgotPasswordLink));
        forgotPasswordLink.click();
    }

    public void clickSellerPanelButton() {
    	wait.until(ExpectedConditions.elementToBeClickable(sellerPanelButton));
        sellerPanelButton.click();
    }

    public void clickDeliveryBoyPanelButton() {
    	wait.until(ExpectedConditions.elementToBeClickable(deliveryBoyPanelButton));
        deliveryBoyPanelButton.click();
    }
    
    public void clickOnErrorOkButton() {
    	wait.until(ExpectedConditions.elementToBeClickable(errorOkButton));
    	errorOkButton.click();
    }
}


