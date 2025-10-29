package Chapter12;

import Chapter12.A;
import Chapter12.B;
import Chapter12.X;
import Chapter12.Y;

public class Main {
    public static void main(String[] args) {
        Y[] y = new Y[2];
        y[0] = new A();
        y[1] = new B();

        for (Y y1 : y) {
            y1.b();
        }

    }

}
