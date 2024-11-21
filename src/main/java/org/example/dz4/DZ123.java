package org.example.dz4;

import java.util.Scanner;

public class DZ123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.println("Введите число (1, 2 или 3):");
            number = scanner.nextInt();
            if (number == 1) {
                System.out.println("Вы ввели число 1.");
                break;
            }
            if (number == 2) {
                System.out.println("Вы ввели число 2.");
                break;
            }
            if (number == 3) {
                System.out.println("Вы ввели число 3.");
                break;
            }
            System.out.println("Неправильный выбор. Попробуйте снова.");
        }
    }
}