package net.hliznutsa.hw19;

public abstract class MusicStyles {
    protected String groupName;

    protected MusicStyles(String name) {
        this.groupName = name;
    }

    protected abstract void playMusic();
}
