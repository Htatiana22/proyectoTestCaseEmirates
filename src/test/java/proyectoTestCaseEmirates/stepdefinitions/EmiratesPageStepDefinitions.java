package proyectoTestCaseEmirates.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyectoTestCaseEmirates.model.BookHotelData;
import proyectoTestCaseEmirates.tasks.*;

import java.util.List;

public class EmiratesPageStepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user wants to book a hotel$")
    public void userWantsToBookAHotel () {
        OnStage.theActorCalled("Herika").wasAbleTo(OpenUp.thePage() , AcceptCookies.button());
    }

    @When("^user clicks on hotels option$")
    public void userClicksOnHotelsOption (List <BookHotelData> bookHotelData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FindHotels.enterDate(bookHotelData));
    }

    @Then("^should show the book page$")
    public void shouldShowTheBookPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(BookHotel.onThePage());
    }
    @Then("^the user makes the reservation$")
    public void theUserMakesTheReservation(List <BookHotelData> bookHotelData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FinalDetails.theReserve(bookHotelData));
    }
}
