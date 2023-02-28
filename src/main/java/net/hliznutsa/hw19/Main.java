package net.hliznutsa.hw19;

import static net.hliznutsa.hw19.MusicStyles.print;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = new MusicStyles[3];

        musicStyles[0] = new RockMusic("Отбросы");
        musicStyles[1] = new PopMusic("Мошенники");
        musicStyles[2] = new ClassicMusic("Классики");

        print(musicStyles);
        print(null);
    }
}