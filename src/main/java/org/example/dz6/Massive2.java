package org.example.dz6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Massive2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peremennaya = 0;
        while (true) {
            try {
                System.out.print("Введите размер массива: ");  // Запрашиваем у пользователя размер массива
                peremennaya = scanner.nextInt(); // Вбиваем свои данные в переменную
                if (peremennaya > 0) {
                    break;
                } else {
                    System.out.println("Размер массива должен быть положительным числом."); // Ошибка ввода числа с минусом
                }
            } catch (InputMismatchException e) {
                System.out.println("Некорректное значение. Пожалуйста, введите целое число."); // Ошибка ввода букв вместо чисел
                scanner.next(); // Очистить некорректный ввод
            }
        }

        int[] Massiv = new int[peremennaya]; // Создаём массив с указанными данными в переменной

        System.out.println("Введите элементы массива:"); // Запрашиваем у пользователя значения элементов массива
        for (int i = 0; i < peremennaya; i++) {
            while (true) {
                try {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    Massiv[i] = scanner.nextInt(); // Запрашиваем данные для каждого элемента массива
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Некорректное значение. Пожалуйста, введите целое число."); // Ошибка ввода букв вместо чисел
                    scanner.next(); // Очистить некорректный ввод
                }
            }
        }

        int max = Massiv[0];
        int min = Massiv[0];
        for (int i = 1; i < peremennaya; i++) {   // Определяем максимальный и минимальный элементы массива
            if (Massiv[i] > max) {
                max = Massiv[i];
            }
            if (Massiv[i] < min) {
                min = Massiv[i];
            } // Через фор прогнали все значения, если есть выполнение условий - обновляем переменные макс и мин
        }

        System.out.println("Введенный массив:");   // Выводим введенный массив
        for (int i = 0; i < peremennaya; i++) {
            System.out.print(Massiv[i] + " ");
        }
        System.out.println();

        System.out.println("Максимальный элемент массива: " + max);    // Выводим максимальный и минимальный элементы массива
        System.out.println("Минимальный элемент массива: " + min);
    }
}
