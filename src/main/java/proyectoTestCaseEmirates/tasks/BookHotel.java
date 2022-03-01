package proyectoTestCaseEmirates.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import proyectoTestCaseEmirates.userinterface.BookingPage;

public class BookHotel implements Task {
    private BookingPage bookingPage;

    public static BookHotel onThePage() {
        return Tasks.instrumented(BookHotel.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BookingPage.BUTTON_SEEAVAILABILITY)
        );

        for(String winHandle : Serenity.getWebdriverManager().getWebdriver().getWindowHandles()){
            Serenity.getWebdriverManager().getWebdriver().switchTo().window(winHandle);
        }

        actor.attemptsTo(
                Click.on(BookingPage.BUTTON_RESERVENOW),
                Click.on(BookingPage.VALUE_SELECTROOMS),
                Click.on(BookingPage.BUTTON_BOOKING)
        );
    }
}

