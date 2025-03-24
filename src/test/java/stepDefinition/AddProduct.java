package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webElement.AddProductsPageElements;


public class AddProduct {
	
	WebDriver driver;
	AddProductsPageElements addProductsPageElements;
	
	 public AddProduct() {
	        this.driver = Base.driver;
	        addProductsPageElements = PageFactory.initElements(driver, AddProductsPageElements.class);
	 }
	 
    @When("I click the Products button")
    public void i_click_the_products_button() {
    	addProductsPageElements.clickOnProduct();
    }
    
    @And("I click the add product button")
    public void i_click_the_add_product_button() {
    	addProductsPageElements.clickOnAddProduct();
    }

    @And("I enter {string} in the product name field")
    public void i_enter_product_name(String productName) {
    	addProductsPageElements.enterProductName(productName);
    }

    @And("I enter {string} in the slug field")
    public void i_enter_slug(String productSlug) {
    	
    }

    @And("I select {string} from the seller dropdown")
    public void i_select_seller(String seller) {
    	addProductsPageElements.selectSeller(seller);
    }

    @And("I select {string} from the tax dropdown")
    public void i_select_tax(String tax) {
    	addProductsPageElements.selectTax(tax);
    }

    @And("I enter {string} in the tags field")
    public void i_enter_tag(String tag) {
    	addProductsPageElements.enterTags(tag);
    }

    @And("I select {string} from the brands dropdown")
    public void i_select_brand(String brand) {
    	addProductsPageElements.selectBrand(brand);
    }

    @And("I enter {string} in the description field")
    public void i_enter_description(String description) {
    	addProductsPageElements.enterDescription(description);
    }

    @And("I upload {string} as the main image")
    public void i_upload_main_image(String pathMainImage) throws InterruptedException {
    	addProductsPageElements.uploadMainImage(pathMainImage);
    }

    @And("I upload {string} as other images")
    public void i_upload_other_images(String pathOtherImage) {
    	addProductsPageElements.uploadOtherImages(pathOtherImage);
    }

    @And("I select {string} for the type radio button")
    public void i_select_type(String type) {
        
    }

    @And("I select {string} for the stock limit radio button")
    public void i_select_stock_limit(String stockLimit) {
        
    }

    @And("I enter {string} in the measurement field")
    public void i_enter_measurement(String measurement) {
    	addProductsPageElements.enterMeasurement(measurement);
    }

    @And("I enter {string} in the price field")
    public void i_enter_price(String price) {
        
    }

    @And("I enter {string} in the discount price field")
    public void i_enter_discount_price(String discountPrice) {
        
    }

    @And("I enter {string} in the stock field")
    public void i_enter_stock(String stock) {
        
    }

    @And("I select {string} from the unit dropdown")
    public void i_select_unit(String unit) {
        
    }

    @And("I select {string} from the status dropdown")
    public void i_select_status(String status) {
        
    }

    @And("I click the add variant button")
    public void i_click_add_variant() {
        
    }

    @And("I select {string} from the category dropdown")
    public void i_select_category(String category) {
       
    }

    @And("I select {string} from the product type dropdown")
    public void i_select_product_type(String productType) {
        
    }

    @And("I enter {string} in the manufacturer field")
    public void i_enter_manufacturer(String manufacturer) {
        
    }

    @And("I select {string} from the made in dropdown")
    public void i_select_made_in(String madeIn) {
        
    }

    @And("I enter {string} in the FSSAI Lic. No. field")
    public void i_enter_fssai_lic_no(String fssaiLicNo) {
        
    }

    @And("I select {string} for the Is Returnable? radio button")
    public void i_select_is_returnable(String isReturnable) {
        
    }

    @And("I select {string} for the Is cancelable? radio button")
    public void i_select_is_cancelable(String isCancelable) {
        
    }

    @And("I select {string} for the Is COD allowed? radio button")
    public void i_select_is_cod(String isCOD) {
        
    }

    @And("I enter {string} in the total allowed quantity field")
    public void i_enter_total_allowed_quantity(String totalAllowedQuantity) {
        
    }

    @And("I select {string} for the product status radio button")
    public void i_select_product_status(String productStatus) {
        
    }

    @And("I click the save button")
    public void i_click_save_button() {
       
    }

    @Then("I should see a confirmation message {string}")
    public void i_should_see_confirmation_message(String expectedMessage) {
        
	}
}