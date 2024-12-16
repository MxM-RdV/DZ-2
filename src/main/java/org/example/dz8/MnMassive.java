package org.example.dz8;

public class MnMassive {
    public static void main(String[] args) {
        // Инициализируем двумерный массив (матрицу)
        int[][] matrica = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Переменная для хранения суммы элементов
        int sum = 0;

        // Проходим по всем элементам матрицы с использованием вложенных циклов for
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                sum += matrica[i][j]; // Добавляем текущий элемент к сумме
            }
        }

        // Выводим результат
        System.out.println("Сумма всех чисел в матрице: " + sum);
    }
}

