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
}
