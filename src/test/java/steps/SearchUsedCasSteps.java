package steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import pages.action.CarsGuideHomePageActions;
import pages.action.CarsSearchPageActions;
import pages.action.UsedCarSearchPageAction;

public class SearchUsedCasSteps 
{
	CarsGuideHomePageActions carGuideHomePage = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();
	UsedCarSearchPageAction usedCarSearchPageAction = new UsedCarSearchPageAction(); 
	
	@And("^select car model$")
	public void select_car_model(List<String> list)
	{
		String model = list.get(1);
		usedCarSearchPageAction.selectCarModel(model);
		
	}
}
