package me.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareersPage extends BasePage{

    @FindBy(linkText ="Open Positions")
    public WebElement OpenPositionsBtn;

     @FindBy(xpath = "//div[@class='heroBg ']")
    public WebElement openPositionsBanner;


}
