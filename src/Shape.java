public abstract class Shape {
    public abstract double cal_area();
    public abstract double cal_perimeter();

    public void printDetails()
    {
        System.out.println("Area = " + cal_area());
        System.out.println("Perimeter = " + cal_perimeter());
    }
}