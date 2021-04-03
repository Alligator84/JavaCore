package chapter13;

import static java.lang.Math.*;

public class HypotStaticImport {

    public static void main(String[] args) {
        double said1, said2, hypot;
        said1 = 3.0;
        said2 = 4.0;

        hypot = sqrt(pow(said1, 2) +
                     pow(said2, 2));

        System.out.println(hypot);
    }
}
