package net.hliznutsa.hw19;

public abstract class MusicStyles {
    protected String groupName;

    protected MusicStyles(String name) {
        this.groupName = name;
    }

    protected abstract void playMusic();

    public static void print(MusicStyles[] music) {
        if (music == null) {
            System.out.println("Нет данных на вывод!");
        } else {
            for (MusicStyles musicStyle : music) {
                musicStyle.playMusic();
            }
        }
    }
}
