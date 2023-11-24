import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
 Scanner menu = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenidos  ");
            System.out.println("Tenemos de");
            System.out.println("1.pastor");
            System.out.println("2.bistec");
            System.out.println("3.campechano");
            System.out.println("4. Salir");


            opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su orden de pastor estan listos  ");
                    break;
                case 2:
                    System.out.println("Su orden de bistec estan listos  ");
                    break;
                case 3:
                    System.out.println("Su orden  de campechanos estan listos ");
                    break;
                case 4:
                    System.out.println("Gracias por su preferencia ***Vuelva pronto*** ");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elija una opcion valida.");
                    break;
            }
        } while (opcion != 4);

        menu.close();
    }
}