package proyectoTestCaseEmirates.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import proyectoTestCaseEmirates.userinterface.OptionHotels;

public class AcceptCookies implements Task {

    private OptionHotels optionHotels;
    public static AcceptCookies button() {
        return Tasks.instrumented(AcceptCookies.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OptionHotels.BUTTON_ACCEPT),
                Click.on(OptionHotels.BUTTON_HOTELS));
    }
}

