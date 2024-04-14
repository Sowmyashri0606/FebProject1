package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Ec\\Hotel\\src\\test\\java\\com\\feature", 
   glue ="com.stepdefinition", 
   dryRun =false, 
   tags= "@tag1")
public class Runner {

}
