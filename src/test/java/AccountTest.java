import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AccountTest {
    private Account account;


    @Test
    @DisplayName("проверка валидного Имя")
    public void validNameTest() {
        account = new Account("Тимати Шаламе");
        assertTrue(account.checkNameToEmboss());
    }


    @Test
    @DisplayName("проверка короткого Имя")
    public void shortNameTest() {
        account = new Account("Ти");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("проверка длинного Имя")
    public void longNameTest() {
        account = new Account("ТиматиШаламеИбнАбдулаГаджи 5");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("проверка Имя без пробела")
    public void noSpaceTest() {
        account = new Account("ТиматиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("проверка Имя с двумя пробелами")
    public void multipleSpacesTest() {
        account = new Account("Тимати  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("проверка Имя с пробеллом в начале")
    public void starstWithSpaceTest() {
        account = new Account(" Тимати  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("проверка Имя с пробеллом в конце")
    public void endstWithSpaceTest() {
        account = new Account("Тимати  Шаламе ");
        assertFalse(account.checkNameToEmboss());
    }

}
