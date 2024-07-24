import java.io.*;

public class Deserts {
    public static int quantity3[] = new int[11];
    public static int amt3 = 0;
    public static String l44[] = new String[11];
    static int price3[] = new int[11];
    static int l4[] = new int[11];
    static int d4[] = new int[11];
    static String sp4[] = new String[11];

    public static void menu3() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int c3, qu3, c23;

            String q4[] = { "Soft Serve Chocolate                 ", "Flurry Blueberry Brownie           ",
                    "Flurry Strawberry Banana           ", "Flurry Blueberry Brownie (Small)   ",
                    "Flurry Strawberry Banana (Small)   ", "Chocolate Brownie Soft Serve (Medium)",
                    "Flurry Choco Crunch (Small)        ", "Soft Serve Strawberry                ",
                    "Flurry Oreo (Small)                ", "Flurry Choco Crunch (Medium)       ",
                    "Flurry Oreo (Medium)               " };
            int r4[] = { 55, 74, 74, 54, 54, 69, 49, 55, 49, 69, 69 };

            do {
                System.out.print('\f');
                System.out.println("The Deserts are:-");
                System.out.println("1.Soft Serve Chocolate...................Rs.55");
                System.out.println("2.Flurry Blueberry Brownie.............Rs.74");
                System.out.println("3.Flurry Strawberry Banana.............Rs.74");
                System.out.println("4.Flurry Blueberry Brownie (Small).....Rs.54");
                System.out.println("5.Flurry Strawberry Banana (Small).....Rs.54");
                System.out.println("6.Chocolate Brownie Soft Serve (Medium)..Rs.69");
                System.out.println("7.Flurry Choco Crunch (Small)..........Rs.49");
                System.out.println("8.Soft Serve Strawberry..................Rs.55");
                System.out.println("9.Flurry Oreo (Small)..................Rs.49");
                System.out.println("10.Flurry Choco Crunch (Medium)........Rs.69");
                System.out.println("11.Flurry Oreo (Medium)................Rs.69");

                System.out.println("Enter your choice");
                c3 = Integer.parseInt(in.readLine());
                /**
                 * for(int i=0;i<11;i++)
                 * {
                 * Deserts.l4[i]=Deserts.l44[i].length();
                 * Deserts.d4[i]=23-Deserts.l4[i];
                 * for(int j=0;j<Deserts.d4[i];j++)
                 * Deserts.sp4[i]=Deserts.sp4[i]+' ';
                 * }
                 */
                if (c3 > 12 || c3 < 1)
                    System.out.println("wrong choice!!");
                else {
                    System.out.println("Enter quantity");
                    qu3 = Integer.parseInt(in.readLine());
                    for (int i = 0; i < 11; i++) {
                        if (i == (c3 - 1)) {
                            quantity3[i] += qu3;
                            l44[i] = q4[i];
                            price3[i] = r4[i] * qu3;
                            System.out
                                    .println("You have purchased " + qu3 + " " + q4[i].trim() + " for Rs." + price3[i]);
                        }
                    }
                    for (int i = 0; i < 11; i++)
                        amt3 = amt3 + price3[i];
                }
                System.out.println("Do you want to purchase something else 1-yes/0-no");
                c23 = Integer.parseInt(in.readLine());
            } while (c23 != 0);
            System.out.println("Total for deserts=Rs." + amt3);
        } catch (Exception e) {
        }
    }
}