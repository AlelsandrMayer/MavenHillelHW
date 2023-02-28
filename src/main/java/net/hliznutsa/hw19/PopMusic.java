package net.hliznutsa.hw19;

public class PopMusic extends MusicStyles {

    protected PopMusic(String name) {
        super(name);
    }

    @Override
    protected void playMusic() {
        System.out.println("Группа '" + this.groupName + "' играет Попсу");
    }
}
