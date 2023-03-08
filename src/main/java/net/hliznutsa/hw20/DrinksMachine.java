package net.hliznutsa.hw20;

public enum DrinksMachine {
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