package net.hliznutsa.hw19;

public class RockMusic extends MusicStyles {
    protected RockMusic(String name) {
        super(name);
    }

    @Override
    protected void playMusic() {
        System.out.println("Группа '" + this.groupName + "' играет Рок");
    }
}
