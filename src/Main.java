public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Наш ангар с грузами
    LinkedList<String> spaceship = new LinkedList<>();
    LinkedList<Integer> starres = new LinkedList<>();
    System.out.println("\n\t\t\t\tДобро пожаловать на нашу игру!\n\tЗадача в игре, ваша задача создать корабль и добарться до марса\n\tНо на пути на вас будут нападать пришельцы и уничтожать корабль\n\tВ космосе вы будете собирать звезды - и с этих звезд будут выпадать деньги\n\tВы можете покупать в магазине разные модификации для вашего корабля\n");
    System.out.println("\t\t\tМагазин характеристики: \n\t1.Щит - у него есть 200 шкал здоровья тем самым повляеться шансы отбиться от пришельев - но шит не бесконечный\n\t2.Скорость - Повышаеться скорость корабли и появляться много шансов находить звезды из за скорости, так же есть шанс убежать но маленький\n\t3.Пушки - дают возможность уничтожать пришельцев тем самым уменьшив шансы их появления - но пушки дорогие если погибнете они проподают как и все модификации\n");
    System.out.println("Сборка космического корабля: ");
    float money = 600;
    int endurance = 200;
    int speed = 150;
    float moneygame = 0;


    boolean Workspaceshop = true;
    while (true) {
        System.out.println("1.Создать космический корабль");
        System.out.println("2.️🛡Устоновить защиту - 200$");
        System.out.println("3.🚀️Увеличить скорость - 300$");
        System.out.println("4.🏹Устоновить пушки - 400$");
        System.out.println("5. Покозать Балнс💲");
        System.out.print("Выберите: ");
        int choice = scan.nextInt();
        switch (choice) {


            case 1:
                System.out.println("Вы выбрали раздел создание космического корабля!");
                System.out.print("Создать: ");
                String spaceX = scan.nextLine();
                spaceX = scan.nextLine();
                spaceship.add(spaceX);
                System.out.println("Вы успешно создали корабль 🛸" + spaceX + " ваш корабль готов\n");
                System.out.println("Нажмите [play] если хотите отправить в полет || если нет - то [exit]");
                String game1 = scan.nextLine();
                if (game1.equals("play")) {
                    System.out.println("Вы запустили игру!");
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    double star = Math.random();
                    if (star < 0.99) {
                        System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                        System.out.println(" +43💲");
                        moneygame = moneygame + 43;
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    double aliens = Math.random();
                    if (aliens < 0.99) {
                        System.out.println("👽🚨ОПАСНОСТЬ на корабль было совершено нападение\nВаш корабль 🛸" + spaceX + " Был уничтожен\n\t\t\tWASTED");
                        spaceship.clear();
                        System.out.println("Ваши выгрыши за матч: " + moneygame);
                        money = moneygame + money;
                        System.out.println("Баланс: " + money);
                        break;
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    double stars2 = Math.random();
                    if (stars2 < 0.30) {
                        System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                        System.out.println(" +21💲");
                        moneygame = moneygame + 21;
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    System.out.println("--🌌Корабль рзавернулся");
                    double alienss1 = Math.random();
                    if (alienss1 < 0.40) {
                        System.out.println("👽🚨ОПАСНОСТЬ на корабль было совершено нападение\nВаш корабль 🛸" + spaceX + " Был уничтожен\n\t\t\tWASTED");
                        spaceship.clear();
                        System.out.println("Ваши выгрыши за матч: " + moneygame);
                        money = moneygame + money;
                        System.out.println("Баланс: " + money);
                        break;
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    double stars3 = Math.random();
                    if (stars3 < 0.60) {
                        System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                        System.out.println(" +9💲");
                        moneygame = moneygame + 9;
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    double alienss2 = Math.random();
                    if (alienss2 < 0.30) {
                        System.out.println("👽🚨ОПАСНОСТЬ на корабль было совершено нападение\nВаш корабль 🛸" + spaceX + " Был уничтожен\n\t\t\tWASTED");
                        spaceship.clear();
                        System.out.println("Ваши выгрыши за матч: " + moneygame);
                        money = moneygame + money;
                        System.out.println("Баланс: " + money);
                        break;
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    double stars4 = Math.random();
                    if (stars4 < 0.10) {
                        System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                        System.out.println(" +80💲");
                        moneygame = moneygame + 80;
                    }
                    double alienss3 = Math.random();
                    if (alienss3 < 0.65) {
                        System.out.println("👽🚨ОПАСНОСТЬ на корабль было совершено нападение\nВаш корабль 🛸" + spaceX + " Был уничтожен\n\t\t\tWASTED");
                        spaceship.clear();
                        System.out.println("Ваши выгрыши за матч: " + moneygame);
                        money = moneygame + money;
                        System.out.println("Баланс: " + money);
                        break;
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    System.out.println("--🌌Корабль рзавернулся");
                    double alienss4 = Math.random();
                    if (alienss4 < 0.45) {
                        System.out.println("👽🚨ОПАСНОСТЬ на корабль было совершено нападение\nВаш корабль 🛸" + spaceX + " Был уничтожен!\n\t\t\tWASTED");
                        spaceship.clear();
                        System.out.println("Ваши выгрыши за матч: " + moneygame);
                        money = moneygame + money;
                        System.out.println("Баланс: " + money);
                        break;

                    } else {
                        System.out.println("\n\t\t\tПОБЕДА🏆\n\tВы смогли добраться до марса!\nВаша награда +200💲");
                        money = money + 200;
                        money = moneygame + money;
                        System.out.println("Все ваши выграши за матч: " + moneygame);
                        System.out.println("Общий баланс: " + money);
                    }
                }
                break;

            case 2:
                System.out.println("Вы выбрали раздел устоновление зашиты🛡️");
                if (money < 200) {
                    System.out.println("\n\t\t\t📢ВНИМАНИЕ\n\t\tВаш баланс ниже 200💲\n\tСоветую поиграть в режим без снарежения и заработать там деньги!\n");
                } else {
                    money = money - 200;
                    System.out.println("Выберите <Щит> -- 200💲");
                    String spaceShield = scan.nextLine();
                    spaceShield = scan.nextLine();
                    spaceship.add(spaceShield);
                    System.out.println("Вы успешно устоновили Щит на корабль 🛸" + spaceship + " ваш корабль готов\nВаш баланс: " + money);
                    System.out.println("Нажмите [play] если хотите отправить в полет || если нет - то [exit]");
                    String game2 = scan.nextLine();
                    if (game2.equals("play")) {
                        System.out.println("Вы запустили игру!");
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        double star = Math.random();
                        if (star < 0.80) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println(" +35💲");
                            moneygame = moneygame + 35;
                        }
                        System.out.println("--🌌Корабль рзавернулся");
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                    }
                    double aliens1 = Math.random();
                    if (aliens1 < 0.80) {
                        System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                        double Fightback = Math.random();
                        if (Fightback < 0.90) {
                            System.out.println("ВАШ КОРАБЛЬ СМОГ ЗАШИТИТЬСЯ");
                            endurance = endurance - 35;
                            System.out.println("Состояние брони🛡️: " + endurance);
                        } else {
                            System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                            spaceship.clear();
                            System.out.println("Ваши выгрыши за матч: " + moneygame);
                            money = moneygame + money;
                            System.out.println("Баланс: " + money);
                            break;
                        }
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    System.out.println("--🌌Корабль рзавернулся");
                    double star = Math.random();
                    if (star < 0.15) {
                        System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                        System.out.println(" +54💲");
                        moneygame = moneygame + 54;
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    double aliens3 = Math.random();
                    if (aliens3 < 0.35) {
                        System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль 🛸" + spaceship + "было совершено нападение");
                        double Fightback = Math.random();
                        if (Fightback < 0.75) {
                            System.out.println("ВАШ КОРАБЛЬ СМОГ ЗАШИТИТЬСЯ");
                            endurance = endurance - 45;
                            System.out.println("Состояние брони🛡️: " + endurance);
                        } else {
                            System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                            spaceship.clear();
                            System.out.println("Ваши выгрыши за матч: " + moneygame);
                            money = moneygame + money;
                            System.out.println("Баланс: " + money);
                            break;
                        }
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    System.out.println("--🌌Корабль рзавернулся");

                    double star5 = Math.random();
                    if (star5 < 0.40) {
                        System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                        System.out.println(" +68💲");
                        moneygame = moneygame + 68;
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    double aliens4 = Math.random();
                    if (aliens4 < 0.30) {
                        System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                        double Fightback = Math.random();
                        if (Fightback < 0.55) {
                            System.out.println("ВАШ КОРАБЛЬ СМОГ ЗАШИТИТЬСЯ");
                            endurance = endurance - 50;
                            System.out.println("Состояние брони🛡️: " + endurance);
                        } else {
                            System.out.println("Ваш корабль  🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                            spaceship.clear();
                            System.out.println("Ваши выгрыши за матч: " + moneygame);
                            money = moneygame + money;
                            System.out.println("Баланс: " + money);
                            break;
                        }
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    System.out.println("--🌌Корабль рзавернулся");
                    double star4 = Math.random();
                    if (star4 < 0.05) {
                        System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                        System.out.println(" +300$");
                        moneygame = moneygame + 300;
                    }
                    double aliens5 = Math.random();
                    if (aliens5 < 0.55) {
                        System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                        double Fightback2 = Math.random();
                        if (Fightback2 < 0.45) {
                            System.out.println("ВАШ КОРАБЛЬ СМОГ ЗАШИТИТЬСЯ");
                            endurance = endurance - 46;
                            System.out.println("Состояние брони🛡️: " + endurance);
                        } else {
                            System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                            spaceship.clear();
                            System.out.println("Ваши выгрыши за матч: " + moneygame);
                            money = moneygame + money;
                            System.out.println("Баланс: " + money);
                            break;
                        }
                        double star2 = Math.random();
                        if (star2 < 0.85) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+34💲");
                            moneygame = moneygame + 34;
                            break;
                        }
                    }
                    System.out.println("--🌌Ваш корабль летит по космосу--");
                    double aliens6 = Math.random();
                    if (aliens6 < 0.45) {
                        System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                        double Fightback1 = Math.random();
                        if (Fightback1 < 0.45) {
                            System.out.println("ВАШ КОРАБЛЬ СМОГ ЗАШИТИТЬСЯ");
                            endurance = endurance - 82;
                            System.out.println("Состояние брони🛡️: " + endurance);
                        } else {
                            System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                            spaceship.clear();
                            System.out.println("Ваши выгрыши за матч: " + moneygame);
                            money = moneygame + money;
                            System.out.println("Баланс: " + money);
                            break;
                        }
                    } else {
                        System.out.println("\n\t\t\tПОБЕДА🏆\n\tВы смогли добраться до марса!\nВаша награда +200💲");
                        money = money + 200;
                        money = moneygame + money;
                        System.out.println("Все ваши выграши за матч: " + moneygame);
                        System.out.println("Общий баланс: " + money);
                    }
                    break;
                }

            case 3:
                System.out.println("Вы выбрали раздел устоновление скорости🚀️");
                if (money < 300) {
                    System.out.println("\n\t\t\t📢ВНИМАНИЕ\n\t\tВаш баланс ниже 300💲\n\tСоветую поиграть в режим без снарежения и заработать там деньги!\n");
                } else {
                    money = money - 300;
                    System.out.println("Выберите <Скорость🚀> -- 350💲");
                    String spaceSpeed = scan.nextLine();
                    spaceSpeed = scan.nextLine();
                    spaceship.add(spaceSpeed);
                    System.out.println("Вы успешно устоновили Скорость на корабль 🛸" + spaceship + " ваш корабль готов\nВаш баланс: " + money);
                    System.out.println("Нажмите [play] если хотите отправить в полет || если нет - то [exit]");

                    String game3 = scan.nextLine();
                    if (game3.equals("play")) {
                        System.out.println("Вы запустили игру!");
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        System.out.println("--🌌Корабль рзавернулся");
                        double star1 = Math.random();
                        if (star1 < 0.75) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+55💲");
                            moneygame = moneygame + 55;
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        double star2 = Math.random();
                        if (star2 < 0.80) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+37💲");
                            moneygame = moneygame + 37;
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        double aliens = Math.random();
                        if (aliens < 0.60) {
                            System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                            double Fightback1 = Math.random();
                            if (Fightback1 < 0.70) {
                                System.out.println("🚀ВАШ КОРАБЛЬ СМОГ УЛЕТЕТЬ");
                            } else {
                                System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                                spaceship.clear();
                                System.out.println("Ваши выгрыши за матч: " + moneygame);
                                money = moneygame + money;
                                System.out.println("Баланс: " + money);
                                break;
                            }
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        if (star1 < 0.05) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+250💲");
                            moneygame = moneygame + 250;
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        if (star1 < 0.34) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+120💲");
                            moneygame = moneygame + 120;
                        }
                        double aliens22 = Math.random();
                        if (aliens22 < 0.50) {
                            System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                            double Fightback1 = Math.random();
                            if (Fightback1 < 0.30) {
                                System.out.println("🚀ВАШ КОРАБЛЬ СМОГ УЛЕТЕТЬ");
                            } else {
                                System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                                spaceship.clear();
                                System.out.println("Ваши выгрыши за матч: " + moneygame);
                                money = moneygame + money;
                                System.out.println("Баланс: " + money);
                                break;
                            }
                        }
                        double aliens2 = Math.random();
                        if (aliens2 < 0.50) {
                            System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                            double Fightback1 = Math.random();
                            if (Fightback1 < 0.45) {
                                System.out.println("🚀ВАШ КОРАБЛЬ СМОГ УЛЕТЕТЬ");
                            } else {
                                System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                                spaceship.clear();
                                System.out.println("Ваши выгрыши за матч: " + moneygame);
                                money = moneygame + money;
                                System.out.println("Баланс: " + money);
                                break;
                            }
                        }
                        if (star1 < 0.65) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+80💲");
                            moneygame = moneygame + 80;
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        if (star1 < 0.50) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+45💲");
                            moneygame = moneygame + 45;
                        }
                        double aliens23 = Math.random();
                        if (aliens23 < 0.30) {
                            System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                            double Fightback1 = Math.random();
                            if (Fightback1 < 0.30) {
                                System.out.println("🚀ВАШ КОРАБЛЬ СМОГ УЛЕТЕТЬ");
                            } else {
                                System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                                spaceship.clear();
                                System.out.println("Ваши выгрыши за матч: " + moneygame);
                                money = moneygame + money;
                                System.out.println("Баланс: " + money);
                                break;
                            }
                        }
                        System.out.println("--🌌Корабль рзавернулся");
                        if (aliens22 < 0.45) {
                            System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                            double Fightback1 = Math.random();
                            if (Fightback1 < 0.30) {
                                System.out.println("🚀ВАШ КОРАБЛЬ СМОГ УЛЕТЕТЬ");
                            } else {
                                System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                                spaceship.clear();
                                System.out.println("Ваши выгрыши за матч: " + moneygame);
                                money = moneygame + money;
                                System.out.println("Баланс: " + money);
                                break;
                            }
                        } else {
                            System.out.println("\n\t\t\tПОБЕДА🏆\n\tВы смогли добраться до марса!\nВаша награда +200💲");
                            money = money + 200;
                            money = moneygame + money;
                            System.out.println("Все ваши выграши за матч: " + moneygame);
                            System.out.println("Общий баланс: " + money);
                        }
                        break;
                    }
                }
            case 4:
                System.out.println("Вы выбрали раздел устоновление пушек🏹");
                if (money < 300) {
                    System.out.println("\n\t\t\t📢ВНИМАНИЕ\n\t\tВаш баланс ниже 400💲\n\tСоветую поиграть в режим без снарежения и заработать там деньги!\n");
                } else {
                    money = money - 400;
                    System.out.println("Выберите < Пушка🏹> -- 350💲");
                    String spaceSpeed = scan.nextLine();
                    spaceSpeed = scan.nextLine();
                    spaceship.add(spaceSpeed);
                    System.out.println("Вы успешно устоновили Скорость на корабль 🛸" + spaceship + " ваш корабль готов\nВаш баланс: " + money);
                    System.out.println("Нажмите [play] если хотите отправить в полет || если нет - то [exit]");
                    String game4 = scan.nextLine();
                    if (game4.equals("play")) {
                        System.out.println("Вы запустили игру!");
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        double star1 = Math.random();
                        if (star1 < 0.88) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+55💲");
                            moneygame = moneygame + 55;
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        if (star1 < 0.70) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+85💲");
                            moneygame = moneygame + 55;
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        System.out.println("--🌌Корабль рзавернулся");
                        double aliens22 = Math.random();
                        if (aliens22 < 0.70) {
                            System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                            double Fightback1 = Math.random();
                            if (Fightback1 < 0.85) {
                                System.out.println("💥КОРАБОЛЬ СМОГ УНИЧТОЖИТЬ ПРИШЕЛЬЦЕВ");
                                System.out.println("В КОРАБЛЕ ПРИШЕЛЬЦЕВ БЫЛО +80💲");
                                moneygame = moneygame + 80;
                            } else {
                                System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                                spaceship.clear();
                                System.out.println("Ваши выгрыши за матч: " + moneygame);
                                money = moneygame + money;
                                System.out.println("Баланс: " + money);
                                break;
                            }
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        if (star1 < 0.49) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+35💲");
                            moneygame = moneygame + 55;
                            System.out.println("--🌌Корабль рзавернулся");
                        }
                        double aliens25 = Math.random();
                        if (aliens25 < 0.57) {
                            System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                            double Fightback1 = Math.random();
                            if (Fightback1 < 0.90) {
                                System.out.println("💥КОРАБОЛЬ СМОГ УНИЧТОЖИТЬ ПРИШЕЛЬЦЕВ");
                                System.out.println("В КОРАБЛЕ ПРИШЕЛЬЦЕВ БЫЛО +100💲");
                                moneygame = moneygame + 100;
                            } else {
                                System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                                spaceship.clear();
                                System.out.println("Ваши выгрыши за матч: " + moneygame);
                                money = moneygame + money;
                                System.out.println("Баланс: " + money);
                                break;
                            }
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        if (star1 < 0.80) {
                            System.out.println("⭐ВЫ НАШЛИ ЗВЕЗДУ");
                            System.out.println("+35💲");
                            moneygame = moneygame + 55;
                            System.out.println("--🌌Корабль рзавернулся");
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        double aliens35 = Math.random();
                        if (aliens35 < 0.45) {
                            System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                            double Fightback1 = Math.random();
                            if (Fightback1 < 0.70) {
                                System.out.println("💥КОРАБОЛЬ СМОГ УНИЧТОЖИТЬ ПРИШЕЛЬЦЕВ");
                                System.out.println("В КОРАБЛЕ ПРИШЕЛЬЦЕВ БЫЛО +200💲");
                                moneygame = moneygame + 200;
                            } else {
                                System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                                spaceship.clear();
                                System.out.println("Ваши выгрыши за матч: " + moneygame);
                                money = moneygame + money;
                                System.out.println("Баланс: " + money);
                                break;
                            }
                        }
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        System.out.println("--🌌Ваш корабль летит по космосу--");
                        double aliens54 = Math.random();
                        if (aliens54 < 0.15) {
                            System.out.println("👽🚨ОПАСНОСТЬ на ваш корабль" + spaceship + "было совершено нападение");
                            double Fightback1 = Math.random();
                            if (Fightback1 < 0.30) {
                                System.out.println("💥КОРАБОЛЬ СМОГ УНИЧТОЖИТЬ ПРИШЕЛЬЦЕВ");
                                System.out.println("В КОРАБЛЕ ПРИШЕЛЬЦЕВ БЫЛО +300💲");
                                moneygame = moneygame + 300;
                            } else {
                                System.out.println("Ваш корабль 🛸" + spaceship + " \nБыл уничтожен\n\t\t\tWASTED");
                                spaceship.clear();
                                System.out.println("Ваши выгрыши за матч: " + moneygame);
                                money = moneygame + money;
                                System.out.println("Баланс: " + money);
                                break;
                            }
                        } else {
                            System.out.println("\n\t\t\tПОБЕДА🏆\n\tВы смогли добраться до марса!\nВаша награда +200💲");
                            money = money + 200;
                            money = moneygame + money;
                            System.out.println("Все ваши выграши за матч: " + moneygame);
                            System.out.println("Общий баланс: " + money);
                        }
                        break;
                    }
                }
        }
        }
    }
