package me.ellebelle;

public class ShapeDemo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        // rectangle.setHeight(10);

        IO.println(rectangle.getHeight()); // använder första konstruktorn

        Rectangle rectangle2 = new Rectangle(10,10, new Color(255, 154, 200)); // använder andra konstruktorn
        Rectangle rectangle3 = new Rectangle(100,100, new Color(140, 14, 200));

        IO.println(rectangle2);
        IO.println(rectangle3);

        /*
        Color color = rectangle.getColor();
        IO.println(color.red());
        Utskriften blir NullPointerException för det finns inget som referensen
        i minnet pekar på.
         */

    }
}
