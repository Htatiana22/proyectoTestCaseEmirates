package proyectoTestCaseEmirates.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class OptionHotels extends PageObject {
    public static final Target BUTTON_ACCEPT = Target.the("click on the accept button cookies")
            .located(By.id("onetrust-accept-btn-handler"));

    public static final Target BUTTON_HOTELS = Target.the("click on the hotels option")
            .located(By.xpath("//*[@data-name='Hoteles']"));
}
