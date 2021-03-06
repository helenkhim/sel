import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import java.beans.PropertyEditor;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Selenide.open;


public class CallbackTest {
    @Test
    void shouldHappyPathTest() {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Андрей Мамин-Сибиряк");
        $("[data-test-id=phone] input").setValue("+79023454325");
        $("[data-test-id=agreement]").click();
        $("[type=button]").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }


}











