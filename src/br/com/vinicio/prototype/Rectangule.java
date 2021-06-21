package br.com.vinicio.prototype;

public class Rectangule extends Shape {

    private String width;
    private String height;

    public Rectangule(Rectangule rectangule) {
        super(rectangule);
        this.width = rectangule.width;
        this.height = rectangule.height;
    }

    public Rectangule() {
        super();
    }

    @Override
    public Rectangule clone() {
        return new Rectangule(this);
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangule{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                "} " + super.toString();
    }
}
