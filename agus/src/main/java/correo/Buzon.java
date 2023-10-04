package correo;

import java.util.ArrayList;
import java.util.List;

public class Buzon {
    private List<Correo> listaCorreos;

    public Buzon() {
        this.listaCorreos = new ArrayList<>();
    }

    // Método para recibir un correo
    public void recibirCorreo(Correo correo) {
        this.listaCorreos.add(correo);
    }

    // Método para imprimir todos los correos recibidos
    public void mostrarCorreos() {
        for (Correo correo : listaCorreos) {
            System.out.println("De: " + correo.getRemitente());
            System.out.println("Asunto: " + correo.getAsunto());
            System.out.println("Cuerpo: " + correo.getCuerpo());
            System.out.println();
        }
    }
}

