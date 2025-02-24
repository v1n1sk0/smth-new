import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        task1(scanner);

        // Задача 2
        task2(scanner);

        // Задача 3
        task3(scanner);

        // Задача 4
        task4(scanner);

        // Задача 5
        task5(scanner);

        scanner.close();
    }

    // Задача 1
    private static void task1(Scanner scanner) {
        System.out.print("Введите операционную систему (0 - iOS, 1 - Android): ");
        int clientOS = scanner.nextInt();
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    // Задача 2
    private static void task2(Scanner scanner) {
        System.out.print("Введите операционную систему (0 - iOS, 1 - Android): ");
        int clientOS = scanner.nextInt();
        System.out.print("Введите год выпуска устройства: ");
        int clientDeviceYear = scanner.nextInt();

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
    }

    // Задача 3
    private static void task3(Scanner scanner) {
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("Год должен быть больше 1584.");
        }
    }

    // Задача 4
    private static void task4(Scanner scanner) {
        int deliveryDistance = 95; // Пример расстояния
        int days = 0;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставка невозможна.");
            return;
        }

        System.out.println("Потребуется дней: " + days);
    }

    // Задача 5
    private static void task5(Scanner scanner) {
        System.out.print("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12.");
            return;
        }

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
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
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }
}