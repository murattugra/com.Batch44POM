package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {



    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@title='Allow All Cookies']")
    public WebElement facebookCookie;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement passaBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButonu;

    @FindBy(className = "_9ay7")
    public WebElement girilemediYazisiElemnti;


}

