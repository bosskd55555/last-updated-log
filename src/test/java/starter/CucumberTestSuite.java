package starter;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

/*@RunWith(Cucumber.class)*/


@CucumberOptions(
        //plugin = {"pretty"},
        features = "src/test/resources/features",
        		//glue={"src.test.java.stepdefinitions"},
        glue= {"starter.stepdefinitions"},
        		//glue= {"starter.stepdefinitions.SearchOnDuckDuckGoStepDefinitions"},
        
        		
      //  monochrome=true,
      //  plugin= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
        //strict=true,
        dryRun=false
   
         
)
public class CucumberTestSuite {
	
}
