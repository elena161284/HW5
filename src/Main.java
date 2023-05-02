public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 14;
        int clientOS = 0;
        boolean nyw = clientOS == 1 && clientDeviceYear < 15;
        if (nyw) {
            System.out.println("Установите облегченную версию версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 15) {
            System.out.println("Установите облегченную версию версию приложения для iOS по ссылке.");
        }
        boolean nyw2 = clientOS == 1 && clientDeviceYear == 15;
        if (nyw2) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear == 15) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2200;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        boolean from1Day = (deliveryDistance <= 20);
        if (from1Day) {
            System.out.println("Потребуется 1 день для доставки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня для доставки.");
        }
        boolean from3Days = (deliveryDistance > 60 && deliveryDistance < 100);
        if (from3Days) {
            System.out.println("Потребуется 3 дня для доставки.");
        } else {
            System.out.println("Доставки нет.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                default:
                System.out.println("Такого сезона не существует");
        }
        }
    }

