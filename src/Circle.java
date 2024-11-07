public class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius>=0)
            this.radius = radius;
        else
            System.out.println("radius can't be negative");
    }

    @Override
    double calculateArea() {
        return Math.PI*(getRadius()*getRadius());
    }

    @Override
    double calculateCircumference() {
        return 2*Math.PI*getRadius();
    }
}
