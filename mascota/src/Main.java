import Entidad.Mascota;
import Servicio.MascotaServicio;

public class Main {

    public static void main(String[] args) {

        MascotaServicio servicio = new MascotaServicio();
        Mascota mascota = servicio.crearMascota();

        //Funcionalidad de Jasbir
        servicio.Alimentar(mascota);

        //Mostrando objeto Mascota
        System.out.println(mascota.toString());

    }
}