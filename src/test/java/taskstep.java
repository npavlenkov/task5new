import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class taskstep {
    String
            BASE_URL = "https://github.com",
            Issuse = "Issues",
            repos = "npavlenkov/tasks",
            issuesnomer = "#1";

    @Test
    public void test5step() {
        step("Открываем главную страницу", () -> {
            open(BASE_URL);
        });
        step("Ищем репозиторий " + repos, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(repos);
            $(".header-search-input").submit();
        });
        step("Кликаем на репозиторий " + repos, () -> {
            $(By.linkText(repos)).click();
        });
        step("Переходем в раздел " + Issuse, () -> {
            $(withText(Issuse)).click();
        });
        step("ПРоверяем что ишъю с номером " + issuesnomer + " существует", () -> {
            $(withText(issuesnomer)).click();
        });


        sleep(5000);

    }
}