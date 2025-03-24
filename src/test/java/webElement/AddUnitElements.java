package webElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUnitElements {

	WebDriver driver;
	WebDriverWait wait;

	public AddUnitElements(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#sidebar > div > div.sidebar-menu > ul > li.sidebar-item.active.has-sub > ul > li.submenu-item.active > a")
	WebElement unitsBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/section/div/div[1]/span/button")
	WebElement addUnit;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[1]/input")
	WebElement unitNameField;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[2]/input")
	WebElement shortCodeField;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[3]/select")
	WebElement parentUnitDropdown;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/div[4]/input")
	WebElement conversionField;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/footer/div/button[1]")
	WebElement saveBtn;
	
	public void clickOnUnits() {
		wait.until(ExpectedConditions.elementToBeClickable(unitsBtn));
		unitsBtn.click();
	}
	
	public void clickOnAddUnit() {
		addUnit.click();
	}

	public void enterUnitName(String unitName) {
		unitNameField.sendKeys(unitName);
	}

	public void enterShortCode(String shortCode) {
		shortCodeField.sendKeys(shortCode);
	}

	public void selectParentUnit(String parentUnit) {
		new Select(parentUnitDropdown).selectByVisibleText(parentUnit);
	}

	public void enterConversion(String conversion) {
		conversionField.sendKeys(conversion);
	}

	public void clickOnSaveBtn() {
		saveBtn.click();
	}
}
