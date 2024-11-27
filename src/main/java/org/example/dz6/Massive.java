package org.example.dz6;

import java.util.Scanner;

public class Massive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");   // Запрашиваем у пользователя размер массива
        int peremennaya = scanner.nextInt();  // Вбиваем свои данные в переменную
        int[] Massiv = new int[peremennaya]; // Создаём массив с указанными данными в переменной

        System.out.println("Введите элементы массива:");   // Запрашиваем у пользователя значения элементов массива
        for (int i = 0; i < peremennaya; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            Massiv[i] = scanner.nextInt(); // Запрашиваем данные для каждого элемента массива
        }

        int max = Massiv[0];
        int min = Massiv[0];
        for (int i = 1; i < peremennaya; i++) { //Определяем максимальный и минимальный элементы массива
            if (Massiv[i] > max) {
                max = Massiv[i];
            }
            if (Massiv[i] < min) {
                min = Massiv[i];
            }  // Через фор прогнали все значения, если есть выполнение условий - обновляем переменные макс и мин
        }

        System.out.println("Введенный массив:");  // Выводим введенный массив
        for (int i = 0; i < peremennaya; i++) {
            System.out.print(Massiv[i] + " ");
        }
        System.out.println();

        System.out.println("Максимальный элемент массива: " + max); // Выводим максимальный и минимальный элементы массива
        System.out.println("Минимальный элемент массива: " + min);
    }
}
