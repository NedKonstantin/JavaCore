package ru.geekbrains.nedovesov.main.site.at.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationForSearch extends BasePage {

    @FindBy (css = "li > a > svg.icon-search")
    private WebElement searchButton;

    @FindBy (css = "input.search-panel__search-field")
    private WebElement searchField;

    public NavigationForSearch(WebDriver driver) {
        super(driver);
    }

    @Override
    public NavigationForSearch closePopurBanner (){
        driver.findElement(By.xpath("//div/div/button[*]")).click();
        return this;
    }

    public NavigationForSearch clickIconSearch(){
        searchButton.click();
        return this;
    }

    public CareerPage enterToSearchField(String searchWord){
        searchField.sendKeys(searchWord);
        return new CareerPage(driver);
    }
}
