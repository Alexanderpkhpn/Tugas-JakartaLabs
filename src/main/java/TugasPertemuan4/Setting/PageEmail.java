package TugasPertemuan4.Setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEmail extends BasePage{
	@FindBy(tagName = "body")
	private WebElement textEmail;
	
	public PageEmail(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public String getTextEmail() {
		return textEmail.getText();
	}
	
}
