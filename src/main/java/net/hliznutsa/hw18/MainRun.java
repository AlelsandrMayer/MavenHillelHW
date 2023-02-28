package net.hliznutsa.hw18;

public class MainRun {
    public static void main(String[] args) {
        Smartphones androidPhone1 = new Androids();
        printSmartPhone(androidPhone1);

        LinuxOS androidPhone2 = new Androids();
        System.out.println("\n--- " + androidPhone2.systemLinuxOS());

        Androids androidPhone3 = new Androids();
        printAllAndroids(androidPhone3);

        iPhones iphone1 = new iPhones();
        printAllIphone(iphone1);

        Smartphones iphone2 = new iPhones();
        printSmartPhone(iphone2);
    }

    public static void printSmartPhone(Smartphones phone) {
        System.out.print("--- " + phone.sms() + " , " + phone.call() + " , " + phone.internet());
    }

    public static void printAllIphone(iPhones phone) {
        printSmartPhone(phone);
        System.out.println(" , " + phone.systemIOS());
    }

    public static void printAllAndroids(Androids phone) {
        printSmartPhone(phone);
        System.out.println(" , " + phone.systemLinuxOS());
    }
}
