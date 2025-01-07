public class circle extends shape{
    private double radius;

    public circle(double r){
        this.radius = r;
    }
    @Override
    public double cal_area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double cal_perimeter() {
        return 2*Math.PI*radius;
    }
}