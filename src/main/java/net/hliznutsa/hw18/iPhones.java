package net.hliznutsa.hw18;

public class iPhones implements Smartphones, IOS {
    @Override
    public String call() {
        return "Звонок с Айфона";
    }

    @Override
    public String sms() {
        return "Сообщение с Айфона";
    }

    @Override
    public String internet() {
        return "Интернет с Айфона";
    }

    @Override
    public String systemIOS() {
        return "Операционна система iOS";
    }
}
