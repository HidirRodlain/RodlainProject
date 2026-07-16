import java.util.ArrayList;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> pogod = new ArrayList<>(7);
        for (int i = 0; i < 7; i++) {
            pogod.add(0);
        }

        boolean isRunning = true; // Для бесконечного цикла меню

        while (isRunning) {
            System.out.println("\n--- Обновление Прогноза Погоды на Неделю ---");
            System.out.println("1. Обновить прогноз на Понедельник");
            System.out.println("2. Обновить прогноз на Вторник");
            System.out.println("3. Обновить прогноз на Среду");
            System.out.println("4. Обновить прогноз на Четверг");
            System.out.println("5. Обновить прогноз на Пятницу");
            System.out.println("6. Показать весь недельный прогноз");
            System.out.println("7. Выйти из программы");
            System.out.print("Ваш выбор: ");

            int choice = scan.nextInt();
            scan.nextLine(); // ВАЖНО: Очищаем буфер Scanner после nextInt()!

            switch (choice) {
                case 1: // Понедельник (индекс 0)
                    System.out.print("Введите температуру на Понедельник: ");
                    int tempMon = scan.nextInt();
                    pogod.set(0, tempMon); // ОБНОВЛЯЕМ элемент на индексе 0
                    System.out.println("Прогноз на Понедельник обновлен.");
                    break;
                case 2: // Вторник (индекс 1)
                    System.out.print("Введите температуру на Вторник: ");
                    int tempTue = scan.nextInt();
                    pogod.set(1, tempTue); // ОБНОВЛЯЕМ элемент на индексе 1
                    System.out.println("Прогноз на Вторник обновлен.");
                    break;
                case 3: // Среда (индекс 2)
                    System.out.print("Введите температуру на Среду: ");
                    int tempWed = scan.nextInt();
                    pogod.set(2, tempWed); // ОБНОВЛЯЕМ элемент на индексе 2
                    System.out.println("Прогноз на Среду обновлен.");
                    break;
                case 4: // Четверг (индекс 3)
                    System.out.print("Введите температуру на Четверг: ");
                    int tempThu = scan.nextInt();
                    pogod.set(3, tempThu); // ОБНОВЛЯЕМ элемент на индексе 3
                    System.out.println("Прогноз на Четверг обновлен.");
                    break;
                case 5: // Пятница (индекс 4)
                    System.out.print("Введите температуру на Пятницу: ");
                    int tempFri = scan.nextInt();
                    pogod.set(4, tempFri); // ОБНОВЛЯЕМ элемент на индексе 4
                    System.out.println("Прогноз на Пятницу обновлен.");
                    break;
                case 6: // Показать весь прогноз
                    System.out.println("\n--- Ваш Недельный Прогноз ---");
                    String[] daysOfWeek = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
                    for (int i = 0; i < pogod.size(); i++) {
                        // Выводим только те дни, для которых есть данные
                        if (pogod.get(i) != 0) { // Если температура не 0 (то есть мы её обновили)
                            System.out.println(daysOfWeek[i] + ": " + pogod.get(i) + "°C");
                        } else {
                            System.out.println(daysOfWeek[i] + ": Нет данных (0°C)");
                        }
                    }
                    break;
                case 7: // Выйти
                    System.out.println("Программа завершена. До свидания!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, введите число от 1 до 7.");
                    break;
            }
        }
        scan.close(); // Закрываем Scanner, когда он больше не нужен
    }
}