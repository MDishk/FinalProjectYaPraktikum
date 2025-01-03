package ru.yandex.add_name;

public class Praktikum {
    public static void main(String[] args) {
        // Пример строки с именем и фамилией
        String testName = "Тимоти Шаламе";

        // Создание экземпляра класса Account
        Account account = new Account(testName);

        // Проверка на то, можно ли использовать имя и фамилию для печати на банковской карте
        boolean canEmboss = account.checkNameToEmboss();

        // Вывод результата
        if (canEmboss) {
            System.out.println("Можно напечатать на карте такое имя: " + testName);
        } else {
            System.out.println("Нельзя напечатать на карте такое имя: " + testName);
        }
    }
}
