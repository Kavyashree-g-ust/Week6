package com.shopkart;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")

@ConfigurationParameter(
        key = GLUE_PROPERTY_NAME,
        value = "com.shopkart.stepdefs,com.shopkart.support"
)

@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value =
                "pretty," +
                        "summary," +
                        "html:build/cucumber-report/cucumber.html," +
                        "json:build/cucumber-report/cucumber.json," +
                        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
)
@ConfigurationParameter(
        key = FILTER_TAGS_PROPERTY_NAME,
        value = "not @ignore"
)

public class RunCucumberTest {
}