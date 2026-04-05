package servicios;

import modelo.DatosSolicitud;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicioContactoSimTest {

    @Test
    void testTokenYEntidades() {
        // Arrange
        ServicioContactoSim servicio = new ServicioContactoSim();

        // Act
        int token = servicio.solicitarSimulation(new DatosSolicitud(null));
        var entidades = servicio.getEntities();

        // Assert
        assertTrue(token >= 1000, "El token debe ser un número de 4 cifras");
        assertEquals(2, entidades.size(), "Debe haber dos entidades disponibles");
        assertNotNull(entidades.get(0).getName());
    }
}