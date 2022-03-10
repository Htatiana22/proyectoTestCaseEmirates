package proyectoTestCaseEmirates.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyectoTestCaseEmirates.model.BookHotelData;
import proyectoTestCaseEmirates.tasks.ContinueBooking;
import proyectoTestCaseEmirates.tasks.FilterBy;
import proyectoTestCaseEmirates.tasks.OpenBooking;

import java.util.List;

public class BookingPageStepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user wants to filter the search$")
    public void user_wants_to_filter_the_search() {
        OnStage.theActorCalled("Tatiana").wasAbleTo(OpenBooking.thePage());
    }


    @When("^user clicks filter by section$")
    public void user_clicks_filter_by_section() {
        OnStage.theActorCalled("Tatiana").attemptsTo(FilterBy.theReserva());

    }

    @Then("^should automatically load the results according to the selected filter$")
    public void should_automatically_load_the_results_according_to_the_selected_filter(List<BookHotelData> bookHotelData) {
        OnStage.theActorCalled("Tatiana").attemptsTo(ContinueBooking.thePage(bookHotelData));

    }
}
