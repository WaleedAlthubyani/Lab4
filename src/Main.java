public class Main {
    public static void main(String[] args) {

        System.out.println("\nCircle\n");

        Circle c1 = new Circle(1);
        c1.setRadius(2);
        System.out.println("Radius= "+c1.getRadius());
        System.out.printf("Area= %.2f \nCircumference= %.2f"+"\n",c1.calculateArea(),c1.calculateCircumference());

        System.out.println("\nRectangle\n");

        Rectangle r1 = new Rectangle(0,0);
        r1.setWidth(3);
        r1.setHeight(6);
        System.out.println("Height= "+r1.getHeight()+"\nWidth= "+r1.getWidth());
        System.out.printf("Area= %.2f \nPerimeter= %.2f"+"\n",r1.calculateArea(),r1.calculateCircumference());

        System.out.println("\nTriangle\n");

        Triangle t1 = new Triangle(0,0);
        t1.setHeight(8.66);
        t1.setBase(10);
        System.out.println("Height= "+t1.getHeight()+"\nbase= "+ t1.getBase());
        System.out.printf("Area= %.2f \nPerimeter= %.2f"+"\n",r1.calculateArea(),r1.calculateCircumference());
    }
}