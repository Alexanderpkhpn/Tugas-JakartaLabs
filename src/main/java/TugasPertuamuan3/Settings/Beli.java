package TugasPertuamuan3.Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Beli extends Settings {
		@FindBy(xpath = "//input[@id='user-name']")
		private WebElement username;

		@FindBy(xpath = "//input[@id='password']")
		private WebElement password;

		@FindBy(xpath = "//input[@id='login-button']")
		private WebElement loginBtn;
		
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement keranjang;
		
		@FindBy(xpath = "//a[@class='shopping_cart_link']")
		private WebElement keranjang1;
		
		@FindBy(xpath = "//button[@id='checkout']")
		private WebElement checkout;
		
		@FindBy(xpath = "//input[@id='first-name']")
		private WebElement checkoutname;

		@FindBy(xpath = "//input[@id='last-name']")
		private WebElement checkoutLastName;
		
		@FindBy(xpath = "//input[@id='postal-code']")
		private WebElement kodepost;
		
		@FindBy(xpath = "//input[@id='continue']")
		private WebElement lanjut;
		
		@FindBy(xpath = "//button[@id='finish']")
		private WebElement finish;

		public Beli(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
			super(driver, explicitWait);
			PageFactory.initElements(driver.get(), this);
		}

		public void loginWeb(String user, String pass, String checkoutnama, String checkoutnamabelakang, String kodepos) {
			username.sendKeys(user);
			password.sendKeys(pass);
			loginBtn.click();
			keranjang.click();
			checkout.click();
			checkoutname.sendKeys(checkoutnama);
			checkoutLastName.sendKeys(checkoutnamabelakang);
			kodepost.sendKeys(kodepos);
			lanjut.click();
			finish.click();
		}

		public void inputUsername(String user) {
			username.sendKeys(user);
		}

		public void inputPassword(String pass) {
			password.sendKeys(pass);
		}

		public void clickLoginButton() {
			loginBtn.click();
		}
		
		public void clickKeranjangButton() {
			keranjang.click();
		}
		
		public void clickKeranjang1Button() {
			keranjang1.click();
		}
		
		public void clickcheckoutButton() {
			checkout.click();
		}
		
		public void inputcheckoutname(String user) {
			checkoutname.sendKeys(user);
		}

		public void inputcheckoutLastName(String pass) {
			checkoutLastName.sendKeys(pass);
		}
		public void inputkodepost(String user) {
			kodepost.sendKeys(user);
		}
		public void clicklanjutButton() {
			lanjut.click();
		}
		public void clickselesaiButton() {
			finish.click();
		}

	}
