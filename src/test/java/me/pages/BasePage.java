package me.pages;

import me.utility.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract  class BasePage {

    public Logger log = LogManager.getLogger(this.getClass());

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
