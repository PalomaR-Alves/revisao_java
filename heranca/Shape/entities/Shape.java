package entities;

import entities.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape() {}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    /*
    Método ABSTRATO: quando a classe é genérica demais ele não possui implementação.
    A existência um método abstrato faz com que a classe à qual ele pertence seja
    obrigatoriamente abstrata.
    */
    public abstract double area();
}
