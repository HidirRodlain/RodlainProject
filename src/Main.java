
import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthPainter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = 200000;
//        Испния
        int tiketSpain = 35000;
        int houtelMurillo = 42322;
        int houtelIslas = 59928;
        int houtelAbalu = 84660;
//        Франция
        int tiketFrance = 30000;
        int houteAteiler = 38500;
        int houtelBelleve = 84700;
        int houteMarignan = 207000;
//       Турция
        int tiketTyrkey = 25000;
        int hotelBerce = 24993;
        int hotelDevice = 40000;
        int hotelMovenpic = 60000;


        System.out.println("Добро пожаловать в Аэропорт!\nВы хотите отдохнуть на неделю? - Let's go\nВыберите в какие места хотите полететь: \n1.Испания-Мадрид\n2.Франция-Париж\n3.Турция-Стамбул");
        String county = scan.nextLine();
        switch (county) {
            case "Испания":
                System.out.println("Билет: из Москвы в Стамбул прямой рейс — примерно 35 тысяч рублей в одну сторону.");
            {
                money = money - tiketSpain;
                System.out.println("Баланс на карте: " + money);
            }
            System.out.println("Мадрид популярные места: \nМузей Прадо\nКоролевский дворец\nМузей Тиссена-Борнемисы\nУлица Гран-Виа\nПарк Буэн-Ретиро.\n");
            System.out.println("Снять отель на неделю - выберите место где хотите снять отель на неделю!\n\n1.Bravo Murillo (2 звезды).\nЗа неделю: от 350 до 500 евро.\n--Есть парковка и кондиционер. Подойдёт для бюджетного размещения\n\n2.Islas Hotel (4 звезды).\nЗа неделю: от 600 до 800 евро.\n--Есть парковка, кондиционер, тренажёрный зал. Хороший баланс цены и удобств. ");
            System.out.println("\n\n3.Hotel Abalú Boutique Gran Vía (4 звезды).\nЗа неделю: от 800 до 1000 евро.).\nЕсть парковка, кондиционер, тренажёрный зал. Бутик-формат, ближе к центру и шопингу.\nВыберите: ");
            int choice = scan.nextInt();

            if (choice == 1) {
                if (money >= houtelMurillo) {
                    money = money - houtelMurillo;
                    System.out.println("Вы успешно арендовали отель Bravo Murillo на неделю!");
                    System.out.println("Баланс на карте: " + money);
                } else {
                    System.out.println("Недостаточно средств для отеля Bravo Murillo!");
                }
            } else if (choice == 2) {
                if (money >= houtelIslas) {
                    money = money - houtelIslas;
                    System.out.println("Вы успешно арендовали отель Islas Hotel на неделю!");
                    System.out.println("Баланс на карте: " + money);
                } else {
                    System.out.println("Недостаточно средств для отеля Islas Hotel!");
                }
            } else if (choice == 3) {
                if (money >= houtelAbalu) {
                    money = money - houtelAbalu;
                    System.out.println("Вы успешно арендовали отель Hotel Abalu на неделю!");
                    System.out.println("Баланс на карте: " + money);
                } else {
                    System.out.println("Недостаточно средств для отеля Hotel Abalu!");
                }
            }
            break;
            case "Франция":
                System.out.println("Билет: из Москвы в Париж прямой рейс в одну сторону начинается примерно от 25–30 тысяч рублей.");
            {
                money = money - tiketFrance;
                System.out.println("Баланс: " + money);
            }
            System.out.println("Париж популярные места: \nЭйфелева башня.\nЕлисейские поля\nТриумфальная арка.\nЛувр.\n");
            System.out.println("Снять отель на неделю - выберите место где хотите снять отель на неделю!\n\n1.Atelier Montparnasse (3 звезды)\nЗа неделю 440 до 450 евр\nЕсть парковка и кондиционер в номерах. Гости отмечают уютную атмосферу и удобное расположение для изучения района.\n\n2,Hotel Bellevue Paris Montmartre (4 звезды)\nЗа неделю: от 940 до 980 евро\nЗдесь тоже есть кондиционер, но акцент сделан на более внимательном обслуживании и уютной, «домашней» обстановке.");
            System.out.println("\n\n3.Hôtel Marignan Champs Elysées (5 звёзд)\nЗа неделю: 2059 до 2369 евро\nСама улица тихая, поэтому, несмотря на центральное расположение");
            int choice2 = scan.nextInt();

            if (choice2 == 1) {
                if (money >= houteAteiler) { // Не забываем проверку на баланс!
                    money = money - houteAteiler;
                    System.out.println("Вы успешно арендовали отель Atelier Montparnasse на неделю!");
                    System.out.println("Баланс на карте: " + money);
                } else {
                    System.out.println("Недостаточно средств для отеля Atelier Montparnasse!");
                }
            } else if (choice2 == 2) {
                if (money >= houtelBelleve) {
                    money = money - houtelBelleve;
                    System.out.println("Вы успешно арендовали отель Bellevue Paris Montmartre на неделю!");
                    System.out.println("Баланс на карте: " + money);
                } else {
                    System.out.println("Недостаточно средств для отеля Bellevue Paris Montmartre!");
                }
            } else if (choice2 == 3) {
                if (money >= houteMarignan) {
                    money = money - houtelAbalu;
                    System.out.println("Вы успешно арендовали отель Marignan Champs Elysées на неделю!");
                    System.out.println("Баланс на карте: " + money);
                } else {
                    System.out.println("Недостаточно средств для отеля Marignan Champs Elysées!");
                }
            }
            break;
            case "Турция":
                System.out.println("Билет: из Москвы в Стамбул рублей прямой рейс в одну сторону начинается примерно 20-25 тысяч рублей");
            {
                money = money - tiketTyrkey;
                System.out.println("Баланс: " + money);
            }
            System.out.println("Стамбул популярные места: \nДворец Топкапы\nЦистерна Базилика\nМечеть Сулеймание\n");
            System.out.println("Снять отель на неделю - выберите место хотите снять отель на неделю!\n\n1.Berce Hotel (3 звезд)\nЗа неделю: 21 000 – 28 000 рублей\n расположен в районе Фатих (Султанахмет), недалеко от главных достопримечательностей. Есть парковка и кондиционер.\n\n2.Divas Hotel (4 звезд) \n За неделю  35 000 – 45 000 рублей.\nудобно для шопинга — недалеко от Гранд-Базара. Есть бассейн, парковка, тренажёрный зал.\n");
            System.out.println("3.Mövenpick Hotel Istanbul Bosphorus\nЗа неделю: 50000–70000 рублей\nрайон Ортакёй. В отеле: крытый бассейн, спа с хаммамом, фитнес, несколько ресторанов, бизнес‑центр, парковка, Wi‑Fi. Из многих номеров — вид на Босфор.\n");
            int choice3 = scan.nextInt();

            if (choice3 == 1) {
                if (money >= hotelBerce) {
                    money = money - hotelBerce;
                    System.out.println("Вы успешно арендовали отель Berce на неделю!");
                    System.out.println("Баланс на карте: " + money);
                } else {
                    System.out.println("Недостаточна средств для отеля Berce!");
                }
                if (choice3 == 2) {
                    if (money >= hotelDevice) {
                        money = money - hotelDevice;
                        System.out.println("Вы успешно арендовали отель Device на неделю!");
                        System.out.println("Баланс на карте: " + money);
                    } else {
                        System.out.println("Недостаточно средств для отеля Device!");
                    }
                    if (choice3 == 3) {
                        if (money >= hotelMovenpic) {
                            money = money - hotelMovenpic;
                            System.out.println("Вы успешно арендовали отель Mövenpick на неделю!");
                            System.out.println("Баланс на карте: " + money);
                        } else {
                            System.out.println("Недостаточно средств для отеля Mövenpick");
                        }
                    }
                }
            }
        }
    }
}

















































