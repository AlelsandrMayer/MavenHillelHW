package net.hliznutsa.hw20;

import java.util.Scanner;

public class MethodsDrink {
    private static final String YES = "YES";

    public static void printMachineMenu() {
        System.out.println("МЕНЮ: \n" + Drinks.COFFEE + " - цена: " + Drinks.COFFEE.getPrice());

        System.out.println(Drinks.TEA + " - цена: " + Drinks.TEA.getPrice());

        System.out.println(Drinks.LEMONADE + " - цена: " + Drinks.LEMONADE.getPrice());

        System.out.println(Drinks.MOJITO + " - цена: " + Drinks.MOJITO.getPrice());

        System.out.println(Drinks.MINERAL_WATER + " - цена: " + Drinks.MINERAL_WATER.getPrice());

        System.out.println(Drinks.COCA_COLA + " - цена: " + Drinks.COCA_COLA.getPrice());

        System.out.println("\nСделайте выбор согласно названию в меню\n" + "Например Lemonade");
    }

    protected Drinks systemInDrink() {
        System.out.println("Ваш выбор: ");

        Scanner scanner = new Scanner(System.in);
        String drinkScanner = scanner.next();

        return Drinks.valueOf(drinkScanner.toUpperCase());
    }

    protected boolean wantMore() {
        System.out.println("Желаете ещё что-то заказать? Напишите YES или NO");

        Scanner scanner = new Scanner(System.in);
        String yesOrNo = scanner.next();

        return YES.equalsIgnoreCase(yesOrNo);
    }

    public static void printScore(int amountPurchases, int countOfDrinks) {
        System.out.println("Количество напитков: " + countOfDrinks +
                "\nСумма к оплате: " + amountPurchases);
    }
}