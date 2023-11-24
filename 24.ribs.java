import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
  System.out.println("Se muestran los numeros primos del 2 al 500 : ");
        for (int i = 2; i <= 500; i++) {
            int Num = 1;
            int Cont = 0;
            while (Num <= i){
                if (i % Num == 0){
                    Cont = Cont + 1;
                }
                Num = Num + 1;
            }
            if (Cont == 2){
                System.out.println(i);
            }
                }
    }
}