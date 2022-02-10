package com.interviewzenTeste.suite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.interviewzenTeste.steps",
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        monochrome = true
)
public class InterviewzenTest {

}
