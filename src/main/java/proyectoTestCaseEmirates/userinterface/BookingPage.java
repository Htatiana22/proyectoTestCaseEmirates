package proyectoTestCaseEmirates.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookingPage  extends PageObject {

    public static final Target BUTTON_SEEAVAILABILITY = Target.the("click on the button check availability")
            .located(By.cssSelector("div._814193827 :nth-child(3) span._b61fba663"));

    public static final Target BUTTON_RESERVENOW = Target.the("click the book now button")
            .located (By.id("hcta"));

    public static final Target VALUE_SELECTROOMS = Target.the("select the number of rooms")
            .located(By.cssSelector("tr.hprt-table-cheapest-block td:nth-child(5) select :nth-child(2)"));

    public static final Target BUTTON_BOOKING = Target.the("click on booking button")
            .located(By.xpath("//button[contains(@class, 'js-reservation-button')]"));
}


