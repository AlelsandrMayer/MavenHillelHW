package net.hliznutsa.hw20;

public enum Drinks {
    COFFEE(34),
    TEA(15),
    LEMONADE(18),
    MOJITO(55),
    MINERAL_WATER(10),
    COCA_COLA(24);

    private final int PRICE;

    Drinks(int price) {
        this.PRICE = price;
    }

    public int getPrice() {
        return PRICE;
    }
}