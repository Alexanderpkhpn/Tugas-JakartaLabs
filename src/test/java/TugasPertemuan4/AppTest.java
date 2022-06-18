package TugasPertemuan4;


import org.testng.annotations.Test;

import TugasPertemuan4.Setting.Common;
import TugasPertemuan4.Setting.HomePage;
import TugasPertemuan4.Setting.PageEmail;

/**
 * Unit test for simple App.
 */
public class AppTest extends AutomationPage {
	
	@Test
	public void GettingMail() {
		HomePage homePage = new HomePage(driver, explicitWait);
		Common commonPage = new Common(driver, explicitWait);
		PageEmail pageEmail = new PageEmail(driver, explicitWait);
		
		String username = "automationtest";
		String iFrame = "ifmail";
		
		homePage.inputUsername(username);
		homePage.clickArrowBtn();
		commonPage.switchIframe(iFrame);
		String text = pageEmail.getTextEmail();
		System.out.println(text);
		
	}
	
	
}
