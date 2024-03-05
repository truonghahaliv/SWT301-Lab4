import java.util.Scanner;

public class TinhToan {
    public static void main(String[] args) {
        System.out.println(Double.parseDouble("abc"));
    }


    public  double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public  double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Tính chu vi và diện tích hình tròn
    public  double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public  double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Tính chu vi và diện tích hình vuông
    public  double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    public  double calculateSquareArea(double side) {
        return side * side;
    }

    private  boolean isValidNumber(double num) {
        return !Double.isNaN(num) && !Double.isInfinite(num);
    }
}
