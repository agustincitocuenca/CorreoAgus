import static org.junit.Assert.assertEquals;
import org.junit.Test;
import correo.Correo;
public class CorreoTest {

    @Test
    public void testGetRemitente() {
        Correo correo = new Correo("remitente@example.com", "destinatario@example.com", "Asunto del correo", "Cuerpo del correo");
        assertEquals("remitente@example.com", correo.getRemitente());
    }
}