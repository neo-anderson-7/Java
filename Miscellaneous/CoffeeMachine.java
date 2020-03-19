import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int dcups = 9;
        int money = 550;

        do {
            System.out.println("");
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String act = scan.nextLine();

            if (act.equals("exit")) {
                break;
            }

            System.out.println("");

            if (act.equals("buy")) {
                int caffe = 0;
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String input = scan.nextLine();
                if (input.equals("back")) {
                    continue;
                } else {
                    caffe = Integer.parseInt(input);
                }
    
                switch (caffe) {
                    case 1: 
                        if (water - 250 >= 0 && coffee - 16 >= 0 && milk >= 0 && dcups - 1 >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            coffee -= 16;
                            dcups--;
                            money += 4;
                        } else {
                            String deficiency = "";
                            if (water - 250 < 0) {
                                deficiency = "water";
                            } else if (coffee - 16 < 0) {
                                deficiency = "coffee beans";
                            } else if (milk < 0) {
                                deficiency = "milk";
                            } else {
                                deficiency = "disposable cups";
                            }

                            System.out.println("Sorry, not enough " + deficiency + "!");
                        }
                        break;
                    
                    case 2:
                        if (water - 350 >= 0 && coffee - 20 >= 0 && milk - 75 >= 0 && dcups - 1 >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            dcups--;
                            water -= 350;
                            milk -= 75;
                            coffee -= 20;
                            money += 7;
                        } else {
                            String deficiency = "";
                            if (water - 350 < 0) {
                                deficiency = "water";
                            } else if (coffee - 20 < 0) {
                                deficiency = "coffee beans";
                            } else if (milk - 75 < 0) {
                                deficiency = "milk";
                            } else {
                                deficiency = "disposable cups";
                            }

                            System.out.println("Sorry, not enough " + deficiency + "!");
                        }
                        break;
                                            
                    case 3:
                        if (water - 200 >= 0 && coffee - 12 >= 0 && milk - 100 >= 0 && dcups - 1 >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            dcups--;
                            water -= 200;
                            milk -= 100;
                            coffee -= 12;
                            money += 6;
                        } else {
                            String deficiency = "";
                            if (water - 350 < 0) {
                                deficiency = "water";
                            } else if (coffee - 20 < 0) {
                                deficiency = "coffee beans";
                            } else if (milk - 100 < 0) {
                                deficiency = "milk";
                            } else {
                                deficiency = "disposable cups";
                            }

                            System.out.println("Sorry, not enough " + deficiency + "!");
                        }
                        break;
                                     
                    default:
                        System.out.print("Error!");
                }
            }

            if (act.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add: ");
                int fillWater = scan.nextInt();
                water += fillWater;
    
                System.out.println("Write how many ml of milk do you want to add: ");
                int fillMilk = scan.nextInt();
                milk += fillMilk;
    
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int fillCoffee = scan.nextInt();
                coffee += fillCoffee;
    
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int fillDCups = scan.nextInt();
                dcups += fillDCups;
                scan.nextLine();
            }
    
            if (act.equals("take")) {
                System.out.println("I gave you $" + money);
                money = 0;
            }
    
            if (act.equals("remaining")) {
                status(water, milk, coffee, dcups, money);
            }

        } while (true);

        scan.close();
    }

    public static void status(int water, int milk, int coffee, int dcups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(dcups + " of disposable cups");
        System.out.println(money + " of money");
    }
}
