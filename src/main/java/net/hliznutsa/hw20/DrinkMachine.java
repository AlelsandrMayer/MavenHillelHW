package net.hliznutsa.hw20;

import static net.hliznutsa.hw20.MethodsDrink.systemInDrink;
import static net.hliznutsa.hw20.MethodsDrink.wantMore;

public class DrinkMachine {
    private static int amountPurchases = 0;
    private static int countOfDrinks = 0;

    public int getAmountPurchases() {
        return amountPurchases;
    }

    public int getCountOfDrinks() {
        return countOfDrinks;
    }

    public void choice() {
        do {
            switch (systemInDrink()) {
                case COFFEE:
                    counterAndPrintChoice(Drinks.COFFEE);
                    System.out.println("Ингридиенты: Вода, зерна, сахар.");
                    break;
                case TEA:
                    counterAndPrintChoice(Drinks.TEA);
                    System.out.println("Ингридиенты: Вода, натуральный чай, сахар.");
                    break;
                case LEMONADE:
                    counterAndPrintChoice(Drinks.LEMONADE);
                    System.out.println("Ингридиенты: Вода, лимон, сахар.");
                    break;
                case MOJITO:
                    counterAndPrintChoice(Drinks.MOJITO);
                    System.out.println("Ингридиенты: Вода, лимон, лайм, мята, сахар.");
                    break;
                case MINERAL_WATER:
                    counterAndPrintChoice(Drinks.MINERAL_WATER);
                    System.out.println("Ингридиенты: Самая минеральная вода.");
                    break;
                case COCA_COLA:
                    counterAndPrintChoice(Drinks.COCA_COLA);
                    System.out.println("Ингридиенты: Вода, секретный ингридиент, много сахара.");
                    break;
            }
        } while (wantMore());
    }

    public static void counterAndPrintChoice(Drinks choice) {
        countOfDrinks++;
        amountPurchases += choice.getPrice();
        System.out.println("Вы выбрали " + choice);
    }
}