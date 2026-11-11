package com.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base_Class.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com.Feature", glue = "com.Step_Definition", dryRun = false, plugin = {
		"pretty", "html:target/CucumberReport.html", "json:target/cucumber.json",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }, monochrome = true)

public class Test_Runner extends Base_Class {

	@BeforeClass
	public static void Start() {
		BrowserLaunch();

	}

//	@AfterClass
//	public static void Close() {
//		Quit();
//
//	}

}
