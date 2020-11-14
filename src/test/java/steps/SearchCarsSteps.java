package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.action.CarsGuideHomePageActions;
import pages.action.CarsSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps 
{
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();

	@Given("^I am on the home page \"([^\"]*)\" of application$")
	public void i_am_on_the_home_page_of_application(String url) {
		SeleniumDriver.openPage(url);

	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
		String menu = list.get(1);
		System.out.println("menu:"+menu);
		carsGuideHomePageActions.moveToBuySellMenu();

	}

	@And("^Click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable 
	{
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from anymake dropdown$")
	public void select_carbrand_as_from_anymake_dropdown(String carBrand)
	{
		carsSearchPageActions.selectCarMake(carBrand);

	}

	@And("^select car model as \"([^\"]*)\" from selectmodel dropdown$")
	public void select_car_model_as_from_selectmodel_dropdown(String carModel)
	{
		carsSearchPageActions.selectCarModel(carModel);

	}

	@And("^select location as \"([^\"]*)\" from selectLocation dropdown$")
	public void select_location_as_from_selectLocation_dropdown(String location)
	{
		carsSearchPageActions.selectLocation(location);
	}

	@And("^select price as \"([^\"]*)\" from price dropdown$")
	public void select_price_as_from_price_dropdown(String carPrice) 
	{
		carsSearchPageActions.selectCarPrice(carPrice);

	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button()
	{
		carsSearchPageActions.clickOnFindMyNextCarBtn();

	}

	@Then("^I should see the list of all searched cars$")
	public void i_should_see_the_list_of_all_searched_cars(){
		System.out.println("car list found");

	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String pageTitle) 
	{
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, pageTitle);

	}


}
