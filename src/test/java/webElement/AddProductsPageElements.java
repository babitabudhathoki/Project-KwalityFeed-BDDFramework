package webElement;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductsPageElements {

	WebDriver driver;
	WebDriverWait wait;

	public AddProductsPageElements(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[2]/ul/li[5]/a")
	WebElement product;

	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[2]/ul/li[5]/ul/li[1]/a")
	WebElement addProduct;

	@FindBy(xpath = "//input[@placeholder = 'Enter Product Name']")
	WebElement productNameTextField;

	@FindBy(id = "seller_id")
	WebElement sellerDropdown;

	@FindBy(id = "tax_id")
	WebElement taxDropdown;

	@FindBy(id = "tags")
	WebElement tagsTextField;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/form/div[1]/div[2]/div[2]/div[6]/div/div/div[2]")
	WebElement brandsDropdown;

	@FindBy(css = "#tinymce")
	WebElement descriptionTextField;

//	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/form/div[1]/div[2]/div[2]/div[8]/div/div")
//	WebElement mainImageUpload;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div[2]/div/form/div[1]/div[2]/div[2]/div[8]/div/div/label[1]/i")
	WebElement mainImageUpload;

	@FindBy(xpath = "//form[@data-v-a901b314]/div[1]/div[2]/div[2]/div[8]/div/div]")
	WebElement otherImageUpload;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div/div[1]")
	WebElement typeRadioButton;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div/div[2]")
	WebElement stockLimitRadioButton;

	@FindBy(xpath = "//*[@id = 'packate_div']/div/div[1]")
	WebElement measurementTextField;

	@FindBy(xpath = "//*[@id = 'packate_div']/div/div[2]")
	WebElement priceTextField;

	@FindBy(xpath = "//*[@id = 'packate_div']/div/div[3]")
	WebElement discountPriceTextField;

	@FindBy(xpath = "//*[@id = 'packate_div']/div/div[4]")
	WebElement stockTextField;

	@FindBy(xpath = "//*[@id = 'packate_div']/div/div[5]")
	WebElement unitDropdown;

	@FindBy(xpath = "//*[@id = 'packate_div']/div/div[6]")
	WebElement statusDropdown;

	@FindBy(xpath = "")
	WebElement addVariantButton;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div[1]/div/select")
	WebElement categoryDropdown;

	@FindBy()
	WebElement productTypeDropdown;

	@FindBy()
	WebElement manufacturerTextField;

	@FindBy()
	WebElement madeInDropdown;

	@FindBy()
	WebElement fssiLicNoTextfield;

	@FindBy()
	WebElement isReturnableRadioButton;

	@FindBy()
	WebElement maxReturnDaysTextField;

	@FindBy()
	WebElement isCancelableRadioButton;

	@FindBy()
	WebElement tillWhichStatusDropdown;

	@FindBy()
	WebElement isCodAllowedRadioButton;

	@FindBy()
	WebElement totalAllowedQuantityTextField;

	@FindBy()
	WebElement productStatusRadioButton;

	@FindBy()
	WebElement saveButton;

	@FindBy()
	WebElement clearButton;

	@FindBy()
	WebElement confirmationMessage;

	public void clickOnProduct() {
		wait.until(ExpectedConditions.elementToBeClickable(product));
		product.click();
	}

	public void clickOnAddProduct() {
		wait.until(ExpectedConditions.elementToBeClickable(addProduct));
		addProduct.click();
	}

	public void enterProductName(String productName) {
		wait.until(ExpectedConditions.visibilityOf(productNameTextField));
		productNameTextField.sendKeys(productName);
	}

	public void selectSeller(String seller) {
		wait.until(ExpectedConditions.visibilityOf(sellerDropdown));
		new Select(sellerDropdown).selectByVisibleText(seller);
	}

	public void selectTax(String tax) {
		wait.until(ExpectedConditions.visibilityOf(taxDropdown));
		new Select(taxDropdown).selectByVisibleText(tax);
	}

	public void enterTags(String tags) {
		wait.until(ExpectedConditions.visibilityOf(tagsTextField));
		tagsTextField.sendKeys(tags);
	}

	public void selectBrand(String brand) {
//    wait.until(ExpectedConditions.visibilityOf(brandsDropdown));
//    new Select(brandsDropdown).selectByVisibleText(brand);
	}

	public void enterDescription(String descriptionText) {
		driver.switchTo().frame(0);
		descriptionTextField.sendKeys(descriptionText);
		driver.switchTo().defaultContent();

	}

	public void uploadMainImage(String imagePath) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", mainImageUpload);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(mainImageUpload));
		mainImageUpload.sendKeys(imagePath);
	}

	public void uploadOtherImages(String imagePath) {
		wait.until(ExpectedConditions.visibilityOf(otherImageUpload));
		otherImageUpload.sendKeys(imagePath);
	}

	public void selectType(String type) {
		wait.until(ExpectedConditions.visibilityOf(typeRadioButton));
		typeRadioButton.click();
	}

	public void selectStockLimit(String stockLimit) {
		wait.until(ExpectedConditions.visibilityOf(stockLimitRadioButton));
		stockLimitRadioButton.click();
	}

	public void enterMeasurement(String measurement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", mainImageUpload);
		measurementTextField.sendKeys(measurement);
	}

	public void enterPrice(String price) {
		wait.until(ExpectedConditions.visibilityOf(priceTextField));
		priceTextField.sendKeys(price);
	}

	public void enterDiscountPrice(String discountPrice) {
		wait.until(ExpectedConditions.visibilityOf(discountPriceTextField));
		discountPriceTextField.sendKeys(discountPrice);
	}

	public void enterStock(String stock) {
		wait.until(ExpectedConditions.visibilityOf(stockTextField));
		stockTextField.sendKeys(stock);
	}

	public void selectUnit(String unit) {
		wait.until(ExpectedConditions.visibilityOf(unitDropdown));
		new Select(unitDropdown).selectByVisibleText(unit);
	}

	public void selectStatus(String status) {
		wait.until(ExpectedConditions.visibilityOf(statusDropdown));
		new Select(statusDropdown).selectByVisibleText(status);
	}

	public void clickAddVariantButton() {
		wait.until(ExpectedConditions.elementToBeClickable(addVariantButton));
		addVariantButton.click();
	}

	public void selectCategory(String category) {
		wait.until(ExpectedConditions.visibilityOf(categoryDropdown));
		new Select(categoryDropdown).selectByVisibleText(category);
	}

	public void selectProductType(String productType) {
		wait.until(ExpectedConditions.visibilityOf(productTypeDropdown));
		new Select(productTypeDropdown).selectByVisibleText(productType);
	}

	public void enterManufacturer(String manufacturer) {
		wait.until(ExpectedConditions.visibilityOf(manufacturerTextField));
		manufacturerTextField.sendKeys(manufacturer);
	}

	public void selectMadeIn(String madeIn) {
		wait.until(ExpectedConditions.visibilityOf(madeInDropdown));
		new Select(madeInDropdown).selectByVisibleText(madeIn);
	}

	public void enterFssai(String fssai) {
		wait.until(ExpectedConditions.visibilityOf(fssiLicNoTextfield));
		fssiLicNoTextfield.sendKeys(fssai);
	}

	public void selectIsReturnable(String isReturnable) {
		wait.until(ExpectedConditions.visibilityOf(isReturnableRadioButton));
		isReturnableRadioButton.click();
	}

	public void selectIsCancelable(String isCancelable) {
		wait.until(ExpectedConditions.visibilityOf(isCancelableRadioButton));
		isCancelableRadioButton.click();
	}

	public void selectIsCodAllowed(String isCodAllowed) {
		wait.until(ExpectedConditions.visibilityOf(isCodAllowedRadioButton));
		isCodAllowedRadioButton.click();
	}

	public void enterTotalAllowedQuantity(String totalAllowedQuantity) {
		wait.until(ExpectedConditions.visibilityOf(totalAllowedQuantityTextField));
		totalAllowedQuantityTextField.sendKeys(totalAllowedQuantity);
	}

	public void selectProductStatus(String productStatus) {
		wait.until(ExpectedConditions.visibilityOf(productStatusRadioButton));
		productStatusRadioButton.click();
	}

	public void clickSaveButton() {
		wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButton.click();
	}

	public String getConfirmationMessage() {
		wait.until(ExpectedConditions.visibilityOf(confirmationMessage));
		return confirmationMessage.getText();
	}
}
