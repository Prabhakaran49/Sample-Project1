package org.pom;

import org.base.ne.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Home_Page extends BaseClass {
	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({@FindBy(id="twotabsearchtextbox") , @FindBy(xpath="//input[@type='text']")})
	WebElement searchtext;

	@FindAll({@FindBy(xpath="nav-search-submit-button")  ,@FindBy(xpath="//input[@type='submit']")})
	WebElement searchbutton;

	public WebElement getSearchtext() {
		return searchtext;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}






}
