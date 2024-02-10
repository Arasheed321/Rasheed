
import java.util.Scanner;

public class RectangleCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area and perimeter
        double area = calculateRectangleArea(length, width);
        double perimeter = calculateRectanglePerimeter(length, width);

        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the perimeter of a rectangle
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}