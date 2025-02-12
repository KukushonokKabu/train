import java.util.Scanner;

/*
Программа для вычисления среднего арифметического
*/
public class ArithmeticMean {
    public static void main(String[] args) {
        System.out.print("Введите три числа для получения среднего арифметического :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = (a+b+c)/3;
        System.out.println("Среднее арифметическое получилось : "+ d);

    }
}
