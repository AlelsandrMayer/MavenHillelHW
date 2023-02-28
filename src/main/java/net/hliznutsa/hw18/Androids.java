package net.hliznutsa.hw18;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public String call() {
        return "Звонок с Андроида";
    }

    @Override
    public String sms() {
        return "Сообщение с Андроида";
    }

    @Override
    public String internet() {
        return "Интернет с Андроида";
    }

    @Override
    public String systemLinuxOS() {
        return "Операционна система LinuxOS";
    }
}
