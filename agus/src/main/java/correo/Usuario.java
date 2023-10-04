package correo;

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
}
