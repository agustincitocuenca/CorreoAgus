package correo;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Contacto {
    public Usuario(String nombre, String apellido, String correoElectronico) {
        super(nombre, apellido, correoElectronico);
    }

    // Método para crear un correo
    public Correo crearCorreo(String destinatario, String asunto, String cuerpo) {
        return new Correo(this.correoElectronico, destinatario, asunto, cuerpo);
    }

    // Método para enviar un correo
    public void enviarCorreo(Correo correo) {
        // Aquí iría la lógica para enviar el correo
        System.out.println("Enviando correo de " + correo.getRemitente() + " a " + correo.getDestinatario());
        System.out.println("Asunto: " + correo.getAsunto());
        System.out.println("Cuerpo del correo: " + correo.getCuerpo());
    }

    // Filtro por remitente
    public List<Correo> filtrarPorRemitente(String remitente, List<Correo> listaCorreos) {
        List<Correo> correosFiltrados = new ArrayList<>();
        for (Correo correo : listaCorreos) {
            if (correo.getRemitente().equals(remitente)) {
                correosFiltrados.add(correo);
            }
        }
        return correosFiltrados;
    }

    // Filtro por asunto
    public List<Correo> filtrarPorAsunto(String asunto, List<Correo> listaCorreos) {
        List<Correo> correosFiltrados = new ArrayList<>();
        for (Correo correo : listaCorreos) {
            if (correo.getAsunto().equals(asunto)) {
                correosFiltrados.add(correo);
            }
        }
        return correosFiltrados;
    }
}
