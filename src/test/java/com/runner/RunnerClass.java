package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features="C:\\Ec\\CheapAir\\src\\test\\java\\com\\feature\\booking.feature", 
glue ="com.stepdefinition" ,
dryRun=false, 
tags= "@tag1")
public class RunnerClass {

}
