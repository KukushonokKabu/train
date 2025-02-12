import java.util.Scanner;

/*
Калькулятор площади прямоугольника
Формула : S = a* b.
*/
public class RectangleAreaCalculator {
    public static void main(String[] args) {
        double length;
        double width;
        System.out.print("Введите ширину прямоугольника : ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextDouble();
        System.out.print("Введите длину прямоугольника : ");
        width = scanner.nextDouble();
        System.out.println("Площадь прямоугольника составила : " + length * width + " в сантиметрах ");
        System.out.println("Площадь прямоугольника составила : " + (length * width) / 10000 + " в метрах ");
    }
}