package com.wipro.java.java8;

//1. Single abstract method
//@FunctionalInterface
//default or/and static  


@FunctionalInterface
interface ShapeInterface {
    // Only 1 abstract method
    public void area(int a);

    // Default method 1
    default String perimeter(int a) {
        return "Perimeter is: " + (4 * a);
    }

    // Default method 2
    default String description() {
        return "This is a shape interface.";
    }

    // Static method 1
    static String shapeType() {
        return "Generic Shape";
    }

    // Static method 2
    static String dimensions() {
        return "2D Shape";
    }
}

class Shapes implements ShapeInterface {
    // Implementation of area abstract method
    public void area(int a) {
        System.out.println("Area is: " + (a * a));
    }

    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area(4);

        // Default methods executed
        System.out.println(s.perimeter(4));
        System.out.println(s.description());

        // Static methods executed
        System.out.println(ShapeInterface.shapeType());
        System.out.println(ShapeInterface.dimensions());
    }
} 
