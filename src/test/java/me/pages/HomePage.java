package me.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


   @FindBy(linkText ="Careers")
    public WebElement careersBtn;

}
