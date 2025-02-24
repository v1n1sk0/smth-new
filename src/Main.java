import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        System.out.print("Введите возраст человека: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно подождать.");
        }

        // Задача 2
        System.out.print("Введите температуру воздуха: ");
        float temperature = scanner.nextFloat();
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        // Задача 3
        System.out.print("Введите скорость: ");
        float speed = scanner.nextFloat();
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        // Задача 4
        System.out.print("Введите возраст человека: ");
        age = scanner.nextInt();
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }

        // Задача 5
        System.out.print("Введите возраст ребенка: ");
        age = scanner.nextInt();
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 6
        System.out.print("Введите количество занятых мест в вагоне: ");
        int seatsTaken = scanner.nextInt();
        int totalCapacity = 102;
        int seatingCapacity = 60;

        if (seatsTaken < seatingCapacity) {
            System.out.println("Есть место в вагоне (сидячие места).");
        } else if (seatsTaken < totalCapacity) {
            System.out.println("Есть место в вагоне (стоячие места).");
        } else {
            System.out.println("Вагон уже полностью забит.");
        }

        // Задача 7
        System.out.print("Введите первое число: ");
        int one = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int two = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int three = scanner.nextInt();

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }

        scanner.close();
    }
}