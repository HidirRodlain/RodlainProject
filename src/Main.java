import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int lokomotive = 1500;
        int speed = 100;
        int speedprice = 300;
        int strength = 250;
        int strengtprice = 250;
//        Улучшение
        int improvedspeed = 20;
        int improvedstrength = 30;

        int vagon = 500;

        String reb = "Устонвлен РЭБ";
        int rebprice = 300;

        int protection = 50;
        int protectionprice = 150;
        int improvedprotection = 20;

        int capacity = 70;
        int capacityprice = 100;
        int improvedcapacity = 14;

        int deleate = 200;

        LinkedList<String> train = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("\t\t\tМини игра про поезд\nВаша задача: \n\t\tСоберите поезд по частям, выберите на ваше усмотроение что купить но у вас огрониченное количество денег ваш баланс 5000\n\t\tПосле того как вы закончили собирать поезд нажмите кнопку - [Закончить]; затем нажмите [Отправить]");
        int money = 6000;
        boolean WorkinTrain = true;
            while (WorkinTrain) {
                System.out.println("1.Добавить локомотив - 1500");
                System.out.println("2.Добавить вагон - 500");
                System.out.println("3.Удалить вагон - 200");
                System.out.println("4.Добавить улучшения");
                System.out.println("5.Выйти с игры");
                System.out.print("\n\t\tВыберите действие: ");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Вы добавили локомотив в начало поезда: ");
                        train.addFirst("Локомотив");
                        System.out.println("Скорость: " + speed + " k/m" + "\nПрочность: " + strength + " k/m");
                        money = money - lokomotive;
                        System.out.println(train);
                        System.out.println("Баланс: " + money + "\n");
                        break;
                    case 2:
                        System.out.println("Вы добавили вагон в ряд поезда: ");
                        train.add("Вагон");
                        money = money - vagon;
                        System.out.println(train);
                        System.out.println("Баланс: " + money + "\n");
                        break;
                    case 3:
                        System.out.println("Введите какой вагон хотите удалить (номер по счету, не считаю локомотив, введите номер): ");
                        int numvagon = scan.nextInt();
                        money = money - deleate;
                        train.remove(numvagon);
                        System.out.println(train);
                        System.out.println("Вы успешно удалили вагон номер: " + numvagon + "\nБаланс: " + money + "\n");
                        break;

                    case 4:
                        boolean inupgrage = true;
                            System.out.println("Выберите какое улучшение хотите купить: \n");
                            while (inupgrage) {
                            System.out.println("1.Улучшение для Локомотива\n2.Улучшение для вагонов\n3.Выйти с улучшения\n");
                            int improved = scan.nextInt();
                            switch (improved) {
                                case 1:
                                    System.out.println("1.Скорость +15%\n" + "2.Прочность +20%\n");
                                    System.out.print("Выберите какое улучшение: ");
                                    int lokimotiveimproved = scan.nextInt();
                                    if (lokimotiveimproved == 1) {
                                        money = money - speedprice;
                                        if (speedprice >= money) {
                                            System.out.println("Недостаточно денег!\nБаланс: " + money);
                                        } else {
                                            System.out.println("Вы выбрали улучшение <Скорость>\nСкорость увеличено на 15%");
                                            speed = speed + improvedspeed;
                                            System.out.println("Скорость: " + speed);
                                            System.out.println("Баланс: " + money + "\n");
                                            break;
                                        }
                                    }
                                        if (lokimotiveimproved == 2) {
                                            money = money - strengtprice;
                                            if (strengtprice >= money) {
                                                System.out.println("Недостаточно денег!\nБаланс: " + money);
                                            } else {
                                                strength = strength + improvedstrength;
                                                System.out.println("Вы выбрали улучшение <Прочность>\nПрочность улучшено на 20%");
                                                System.out.println("Прочность: " + strength);
                                                System.out.println("Баланс: " + money + "\n");
                                                break;
                                            }
                                        }
                                    break;
                                case 2:
                                    System.out.println("1.Поставить зашиту +20%\n" + "2.Устоновить РЭБ\n" + "3.Увеличить вместимоть вагонов +20%\n");
                                    System.out.print("Выберите какое улучшение: ");
                                    int vagonimproved = scan.nextInt();
                                    if (vagonimproved == 1) {
                                        money = money - protectionprice;
                                        if (protectionprice >= money) {
                                            System.out.println("Недостаточно денег!\nБаланс: " + money);
                                        } else {
                                            protection = protection + improvedprotection;
                                            System.out.println("Вы выбрали улучшение <защита>\nЗашита улучшено на +20%");
                                            System.out.println("Защита: " + protection);
                                            System.out.println("Баланс: " + money + "\n");
                                            break;
                                        }
                                    }
                                    if (vagonimproved == 2) {
                                        money = money - rebprice;
                                        if (rebprice >= money) {
                                            System.out.println("Недостаточно денег\nБаланс: " + money);
                                        }else {
                                            System.out.println("Вы выбрали улучшение <РЭБ>");
                                            System.out.println("Состояние: " + reb);
                                            System.out.println("Баланс: " + money + "\n");
                                            break;
                                        }
                                    }
                                    if (vagonimproved == 3) {
                                        money = money - capacityprice;
                                        if (capacityprice >= money) {
                                            System.out.println("Недостаточно денег\nБаланс: " + money);
                                        }else  {
                                           capacity = capacity + improvedcapacity;
                                            System.out.println("Вы выбрали улучшение <Вместимости>\nВместимость улучшено на 20%");
                                            System.out.println("Вместимость: " + capacity);
                                            System.out.println("Баланс: " + money + "\n");
                                            break;
                                        }
                                    }
                                case 3:
                                    System.out.println("Вы вышли с улучшения!");
                                    inupgrage = false;
                                    break;
                            }
                            }
                            break;
                    case 5:
                        System.out.println("Вы вышли с игры!\n--Ожидание выхода--\n- - - \n- - -\n*выход*\n");
                        WorkinTrain = false;

                }
            }
        }
    }








































































































