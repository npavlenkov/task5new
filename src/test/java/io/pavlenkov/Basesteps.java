package io.pavlenkov;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Basesteps {
    private static final String
            BASE_URL = "https://github.com";

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open(BASE_URL);
    }

    @Step("Ищем репозиторий {repos}")
    public void searchForRepository(final String repos) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repos);
        $(".header-search-input").submit();
    }

    @Step("Кликаем на репозиторий {repos}")
    public void goToRepositoryFromSearch(final String repos) {
        $(By.linkText(repos)).click();
    }

    @Step("Переходем в раздел Issues")
    public void openRepositoryIssues() {
        $(withText("Issues")).click();
    }

    @Step("ПРоверяем что ишъю с номером {nomer} существует")
    public void shouldSeeIssuesWithNumber(final String nomer) {
        $(withText(nomer)).click();

    }
}