public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double l, double w)
    {
        this.length = l;
        this.width = w;
    }

    @Override
    public double cal_area() {
        return length*width;
    }

    @Override
    public double cal_perimeter() {
        return 2*(length + width);
    }
}
