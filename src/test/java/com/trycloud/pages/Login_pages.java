package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pages {

    public Login_pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "user")
    public WebElement userName;

    @FindBy(id= "password")
    public WebElement password;

    @FindBy(id="submit-form")
    public WebElement loginButton;


}