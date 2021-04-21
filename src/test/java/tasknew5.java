import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class tasknew5 {
    String
    repos = "npavlenkov/tasks",
    issuesnomer = "#1";
    @Test
    public void test5() {
        open("https://github.com");
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repos);
        $(".header-search-input").submit();
        $(By.linkText(repos)).click();
        $(withText("Issues")).click();
        $(withText(issuesnomer)).should(Condition.exist);


        sleep(5000);

    }
}