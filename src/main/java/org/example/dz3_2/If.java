package org.example.dz3_2;

public class If {
    public static void main(String[] args) {
        int N = 100;
        function(N);
        test();
    }

    public static void test() {
        System.out.println("test");
    }

    public static void function(int N) {
        if (N < 1) {
            System.out.println("числа для вывода отсутствуют");
        } else {
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        }
    }
}
