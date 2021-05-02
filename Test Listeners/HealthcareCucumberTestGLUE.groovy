import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

class HealthcareCucumberTestGLUE {
	
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		CucumberKW.GLUE = ['com.kazurayam.ks.bdd.example']
	}
}