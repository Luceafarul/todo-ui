package todo;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class CreateTodoTest extends BaseTest {

    @Test
    public void createTodo() {
        Todo.create("Read Book");

        Todo.list().shouldHave(CollectionCondition.size(1));
        Todo.list().first().shouldHave(Condition.text("Read Book"));
        Todo.count().shouldHave(Condition.text("1 item left"));
    }
}
