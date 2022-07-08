/*
 * Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes.
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
public class BarcosEspeciales extends Barcos{
    int numeroMastilesVelero;
    int PotenciaBarcosMotor;
    int PotenciaYates;
    int NumCamarotesYates;

    public BarcosEspeciales() {
    }

    public BarcosEspeciales(int numeroMastilesVelero, int PotenciaBarcosMotor, int PotenciaYates, int NumCamarotesYates, int matricula, int eslora, int añoFabricacion, String nombreCliente, int DNI, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, String NombreBarco) {
        super(matricula, eslora, añoFabricacion, nombreCliente, DNI, fechaAlquiler, fechaDevolucion, posicionAmarre, NombreBarco);
        this.numeroMastilesVelero = numeroMastilesVelero;
        this.PotenciaBarcosMotor = PotenciaBarcosMotor;
        this.PotenciaYates = PotenciaYates;
        this.NumCamarotesYates = NumCamarotesYates;
    }
    
    public void BarcoEspecial(){
        Scanner Leer=new Scanner(System.in);
        System.out.println("Indique el numero de mastiles para veleros que desea");
        this.numeroMastilesVelero=Leer.nextInt();
        System.out.println("Desea un barco a motor o un yate?");
        String tipoBarco=Leer.next();
        if(tipoBarco.equalsIgnoreCase("barco a motor")){
        System.out.println("Indique la potencia en CV que desea para su barco a motor ");
        this.PotenciaBarcosMotor=Leer.nextInt();
        }
         if(tipoBarco.equalsIgnoreCase("yate")){
            System.out.println("Indique la potencia en CV que desea para su yate");
            this.PotenciaYates=Leer.nextInt();
            System.out.println("indique el numero de camarotes que quiere para su yate");
            this.NumCamarotesYates=Leer.nextInt();
        }
    }
    
}
