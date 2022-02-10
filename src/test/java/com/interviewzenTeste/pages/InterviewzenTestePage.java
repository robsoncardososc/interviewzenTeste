package com.interviewzenTeste.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterviewzenTestePage {

    @FindBy(css = "#search-open")
    protected WebElement searchIcon;

    @FindBy(css = "div.desktop-search>form>label>.search-field")
    protected WebElement searchBar;

    @FindBy(css = "div.desktop-search>form>.search-submit")
    protected WebElement searchBtn;

    @FindBy(css = ".archive-title>span")
    protected WebElement searchResult;

    @FindBy(css = ".entry-title")
    protected WebElement resultNotFound;
}
