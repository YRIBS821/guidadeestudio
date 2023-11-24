import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("Yulianareyes");
        canner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        
        int numero = scanner.nextInt();
        scanner.close();
        
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *=i;
            
        }
        System.out.println("El factorial del numero ingresado   " + numero + " es =  " + factorial);
    }
}