
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Hello World!");
//        System.out.println("Starting to make a coffee");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Coffee is ready!");
//        System.out.println("Write how many cups of coffee you will need: ");
//        int val = scanner.nextInt();
//        int water44 = val*200;
//        int milk45 = val*50;
//        int coffe46 = val*15;
//        System.out.println("For "+ val +" cups of coffee you will need:");
//        System.out.println(water44 + " ml of water");
//        System.out.println(milk45 + " ml of milk");
//        System.out.println(coffe46 + " g of coffe beans");

        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffee = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int need = sc.nextInt();
        int calWater= 200*need;
//        System.out.println(calWater);
        int calMilk = 50*need;
//        System.out.println(calMilk);
        int calCoffee = 15*need;
//        System.out.println(calCoffee);
        if(calWater<=water && calMilk<=milk && calCoffee<=coffee)
        {
            int check1 = (water-calWater)/200;
            int check2 = (milk - calMilk)/50;
            int check3 = (coffee - calCoffee)/15;
            int smallest = Math.min(check1, Math.min(check2, check3));
            if(smallest>0)
            {
                System.out.println("Yes, I can make that amount of coffee" + " (and even "+

                        smallest + " more than that)");
            }
            else
            {
                System.out.println("Yes, I can make that amount of coffee");
            }







        } else  if(calWater>water || calMilk>milk || calCoffee>coffee)
        {
            int val1 = water/200;
            int val2 = milk/50;
            int val3 = coffee/15;
            int smallest = Math.min(val1, Math.min(val2, val3));
            if(need>smallest)
            {
                System.out.println("No, I can make only " + smallest +" cup(s) of coffee");
            }

        } else if(water == 0 || milk == 0 || coffee == 0)
        {
            if(need==1)
            {
                System.out.println("No, I can make only 0 cup(s) of coffee");
            } else if(need==0)
            {
                System.out.println("Yes, I can make that amount of coffee ");
            }
        }










    }
}
