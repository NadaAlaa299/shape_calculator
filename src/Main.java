import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("\n< Shape Calculator Program >");
            System.out.println("1) Calculate Circle");
            System.out.println("2) Calculate Rectangle");
            System.out.println("3) Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            System.out.print("\n");
            switch (choice){
                case 1:
                    System.out.print("Enter circle radius: ");
                    double radius = scanner.nextDouble();
                    Shape circle = new Circle(radius);
                    circle.printDetails();
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    Shape rectangle = new Rectangle(length, width);
                    rectangle.printDetails();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, Please try again.");
            }
        }
    }
}