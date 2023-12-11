package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		
		features = {"E:/CHETAN'S DATA/InterviewPractice/Framework/src/test/java/Features/FrontPage.feature",
				"E:/CHETAN'S DATA/InterviewPractice/Framework/src/test/java/Features/ProductPage.feature",
				"E:/CHETAN'S DATA/InterviewPractice/Framework/src/test/java/Features/SignInPage.feature",
				
		},
		glue="StepDefinition"
		)


public class TestRunner {
	
}

