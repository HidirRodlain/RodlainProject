import java.util.ArrayList;
import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        ArrayList<String> touristname = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("\t\t\tHotel Hundra\nУ нас дешевые номера\nХорший вид с окна\nПарковка и многое другое!\n");
        boolean isworkhoutel = true;
        while (true) {
            System.out.println("1.Заселить гостей");
            System.out.println("2.Список гостей");
            System.out.println("3.Выселить гостя");
            System.out.println("4.Выйти с системы\n");
            System.out.print("Выберите: ");
            int hotelsistem = scan.nextInt();
            switch (hotelsistem) {
                case 1:
                    scan.nextLine();
                    System.out.println("Сотрудник: Здрасвуйте добро пожаловать в наш отель!");
                    System.out.println("Сотрудник: Введите ваше имя и фамилия\n");
                    System.out.print("Имя: ");
                    String name = scan.nextLine();
                    System.out.print("Фамилия: ");
                    String surname = scan.nextLine();
                    touristname.add(name + " " + surname);
                    System.out.println("Поздровляем уважаемый " + name + " " + surname + " Вы успешно заселены!\n");
                    break;
                case 2:
                    System.out.println("Менеджер: Покажите мне список гостей! \nСотрудник: Вот список на сегодняшний день");
                    System.out.println("\t\tСписко жильцов отеля: \n" + touristname + "\n");
                    break;
                case 3:
                    System.out.println("Гость: Спасибо за отличый отдых!\nСотрудник: Всегда пожалуйста! рады вас видеть снова\n");
                    if (scan.hasNextLine()) {
                        System.out.println("Введите имя и фамилию: ");
                        String remnamesern = scan.nextLine();
                        remnamesern = scan.nextLine();
                        boolean removed = touristname.remove(remnamesern);
                        if (removed) {
                            System.out.println("Система: Гость " + remnamesern + " успешно выселен!");
                        } else {
                            System.out.println("Не удалось найти " + remnamesern);
                        }
                    }
                case 4:
                    System.out.println("Вы вышли с системы!");
                    isworkhoutel = false;
            }
        }
    }
}
