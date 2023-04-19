import java.util.Scanner;

public class TestToCalculatingTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(20);
        double base = scanner.nextDouble();
        System.out.println(110);
        double height = scanner.nextDouble();
        double area = (height * base)/2;
        System.out.println("Площа Трикутника:" + area);
    }
}
