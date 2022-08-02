import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static int currentYear = LocalDate.now().getYear();

    public static void main(String[] agrs) {
        printYear();
        identifyAppVersion();
        printDays();
    }

    private static int getCurrentYear() {
        return currentYear;
    }

    private static void printYear() {
        boolean leapYear = ((getCurrentYear() % 4 == 0) && (getCurrentYear() % 100 != 0) || (getCurrentYear() % 400 == 0));
        if (leapYear) {
            System.out.println(getCurrentYear() + " Год является высокосным");
        } else {
            System.out.println(getCurrentYear() + " Год не является высокосным");
        }

    }

    private static int clientOS() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите ОС Вашего устройства, где IOS это 0 а Android это 1");
            return scanner.nextInt();
        }
    }

    private static void identifyAppVersion() {
        int clientIOS = 0;
        int clientAndroid = 1;
        int year = 2015;
        int os = clientOS();
        if (os == clientIOS && getCurrentYear() >= year) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == clientIOS) {
            System.out.println("Установите обленченную версию приложения для iOS по ссылке");
        } else if (os == clientAndroid && getCurrentYear() >= year) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (os == clientAndroid) {
            System.out.println("Установите обленченную версию приложения для Android по ссылке");
        }
    }

    private static int deliveryDistance() {
        return 95;
    }

    private static void printDays() {
        System.out.println("Доставка займет " + deliverCart() + " дня");
    }

    private static int deliverCart() {
        int delivery = 1;
        if (deliveryDistance() > 60) {
            delivery++;
        }
        if (deliveryDistance() <= 100) {
            delivery++;
        }
        return delivery;
    }
}