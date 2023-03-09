package net.hliznutsa.hw20;

import static net.hliznutsa.hw20.MethodsDrink.printMachineMenu;
import static net.hliznutsa.hw20.MethodsDrink.printScore;

public class MainRunDrinkMachine {
    public static void main(String[] args) {
        printMachineMenu();

        DrinkMachine firstClient = new DrinkMachine();
        firstClient.choice();

        printScore(firstClient.getAmountPurchases(), firstClient.getCountOfDrinks());

    }
}