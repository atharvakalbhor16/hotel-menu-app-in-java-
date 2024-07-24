import java.io.*;

public class Beverages {
    public static int quantity2[] = new int[23];
    public static int amt2 = 0;
    public static String l33[] = new String[23];
    static int price2[] = new int[23];
    static int l3[] = new int[23];
    static int d3[] = new int[23];
    static String sp3[] = new String[23];

    public static void menu2() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int c2, qu2, c22;

            String q2[] = { "Medium Coke                     ", "Medium Fanta                    ",
                    "Medium Sprite                   ", "Large Coke                      ",
                    "Large Fanta                     ", "Large Sprite                    ",
                    "Ice Tea                         ", "Cold Coffee                     ",
                    "Diet Coke Can (300ml)           ", "Ice Tea (Medium)                ",
                    "Minute Maid Pulpy Orange (400ml)", "Maaza (200ml)                   ",
                    "Fresh Brew Coffee               ", "Tea                             ",
                    "Packaged Drinking Water         ", "Black Coffee                    ",
                    "Black Tea                       ", "Small Shake Chocolate        ",
                    "Medium Shake Chocolate       ", "Large Shake Chocolate        ",
                    "Small Shake Strawberry       ", "Strawberry Shake            " };

            int r2[] = { 55, 55, 55, 65, 65, 65, 39, 55, 50, 50, 57, 23, 52, 37, 27, 48, 32, 60, 70, 80, 60, 70, };
            do {
                System.out.print('\f');
                System.out.println("Beverages are:-");
                System.out.println("1.Medium Coke.........................Rs.55");
                System.out.println("2.Medium Fanta........................Rs.55");
                System.out.println("3.Medium Sprite.......................Rs.55");
                System.out.println("4.Large Coke..........................Rs.65");
                System.out.println("5.Large Fanta.........................Rs.65");
                System.out.println("6.Large Sprite........................Rs.65");
                System.out.println("7.Ice Tea.............................Rs.39");
                System.out.println("8.Cold Coffee.........................Rs.55");
                System.out.println("9.Diet Coke Can (300ml)...............Rs.50");
                System.out.println("10.Ice Tea (Medium)...................Rs.50");
                System.out.println("11.Minute Maid Pulpy Orange (400ml)...Rs.57");
                System.out.println("12.Maaza (200ml)......................Rs.23");
                System.out.println("13.Fresh Brew Coffee..................Rs.52");
                System.out.println("14.Tea................................Rs.37");
                System.out.println("15.Packaged Drinking Water............Rs.27");
                System.out.println("16.Black Coffee.......................Rs.48");
                System.out.println("17.Black Tea..........................Rs.32");
                System.out.println("18.Small Shakes Chocolate...........Rs.60");
                System.out.println("19.Medium Shakes Chocolate..........Rs.70");
                System.out.println("20.Large Shakes Chocolate...........Rs.80");
                System.out.println("21.Small Shakes Strawberry..........Rs.60");
                System.out.println("22.Strawberry Shake................Rs.70");

                System.out.println("Enter your choice");
                c2 = Integer.parseInt(in.readLine());

                if (c2 > 22 || c2 < 1)
                    System.out.println("wrong choice!!");
                else {
                    System.out.println("Enter quantity");
                    qu2 = Integer.parseInt(in.readLine());
                    for (int i = 0; i < 22; i++) {
                        if (i == (c2 - 1)) {
                            quantity2[i] += qu2;
                            l33[i] = q2[i];
                            price2[i] = r2[i] * qu2;
                            System.out
                                    .println("You have purchased " + qu2 + " " + q2[i].trim() + " for Rs." + price2[i]);
                        }
                    }
                    for (int i = 0; i < 22; i++)
                        amt2 = amt2 + price2[i];
                }
                System.out.println("Do you want to purchase something else 1-yes/0-no");
                c22 = Integer.parseInt(in.readLine());
            } while (c22 != 0);
            System.out.println("Total for beverages=Rs." + amt2);
        } catch (Exception e) {
        }
    }
}