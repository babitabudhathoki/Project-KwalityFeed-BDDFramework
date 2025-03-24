package webElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddSectionElements {
 
	WebDriver driver;
	WebDriverWait wait;

	public AddSectionElements(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
		
}
	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[2]/ul/li[10]/a")
	WebElement featuredSectionbtn;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[2]/ul/li[10]/ul/li[1]/a")
	WebElement addSectionBtn; 
	
	@FindBy(xpath = "//input[@placeholder = 'Ex : Featured Products / Products on Sale']")
	WebElement titleForSectionField;
	
	@FindBy(xpath = "//input[@placeholder = 'Ex : Weekends deal goes here']")
	WebElement shortDescriptionField;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[3]")
	WebElement categoryIDsDropdown;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/span/span/span/ul/li[2]")
	WebElement CategoryIDsOption;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[4]/select")
	WebElement productTypesDropdown;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/footer/div/button[1]")
	WebElement saveBtn;
	
	public void clickOnFeaturedSections() {
		wait.until(ExpectedConditions.elementToBeClickable(featuredSectionbtn));
		featuredSectionbtn.click();
	}
	
	public void clickOnAddSection() {
		wait.until(ExpectedConditions.elementToBeClickable(addSectionBtn));
		addSectionBtn.click();
	}
	
	public void enterTitleForSection(String titleForSection) {
		wait.until(ExpectedConditions.visibilityOf(titleForSectionField));
		titleForSectionField.sendKeys(titleForSection);
	}
		
	public void enterShortDescription(String shortDescription) {
		wait.until(ExpectedConditions.visibilityOf(shortDescriptionField));
		shortDescriptionField.sendKeys(shortDescription);
	}
	
	public void selectCategoryId(String categories) {
		wait.until(ExpectedConditions.visibilityOf(categoryIDsDropdown));
//		new Select(categoryIDsDropdown).selectByVisibleText(categories);
		categoryIDsDropdown.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(CategoryIDsOption).click().perform();
		
		
	}
	
	public void selectProdcutType(String productType) {
		wait.until(ExpectedConditions.visibilityOf(productTypesDropdown));
		new Select(productTypesDropdown).selectByVisibleText(productType);
	}
	
	public void clickOnSveBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
	}
			
}


