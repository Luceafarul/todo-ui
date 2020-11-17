package todo;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class CreateTodoTest {
    @Test
    public void createTodo() {
        open("http://todomvc.com/examples/react/#/");

        $(".new-todo").val("Read book").pressEnter();

        assertEquals("Read book", $(".todo-list label").text());
        assertEquals("1 item left", $(".todo-count").text());
    }
}
