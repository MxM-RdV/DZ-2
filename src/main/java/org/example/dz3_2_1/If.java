package org.example.dz3_2_1;

public class If {
    public static void main(String [] args) {
        int sum = 0;
        int count = 0;
            for(int i = 1;i<=100;i++) {
                if (i % 2 == 0) {
                    sum = sum + i;
                    count++;
                }
            }
        System.out.println("Сумма всех чертных чисел от 1 до 100: " + sum);
        System.out.println("Количество чертных чисел: " + count);

    }
}