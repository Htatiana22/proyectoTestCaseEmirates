package proyectoTestCaseEmirates.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookingHotel extends PageObject {

    public static final Target INPUT_DESTINATION = Target.the("Click on the destination field")
            .located(By.id("book-hotel-suggest-field_label"));

    public static final Target VALUE_DESTINATION = Target.the("Enter the destination value")
            .located(By.id("book-hotel-suggest-field"));

    public static final Target INPUT_CHECKINDATE = Target.the("Select check-in date input")
            .located(By.id("bookingStartDate"));

    public static final Target VALUE_CHECKINDATE = Target.the("Select check-in date value")
            .located(By.xpath("//td[contains(@class, 'CalendarDay__today')]/a"));

    public static final Target INPUT_CHECKOUTDATE = Target.the("Select check-out date input")
            .located(By.id("bookingEndDate"));

    public static final Target VALUE_CHECKOUTDATE = Target.the("Select check-out date value")
            .located(By.xpath("(//A[@class='CalendarDay__text__default'][text()='7'])[3]"));
            //.located(By.xpath("//td[contains(@class, 'CalendarDay__firstDayOfWeek_3')]/a"));

    public static final Target BUTTON_FINDHOTELS = Target.the("Click the find hotel button")
            .located(By.xpath("//*[@type='submit']"));
}

