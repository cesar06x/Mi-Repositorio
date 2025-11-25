package ec.edu.espe.theoricalexcercise.view;

import ec.edu.espe.theoricalexcercise.model.A;
import ec.edu.espe.theoricalexcercise.model.B;
import ec.edu.espe.theoricalexcercise.model.C;

/**
 *
 * @author Cesar Vargas, Paradigm, @ESPE
 */
public class Excercise {
    public static void main(String[] args) {
        A a;
        B b;
        C c;
        a = new C(0, 0, 0, 0);
        b = new C(1, 1, 1, 1);
        c = new C(2, 2, 2, 2);
        
        System.out.println("a --> " + a);
        System.out.println("b --> " + b);
        System.out.println("c --> " + c);
    }

}
