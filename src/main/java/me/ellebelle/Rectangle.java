package me.ellebelle;

public class Rectangle {
    // dessa kallas för fält/field. Detta är data-delen av objektorientering.
    // vi vill ha dessa privata. Den enda som kan skriva till dessa (initiera
    //  variablerna) är endast kod i den egna klassen.
    private int width;
    private int height;  // kan sätta värde = 5;
    private Color color;



    // KONSTRUKTOR har ingen returtyp, har samma namn som klassen
    public Rectangle() {
        width = 1;
        height = 1;
    }

    // overloadeing, samma namn på en metod men med olika in parametrar
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    // enda sättet att få åtkomst till våra privata fält är genom publika metoder:
    // jag görmmer min data, gör den privat, dvs har byggt objekt med inkapslig.
    // dessa metoder är inte static för de tillhör inte klassen utan de tillhör objekt.

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getArea() {
        return width * height;
    }
}

record Color(int red, int green, int blue) {}
