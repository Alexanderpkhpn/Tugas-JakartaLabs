package TugasPertuamuan3.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kalimat extends Settings {
	@FindBy(xpath = "//h2[@class='complete-header']")
	private WebElement profileText;

	public Kalimat(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public String getProfileText() {
		return profileText.getText();
	}
}
