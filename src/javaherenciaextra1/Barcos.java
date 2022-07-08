/*
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler
 */
package javaherenciaextra1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fabi
 */
public class Barcos extends Alquiler {
    int matricula;
    int eslora;
    int añoFabricacion;

    public Barcos() {
    }

    public Barcos(int matricula, int eslora, int añoFabricacion, String nombreCliente, int DNI, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, String NombreBarco) {
        super(nombreCliente, DNI, fechaAlquiler, fechaDevolucion, posicionAmarre, NombreBarco);
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }
    
    
      public void ArmarBarco(){
          System.out.println("****Datos del barco elegido****");
        Scanner Leer=new Scanner(System.in);
       
        System.out.println("Indique la matricula ");
        this.matricula= Leer.nextInt();
        System.out.println("Indique los metros de eslora");
        this.eslora=Leer.nextInt();
        System.out.println("Indique el año de fabricacion");
        this.añoFabricacion=Leer.nextInt();
    }
    
}
