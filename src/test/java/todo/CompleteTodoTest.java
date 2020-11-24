package todo;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class CompleteTodoTest {
    @Test
    public void shouldMarkTodoItemAsCompleted() {
        open("http://todomvc.com/examples/react/#/");

        $(".new-todo").val("Read book").pressEnter();

        $(".toggle").click();

        $$(".todo-list li").shouldHave(CollectionCondition.allMatch(
                "Should be completed",
                el -> el.getAttribute("class").contains("completed"))
        );
        $(".todo-count").shouldHave(Condition.text("0 items left"));
    }
}
