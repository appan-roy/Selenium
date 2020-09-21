package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesWithTags", glue={"stepDefinition"}, tags= {"(@sanity or @smoke) and not @regression"})
public class TestRunner_Tags {

}
