
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int money = 1200;
        int brontehnika = 0;
        int flot = 0;
        int army = 125000;
        System.out.println("Выберите что хотите изменить в армии: \n1.Увеличить количество регулярной армии!\n2.Увеличить количество бронетранспортеров БТР БМП ТАНК\n3.Увеличить флот пополнить боевые катера и корабли");
        System.out.println("Выберите: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Вы увеличили количество армии + 20.000 солдат!\nНа содеражании армии снимаеться -500");
                money = money - 500;
                army = army + 20000;
                System.out.println("Обшая численость воурженых сил: " + army);
                System.out.println("Состояния военного бюджета: " + money);
                break;
            case 2:
                System.out.println("ВПК перешло на производство бронетехники, ряды поплнены на 100 машин!\nНа производства -700");
                brontehnika = brontehnika + 100;
                money = money - 500;
                System.out.println("Количество бронетехники: " + brontehnika);
                System.out.println("Состояние военного бюджета: " + money);
                break;
            case 3:
                System.out.println("Вы увеличи воено морской флот, количество кораблей поплнены на 50 штук!\nНа производство -900");
                flot = flot + 50;
                System.out.println("Количество военных кораблей: " + flot);
                money = money - 900;
                System.out.println("Состояние военного бюджета: " + money);
        }
        if (money >= 1500) {
            System.out.println("Экономика отчина! ");
        } else {
            if (money >= 700) {
                System.out.println("Экономика стабильна");
            } else {
                System.out.println("Экономика в кризисе! ");
            }


        }
    }
}































































