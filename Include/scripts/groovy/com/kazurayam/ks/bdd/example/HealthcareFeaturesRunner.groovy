package com.kazurayam.ks.bdd.example

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.kms.katalon.core.configuration.RunConfiguration

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/healthcare",
// glue="",           // glue is defined by "Test Listeners/HealthcareCucuberTestGLUE.groovy"
plugin = [	"pretty",
	"junit:CucumberReports/healthcare/cucumber.xml",
	"html:CucumberReports/healthcare",
	"json:CucumberReports/healthcare/cucumber.json"
	
])
public class HealthcareFeaturesRunner {}
