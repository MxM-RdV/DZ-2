package org.example.dz5;

import java.util.Scanner;

public class DaysWeeks {
    public static String daysWeeks(int number) {
        return switch (number) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Некорректное значение. Введите число от 1 до 7.";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число (от 1 до 7): ");
            int number = scanner.nextInt();
            System.out.println(daysWeeks(number));

            System.out.print("Хотите ввести еще одно число? (да/нет): ");
            String again = scanner.next().trim().toLowerCase();
            if (!again.equals("да")) {
                System.out.println("Программа завершена.");
                break;
            }
        }
        scanner.close();
    }
}