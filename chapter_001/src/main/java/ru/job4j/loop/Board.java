package ru.job4j.loop;

/**
 *Class Board
 *@author Alexander Zabelin
 *@since 0.1
 */
public class Board {

    /**
     * Нарисовать шахматную доску
     * @param width щирина
     * @param height высота
     * @return строка шахматной доски
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }

    public static void main(String[] args) {
        Board b = new Board();
        System.out.println(b.paint(5, 4));
    }
}
