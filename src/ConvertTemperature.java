import java.util.Scanner;

/*
Программа которая запрашивает у пользователя температуру в градусах Цельсия и преобразует ее в градусы Фаренгейта.
Формула : F=(C*9/5)+32.
*/
public class ConvertTemperature {
    public static void main(String[] args) {
        System.out.print("Введи температуру в градусах Цельсия :");
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        double temperature2 = (temperature * 9 / 5) + 32;
        System.out.println("В градусах Фаренгейта получится : " + temperature2);
        System.out.println("Чтоб переконвертировать температуру из Фаренгейта в градусы Цельсия, введи температура или нажми 0 для выхода");
        Scanner scanner1 = new Scanner(System.in);
        double temp = scanner1.nextDouble();
        if (temp != 0) {
            System.out.println("Вы ввели " + temp + "градусов Фаренгейта");
            double temp2 = (temp - 32) * 5 / 9;
            System.out.println("Градусов Цельсия получится :" + temp2);
        }
        else System.out.println("Программа завершена.");

    }
}