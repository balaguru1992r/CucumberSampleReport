package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue={"com.stepdefn"},monochrome=true,plugin={"pretty","json:src\\test\\resources\\Reports\\output.json"},dryRun=false,strict=true,snippets=SnippetType.CAMELCASE)
public class TestRunner {

@AfterClass
public static  void afterClass() {
String path=System.getProperty("user.dir");
Reporting.jvmReport(path + "\\src\\test\\resources\\Reports\\output.json");
}
}
