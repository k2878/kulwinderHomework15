package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy (xpath= "//ul[@class='nav navbar-nav']/li[1]/a")
    WebElement desktop;

    @CacheLookup
    @FindBy (xpath= "//ul[@class='nav navbar-nav']/li[2]/a")
    WebElement laptopsAndNotebooks;

    @CacheLookup
    @FindBy (xpath="//ul[@class='nav navbar-nav']/li[3]/a")
    WebElement components;

    @CacheLookup
    @FindBy (linkText = "Show AllDesktops")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy (linkText = "Show AllLaptops & Notebooks")
    WebElement showAllDesktopsAndNotebooks;

    @CacheLookup
    @FindBy (linkText = "Show AllComponents")
    WebElement showAllComponents;



    public void mouseHoverToDesktop(){
        mouseHoverToElementAndClick(desktop);
        log.info("Mouse hover on “Desktops” and click " + desktop.toString());
    }

    public void mouseHoverToLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(laptopsAndNotebooks);
        log.info("Mouse hover on “Laptops & Notebooks” and click " + laptopsAndNotebooks.toString());
    }

    public void mouseHoverToComponents(){
        mouseHoverToElementAndClick(components);
        log.info(" Mouse hover on “Components” and click " + components.toString());
    }

    public void setShowAllDesktops(){
        clickOnElement(showAllDesktops);
        log.info("Click on Show All Desktops " +showAllDesktops.toString());
    }

    public void setShowAllDesktopsAndNotebooks(){
        clickOnElement(showAllDesktopsAndNotebooks);
        log.info("Click on Show All LaptopAndNotebooks " + showAllDesktopsAndNotebooks.toString());
    }

    public void setShowAllComponents(){
        clickOnElement(showAllComponents);
        log.info("Click on Show All ShowAllComponents " + showAllComponents.toString());
    }

    public void clickOnLoginLink() {
    }
}

