import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero cualquiera");
        int numero = scanner.nextInt();

        if (numero <0) {
            System.out.println("El numero es negativo");
        } else if (numero >0){
            System.out.println("El numero es positivo");
        }
    }
}