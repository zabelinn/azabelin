package ru.job4j.tracker;

/**
 * Интерфейс реализует получение данных от пользователя
 */
public interface Input {
    /**
     * Запросить данные от пользователя
     * @param question какое значение нужно ввести
     * @return введенное значение
     */
    String ask(String question);
}
