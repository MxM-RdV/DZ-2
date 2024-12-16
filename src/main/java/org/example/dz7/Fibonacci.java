package org.example.dz7;

public class Fibonacci {
    // Рекурсивная функция для вычисления числа Фибоначчи
    public static int recursion(int n) {
        if (n <= 1) {
            return n;
        }
        int m = recursion(n - 1);
        int k = recursion(n - 2);
        return m + k;
    }

    public static void main(String[] args) {
        int n = 5; // Число Фибоначчи, которое нужно вычислить
     //   System.out.println("Число Фибоначчи (рекурсивно) для n = " + n + ": " + recursion(n));
        for (int i= 0;i <= n;i++){
            System.out.print(recursion(i) + " " );
        }
    }
}


