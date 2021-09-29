package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
public static void jvmReport(String jsonFile) {
	//report location
	File reportDirectory=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
	Configuration configuration= new Configuration(reportDirectory,"Facebook Automation");
	configuration.addClassifications("Browser", "Chrome");
	configuration.addClassifications("BrowserVersion", "93");
	configuration.addClassifications("Os", "Windows 8.1");
	configuration.addClassifications("Env", "Test");
	configuration.addClassifications("Sprint", "33");
	List<String> jsonFiles=new ArrayList<String>();
	jsonFiles.add(jsonFile);
	ReportBuilder builder=new ReportBuilder(jsonFiles,configuration);
	builder.generateReports();

	
	
	

}
}
