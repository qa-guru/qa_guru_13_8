package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositoryTest {

  @Test
  void shouldFindSelenideAsFirstRepository(){
    // region с чего начинаем?
    // открыть страницу github.com
    // ввести в поле поиска selenide и нажать Enter
    // нажимаем на линк от первого результата поиска
    // check: в заголовке встречается selenide/selenide
    // endregion
  }
}
