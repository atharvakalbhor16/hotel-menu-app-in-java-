import java.io.*;

public class burgers_wraps {
    public static int quantity1[] = new int[19];
    public static int amt1 = 0;
    public static String l11[] = new String[19];
    static int price1[] = new int[19];

    public static void menu1() {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int c, qu, c2;

            String q[] = { "Aloo Tikki Burger(veg)       ", "Aloo wrap(veg)          ", "Veggie Nuggets               ",
                    "Masala Grill Burger(veg)       ", "Spicy Paneer Burger(veg)     ", "Spicy Panner Wrap(veg)  ",
                    "Paneer Royale Cheese Burger(veg)    ", "Classic Egg wrap                ",
                    "Chicken Grill Wrap        ", "Chicken Cheese Burger(Big)    ", "Masala Grill Chicken    ",
                    "Grilled Chicken Wrap    ", "Spicy Chicken Burger         ", "Spicy Chicken Wrap      ",
                    "Grilled Chicken Royale  ", "Chicken McNuggets(6 pcs)", "Chicken Nuggets(12 pcs)        " };


            int r[] = { 32, 55, 70, 50, 120, 150, 125, 59, 46, 110, 63, 65, 155, 135, 120, 105, 160 };
            do {
                System.out.print('\f');
                System.out.println("The Burger and Wraps are:-");
                System.out.println("1.Aloo Tikki Burger(veg)...............Rs.32");
                System.out.println("2.Aloo wrap(veg).......................Rs.55");
                System.out.println("3.Veggie Nuggets.......................Rs.70");
                System.out.println("4.Masala Grill Burger(veg).............Rs.50");
                System.out.println("5.Spicy Paneer Burger(veg).............Rs.120");
                System.out.println("6.Spicy Panner Wrap(veg)...............Rs.150");
                System.out.println("7.Paneer Royale Chesse Burger(veg).....Rs.125");
                System.out.println("8.Classic Egg wrap.....................Rs.59");
                System.out.println("9.Chicken Grill Wrap...................Rs.46");
                System.out.println("10.Chicken Cheese Burger(Big)...........Rs.110");
                System.out.println("11.Masala Grill Chicken.................Rs.63");
                System.out.println("12.Grilled Chicken Wrap.................Rs.65");
                System.out.println("13.Spicy Chicken Burger.................Rs.155");
                System.out.println("14.Spicy Chicken Wrap...................Rs.135");
                System.out.println("15.Grilled Chicken Royale...............Rs.120");
                System.out.println("16.Chicken Nuggets(6 pcs)...............Rs.105");
                System.out.println("17.Chicken Nuggets(12 pcs)..............Rs.160");

                System.out.println("Enter your choice");
                c = Integer.parseInt(in.readLine());

                if (c > 17 || c < 1)
                    System.out.println("wrong choice!!");
                else {
                    System.out.println("Enter quantity");
                    qu = Integer.parseInt(in.readLine());
                    for (int i = 0; i < 17; i++) {
                        if (i == (c - 1)) {
                            quantity1[i] += qu;
                            l11[i] = q[i];
                            price1[i] = r[i] * qu;
                            System.out.println("You have purchased " + qu + " " + q[i].trim() + " for Rs." + price1[i]);
                        }
                    }
                    for (int i = 0; i < 17; i++)
                        amt1 = amt1 + price1[i];
                }
                System.out.println("Do you want to purchase something else 1-yes/0-no");
                c2 = Integer.parseInt(in.readLine());
            } while (c2 != 0);
            System.out.println("Total for burgers and wraps=Rs." + amt1);

        } catch (Exception e) {
        }
    }
}