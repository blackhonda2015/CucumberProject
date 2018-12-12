package com.syntax.cucumberproject.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mudassar Rehman\\Desktop\\Java\\CucumberProject\\src\\test\\resources\\features\\Login.feature",
							glue="")
public class LoginRunner {

}
