package proyectoTestCaseEmirates.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import proyectoTestCaseEmirates.Utils.WaitTime;
import proyectoTestCaseEmirates.userinterface.SelectFilter;

public class FilterBy implements Task {
    public static FilterBy theReserva() {
        return Tasks.instrumented(FilterBy.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectFilter.INPUT_RESIDENCE),
                Click.on(SelectFilter.INPUT_CHILDREN),
                Click.on(SelectFilter.SELECT_CHILDREN),
                Click.on(SelectFilter.INPUT_AGECHILDREN),
                Click.on(SelectFilter.SELECT_AGECHILDREN),
                Scroll.to(SelectFilter.OPTION_FILTERBY),
                Click.on(SelectFilter.CHECKBOX_POPULARFILTERS),
                Click.on(SelectFilter.CHECKBOX_STARS)
        );
        WaitTime.Time();
        
    }
}
