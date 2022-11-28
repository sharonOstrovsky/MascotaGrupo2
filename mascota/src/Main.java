import Entidad.Mascota;
import Servicio.MascotaServicio;

public class Main {

    public static void main(String[] args) {

        MascotaServicio servicio = new MascotaServicio();
        Mascota mascota = servicio.crearMascota();


        servicio.hablar(mascota);

    }
}