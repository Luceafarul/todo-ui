package todo;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class ClearCompleteTodoTest {
    @Test
    public void createTodo() {
        open("http://todomvc.com/examples/react/#/");

        $(".new-todo").val("Read book").pressEnter();

        $(".toggle").click();

        $(".clear-completed").click();

        $(".main").shouldNot(Condition.exist);
        $(".footer").shouldNot(Condition.exist);
    }
}
