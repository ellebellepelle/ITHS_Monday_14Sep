package me.ellebelle;

public class ShapeDemo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        // rectangle.setHeight(10);

        IO.println(rectangle.getHeight()); // använder första konstruktorn

        Rectangle rectangle2 = new Rectangle(10,10); // använder andra konstruktorn
        Rectangle rectangle3 = new Rectangle(100,100);
    }
}
