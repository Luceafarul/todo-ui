package todo;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class ClearCompleteTodoTest extends BaseTest {

    @Test
    public void createTodo() {
        Todo.create("Read Book");

        Todo.markCompleted("Read Book");

        Todo.clearCompleted();

        Todo.count().shouldNot(Condition.exist);
        Todo.main().shouldNot(Condition.exist);
        Todo.footer().shouldNot(Condition.exist);
    }
}
