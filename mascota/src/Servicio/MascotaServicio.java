package Servicio;

import Entidad.Mascota;

import java.sql.SQLOutput;
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

    public void mostrarMascota(Mascota mascota){

        System.out.println("MASCOTA " + mascota.getNombre());
        System.out.println("Raza: " + mascota.getRaza());
        System.out.println("Edad: " + mascota.getEdad());
        System.out.println("Tipo de alimento: " + mascota.getAlimento());
        System.out.println("Energia: " + mascota.getEnergia());
    }

    public void Alimentar(Mascota m){
        System.out.println("Cuanto/as " + m.getAlimento() + " le quieres dar?: ");
        int cantidad = input.nextInt();
        int energiaActual = m.getEnergia();

        if (m.getEnergia() == 1000){
            System.out.println("Tu mascota ya esta full");
        }else{
            for (int i = 0; i < cantidad; i++){
                energiaActual+=10;
            }
            m.setEnergia(energiaActual);
        }
    }

    public void hablar(Mascota mascota){


        switch (mascota.getRaza()){
            case "perro":
                System.out.println("La mascota hace Guau");
                break;
            case "gato":
                System.out.println("La mascota hace Miau");
                break;

        }


    }

    public void pasearMascota(Mascota mascota){
        mascota.setEnergia(mascota.getEnergia()-200);

        System.out.println(mascota.getNombre()+" dio un paseo.");

    }
}
