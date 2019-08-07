import java.util.Scanner;

public class action {
    Scanner scanner = new Scanner(System.in);
    private static int availableWater= 1200;
    private static int availableMilk = 540;
    private static int availableCoffeeBeans = 120;
    private static int availableMoney = 550;
    private  static int disposableCups = 9;

    public static void status()
    {
        System.out.println("The coffee machine has: ");
        System.out.println(availableWater + " of water");
        System.out.println(availableMilk + " of milk");
        System.out.println(availableCoffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(availableMoney + " of money");


    }

    public static void buyEspresso()
    {
       if(availableWater>=250 && availableCoffeeBeans>=16 && disposableCups>=1)
       {
           availableWater -=250;
           availableCoffeeBeans -=16;
           availableMoney +=4;
           disposableCups--;
       }else
       {
           System.out.println("Sorry can't make the coffee");
       }

    }

    public static void buyLatte()
    {
        if(availableWater>=350 && availableMilk>=75 && availableCoffeeBeans>=20 && disposableCups>=1)
        {
            availableWater -= 350;
            availableMilk -=75;
            availableCoffeeBeans -= 20;
            availableMoney += 7;
            disposableCups--;


        }
    }

    public static void buyCappuccino()
    {
        if (availableWater>=200 && availableMilk>=100 && availableCoffeeBeans>=12 && disposableCups>=1)
        {
            availableWater -= 200;
            availableMilk -= 100;
            availableCoffeeBeans -= 12;
            availableMoney += 6;
            disposableCups -=1 ;

        }
    }

    public static void fill(int water, int milk, int coffeeBeans, int cups)
    {
        availableWater += water;
        availableMilk += milk;
        availableCoffeeBeans += coffeeBeans;
        disposableCups += cups;


    }


    public static void buy(int val)
    {
        switch (val){
            case 1:
                buyEspresso();
                break;
            case 2:
                buyLatte();
                break;
            case 3:
                buyCappuccino();
                break;
        }
    }

    public static  void take()
    {
        System.out.println("I gave you $" + availableMoney);
        availableMoney = 0;
    }

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        status();
        System.out.println("Write action (buy, fill, take): ");
        String val = scanner1.next();
        switch (val)
        {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int ris = scanner1.nextInt();
                buy(ris);
                status();
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add: ");
                int water = scanner1.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                int milk = scanner1.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int coffeBeans = scanner1.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int cups = scanner1.nextInt();
                fill(water, milk, coffeBeans, cups);
                status();
                break;
            case "take":
                take();
                status();
                break;

        }





    }
}
