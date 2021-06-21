package br.com.vinicio.prototype;

public class Shape implements Prototype {

    private String x;
    private String y;
    private String color;

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public Shape() {
    }

    @Override
    public Shape clone() {
        return new Shape(this);
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
