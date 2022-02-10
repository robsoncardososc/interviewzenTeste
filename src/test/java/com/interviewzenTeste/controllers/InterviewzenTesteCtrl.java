package com.interviewzenTeste.controllers;

import com.interviewzenTeste.pages.InterviewzenTestePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InterviewzenTesteCtrl extends InterviewzenTestePage{

    private WebDriver driver;

    public InterviewzenTesteCtrl(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigate(String url){
        driver.navigate().to(url);
    }

    public void clickOnmSearchIcon(){
        searchIcon.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(searchBar));
    }

    public void typeSearch(String search){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(searchBtn));
        searchBar.sendKeys(search);
    }

    public void clickOnSearchBtn(){
        searchBtn.click();
    }

    public void verifySerachResult(String search){
        Assert.assertEquals(searchResult.getText(), search);
    }

    public void verifyResultNotFound(String result){
        Assert.assertEquals(resultNotFound.getText(), result);
    }
}
