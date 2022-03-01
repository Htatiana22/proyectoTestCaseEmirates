package proyectoTestCaseEmirates.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyectoTestCaseEmirates.model.BookHotelData;
import proyectoTestCaseEmirates.userinterface.CompleteBooking;

import java.util.List;

public class FinalDetails implements Task {

    private String strFirstName;

    private List<BookHotelData> bookHotelData;
        public FinalDetails (List <BookHotelData> bookHotelData) {
            this.bookHotelData = bookHotelData;
    }
    public static FinalDetails theReserve(List<BookHotelData> bookHotelData) {
        return Tasks.instrumented(FinalDetails.class, bookHotelData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompleteBooking.INPUT_FIRSTNAME),
                Enter.keyValues(bookHotelData.get(0).getStrFirstName()).into(CompleteBooking.VALUE_FIRSTNAME),
                Click.on(CompleteBooking.INPUT_LASTNAME),
                Enter.keyValues(bookHotelData.get(0).getStrLastName()).into(CompleteBooking.VALUE_LASTNAME),
                Click.on(CompleteBooking.INPUT_EMAIL),
                Enter.keyValues(bookHotelData.get(0).getStrEnterEmail()).into(CompleteBooking.VALUE_EMAIL),
                Click.on(CompleteBooking.INPUT_CONFIRMATIONEMAIL),
                Enter.keyValues(bookHotelData.get(0).getStrConfirmationEmail()).into(CompleteBooking.VALUE_CONFIRMATIONEMAIL),
                Click.on(CompleteBooking.BUTTON_NEXT),
                Click.on(CompleteBooking.INPUT_PHONENUMBER),
                Enter.keyValues(bookHotelData.get(0).getStrPhoneNumber()).into(CompleteBooking.VALUE_PHONENUMBER),
                Click.on(CompleteBooking.BUTTON_COMPLETEBOOKING)
        );

    }
}
