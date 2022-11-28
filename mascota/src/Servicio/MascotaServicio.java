package Servicio;

import Entidad.Mascota;

import java.util.Scanner;

public class MascotaServicio {

    Scanner input = new Scanner(System.in);

    public Mascota crearMascota(){

        Mascota mascota = new Mascota();

        System.out.print("ingrese el nombre de la mascota: ");
        mascota.setNombre(input.nextLine());
        System.out.print("ingrese la raza:");
        mascota.setRaza(input.next());
        System.out.print("ingrese la edad");
        mascota.setEdad(input.nextInt());
        System.out.print("ingrese el alimento:");
        mascota.setAlimento(input.next());


        return mascota;
    }

    public void ladrar(Mascota m){

        System.out.println("Guau");
        System.out.println("Holis");
    }
}
