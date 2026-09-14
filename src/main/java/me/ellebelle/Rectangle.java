package me.ellebelle;

public class Rectangle {
    // dessa kallas för fält/field. Detta är data-delen av objektorientering.
    // vi vill ha dessa privata. Den enda som kan skriva till dessa (initiera
    //  variablerna) är endast kod i den egna klassen.
    private int width;
    private int height;
    private Color color;
}

record Color(int red, int green, int blue) {}
