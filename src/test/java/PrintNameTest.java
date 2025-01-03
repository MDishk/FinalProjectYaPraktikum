import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import ru.yandex.add_name.Account;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrintNameTest {

    private Account account;

    //Позитивные проверки
    @Test
    @DisplayName("Валидное имя из 3 символов")
    @Description("Ввели две буквы и один пробел между ними")
    public void validThreeSimbNameTest() {
        account = new Account("Т Ш");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Валидное имя из 13 символов")
    @Description("Ввели двенадцать букв и один пробел между ними")
    public void validThirteenSimbNameTest() {
        account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Валидное имя из 19 символов")
    @Description("Ввели восемнадцать букв и один пробел между ними")
    public void validNineteenSimbNameTest() {
        account = new Account("Бенедикт Кембербетч");
        assertTrue(account.checkNameToEmboss());
    }

    //Негативные проверки
    @Test
    @DisplayName("Невалидное имя из 1 символа")
    @Description("Ввели одну букву без пробелов")
    public void wrongOneSimbNameTest() {
        account = new Account("А");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Слишком длинное имя")
    @Description("Ввели 32 символа с пробелом посередине")
    public void tooLongNameTest() {
        account = new Account("Бенедикт Кембербетчевыйййййййййй");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Имя без пробела")
    @Description("Ввели имя ТимотиШаламе без пробелов")
    public void noSpaceNameTest() {
        account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Имя с двумя пробелами")
    @Description("Ввели имя Тимоти  Шаламе с двумя пробелами посередине")
    public void doubleSpacesNameTest() {
        account = new Account("Тимоти  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Пробел в начале имени")
    @Description("Ввели имя ТимотиШаламе и добавили вначале пробел")
    public void spaceAtBeginningNameTest() {
        account = new Account(" ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Пробел в конце имени")
    @Description("Ввели имя ТимотиШаламе и добавили в конце пробел")
    public void spaceAtEndNameTest() {
        account = new Account("ТимотиШаламе ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Пустая строка вместо имени")
    @Description("Оставили строку с именем пустой")
    public void emptyNameTest() {
        account = new Account("");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Имя из одного пробела")
    @Description("Поставили пробел в качестве имени")
    public void onlySpaceAsNameTest() {
        account = new Account(" ");
        assertFalse(account.checkNameToEmboss());
    }
}
