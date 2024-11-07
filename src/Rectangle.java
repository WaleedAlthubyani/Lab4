public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = (height>0) ? height : 1;
        this.width = (width>0) ? width : 1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0)
            this.height = height;
        else
            System.out.println("A rectangle can't have a height= "+height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            System.out.println("A rectangle can't have a width= "+width);
    }

    @Override
    double calculateArea() {
        return getHeight()*getWidth();
    }

    @Override
    double calculateCircumference() {
        return 2*(getHeight()+getWidth());
    }
}
