
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        System.out.println("Ударные дроны: \n1.Герань.\n2.Шахед.\n3.Ланцет");
        String choiceDrone = scan.nextLine();
        System.out.println("Вы выбрали: " + choiceDrone);
        switch (choiceDrone) {
            case "Герань":
                System.out.println("Выберите по каким пунктам врага будете бить: \n1.Логистика.\n2.Дислокации\n3.Склады БК");
                int choiceplace = scan.nextInt();
                System.out.println("Отлично! нажмите кнопку <пуск>");
                String start = scan.nextLine();
                start = scan.nextLine();
                if (start.equals("пуск")) {
                    System.out.println("До запуска: \n--3--\n--2--\n--1--\nЗапуск!!!");
                }
                break;
            case "Шахед":
                System.out.println("Выберите по каким пунктам врага будете бить: \n1.Порт.\n2.Суда.\n3.Танкер");
                int choiceplace2 = scan.nextInt();
                System.out.println("Отлично! нажмите кнопку <пуск>");
                String start2 = scan.nextLine();
                start2 = scan.nextLine();
                if (start2.equals("пуск")) {
                    System.out.println("До запуска: \n--3--\n--2--\n--1--\nЗапуск!!!");
                }
                break;
            case "Ланцет":
                System.out.println("Выберите по каким пунктам врага будете бить: \n1.Завод дронов.\n2.Нефти.\n3.Электростанциям");
                int choiceplace3 = scan.nextInt();
                System.out.println("Отлично! нажмите кнопку <пуск> ");
                String start3 = scan.nextLine();
                start3 = scan.nextLine();
                if (start3.equals("пуск")) {
                    System.out.println("До запуска: \n--3--\n--2--\n--1--\nЗапуск!!!");
                }
                break;
            default:
                System.out.println("Вы ввели что то не то!");
        }
    }
}





























