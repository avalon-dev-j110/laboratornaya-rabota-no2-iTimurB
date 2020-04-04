package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    public float radius;
    
    public Circle (float radius){
        this.radius = radius;
    }
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    @Override
    public float getLength() {
        return (float) Math.PI*this.radius*2;
    }
    @Override
    public float getArea() {
        return (float) Math.PI* (float)(this.radius*this.radius);
    }
    @Override
    public String toString() {
        return "Circle {" + "radius = " + radius + '}' + " Area of a circle = " + getArea();
    }
    
}
