package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public Login(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class = 'mainnav__item mainnav__item--expandable']) [1]")
    public WebElement logIn;
    @FindBy(xpath = "(//span[text() = 'Hudl'])[1]")
    public WebElement hudl;

    @FindBy(xpath = "//button[text() = 'Accept All Cookies']")
    public WebElement cookies;
    @FindBy(xpath = "//div[text() = 'Allow All']")
    public WebElement allowAll;
    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;


    @FindBy(xpath = "    ( //a[@class = 'mainnav__item mainnav__item--expandable']) [2]")
    public WebElement loginButton;

    @FindBy(id = "logIn")
    public WebElement continueButton;

    @FindBy(xpath = "(//p[@class = 'error-message uni-text uni-text--small uni-text--set-solid']) [1]")
    public WebElement errorMessage;

    @FindBy(xpath = "(//span[text() = 'Log Out'])[1]")
    public WebElement logout;

    @FindBy(xpath = "//div[@class = 'hui-globaluseritem__display-name']")
    public WebElement arrow;
}
