package proyectoTestCaseEmirates.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyectoTestCaseEmirates.model.BookHotelData;
import proyectoTestCaseEmirates.userinterface.ReservationPgBooking;

import java.util.List;

public class ContinueBooking implements Task {

    private List<BookHotelData> bookHotelData;

    public ContinueBooking (List <BookHotelData> bookHotelData) {
        this.bookHotelData = bookHotelData;
    }

        public static ContinueBooking thePage(List<BookHotelData> bookHotelData) {
            return Tasks.instrumented(ContinueBooking.class, bookHotelData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReservationPgBooking.BUTTON_SEEAVAILABILITY)
        );

        for(String winHandle : Serenity.getWebdriverManager().getWebdriver().getWindowHandles()){
            Serenity.getWebdriverManager().getWebdriver().switchTo().window(winHandle);
        }

        actor.attemptsTo(
                Click.on(ReservationPgBooking.BUTTON_RESERVENOW),
                Click.on(ReservationPgBooking.VALUE_SELECTROOMS),
                Click.on(ReservationPgBooking.BUTTON_BOOKING),
                Click.on(ReservationPgBooking.INPUT_FIRSTNAME),
                Enter.keyValues(bookHotelData.get(0).getStrFirstName()).into(ReservationPgBooking.VALUE_FIRSTNAME),
                Click.on(ReservationPgBooking.INPUT_LASTNAME),
                Enter.keyValues(bookHotelData.get(0).getStrLastName()).into(ReservationPgBooking.VALUE_LASTNAME),
                Click.on(ReservationPgBooking.INPUT_EMAIL),
                Enter.keyValues(bookHotelData.get(0).getStrEnterEmail()).into(ReservationPgBooking.VALUE_EMAIL),
                Click.on(ReservationPgBooking.INPUT_CONFIRMATIONEMAIL),
                Enter.keyValues(bookHotelData.get(0).getStrConfirmationEmail()).into(ReservationPgBooking.VALUE_CONFIRMATIONEMAIL),
                Click.on(ReservationPgBooking.BUTTON_NEXT),
                Click.on(ReservationPgBooking.INPUT_PHONENUMBER),
                Enter.keyValues(bookHotelData.get(0).getStrPhoneNumber()).into(ReservationPgBooking.VALUE_PHONENUMBER),
                Click.on(ReservationPgBooking.BUTTON_COMPLETEBOOKING)
        );

    }
}
