package ru.avalon.java.dev.j10.labs.shapes;

public class Triangle implements Polygon{
    public float sideA;
    public float sideB;
    public float sideC;
    private float halfPerimeter;
       
    public Triangle (float sideA, float sideB, float sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;         
    }
    
    @Override
    public float getPerimeter() {
        return (float) Math.abs(sideA + sideB + sideC);
    }    
    @Override
    public float getArea() {
        halfPerimeter = (this.getPerimeter()/2); 
        return (float) Math.sqrt (this.halfPerimeter*(this.halfPerimeter-this.sideA)*(this.halfPerimeter-this.sideB)*(this.halfPerimeter-this.sideC));
    }    
    @Override
    public String toString() {
        return "Triangle {" + "sideA = " + sideA + "; sideB = " + sideB + "; sideC = " + sideC + '}' + " Area of a triangle = " + getArea();
    }    
}
