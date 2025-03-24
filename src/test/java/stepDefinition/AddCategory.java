package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webElement.AddCategoryElements;


public class AddCategory {
	
	WebDriver driver;
	AddCategoryElements addCategoryElements;
	
	 public AddCategory() {
	        this.driver = Base.driver;
	        addCategoryElements = PageFactory.initElements(driver, AddCategoryElements.class);
	 }
	 
	 @When("I click the categories button")
	 public void i_click_the_categories_button() {
		 addCategoryElements.clickOnCategories();
	 }

	 @And("I click the add categories")
	 public void i_click_the_add_categories() {
		 addCategoryElements.clickOnAddCategories();
	 }

	 @And("I select {string} from the parent category dropdown")
	 public void i_select_from_the_parent_category_dropdown(String categoryDropdown) {
		 addCategoryElements.selectParentCategory(categoryDropdown);
	 }

	 @And("I enter {string} in the category name field")
	 public void i_enter_in_the_category_name_field(String categoryName) {
		 addCategoryElements.enterCategoryName(categoryName);
	 }
	 
	 @And("I enter {string} in the slug field on category")
	 public void i_enter_in_the_slug_field(String slug) {
		 addCategoryElements.enterSlug(slug);
	 }

	 @And("I enter {string} in the category subtitle field")
	 public void i_enter_in_the_category_subtitle_field(String categorySubtitle) {
		 addCategoryElements.enterCategorySubtitle(categorySubtitle);
	 }

	 @And("I upload {string}")
	 public void i_upload(String imagePath) {
		 addCategoryElements.uploadImage(imagePath);
	 }

	 @Then("I click th save button")
	 public void i_click_th_save_button() {
		 addCategoryElements.clickOnSaveBtn();
	 }
}
