package me.ellebelle;

public class Rectangle {
    // dessa kallas för fält/field. Detta är data-delen av objektorientering.
    // vi vill ha dessa privata. Den enda som kan skriva till dessa (initiera
    //  variablerna) är endast kod i den egna klassen.
    private int width;
    private int height;  // kan sätta värde = 5;
    private Color color;


    // java använder automatiskt toString() när jag skriver ut objekt.
    // så jag behöver @Override:a den toString() som java-objektet har från
    // klassen Object. för den ger bara adressen, jag behöver göra
    // så att jag får värdena/datan i objektet.
    // När någon vill göra mitt Rectangle-objekt till text, använd MIN version ist.
    @Override
    public String toString() {
        return "Rectangle: width = " + width +
                ", height = " + height +
                ", color = " + color;
    }


    // KONSTRUKTOR har ingen returtyp, har samma namn som klassen
    public Rectangle() {
        width = 1;
        height = 1;
        color = new Color(0, 0, 0);
    }

    // overloadeing, samma namn på en metod men med olika in parametrar
    public Rectangle(int w, int h, Color c) {
        // verifiera så vi inte skickar in "dålig" data
        if(w < 1 || h < 1 || c == null) {
            throw new IllegalArgumentException(); // vi gör ett objekt ev en viss klass som innehåller Exception och
            // det gör vi bäst med IllegalArg...
        }
        width = w;
        height = h;
        color = c;
    }

    // enda sättet att få åtkomst till våra privata fält är genom publika metoder:
    // jag görmmer min data, gör den privat, dvs har byggt objekt med inkapslig.
    // dessa metoder är inte static för de tillhör inte klassen utan de tillhör objekt.

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
       // if ( width > 0)
       //         this.width = width;
        if (width < 1) {
            throw new IllegalArgumentException();
        }
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
