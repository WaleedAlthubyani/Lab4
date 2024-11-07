public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = (height>0) ? height : 1;
        this.base = (base>0) ? base : 1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0)
            this.height = height;
        else
            System.out.println("A triangle can't have a height= "+height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base>0)
            this.base = base;
        else
            System.out.println("A triangle can't have a base= "+base);
    }

    @Override
    double calculateArea() {
        return ((getBase()*getHeight()/2));
    }

    @Override
    double calculateCircumference() {
        return 3*getBase();
    }
}
