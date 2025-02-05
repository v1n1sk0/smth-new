public class Main {
    public static void main(String[] args) {
        // Задача 1
        int intValue = 569;
        byte byteValue = 67;
        short shortValue = 27897;
        long longValue = 987678965549L;
        float floatValue = 2.786f;
        double doubleValue = 27.12;

        System.out.println("Значение переменной intValue с типом int равно " + intValue);
        System.out.println("Значение переменной byteValue с типом byte равно " + byteValue);
        System.out.println("Значение переменной shortValue с типом short равно " + shortValue);
        System.out.println("Значение переменной longValue с типом long равно " + longValue);
        System.out.println("Значение переменной floatValue с типом float равно " + floatValue);
        System.out.println("Значение переменной doubleValue с типом double равно " + doubleValue);

        // Задача 3
        int ludmilaStudents = 23;
        int annaStudents = 27;
        int ekaterinaStudents = 30;
        int totalSheets = 480;

        int totalStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
        int sheetsPerStudent = totalSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        // Задача 4
        int bottlesPerTwoMinutes = 16;
        int minutesIn20 = 20;
        int minutesInDay = 1440; // 24 * 60 = 1440
        int minutesIn3Days = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesIn20Minutes = (bottlesPerTwoMinutes / 2) * minutesIn20;
        int bottlesInDay = (bottlesPerTwoMinutes / 2) * minutesInDay;
        int bottlesIn3Days = (bottlesPerTwoMinutes / 2) * minutesIn3Days;
        int bottlesInMonth = (bottlesPerTwoMinutes / 2) * minutesInMonth;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");

        // Задача 5
        int totalClasses = 30; // Сумма классов
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int totalWhitePaint = totalClasses * whitePaintPerClass;
        int totalBrownPaint = totalClasses * brownPaintPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        // Задача 6
        int bananasQuantity = 5;
        int bananaWeight = 80;
        int milkVolume = 200;
        int milkWeightPer100ml = 105;
        int iceCreamQuantity = 2;
        int iceCreamWeight = 100;
        int eggsQuantity = 4;
        int eggWeight = 70;

        int totalWeightInGrams = (bananasQuantity * bananaWeight) +
                (milkVolume / 100 * milkWeightPer100ml) +
                (iceCreamQuantity * iceCreamWeight) +
                (eggsQuantity * eggWeight);
        double totalWeightInKg = totalWeightInGrams / 1000.0;

        System.out.println("Общий вес завтрака: " + totalWeightInGrams + " грамм (" + totalWeightInKg + " кг)");

        // Задача 7
        int weightToLoseInKg = 7;
        int lossPerDayMin = 250; // грамм
        int lossPerDayMax = 500; // грамм

        int daysForMinLoss = (weightToLoseInKg * 1000) / lossPerDayMax;
        int daysForMaxLoss = (weightToLoseInKg * 1000) / lossPerDayMin;
        double averageDaysToLoseWeight = (daysForMinLoss + daysForMaxLoss) / 2.0;

        System.out.println("На похудение при 250 граммах в день уйдет " + daysForMinLoss + " дней.");
        System.out.println("На похудение при 500 граммах в день уйдет " + daysForMaxLoss + " дней.");
        System.out.println("В среднем потребуется " + averageDaysToLoseWeight + " дней для достижения результата.");

        // Задача 8
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        // Увеличение зп на 10%
        double mashaNewSalary = mashaSalary * 1.1;
        double denisNewSalary = denisSalary * 1.1;
        double kristinaNewSalary = kristinaSalary * 1.1;

        double mashaAnnualIncomeIncrease = (mashaNewSalary * 12) - (mashaSalary * 12);
        double denisAnnualIncomeIncrease = (denisNewSalary * 12) - (denisSalary * 12);
        double kristinaAnnualIncomeIncrease = (kristinaNewSalary * 12) - (kristinaSalary * 12);

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualIncomeIncrease + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualIncomeIncrease + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualIncomeIncrease + " рублей.");
    }
}