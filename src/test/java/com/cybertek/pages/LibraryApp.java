package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryApp {

    public LibraryApp(){PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "inputEmail")
    public WebElement emailAdress;

    @FindBy(id = "inputPassword")
    public  WebElement password;





}
