package TugasPertemuan3;

import org.testng.Assert;
import org.testng.annotations.Test;

import TugasPertuamuan3.Settings.Beli;
import TugasPertuamuan3.Settings.Kalimat;

public class AutomationPageFactory extends Setting{
	@Test
	public void testLogin() {

		Beli loginPage = new Beli(driver, explicitWait);
		Kalimat profilePage = new Kalimat(driver, explicitWait);
		String username = "standard_user";
		String password = "secret_sauce";
		String checkoutnama = "Alexander";
		String checkoutLastName = "Pakpahan";
		String kodepos = "17144";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		loginPage.clickKeranjangButton();
		loginPage.clickKeranjang1Button();
		loginPage.clickcheckoutButton();
		loginPage.inputcheckoutname(checkoutnama);
		loginPage.inputcheckoutLastName(checkoutLastName);
		loginPage.inputkodepost(kodepos);
		loginPage.clicklanjutButton();
		loginPage.clickselesaiButton();
				
		String actualText = profilePage.getProfileText();
		String expectedText = "THANK YOU FOR YOUR ORDER";

		Assert.assertTrue(actualText.contains(expectedText));
	}
}
