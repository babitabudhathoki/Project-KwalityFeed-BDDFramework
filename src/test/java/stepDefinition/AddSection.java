package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webElement.AddSectionElements;

public class AddSection {
	
	WebDriver driver;
	AddSectionElements addSectionElements;
	
	 public AddSection() {
	        this.driver = Base.driver;
	        addSectionElements = PageFactory.initElements(driver, AddSectionElements.class);
	 }
	 
	
	@When("I click the featured section button")
	public void i_click_the_featured_section_button() {
		addSectionElements.clickOnFeaturedSections();
	}

	@And("I click the add section")
	public void i_click_the_add_section() {
		addSectionElements.clickOnAddSection();
	}

	@And("I enter {string} in the title for section field")
	public void i_enter_in_the_title_for_section_field(String string) {
		addSectionElements.enterTitleForSection(string);
	}

	@And("I enter {string} in the short description field")
	public void i_enter_in_the_short_description_field(String string) {
		addSectionElements.enterShortDescription(string);
	}

	@And("I select {string} from the category IDs dropdown")
	public void i_select_from_the_category_i_ds_dropdown(String string) {
		addSectionElements.selectCategoryId(string);
	}

	@And("I select {string} from the product types dropdown")
	public void i_select_from_the_product_types_dropdown(String string) {
		addSectionElements.selectProdcutType(string);
	}
	
	@Then("I click the save button of add section")
	public void i_click_the_save_button() {
		addSectionElements.clickOnSveBtn();
	}

}
