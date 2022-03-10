package proyectoTestCaseEmirates.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import proyectoTestCaseEmirates.userinterface.BookingPgResult;

public class OpenBooking implements Task {
    private BookingPgResult BookingPgResult;
    public static OpenBooking thePage() {
        return Tasks.instrumented(OpenBooking.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(BookingPgResult));

    }
}
