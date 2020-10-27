package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationPage {

    private WebDriver driver;

    @FindBy(xpath="//*[@id=\"content\"]/ul/li[21]/a")
    private WebElement formLink;
    @FindBy(xpath="//*[@id=\"content\"]/div/h2")
    private WebElement logo;
    @FindBy(id="username")
    private WebElement userNameTxtFld;
    @FindBy(id="password")
    private WebElement passwordTxtFld;
    @FindBy(xpath="//*[@id=\"login\"]/button/i")
    private WebElement loginBtn;
    @FindBy(xpath="//*[@id=\"flash\"]")
    private WebElement wrongPasswordTxt;
    @FindBy(xpath="//*[@id=\"flash\"]")
    private WebElement wrongUserNameTxt;
    @FindBy(xpath="//*[@id=\"flash\"]")
    private WebElement loginInText;
    @FindBy(xpath="//*[@id=\"content\"]/div/a")
    private WebElement logOutBtn;
    @FindBy(xpath="//*[@id=\"flash\"]")
    private WebElement logOutText;

    public FormAuthenticationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openUrl(){
        driver.get("http://the-internet.herokuapp.com/");
    }
    public void clkAuthenticationLink() {
    formLink.click();
    }
    public void validateLoginPage(){
        assert(logo.isDisplayed());
    }
    public void setUsername(String userName) {
        userNameTxtFld.sendKeys(userName);
    }
    public void setPassword(String password) {
        passwordTxtFld.sendKeys(password);
    }
    public void clkLogin() {
        loginBtn.click();
    }
    public void loginWithWrongPassword(){
        String expectedMsg = "Your password is invalid";
        String actualMsg = wrongPasswordTxt.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }

    public void clkLogout() {
        logOutBtn.click();
    }

    public void validateLogoutPage() {
        String expectedMsg ="You logged out of the secure area!\n" +
                "×";
        String actualMsg = logOutText.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }

    public void validateWithValidData() {
        String expectedMsg ="You logged into a secure area!\n" +
                "×";
        String actualMsg = loginInText.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }

    public void validateWithWrongPassword() {
        String expectedMsg ="Your password is invalid!\n" +
                "×";
        String actualMsg = loginInText.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }

    public void validateWithWrongUserName() {
        String expectedMsg ="Your username is invalid!\n" +
                "×";
        String actualMsg = loginInText.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }
}
