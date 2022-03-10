package proyectoTestCaseEmirates.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectFilter extends PageObject {

    public static final Target INPUT_RESIDENCE = Target.the("Click on the room option")
            .located(By.xpath("//LABEL[@id='xp__guests__toggle']"));

    public static final Target INPUT_CHILDREN  = Target.the("Click on the children option")
            .located(By.xpath("(//BUTTON[@class='bui-button bui-button--secondary bui-stepper__add-button '])[2]"));

    public static final Target SELECT_CHILDREN = Target.the("select number of children")
            .located(By.xpath("(//BUTTON[@class='bui-button bui-button--secondary bui-stepper__add-button '])[1]"));
            //.located(By.xpath("(//SPAN[@class='bui-stepper__display'][text()='2'])[2]"));


    public static final Target INPUT_AGECHILDREN = Target.the("Click on the mandatory age option")
            .located(By.xpath("//SELECT[@name='age']"));

    public static final Target SELECT_AGECHILDREN = Target.the("")
            .located(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[3]/select/option[11]"));

    public static final Target OPTION_FILTERBY = Target.the("Go to the popular filters option")
            .located(By.xpath("//H2[@class='ac6bdec376 _192b3a196 _397a46f0e'][text()='Filtrar por:']"));

    public static final Target CHECKBOX_POPULARFILTERS = Target.the("Click on the breakfast included option")
            .located(By.xpath("(//DIV[@data-testid='filters-group-label-content'][text()='Desayuno incluido'])[1]"));

    public static final Target CHECKBOX_STARS = Target.the("Click on 4 stars")
            .located(By.xpath("//DIV[@class='_29c344764'][text()='4 estrellas']"));



}
