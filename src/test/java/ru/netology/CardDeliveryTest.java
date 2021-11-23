package ru.netology;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryTest {
    @Test
    void shouldRegisterDeliveryCard() {
        open("http://localhost:9999/");
        $("[data-test-id=city] input").setValue("Екатеринбург");
        $("[data-test-id=date] input").setValue("");
        $("[data-test-id=name] input").setValue("Зотов Александр");
        $("[data-test-id=phone] input").setValue("+79123456789");
        $("[data-test-id=agreement]").click();
        $(".button").click();
        $(withText("Успешно!")).shouldBe(visible, Duration.ofSeconds(15));

    }
}
