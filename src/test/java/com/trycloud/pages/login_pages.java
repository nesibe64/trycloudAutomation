package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class login_pages {

    public login_pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
