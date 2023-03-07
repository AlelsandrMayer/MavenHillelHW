package net.hliznutsa.hw20;

import java.util.Scanner;

enum DrinksMachine {
    COFFEE(34),
    TEA(15),
    LEMONADE(18),
    MOJITO(55),
    MINERAL_WATER(10),
    COCA_COLA(24);

    private final int PRICE;

    DrinksMachine(int price) {
        this.PRICE = price;
    }

    public int getPrice() {
        return PRICE;
    }
}

class Drink {
    private static int countOfDrinks = 0;
    private static int amountPurchases = 0;

    public void printInfo() {
        System.out.println("МЕНЮ: \n" + " -1- " + DrinksMachine.COFFEE + " - цена: " + DrinksMachine.COFFEE.getPrice());
        System.out.println(" -2- " + DrinksMachine.TEA + " - цена: " + DrinksMachine.TEA.getPrice());
        System.out.println(" -3- " + DrinksMachine.LEMONADE + " - цена: " + DrinksMachine.LEMONADE.getPrice());
        System.out.println(" -4- " + DrinksMachine.MOJITO + " - цена: " + DrinksMachine.MOJITO.getPrice());
        System.out.println(" -5- " + DrinksMachine.MINERAL_WATER + " - цена: " + DrinksMachine.MINERAL_WATER.getPrice());
        System.out.println(" -6- " + DrinksMachine.COCA_COLA + " - цена: " + DrinksMachine.COCA_COLA.getPrice());
        System.out.println("Сделайте выбор согласно порядковому номеру в меню\n" +
                "Например если хотите выбрать LEMONADE , напишите  3");
    }

    public void chooseDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваш выбор: ");
        int choose = scanner.nextInt();

        if (choose <= 0 || choose >= 7) {
            System.out.println("Некоректный ввод, попробуйте ещё раз.");
            chooseDrink();
        } else {
            countOfDrinks++;
            switch (choose) {
                case 1:
                    printForSwitch(DrinksMachine.COFFEE);
                    System.out.println("Ингридиенты: Вода, зерна, сахар.");
                    break;
                case 2:
                    printForSwitch(DrinksMachine.TEA);
                    System.out.println("Ингридиенты: Вода, натуральный чай, сахар.");
                    break;
                case 3:
                    printForSwitch(DrinksMachine.LEMONADE);
                    System.out.println("Ингридиенты: Вода, лимон, сахар.");
                    break;
                case 4:
                    printForSwitch(DrinksMachine.MOJITO);
                    System.out.println("Ингридиенты: Вода, лимон, лайм, мята, сахар.");
                    break;
                case 5:
                    printForSwitch(DrinksMachine.MINERAL_WATER);
                    System.out.println("Ингридиенты: Самая минеральная вода.");
                    break;
                case 6:
                    printForSwitch(DrinksMachine.COCA_COLA);
                    System.out.println("Ингридиенты: Вода, секретный ингридиент, много сахара.");
                    break;
            }
            System.out.println("Желаете ещё что-то заказать? Напишите Да или Нет");
            String yesOrNo = scanner.next();
            String yes = "ДА";
            if (yes.equalsIgnoreCase(yesOrNo)) {
                chooseDrink();
            }
        }
    }

    public void allTogether() {
        System.out.println("Количество напитков: " + countOfDrinks + "\nСумма к оплате: " + amountPurchases);
    }

    public static void printForSwitch(DrinksMachine choice) {
        amountPurchases += choice.getPrice();
        System.out.println("Вы выбрали " + choice);
    }
}
