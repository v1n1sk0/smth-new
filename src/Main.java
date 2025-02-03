public class Main {
    public static void main(String[] args) {
        // Задача 2: Увеличиваем значения переменных на 4
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog += 4; // Увеличиваем dog на 4
        cat += 4; // Увеличиваем cat на 4
        paper += 4; // Увеличиваем paper на 4

        System.out.println("Новое значение переменной dog: " + dog);
        System.out.println("Новое значение переменной cat: " + cat);
        System.out.println("Новое значение переменной paper: " + paper);

        // Задача 3: Уменьшаем значения переменных
        dog -= 3.5; // Уменьшаем dog на 3.5
        cat -= 1.6; // Уменьшаем cat на 1.6
        paper -= 7639; // Уменьшаем paper на 7639

        System.out.println("Новое значение переменной dog: " + dog);
        System.out.println("Новое значение переменной cat: " + cat);
        System.out.println("Новое значение переменной paper: " + paper);

        // Задача 4: Работа с переменной friend
        var friend = 19;
        System.out.println("Изначальное значение friend: " + friend);

        friend += 2; // Увеличиваем friend на 2
        System.out.println("Значение friend после увеличения на 2: " + friend);

        friend /= 7; // Делим friend на 7
        System.out.println("Значение friend после деления на 7: " + friend);

        // Задача 5: Работа с переменной frog
        var frog = 3.5;
        System.out.println("Изначальное значение frog: " + frog);

        frog *= 10; // Увеличиваем frog в 10 раз
        System.out.println("Значение frog после увеличения на 10 раз: " + frog);

        frog /= 3.5; // Делим frog на 3.5
        System.out.println("Значение frog после деления на 3.5: " + frog);

        frog += 4; // Добавляем 4 к frog
        System.out.println("Значение frog после добавления 4: " + frog);

        // Задача 6: Общая масса двух боксеров
        var boxer1Weight = 78.2; // Масса первого боксера
        var boxer2Weight = 82.7; // Масса второго боксера

        var totalWeight = boxer1Weight + boxer2Weight; // Общая масса
        System.out.println("Общая масса двух боксеров: " + totalWeight);

        var weightDifference = boxer2Weight - boxer1Weight; // Разница между массами
        System.out.println("Разница между массами боксеров: " + weightDifference);

        // Задача 7: Остаток от деления
        var remainder = boxer2Weight % boxer1Weight; // Остаток от деления
        System.out.println("Остаток от деления массы второго боксера на массу первого: " + remainder);
        // Задача 8: Арифметические функции
        var totalHours = 640; // Общее количество часов работы
        var hoursPerEmployee = 8; // Часы работы на одного сотрудника
        var totalEmployees = totalHours / hoursPerEmployee; // Общее количество работников
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");

        var additionalEmployees = 94; // Дополнительные работники
        var newTotalEmployees = totalEmployees + additionalEmployees; // Новое общее количество работников
        var newTotalHours = newTotalEmployees * hoursPerEmployee; // Часы работы для нового количества работников
        System.out.println("Если в компании работает " + newTotalEmployees + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}
