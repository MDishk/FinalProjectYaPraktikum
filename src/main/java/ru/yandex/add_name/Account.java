package ru.yandex.add_name;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // Проверка длины строки
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }

        // Проверка наличия пробела
        int spaceCount = 0;
        for (char c : name.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        if (spaceCount != 1) {
            return false;
        }

        // Проверка на то, что пробел не стоит в начале или в конце строки
        if (name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ') {
            return false;
        }

        // Все проверки пройдены
        return true;
    }
}