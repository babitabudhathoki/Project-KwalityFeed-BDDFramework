package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webElement.AddUnitElements;

public class AddUnit {
	
	WebDriver driver;
	AddUnitElements addUnitElements;
	
	 public AddUnit() {
	        this.driver = Base.driver;
	        addUnitElements = PageFactory.initElements(driver, AddUnitElements.class);
	 }
	
	@When("I click the units button")
	public void i_click_the_units_button() {
		addUnitElements.clickOnUnits();
	}

	@And("I click the add unit")
	public void i_click_the_add_unit() {
		addUnitElements.clickOnAddUnit();
	}

	@And("I enter {string} in the title for unit name field")
	public void i_enter_in_the_title_for_unit_name_field(String string) {
		addUnitElements.enterUnitName(string);
	}

	@And("I enter {string} in the short Code field")
	public void i_enter_in_the_short_code_field(String string) {
		addUnitElements.enterShortCode(string);
	}

	@And("I select {string} from the parent unit dropdown")
	public void i_select_from_the_parent_unit_dropdown(String string) {
		addUnitElements.selectParentUnit(string);
	}

	@And("I enter {string} in the conversion field")
	public void i_enter_in_the_conversion_field(String string) {
		addUnitElements.enterConversion(string);
	}

	@Then("I click the save button of add unit")
	public void i_click_the_save_button_of_add_unit() {
		addUnitElements.clickOnSaveBtn();
	}


}
