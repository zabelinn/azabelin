package ru.job4j.condition;

/**
 *Class DummyBot
 *@author Zabelin Alexander
 *@since 0.1
 */
public class DummyBot {

    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl;
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        } else {
            rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        }

        return rsl;
    }
}
