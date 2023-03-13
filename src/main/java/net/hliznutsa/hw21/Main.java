package net.hliznutsa.hw21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 3;
        User user = null;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите логин:");
            String login = scanner.next();

            System.out.println("Введите пароль:");
            String password = scanner.next();

            System.out.println("Повторите ввод пароля:");
            String confirmPassword = scanner.next();

            count--;
            try {
                user = new User(login, password, confirmPassword);
            } catch (WrongLoginException | WrongPasswordException | NullPointerException e) {
                System.err.println(e.getMessage() + "\nОсталось " + count + " попыток");
            }
        } while (user == null && count > 0);

        try {
            System.out.println(user.getLOGIN() + "  ,  " + user.getPASSWORD());
        } catch (NullPointerException e) {
            System.err.println("Нет данных");
        } finally {
            System.out.println("Дякую, що скористались нашим сервісом");
        }
    }
}