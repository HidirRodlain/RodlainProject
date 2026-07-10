
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tourist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы директор реалтор отеля\nВаша задача заселить гостей!");
        boolean isHoutel = true;
        while (true) {
            System.out.println("1.Заселить гостя");
            System.out.println("2.Показать список жильцов");
            System.out.println("3.Выселить гостя по имени");
            System.out.println("Выйти из системы\n");
            System.out.print("Выбериет: \n");
            int choicedo = scan.nextInt();

            switch (choicedo) {
                case 1:
                        System.out.print("Введите имя туриста: ");
                        String turist = scan.nextLine();
                        turist = scan.nextLine();
                        tourist.add(turist);
                        System.out.println("Вы успешно заселили туриста " + turist  + "\n");
                        break;

                case 2:
                    System.out.println("\nСписок всех жильцов отеля\n\t\tСписок: \n" + tourist);
                    break;

                case 3:
                    System.out.println("Напишите имя человека которого хотите выселить");
                    if (scan.hasNextLine()) {
                    System.out.print("Введите имя: ");
                    String turistout = scan.nextLine();
                    turistout = scan.nextLine();
                        boolean removed = tourist.remove(turistout);
                        if (removed) {
                            System.out.println("Вы выселили туриста: \"" + turistout + "\"");
                        } else {
                            System.out.println("Туриста с именем \"" + turistout + "\" не найдено");
                        }
                        break;
                    }





                    }



                    }


            }


        }






//• 1. Заселить гостя (add)
//
//• 2. Показать список жильцов
//
//• 3. Выселить гостя по имени (remove)
//
//• 4. Выйти из системы управления


































