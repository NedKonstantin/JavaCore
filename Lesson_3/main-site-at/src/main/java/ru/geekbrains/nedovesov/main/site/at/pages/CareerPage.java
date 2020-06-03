package ru.geekbrains.nedovesov.main.site.at.pages;

import org.openqa.selenium.WebDriver;

public class CareerPage extends BasePage {

    private NavigationForSearch navigationForSearch;

    public CareerPage(WebDriver driver) {
        super(driver);
        navigationForSearch = new NavigationForSearch(driver);
    }
}
