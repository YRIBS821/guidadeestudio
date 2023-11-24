import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
Scanner fichac = new Scanner(System.in);

        System.out.print("ingresa tu nombre completo");
        String nombreCompleto = fichac.nextLine();

        System.out.print("ingresa tu edad");
        int edad = fichac.nextInt();
        fichac.nextLine(); 

        System.out.print("ingresa tu correo electronico");
        String correoElectronico = fichac.nextLine();


        System.out.print("ingresa su numero de celular");
        String telefono = fichac.nextLine();


      fichac.close();


        System.out.println("Ficha de Contacto:");
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad: " + edad + "  Anios ");
        System.out.println("Correo Electronico: " + correoElectronico);
        System.out.println("Telefono: " + telefono);
    }
}