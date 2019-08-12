package com.vytrack.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin ={"html:target/default-cucumber-reports"},
        //tags = {" ~@negative"},
        //tags = {"  not @negative"},
        //tags = {"@storemanager or @negative"},
        //tags = {"@storemanager"},
        //tags = {"@vehicles"},
        //tags = {"@driver"},
        features = {
              "src/test/resources/features"  // to specify where the features are

        },

        // feature contains scenarios
        // every scenario is like a test
        // where is the implementation for features
        glue={
                "com/vytrack/step_definitions",
                //"com/...."   hook we can put here also

        },

        // dry run = to generate step definitions automatically
        // you will see them in the console output
        dryRun = false
)
public class CukesRunner {



}
