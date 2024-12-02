package org.example.dz7;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя размер массива
        System.out.print("Введите размер массива: ");
        int razmer = scanner.nextInt();
        int[] Massive = new int[razmer];

        // Запрашиваем у пользователя значения элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < razmer; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            Massive[i] = scanner.nextInt();
        }

        int sum = 0;

        // Используем цикл for-each для перебора элементов массива
        for (int num : Massive) {
            if (num % 2 == 0) {
                sum += num; // Если число четное, добавляем его к сумме
            }
        }

        // Выводим результат
        System.out.println("Сумма всех четных чисел в массиве: " + sum);
    }
}
