package net.hliznutsa.hw19;

public class ClassicMusic extends MusicStyles {
    protected ClassicMusic(String name) {
        super(name);
    }

    @Override
    protected void playMusic() {
        System.out.println("Группа '" + this.groupName + "' играет Классику.");
    }
}
