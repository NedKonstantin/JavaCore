package ru.geekbrains.nedovesov.main.site.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.nedovesov.main.site.at.base.BaseTest;
import ru.geekbrains.nedovesov.main.site.at.pages.LoginPage;

public class LoginTest extends BaseTest {
   
    @BeforeEach
    public void openSite() {
        driver.get(BASE_URL + LOGIN_LINK);
    }

    @Test
    void loginTest() {
        new LoginPage(driver)
                .checkHeader("Вход")
                .waitLoadPage()
                .enterLoginData("hao17583@bcaoo.com", "hao17583")
                .waitLoadPage()
                .checkHeader("Главная");
    }

    @Test
    void checkAuthUser() {
        new LoginPage(driver)
                .checkHeader("Вход")
                .waitLoadPage()
                .enterLoginData("hao17583@bcaoo.com", "hao17583")
                .waitLoadPage()
                .checkHeader("Главная")
                .getNavigationTab()
                .clickButton("Курсы")
                .getCoursesPage()
                .waitLoadPage()
                .clickCoursesSearchTab()
                .waitLoadPage()
                .getFiltres()
                .chooseCheckBox("Бесплатные")
                .getFiltres()
                .chooseCheckBox("Тестирование")
                .getSelection()
                .checkSelection("Тестирование ПО. Уровень 2")
                .getSelection()
                .checkSelection("Тестирование ПО. Уровень 1");
    }
}
