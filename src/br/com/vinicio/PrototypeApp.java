package br.com.vinicio;

import br.com.vinicio.prototype.Circle;
import br.com.vinicio.prototype.Rectangule;

public class PrototypeApp {

    public static void main(String[] args) {
        var circle = new Circle();
        circle.setColor("azul");
        circle.setY("1");
        circle.setY("2");
        circle.setRadius("10");

        var cloneCircle = circle.clone();

        var rectangule = new Rectangule();
        rectangule.setColor("preto");
        rectangule.setY("1");
        rectangule.setY("2");
        rectangule.setHeight("3");
        rectangule.setWidth("4");

        var cloneRectangule = rectangule.clone();

        System.out.println(circle);
        System.out.println(cloneCircle);
        System.out.println("Circles are the same instance? " + circle.equals(cloneCircle));
        System.out.println(rectangule);
        System.out.println(cloneRectangule);
        System.out.println("Rectangules are the same instance? " + rectangule.equals(cloneRectangule));

    }

}
