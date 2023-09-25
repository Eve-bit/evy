package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.stepDefinitions","org.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class CucumberRunner  extends AbstractTestNGCucumberTests {



}
