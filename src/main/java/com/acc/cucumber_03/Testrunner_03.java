package com.acc.cucumber_03;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
	features="Feature_99"
	,glue= {"step_definition_03"}
)
public class Testrunner_03 {

}
