import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
  Scanner DiasSemana = new Scanner(System.in);

        System.out.print("Ingresa un numero al azar del 1 al 7");
        int numero = DiasSemana .nextInt(); 

        String diaSemana;

        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
               diaSemana= "Martes";
                break;
            case 3:
                diaSemana= "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Numero no valido";
        }

        System.out.println("dia:" + diaSemana ); 

       DiasSemana .close();
    }
}