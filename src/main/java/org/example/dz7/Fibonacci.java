package org.example.dz7;

public class Fibonacci {
    // Рекурсивная функция для вычисления числа Фибоначчи
    public static int Recursia(int n) {
        if (n <= 1) {
            return n;
        }
        return Recursia(n - 1) + Recursia( n- 2);
    }

    public static void main(String[] args) {
        int n = 40; // Число Фибоначчи, которое нужно вычислить
        System.out.println("Число Фибоначчи (рекурсивно) для n = " + n + ": " + Recursia(n));
    }
}


