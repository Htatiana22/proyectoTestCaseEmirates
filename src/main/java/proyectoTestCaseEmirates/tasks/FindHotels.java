package proyectoTestCaseEmirates.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyectoTestCaseEmirates.Utils.WaitTime;
import proyectoTestCaseEmirates.model.BookHotelData;
import proyectoTestCaseEmirates.userinterface.BookingHotel;

import java.util.List;

public class FindHotels implements Task {
    private List<BookHotelData> bookHotelData;

    public FindHotels(List<BookHotelData> bookHotelData) {
        this.bookHotelData = bookHotelData;
    }

    public static FindHotels enterDate(List<BookHotelData> bookHotelData) {
        return Tasks.instrumented(FindHotels.class, bookHotelData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BookingHotel.INPUT_DESTINATION),
                Enter.keyValues(bookHotelData.get(0).getStrValueDestination()).into(BookingHotel.VALUE_DESTINATION)
        );

        WaitTime.Time();

        actor.attemptsTo(
                Click.on(BookingHotel.INPUT_CHECKINDATE),
                Click.on(BookingHotel.VALUE_CHECKINDATE),
                Click.on(BookingHotel.INPUT_CHECKOUTDATE),
                Click.on(BookingHotel.VALUE_CHECKOUTDATE),
                Click.on(BookingHotel.BUTTON_FINDHOTELS));

        for(String winHandle : Serenity.getWebdriverManager().getWebdriver().getWindowHandles()){
            Serenity.getWebdriverManager().getWebdriver().switchTo().window(winHandle);
        }
    }
}


