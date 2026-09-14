package me.ellebelle;

public class ShapeDemo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        // rectangle.setHeight(10);

        IO.println(rectangle.getHeight());

        Rectangle rectangle2 = new Rectangle(10,10);
        Rectangle rectangle3 = new Rectangle(100,100);
    }
}
