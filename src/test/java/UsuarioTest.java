import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import correo.Correo;
import correo.Usuario;

public class UsuarioTest {

    @Test
    public void testCrearCorreo() {
        Usuario usuario = new Usuario("Agustin", "Caceres", "agustin.caceres@edu.ucp.com");
        Correo correo = usuario.crearCorreo("manuel.ramirez@edu.ucp.com", "Asunto del correo", "Cuerpo del correo");

        assertEquals("agustin.caceres@edu.ucp.com", correo.getRemitente());
        assertEquals("manuel.ramirez@edu.ucp.com", correo.getDestinatario());
        assertEquals("Asunto del correo", correo.getAsunto());
        assertEquals("Cuerpo del correo", correo.getCuerpo());
    }

    @Test
public void testEnviarCorreo() {
    Usuario usuario = new Usuario("Agustin", "Caceres", "agustin.caceres@edu.ucp.com");
    Correo correo = new Correo("agustin.caceres@edu.ucp.com", "manuel.ramirez@edu.ucp.com", "Asunto del correo", "Cuerpo del correo");

    // Cambiamos la salida estándar para poder capturarla y verificarla
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    usuario.enviarCorreo(correo);

    // Restauramos la salida estándar original
    System.setOut(originalOut);

    // Verificamos que la salida sea correcta
    String expectedOutput = "Enviando correo de agustin.caceres@edu.ucp.com a manuel.ramirez@edu.ucp.com\n" +
                            "Asunto: Asunto del correo\n" +
                            "Cuerpo del correo: Cuerpo del correo\n";
    assertEquals(expectedOutput, outputStream.toString());
}
}
