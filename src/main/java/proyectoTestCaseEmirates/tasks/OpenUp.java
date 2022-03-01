package proyectoTestCaseEmirates.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import proyectoTestCaseEmirates.userinterface.EmiratesPage;

public class OpenUp implements Task {
    private EmiratesPage emiratesPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(emiratesPage));
    }
}
