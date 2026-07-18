import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.Scanner;

public class Houtel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> queue = new LinkedList<>();

        String tikett = "Вы взяли билет";
        String vipTiket = "Вы взяли вип билет";
        boolean Work = true;
        System.out.println("\t\t--Кинотеатр--");
        while (Work) {
            System.out.println("1.Введите имя - Взять билет");
            System.out.println("2.Весь очередь");
            System.out.println("3.Кто заходит слудуюший");
            System.out.println("4.Купить вип билет");
            System.out.print("Выберите: ");
            int choice = scan.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Введите ваше имя и возьмите билет (взять) \n");
                    System.out.print("\nВведите имя: ");
                    String name = scan.nextLine();
                    name = scan.nextLine();
                    queue.add(name);
                    System.out.print("Взять билет: ");
                    String tiket = scan.nextLine();
                    System.out.println(tikett + "\n");
                    break;

                case 2:
                    System.out.println("Вся очердеь в кинотеатр (слева на право) \n");
                    for (int i = 0; i < queue.size(); i++) {
                        System.out.println("Очередь " + (i+1) + ": " + queue.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Следуюший человек в очердеи \n");
                    System.out.println("Человек: ");
                    String next = queue.peekFirst();
                    System.out.println("Следующий: " + next);
                    break;

                case 4:
                    System.out.println("Купить вип билет (вы сразу становитесь один из первых в очердь) \n");
                    System.out.print("Введите vip имя: ");
                    String namevip = scan.nextLine();
                    namevip = scan.nextLine();
                    System.out.print("Взять вип: ");
                    String vip = scan.nextLine();
                    System.out.println(vipTiket);
                    queue.addFirst(namevip);
                    break;

                case 5:
                    System.out.println("Время сеанса началась");
                    if (queue.isEmpty()) {
                        System.out.println("В очердеи никого нет");
                    }else {
                        System.out.println("Первый в очереди " + queue.pollFirst() + " зашел в кинотеатр \n");
                        break;
                    }





            }

            }












    }
}
