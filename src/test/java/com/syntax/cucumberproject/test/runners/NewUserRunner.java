package com.syntax.cucumberproject.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Mudassar Rehman\\Desktop\\Java\\CucumberProject\\src\\test\\resources\\features\\NewAccount.feature", glue = "C:\\Users\\Mudassar Rehman\\Desktop\\Java\\CucumberProject\\src\\test\\java\\com\\syntax\\cucumberproject\\test\\stepDefinition\\LoginSteps.java")
public class NewUserRunner {

}
