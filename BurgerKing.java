import java.io.*;

public class BurgerKing {
    static int tot = 0;
    static int bill = 1;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int ch, ch2;
        double F_amount = 0, tax;
        System.out.println("");
        System.out.println("                    WELCOME TO Burger King                       ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                      I'M LOVIN' IT                            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        do {
            System.out.println("1.Burgers and wraps");
            System.out.println("2.Beverages ");
            System.out.println("3.Deserts");
            System.out.println("Enter your choice");

            ch = Integer.parseInt(in.readLine());

            switch (ch) {
                case 1:
                    burgers_wraps.menu1();
                    break;

                case 2:
                    Beverages.menu2();
                    break;
                case 3:
                    Deserts.menu3();
                    break;

                default:
                    System.out.println("wrong choice!!");
            }
            System.out.println("do u want to purchase some other option else 1-yes/0-no");
            ch2 = Integer.parseInt(in.readLine());
        } while (ch2 != 0);
        if (ch2 == 0) {
            tot = burgers_wraps.amt1 + Beverages.amt2 + Deserts.amt3;
        }
        tax = 0.04 * tot;
        F_amount = tot + tax;
        date ob = new date();
        ob.date1();
        System.out.println("Bill no>>>>>>>>>>>" + (bill++));
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                    Burger King");
        System.out.println("                  I'm Lovin' it ");
        System.out.println("Item" + "\t\t\t" + "          Quantity" + "\t\t\t  " + "Price");
        System.out.println("==================================================================================");
        for (int i = 0; i < 17; i++) {
            if (burgers_wraps.quantity1[i] > 0) {

                System.out.println(burgers_wraps.l11[i] + "\t\t" + burgers_wraps.quantity1[i] + "\t\t\t"
                        + burgers_wraps.price1[i]);
            }
        }

        for (int i = 0; i < 22; i++) {
            if (Beverages.quantity2[i] > 0) {

                System.out.println(
                        Beverages.l33[i] + " \t" + Beverages.quantity2[i] + " \t \t   \t" + Beverages.price2[i]);
            }
        }
        for (int i = 0; i < 11; i++) {
            if (Deserts.quantity3[i] > 0) {

                System.out.println(Deserts.l44[i] + "   " + Deserts.quantity3[i] + "  \t\t\t" + Deserts.price3[i]);
            }
        }

        int tot = 0;
        System.out.println("");
        System.out.println("total=" + tot);
        System.out.println("tax=" + tax);
        System.out.println("Total amount with tax=" + F_amount);
        System.out.println("");
        System.out.println("------------------------Thank you------------------------");
        System.out.println("**** :) Your Order is getting ready in few minutes :)**** ");

    }
}
