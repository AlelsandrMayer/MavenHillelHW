package net.hliznutsa.hw21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = createUser();

        try {
            System.out.println("Логин: " + user1.getLogin() + "  ,  " + "Пароль: " + user1.getPassword());
        } catch (NullPointerException e) {
            System.err.println("Пользователь не создан");
        } finally {
            System.out.println("Дякую, що скористались нашим сервісом");
        }
    }

    public static User createUser() {
        int count = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите логин:");
            String login = scanner.next();

            System.out.println("Введите пароль:");
            String password = scanner.next();

            System.out.println("Повторите ввод пароля:");
            String confirmPassword = scanner.next();

            try {
                return new User(login, password, confirmPassword);

            } catch (WrongLoginException | WrongPasswordException e) {
                count++;
                System.err.println(e.getMessage() + "\nИспользовано " + count + "/3  попыток");
            }
        } while (count < 3);
        return null;
    }
}