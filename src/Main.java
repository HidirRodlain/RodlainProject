import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> squad = new LinkedList<>();
        System.out.println("Командир: Отряд в строй!");
        squad.add("Альфа");
        squad.add("Браво");
        squad.add("Чарли");
        System.out.println(squad);
        System.out.println("Командир: Боец дельта!\nВстань меду Альфой и Браво");
        squad.add(1,"Дельта");
        System.out.println(squad);
        System.out.println("Командир: Боец Браво вышел из строя!");
        squad.remove("Браво");
        System.out.println("Командир: Строй становиись!!");
        System.out.println(squad);
//        Часть 2
        System.out.println("Командир: У нас поплнение в отряде!\nК нам присойденились\nДозорный, и Снайпер");
        System.out.println("Командир: Дозорный в самый перед строя а снайпер в конец\nСтановись!");
        squad.addFirst("Дозорный");
        squad.addLast("Снайпер");
        System.out.println(squad);
        squad.remove("Альфа");
        squad.remove("Дельта");
        squad.remove("Чарли");
        System.out.println("Командир: Наша задача на сегодня тренировка в лесу!\nМы будем тренироваться и становиться на позиции!\nКомандир: отряд основных сил: Альфа,Чарли,Дельта ваша задача занять боевые позиции по всем флангам\nЛевый фланг Альфа, Центральный Дельта, Правый Чарли!\n");
//        Растояние примерно между отрядами
        squad.add(1,"Альфа");
        squad.add(2,"Растояние");
        squad.add(3,"Дельта");
        squad.add(4,"Растояние");
        squad.add(5,"Чарли");
        squad.add(6,"Растояние");
        System.out.println(squad);
        System.out.println("Командир: Дозорный твоя задача уйти в глуб и доложить информацию о противнике!\nА снайпер забраться на вверх и сидеть там");
        squad.remove("Дозорный");





    }
}












































































