package net.hliznutsa.hw20;

import java.util.Scanner;

public class DrinkMachineWork {
    private static int countOfDrinks = 0;
    private static int amountPurchases = 0;
    private static int attempts = 0;

    public static void machineStart() {
        System.out.println("МЕНЮ: \n" + DrinksMachine.COFFEE + " - цена: " + DrinksMachine.COFFEE.getPrice());
        System.out.println(DrinksMachine.TEA + " - цена: " + DrinksMachine.TEA.getPrice());
        System.out.println(DrinksMachine.LEMONADE + " - цена: " + DrinksMachine.LEMONADE.getPrice());
        System.out.println(DrinksMachine.MOJITO + " - цена: " + DrinksMachine.MOJITO.getPrice());
        System.out.println(DrinksMachine.MINERAL_WATER + " - цена: " + DrinksMachine.MINERAL_WATER.getPrice());
        System.out.println(DrinksMachine.COCA_COLA + " - цена: " + DrinksMachine.COCA_COLA.getPrice());
        System.out.println("\nСделайте выбор согласно названию в меню\n" + "Например Lemonade");

        systemInDrink();
    }

    private static void systemInDrink() {
        System.out.println("Ваш выбор: ");

        Scanner scanner = new Scanner(System.in);
        String drinkScanner = scanner.next();

        choice(checkEnumValue(drinkScanner));
    }

    private static DrinksMachine checkEnumValue(String drinkScanner) {
        for (DrinksMachine objDrink : DrinksMachine.values()) {

            if ((objDrink.name()).equalsIgnoreCase(drinkScanner)) {

                return DrinksMachine.valueOf(drinkScanner.toUpperCase());
            }
        }
        return null;
    }

    private static void choice(DrinksMachine drinkObj) {
        if (drinkObj != null) {

            countOfDrinks++;

            switch (drinkObj) {
                case COFFEE:
                    printForSwitch(DrinksMachine.COFFEE);
                    System.out.println("Ингридиенты: Вода, зерна, сахар.");
                    break;
                case TEA:
                    printForSwitch(DrinksMachine.TEA);
                    System.out.println("Ингридиенты: Вода, натуральный чай, сахар.");
                    break;
                case LEMONADE:
                    printForSwitch(DrinksMachine.LEMONADE);
                    System.out.println("Ингридиенты: Вода, лимон, сахар.");
                    break;
                case MOJITO:
                    printForSwitch(DrinksMachine.MOJITO);
                    System.out.println("Ингридиенты: Вода, лимон, лайм, мята, сахар.");
                    break;
                case MINERAL_WATER:
                    printForSwitch(DrinksMachine.MINERAL_WATER);
                    System.out.println("Ингридиенты: Самая минеральная вода.");
                    break;
                case COCA_COLA:
                    printForSwitch(DrinksMachine.COCA_COLA);
                    System.out.println("Ингридиенты: Вода, секретный ингридиент, много сахара.");
                    break;
            }
            amountPurchases += drinkObj.getPrice();
            wantMore();
        } else {
            System.out.println("Некоректный ввод, попробуйте ещё раз.");
            attempts();
        }
    }

    private static void wantMore() {
        System.out.println("Желаете ещё что-то заказать? Напишите Да или Нет");
        String yes = "ДА";

        Scanner scanner = new Scanner(System.in);
        String yesOrNo = scanner.next();

        if (yes.equalsIgnoreCase(yesOrNo)) {
            systemInDrink();
        } else {
            allTogether();
        }
    }

    private static void allTogether() {
        System.out.println("Количество напитков: " + countOfDrinks + "\nСумма к оплате: " + amountPurchases);
    }

    private static void attempts() {
        if (attempts <= 3) {
            attempts++;
            systemInDrink();
        }
    }

    public static void printForSwitch(DrinksMachine choice) {
        System.out.println("Вы выбрали " + choice);
    }
}