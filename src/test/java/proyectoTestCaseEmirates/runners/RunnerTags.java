package proyectoTestCaseEmirates.runners;

        import cucumber.api.CucumberOptions;
        import cucumber.api.SnippetType;
        import net.serenitybdd.cucumber.CucumberWithSerenity;
        import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/bookingPage.feature",
        tags = "@Stories2",
        //features = "src/test/resources/features/booking.feature",
        //tags = "@Stories1",
        glue = "proyectoTestCaseEmirates.stepdefinitions",
        snippets = SnippetType.CAMELCASE)


public class RunnerTags {
}
