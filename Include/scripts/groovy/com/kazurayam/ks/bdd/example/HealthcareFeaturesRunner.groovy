package com.kazurayam.ks.bdd.example

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/healthcare", glue="", plugin = ["pretty",
	"junit:CucumberReports/healthcare/cucumber.xml",
	"html:CucumberReports/healthcare",
	"json:CucumberReports/healthcare/cucumber.json"])
public class HealthcareFeaturesRunner {}
