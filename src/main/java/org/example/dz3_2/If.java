package org.example.dz3_2;

public class If {
    public static void main(String [] args) {
        int N = 100;
        if(N<1){
            System.out.println("числа для вывода отсутствуют");
        } else if (N>1) {
            for(int i = 1;i<=N;i++) {
            System.out.println(i);
        }
        }
    }
}
