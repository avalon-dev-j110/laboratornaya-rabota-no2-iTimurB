package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Application {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];        
        shapes [0] = new Circle(7);        
        shapes [1] = new Rectangle(3,2);
        shapes [2] = new Triangle(8,9,2);
        shapes [3] = new Triangle(80,90,20);
        shapes [4] = new Triangle((float)50.9,(float)50.3,(float)50.6);
        shapes [5] = new Rectangle(15,20);
        shapes [6] = new Rectangle(35,2);
        shapes [7] = new Circle (3); 
        shapes [8] = new Circle (2); 
        shapes [9] = new Circle (17); 
        
         for (int i=1 ; i<=10; i++)
            System.out.println("Площадь фигуры " + i + " = "  + shapes[i-1].getArea());
         
        Shape MaxArea = findMaxArea(shapes);
        System.out.println(MaxArea.toString());
    }    
        private static Shape findMaxArea(Shape [] shapes) {
            if (shapes.length == 0) {
            return null;
            }            
            Shape findMaxArea = shapes [0];            
            for (int i = 1; i < shapes.length; i++) {
                if (findMaxArea.getArea() < shapes [i].getArea()){
                findMaxArea = shapes [i];
                }
            }
            return findMaxArea;
        }
}        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */ 


