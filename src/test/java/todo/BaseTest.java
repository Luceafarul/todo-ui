package todo;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {
    @BeforeTest
    public void setup() {
        open(Config.basicUrl);
    }
}
