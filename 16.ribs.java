import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa el area del circulo");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("el area del circulo y radio son " + radio + " es: " + area);
        scanner.close();
    }
}