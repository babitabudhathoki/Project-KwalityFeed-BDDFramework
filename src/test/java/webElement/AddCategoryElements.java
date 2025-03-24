package webElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCategoryElements {

	WebDriver driver;
	WebDriverWait wait;

	public AddCategoryElements(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/ul/li[4]/a")
	WebElement categories;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/ul/li[4]/ul/li[1]/a")
	WebElement addCategories;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[1]/select")
	WebElement parentCategoryDropdown;
	
	@FindBy(xpath = "//input[@placeholder = 'Enter category name.']")
	WebElement categoryNameField;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[3]/input")
	WebElement slugField;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[4]/input")
	WebElement categorySubtitleField;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[5]/div")
	WebElement imageUpload;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/footer/div/button[1]")
	WebElement saveBtn;
	
	public void clickOnCategories() {
		wait.until(ExpectedConditions.elementToBeClickable(categories));
		categories.click();
	}
	
	public void clickOnAddCategories() {
		wait.until(ExpectedConditions.elementToBeClickable(addCategories));
		addCategories.click();
	}
	
	public void selectParentCategory(String parentCategory) {
		wait.until(ExpectedConditions.visibilityOf(parentCategoryDropdown));
		new Select(parentCategoryDropdown).selectByVisibleText(parentCategory);
	}
	
	public void enterCategoryName(String categoryName) {
		wait.until(ExpectedConditions.visibilityOf(categoryNameField));
		categoryNameField.sendKeys(categoryName);
	}
	
	public void enterSlug(String slug) {
		wait.until(ExpectedConditions.visibilityOf(slugField));
		slugField.sendKeys(slug);
	}
	
	public void enterCategorySubtitle(String categorySubtittle) {
		wait.until(ExpectedConditions.visibilityOf(categorySubtitleField));
		categoryNameField.sendKeys(categorySubtittle);
	}
	
	public void uploadImage(String path) {
		wait.until(ExpectedConditions.visibilityOf(imageUpload));
		imageUpload.sendKeys(path);
	}
	
	public void clickOnSaveBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
	}

}
