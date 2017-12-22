package ru.job4j.condition;

/**
 *Class Triangle
 *@author Zabelin Alexander
 *@since 0.1
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc) / 2
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Перимент.
     */
    public double period(double ab, double ac, double bc) {
        return (a.distanceTo(b) + a.distanceTo(c) + b.distanceTo(c)) / 2;
    }

    /**
    * Метод должен вычислить площадь треугольника.
    *
    * @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
    */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);

        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return можно ли построить треугольник
     */
    private boolean exist(double ab, double ac, double bc) {
        /*
        в треугольнике длина любой стороны
        меньше суммы длин двух других сторон
        */
        return (
            ab < (ac + bc) && ac < (ab + bc) && bc < (ac + ab)
        );
    }
}
