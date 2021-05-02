package com.kazurayam.ks.bddddtexample

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/bddddtexample", glue="", plugin = ["pretty",
	"junit:CucumberReports/bddddtexample/cucumber.xml",
	"html:CucumberReports/bddddtexample",
	"json:CucumberReports/bddddtexample/cucumber.json"])
public class MyCucumberRunner {}
