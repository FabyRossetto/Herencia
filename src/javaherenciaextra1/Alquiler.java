/*
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
 */
package javaherenciaextra1;

import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author Fabi
 */
public class Alquiler {
    String nombreCliente;
    int DNI;
    Date fechaAlquiler;
    Date fechaDevolucion;
    int posicionAmarre;
    String NombreBarco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int DNI, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, String NombreBarco) {
        this.nombreCliente = nombreCliente;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.NombreBarco = NombreBarco;
    }
    
    
    
    public void DatosAlquiler(){
    Scanner Leer=new Scanner(System.in);   
        System.out.println("Ingrese el nombre del cliente");
        this.nombreCliente=Leer.nextLine();
        System.out.println("Ingrese el DNI");
        this.DNI= Leer.nextInt();
        System.out.println("Ingrese el nombre del barco que quiere alquilar");
        this.NombreBarco=Leer.next();
        System.out.println("Ingrese la posicion de Amarre");
        this.posicionAmarre=Leer.nextInt();

        System.out.println("Ingrese el dia del alquiler");
        int dia = Leer.nextInt();

        System.out.println("Ingrese el mes");
        int mes = Leer.nextInt();

        System.out.println("Ingrese el año");
        int anio = Leer.nextInt();

        fechaAlquiler = new Date(); // Creamos el objeto tipo Date

        fechaAlquiler.setDate(dia); // Seteamos el dia
        fechaAlquiler.setMonth(mes); // Seteamos el mes
        fechaAlquiler.setYear(anio); // Seteamos el anio
        
        System.out.println("Ingrese el dia del devolucion");
        int diadev = Leer.nextInt();

        System.out.println("Ingrese el mes");
        int mesdev = Leer.nextInt();

        System.out.println("Ingrese el año");
        int aniodev = Leer.nextInt();

        fechaDevolucion = new Date(); // Creamos el objeto tipo Date

        fechaDevolucion.setDate(diadev); // Seteamos el dia
        fechaDevolucion.setMonth(mesdev); // Seteamos el mes
        fechaDevolucion.setYear(aniodev); // Seteamos el anio
        
        

        

    
        //me lo devuelve en segundos,por eso lo divido 3600,ahi me los devuelve en hs y
        //despues en 24 para que me los devuelva en dias
       Long diasdeAlquiler = ((fechaDevolucion.getTime()-fechaAlquiler.getTime())/1000)/3600/24;
        System.out.println(" los dias de alquiler son " + diasdeAlquiler+ "dias");
        
        Barcos bar=new Barcos();
        bar.ArmarBarco();
       
        int VM= bar.getEslora()*10;
        long Alquiler= VM*diasdeAlquiler;
        
        System.out.println("El precio final del alquiler es de " + Alquiler);

    }    
}

