package ru.avalon.java.dev.j10.labs.shapes;
/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {
    public float sideA;
    public float sideB;
    
    public Rectangle (float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    @Override
    public float getPerimeter() {
        return (float)Math.abs((this.sideA + this.sideB)*2);
    }    
    @Override
    public float getArea() {
       return (float)Math.abs (this.sideA * this.sideB);
    }    
    @Override
    public String toString() {
        return "Rectangle {" + "sideA = " + sideA + "; sideB = " + sideB + '}' + " Area of a rectangle = " + getArea();
    }
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

}
