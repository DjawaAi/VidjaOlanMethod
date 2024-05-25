import java.time.LocalDate;

public class Main {
    public static void dZ (byte dZ1) {
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
        if (yearOfRelease < currentYear && operatingSystem == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (yearOfRelease <currentYear && operatingSystem == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (yearOfRelease == currentYear && operatingSystem == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (yearOfRelease == currentYear && operatingSystem == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
    }

    public static void deliveryTimeOfCard  (int deliveryDistance) {
        int time = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Карта будет доставлена вам в течении " +time+ " суток");
        } else if (deliveryDistance > 20 && 60 >= deliveryDistance) {time += 1;
            System.out.println("Карта будет доставлена вам в течении " +time+ " суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {time += 1;
            System.out.println("Карта будет доставлена вам в течении " +time+ " суток");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка на растояние " +deliveryDistance+ " невыполняется");
        }
    }

    public static void main(String[] args) {
        System.out.println("Тема ДЗ Метод");
        byte dZ = 0;
        ++dZ;
        dZ(dZ);

        int year1 = 2024;
        determineLeapYear(year1);

        ++dZ;
        dZ(dZ);

        int clientOS = 1;
        int clientDeviceYear = 2023;
        if ((clientOS != 0 && clientOS != 1) || clientDeviceYear > LocalDate.now().getYear()) {
            System.out.println("Для данной операционной системы приложение отсутствуе или введён не возможный год выпуска устройства");
        } else {
            identificationOfApplicationForOS(clientOS, clientDeviceYear);
        }

        ++dZ;
        dZ(dZ);

        int remoteness = 65;
        deliveryTimeOfCard(remoteness);
    }
}