package proyectoTestCaseEmirates.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteBooking extends PageObject {

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

