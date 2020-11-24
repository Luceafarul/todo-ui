package todo;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class CompleteTodoTest extends BaseTest {

    @Test
    public void shouldMarkTodoItemAsCompleted() {
        Todo.create("Read Book");

        Todo.markCompleted("Read Book");

        Todo.count().shouldHave(Condition.text("0 items left"));
        Todo.list().shouldHave(CollectionCondition.allMatch(
                "Should be completed",
                el -> el.getAttribute("class").contains("completed"))
        );
    }
}
