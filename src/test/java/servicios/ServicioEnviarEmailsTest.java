package servicios;

import modelo.Destinatario;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;

class ServicioEnviarEmailsTest {

    @Test
    void testEnvioLog() {
        // Arrange
        ServicioEnviarEmails servicio = new ServicioEnviarEmails(LoggerFactory.getLogger(ServicioEnviarEmails.class));
        Destinatario d = new Destinatario("Jorge", "jorge@test.com");

        // Act & Assert
        assertTrue(servicio.enviarEmail(d, "Mensaje de prueba"));
    }
}