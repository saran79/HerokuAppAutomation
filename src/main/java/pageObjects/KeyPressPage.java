package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressPage {

    private WebDriver driver;

    @FindBy(id="target")
    private WebElement txtField;

    private String keyOne;
    private String keyTwo;
    private String keyThree;
    private String keyFour;

    public KeyPressPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clkLink() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[31]/a")).click();
    }

    public String getTitle(){
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();

    }
    public void pressFourKeys() {
        txtField.sendKeys(Keys.ARROW_RIGHT);
        keyOne = driver.findElement(By.id("result")).getText();
        txtField.sendKeys(Keys.ESCAPE);
        keyTwo = driver.findElement(By.id("result")).getText();
        txtField.sendKeys(Keys.NUMPAD1);
        keyThree = driver.findElement(By.id("result")).getText();
        txtField.sendKeys(Keys.NUMPAD7);
        keyFour = driver.findElement(By.id("result")).getText();
    }

    public String getKeyOne(){
        return keyOne;
    }
    public String getKeyTwo(){
        return keyTwo;
    }
    public String getKeyThree(){
        return keyThree;
    }
    public String getKeyFour(){
        return keyFour;
    }
}
