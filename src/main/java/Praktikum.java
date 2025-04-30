public class Praktikum {
    public static void main(String[] args) {
        String name = "Тимоти Шаламе";
        Account account = new Account(name);
        boolean isValid = account.checkNameToEmboss();
        System.out.println("Имя '" + name + "' валидно: " + isValid);

    }
}
