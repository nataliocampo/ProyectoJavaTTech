package Util;
import java.util.Scanner;

public class Scanneador {

    Scanner scanner = new Scanner(System.in);


    public int getSint() {
        int sint = scanner.nextInt();
        scanner.nextLine();
        return sint;
    }

    public double getSdouble() {
        double sdouble = scanner.nextDouble();
        scanner.nextLine();
        return sdouble;
    }
    public String getSstring() {
        String sstring = scanner.nextLine();
        return sstring;
    }


}
