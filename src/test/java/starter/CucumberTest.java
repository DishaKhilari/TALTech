package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        publish = true,
        features = {"src/test/resources/features/search/TalFeature.feature"},
        tags = "@ContactUs"
)
public class CucumberTest {}
