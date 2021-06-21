package br.com.vinicio.prototype;


public class Circle extends Shape {

    private String radius;

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    public Circle() {
        super();
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius='" + radius + '\'' +
                "} " + super.toString();
    }
}
