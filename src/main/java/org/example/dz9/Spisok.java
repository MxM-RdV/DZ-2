package org.example.dz9;

import java.util.ArrayList;
import java.util.Scanner;

public class Spisok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studenti = new ArrayList<>();
        String command;

        while (true) {
            System.out.println("Введите команду (добавить, удалить, список, выйти):");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "добавить":
                    System.out.print("Введите имя студента: ");
                    String dobavitImya = scanner.nextLine().trim();
                    studenti.add(dobavitImya);
                    System.out.println("Студент " + dobavitImya + " добавлен в список.");
                    break;

                case "удалить":
                    System.out.print("Введите имя студента для удаления: ");
                    String udalitImya = scanner.nextLine().trim();
                    if (studenti.remove(udalitImya)) {
                        System.out.println("Студент " + udalitImya + " удален из списка.");
                    } else {
                        System.out.println("Студент " + udalitImya + " не найден в списке.");
                    }
                    break;

                case "список":
                    System.out.println("Текущий список студентов:");
                    for (String student : studenti) {
                        System.out.println(student);
                    }
                    break;

                case "выйти":
                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Некорректная команда. Пожалуйста, введите добавить, удалить, список или выйти.");
                    break;
            }
        }
    }
}
