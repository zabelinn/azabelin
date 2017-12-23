package ru.job4j.loop;


/**
 *Class Paint
 *@author Alexander Zabelin
 *@since 0.1
 */
public class Paint {

    /**
     * Возвращает правую часть пирамиды
     * @param height высота
     * @return строка правой части пирамиды
     */
    public String rightTrl(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        int weight = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row < height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column < weight; column++) {
                // если строка равна ячейки, то рисуем галку.
                // в данном случае строка определяем, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }

    /**
     * Левая часть пирамиды
     * @param height высота
     * @return строка левой части пирамиды
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < weight; column++) {
                if (column >= height - row - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Рисует пирамидку заданной высоты
     * @param h высота
     * @return строка пирамиды
     */
    public String piramid(int h) {
        StringBuilder res = new StringBuilder();
        for (int row = 0; row < h; row++) {
            for (int weight = 1; weight <= (h * 2) - 1; weight++) {
                if (weight >= h - row && weight <= h + row) {
                    res.append("^");
                } else {
                    res.append(" ");
                }
            }
            res.append(System.lineSeparator());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        System.out.println(paint.piramid(4));
    }
}

