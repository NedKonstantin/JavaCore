package ru.geekbrains.nedovesov.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class Header extends BaseTest {
    private final String TEST_NAME = "header";

    @Test
    void checkCareerHeaderBlock(){
        driver.get(BASE_URL + CAREER_LINK);
        String tagName = driver.findElement(By.cssSelector("header[id='top-menu']")).getTagName();
        // System.out.println(tagName);
        Assertions.assertEquals(TEST_NAME, tagName);
    }
    @Test
    void checkCoursesHeaderBlock(){
        driver.get(BASE_URL + COURSES_LINK);
        closePopurBanner();
        String tagName = driver.findElement(By.cssSelector("header[id='top-menu']")).getTagName();
        // System.out.println(tagName);
        Assertions.assertEquals(TEST_NAME, tagName);
    }
}
