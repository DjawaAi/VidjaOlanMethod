import java.time.LocalDate;

public class Main {
    public static void assignTaskNumber (byte dZ1) {
        System.out.println();
        System.out.println("Задача № " + dZ1);
        System.out.println();
    }

    public static void determineLeapYear(int year) {
        int diffYear = year - 1584;
        int remains = diffYear % 4;
        if (year >= 1584 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year >= 1584 && year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year >= 1584 && year % 4 == 0) {System.out.println(year + " год является високосным");
        } else if (year >= 1584 && remains != 0) {
            System.out.println(year + " год не является високосным");
        } else if (year < 1584) {
            System.out.println(year + " год до введен високосного года");
        }
    }

    public static void identificationOfApplicationForOS(int operatingSystem, int yearOfRelease) {
        int currentYear = LocalDate.now().getYear();
        if (operatingSystem != 0 && operatingSystem != 1 && yearOfRelease > LocalDate.now().getYear()) {
            System.out.println("Для данной операционной системы приложение отсутствуе");
            System.out.println("Значение года выпуска устройства лежит в области грядущего будущего");
        } else if (operatingSystem != 0 && operatingSystem != 1) {
            System.out.println("Для данной операционной системы приложение отсутствуе");
        }
        else if (yearOfRelease > LocalDate.now().getYear()) {
            System.out.println("Значение года выпуска устройства лежит в области грядущего будущего");
        }
        else if (yearOfRelease < currentYear) {
            if (operatingSystem == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (yearOfRelease == currentYear) {
            if (operatingSystem == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
    }

    public static void deliveryTimeOfCard  (int deliveryDistance) {
        int time = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Карта будет доставлена вам в течении " +time+ " суток");
        } else if (deliveryDistance > 20 && 60 >= deliveryDistance) {
            System.out.println("Карта будет доставлена вам в течении " +(++time)+ " суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Карта будет доставлена вам в течении " +(time += 2)+ " суток");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка на растояние " +deliveryDistance+ " невыполняется");
        }
    }

    public static void main(String[] args) {
        System.out.println("Тема ДЗ Метод");
        byte dZ = 0;
        ++dZ;
        assignTaskNumber(dZ);

        int year1 = 2024;
        determineLeapYear(year1);

        ++dZ;
        assignTaskNumber(dZ);

        int clientOS = 1;
        int clientDeviceYear = 2020;
        identificationOfApplicationForOS(clientOS, clientDeviceYear);

        ++dZ;
        assignTaskNumber(dZ);

        int remoteness = 95;
        deliveryTimeOfCard(remoteness);
    }
}