package proyectoTestCaseEmirates.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationPgBooking extends PageObject {

    public static final Target BUTTON_SEEAVAILABILITY = Target.the("click on the button check availability")
            .located(By.cssSelector("div._814193827 :nth-child(3) span._b61fba663"));

    public static final Target BUTTON_RESERVENOW = Target.the("click the book now button")
            .located (By.id("hcta"));

    public static final Target VALUE_SELECTROOMS = Target.the("select the number of rooms")
            .located(By.cssSelector("tr.hprt-table-cheapest-block td:nth-child(5) select :nth-child(2)"));

    public static final Target BUTTON_BOOKING = Target.the("click on booking button")
            .located(By.xpath("//button[contains(@class, 'js-reservation-button')]"));


    public static final Target INPUT_FIRSTNAME = Target.the("Enter the name")
            .located (By.id("firstname"));

    public static final Target VALUE_FIRSTNAME = Target.the("Write name")
            .located(By.id("firstname"));

    public static final Target INPUT_LASTNAME = Target.the("Enter the lastname")
            .located(By.id("lastname"));

    public static final Target VALUE_LASTNAME = Target.the("Write lastname")
            .located(By.id("lastname"));

    public static final Target INPUT_EMAIL = Target.the("Enter the email")
            .located(By.id("email"));

    public static final Target VALUE_EMAIL = Target.the("Write email")
            .located(By.id("email"));

    public static final Target INPUT_CONFIRMATIONEMAIL = Target.the("Confirm Email")
            .located(By.id("email_confirm"));

    public static final Target VALUE_CONFIRMATIONEMAIL = Target.the("Write the mail again")
            .located(By.id("email_confirm"));

    public static final Target BUTTON_NEXT = Target.the("click the next button")
            .located(By.xpath("//*[@id=\"bookForm\"]/div[3]/div/div[2]/button"));

    public static final Target INPUT_PHONENUMBER = Target.the("Click on the phone number field")
            .located(By.id("phone"));

    public static final Target VALUE_PHONENUMBER = Target.the("Enter the cell phone number")
            .located(By.id("phone"));

    public static final  Target BUTTON_COMPLETEBOOKING = Target.the("Click on complete reservation")
            .located(By.xpath("//*[@id=\"bookForm\"]/div[7]/div/div[2]/button/span[2]"));
}
