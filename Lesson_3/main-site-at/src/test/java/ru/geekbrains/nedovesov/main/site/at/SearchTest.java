package ru.geekbrains.nedovesov.main.site.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.nedovesov.main.site.at.base.BaseTest;
import ru.geekbrains.nedovesov.main.site.at.pages.NavigationForSearch;

class SearchTest extends BaseTest {

    @BeforeEach
    public void openSite() {
        driver.get(BASE_URL + COURSES_LINK);
    }

    @Test
    void searchJavaTest() {
        new NavigationForSearch(driver)
                .closePopurBanner()
                .clickIconSearch()
                .enterToSearchField("Java")
                .waitLoadPage()
                .checkProfessionsTab();
    }
}
